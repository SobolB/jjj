public class Enemy extends GameObject {

    private int health;
    private int attack;
    private int defend;

    protected void voice() {
        System.out.println("Противник");
    }

    public Enemy(String name, int health, int attack, int defend) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defend = defend;
    }
    public void printEnemy(){
        System.out.println("___________________________________");
        System.out.println("Name: "+ name + "\nHealth: "+ health + "\nAttack: " + attack + "\nDefend: " + defend);
        System.out.println("___________________________________");
    }


}
