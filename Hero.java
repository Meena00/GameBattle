public class Hero{
    public String name;
    public int hitPointsRemaining;
    public int hitPointsMax;
    public int attackRating;
    public int defenseRating;
    public int currentXP;
    public int currentLevel;
    public int healingPotions;

public Hero(String name, int hpMax, int ar, int dr, int potions){
    this.currentXP = 0;
	this.currentLevel = 1;
	this.name = name;
	this.hitPointsMax = hpMax;
	this.hitPointsRemaining = hpMax;
	this.attackRating = ar;
	this.defenseRating = dr;
	this.healingPotions = potions;

}
public boolean hasHPRemaining(){
    if (hitPointsRemaining > 0){
        return true;
    }
    else
        return false;
    
    }


public void receiveAttack(int incAttack){
    int attack = incAttack;
    attack = attack - this.defenseRating;
    if (attack <0){
        attack = 0;
    }
    this.hitPointsRemaining = this.hitPointsRemaining - attack;

}
public void receiveXP(int xpReceived){
        int levelsGained;
        levelsGained = ((this.currentXP % 10) + xpReceived)/10;
        this.currentXP = this.currentXP + xpReceived;
        this.currentLevel = this.currentLevel + levelsGained;
        this.hitPointsMax = this.hitPointsMax + (levelsGained * 5);
		
		if(levelsGained > 0){

         this.hitPointsRemaining = this.hitPointsMax;
        }
    }
public void useHealingPotion(){
    if(healingPotions>0){
        hitPointsRemaining = hitPointsMax;
        healingPotions--;

    }
}
}