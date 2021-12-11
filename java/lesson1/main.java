package lesson1;

public class main {
    public static void main(String[] args) {

        ObjectSkills [] objectSkills = new ObjectSkills [4];
        objectSkills[0] = new Cat("White", 2, 4);
        objectSkills[1] = new Human("Sergei", 3, 15);
        objectSkills[2] = new Robot("Bender", 1, 20);
        objectSkills[3] = new Human("Anton", 2, 5);



        Tests [] tests = new Tests [4];

        tests [0] = new Wall(1);
        tests [1] = new RunningTrack(3);
        tests [2] = new Wall(3);
        tests [3] = new RunningTrack(9);

        for (ObjectSkills o:objectSkills){

            for (Tests t:tests){
                if(t.isDone(o)){

                    System.out.print(o.name() + " Прошел испытание");
                    t.info();
                }
                else {
                    System.out.print(o.name() + " Выбыл.Не смог пройти испытание" );
                    t.info();

                    break;
                }

            }
        }




    }
}
