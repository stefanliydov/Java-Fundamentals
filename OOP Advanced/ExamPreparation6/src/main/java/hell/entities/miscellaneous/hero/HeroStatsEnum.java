package hell.entities.miscellaneous.hero;

public enum HeroStatsEnum {

    BARBARIAN(90,25,10,350,150), ASSASSIN(25,100,15,150,300), WIZARD(25,25,100,100,250);

    private int strength;
    private int agility;
    private int intelligence;
    private int hitpoints;
    private int damage;


    HeroStatsEnum(int strength, int agility, int intelligence, int hitpoints, int damage){
    this.strength = strength;
    this.agility =agility;
    this.intelligence = intelligence;
    this.hitpoints = hitpoints;
    this.damage = damage;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getAgility() {
        return this.agility;
    }

    public int getIntelligence() {
        return this.intelligence;
    }

    public int getHitpoints() {
        return this.hitpoints;
    }

    public int getDamage() {
        return this.damage;
    }
}
