package lesson1;

public class  Human implements  ObjectSkills{

    private String name;
    private  int maxJump;
    private  int maxRun;


    public Human (String name, int maxJump, int maxRun){

        this.name = name;
        this.maxJump = maxJump;
        this.maxRun = maxRun;
    }

    public String name() {
        return name;
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

    @Override
    public int maxRun() {
        return maxRun;
    }
}
