//In collaboration with Temirlan Seitzhapar
public class Monster{
    public String type;
    public int hitPoints;
    public int attackRating;
    public int xpValue;
    public int goldValue;
    public Monster(String type, int hp, int attackR, int xp, int gold){
    this.type = type;
    this.hitPoints = hp;
    this.attackRating = attackR;
    this.xpValue = xp;
    this.goldValue = gold;
    }
public Monster(){ // calling full argument constructor
    type = "goblin";
    hitPoints = 10;
    attackRating = 1;
    xpValue = 1;
    goldValue = 1;
    
}
public boolean isDefeated(){ 
    if(this.hitPoints <= 0){ // returns true if hitpoints is less than or equal to 0, otherwise false 
        return true;
    }
    else return false;
}

public void receiveAttack(int incAttack){ 
    this.hitPoints -= incAttack; // reduces the hitpointsremainig by attack value 

}

}

