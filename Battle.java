//In collaboration with Temirlan Seitzhapar
public class Battle{
    public static String fight(Hero h, Monster m){
        int pastLevel = h.currentLevel;
        int levelsGained;
        while(h.hasHPRemaining()&& !m.isDefeated()){ // checks if either one is defeated 
            m.receiveAttack(h.attackRating);
            h.receiveAttack(m.attackRating); //check if the hero hasHPRemaining, if not, hero uses healing potion
            if(!h.hasHPRemaining()){
                h.useHealingPotion();
            }
        }
        if(!h.hasHPRemaining()){
            return "The "+m.type+ " has defeated "+h.name+". Game over."; // if hero dies returns message 
        }else{
            h.receiveXP(m.xpValue);
				levelsGained = h.currentLevel - pastLevel;
				h.healingPotions = h.healingPotions + (m.goldValue / 3);
            return h.name + " has defeated the "+m.type+" earning "+m.goldValue+" gold and "+m.xpValue+" XP leveling up "+levelsGained +" times.";
        } // if hero wins returns message
    

}

}