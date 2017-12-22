package app.models.participants;

import app.contracts.Targetable;
import app.models.Config;

public class Boss extends BaseBoss {
    private String name;
    private double health;
    private double damage;
    private double gold;
    private boolean isAlive;
    private int level;

    public Boss(){
        this.setHealth(Config.BOSS_HEALTH);
        this.setDamage(Config.BOSS_DAMAGE);
        this.setGold(Config.BOSS_GOLD);
        this.level =1;
        this.isAlive =true;
    }



    public Boss(String name){
       this.setName(name);
        this.setHealth(Config.BOSS_HEALTH);
        this.setDamage(Config.BOSS_DAMAGE);
        this.setGold(Config.BOSS_GOLD);
        this.level =1;
        this.isAlive =true;
    }
    private void setGold(double gold) {
        this.gold = gold;
    }
    private void setDamage(double damage) {
        this.damage = damage;
    }
    @Override
    public String attack(Targetable target) {
       target.takeDamage(this.damage);
       return "";
    }

    @Override
    public void takeDamage(double damage) {
        this.health-=damage;
        if(this.health<=0){
            this.isAlive=false;
        }
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getDamage() {
        return this.damage;
    }

    @Override
    public double getHealth() {
        return this.health;
    }

    @Override
    public double getGold() {
        return this.gold;
    }

    @Override
    public void setHealth(double health) {
        this.health = health;
    }

    @Override
    public void giveReward(Targetable targetable) {
        targetable.receiveReward(Config.BOSS_INDIVIDUAL_REWARD);
    }

    @Override
    public void receiveReward(double reward) {
        this.gold+= (reward/10.0);
    }

    @Override
    public void levelUp() {
        this.setHealth(Config.BOSS_HEALTH);
        this.level+=1;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Name: %s | Class: Boss\n",this.name));
        sb.append(String.format("Health: %s | Damage: %s | %s Gold",this.getHealth(),this.getDamage(),this.getGold()));
        return sb.toString();
    }
}
