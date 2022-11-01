import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Personage per = new Personage("Dady", 10, 1, 1, 2, 3);
        per.voice();

        Arms arm = new Arms("Ac", 3, 25, 4);
        arm.voice();

        int levelArms = arm.getRequiredExperience();
        per.lootArms(levelArms);


        String[] enemyNames = {"kkkkk","hhhh"};
        String[] armsNames = {"uuuu","jjjj","gggg"};

        Enemy[] objectEnemy = new Enemy[10];
        Arms[] objectArms = new Arms[10];

        for(int i=0; i<10; i++){
            objectEnemy[i] = new Enemy(enemyNames[(int)(Math.random()*2)],(int)(Math.random()*30),(int)(Math.random()*25),(int)(Math.random()*15));

            objectArms[i] = new Arms(armsNames[(int)(Math.random()*3)],(int)(Math.random()*25),(int)(Math.random()*15),(int)(Math.random()*10));
        }
        for (Enemy enemy: objectEnemy){
            enemy.printEnemy();
        }
        for (Arms arms: objectArms){
            arms.printArms();
        }

    }


}