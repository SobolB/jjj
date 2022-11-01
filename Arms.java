public class Arms extends GameObject{
    private int attack;
    private int price;
    private int requiredExperience;
    protected void voice() {
        System.out.println("Оружие");
    }

    public Arms(String name,int attack, int price, int requiredExperience) {

        this.name = name;
        this.attack = attack;
        this.price = price;
        this.requiredExperience = requiredExperience;
    }
    public int getRequiredExperience() {
        return requiredExperience;
    }
    public void printArms(){
        System.out.println("___________________________________");
        System.out.println("Name: "+ name + "\nAttack: " + attack + "\nPrice: " + price + "\nNeed level: " + requiredExperience);
        System.out.println("___________________________________");
    }

}
