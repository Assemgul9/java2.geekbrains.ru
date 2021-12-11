package lesson1;

public class Robot implements ObjectSkills {

    private String name;
    private  int maxJump;
    private  int maxRun;


    public Robot (String name, int maxJump, int maxRun){

        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public int getMaxJump() {
        return maxJump ;
    }

    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public void jump (){
        System.out.println(name + "прыгнул");

    }

    @Override
    public int maxJump() {
        return maxJump;
    }

    public String name() {
        return name;
    }

    public int maxRun() {
        return maxRun;
    }

}
