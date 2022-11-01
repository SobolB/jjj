import java.sql.SQLOutput;

public class Personage extends GameObject {

    private String name;
    private int health;
    private int experience;
    private int attack;
    private int level;
    private int defend;
    private int requiredExperience;

    protected void voice() {
        System.out.println("Персонаж");
    }

    public Personage(String name, int health, int experience, int level, int attack, int defend) {
        this.name = name;
        this.health = health;
        this.experience = experience;
        this.level = level;
        this.attack = attack;
        this.defend = defend;

    }

    public int getHealth()
    {

        return health;
    }

    public void lootArms(int level) {
       if (requiredExperience >= level)
       {
           System.out.println("___________________________________");
           System.out.println("Daddy can take a arms");
           System.out.println("___________________________________");
       }
       else {
           System.out.println("___________________________________");
           System.out.println("Daddy can't take a arms");
           System.out.println("___________________________________");
       }
    }


}
