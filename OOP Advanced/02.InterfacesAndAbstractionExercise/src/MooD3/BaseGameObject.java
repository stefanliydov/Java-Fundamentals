package MooD3;

public abstract class BaseGameObject implements GameObject {

    private String username;
    private String hashedPassword;
    private int level;


    protected BaseGameObject(String username, int level) {
        this.username = username;
       this.hashedPassword =  this.generateHashPassword();
        this.level = level;
    }

    protected abstract String generateHashPassword();

    public String getUsername() {
        return username;
    }
    public abstract double getSpecialPower();
    public String getHashedPassword() {
        return hashedPassword;
    }

    public int getLevel() {
        return level;
    }
    @Override
    public String toString() {
        return String.format("\"%s\" | \"%s\" -> %s\n",this.getUsername(),this.getHashedPassword(),this.getClass().getSimpleName());
    }
}
