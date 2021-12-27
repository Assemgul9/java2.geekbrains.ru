package lesson1;

public class Wall implements Tests{

    private int height;

    public Wall (int height){
        this.height = height;
    }

    @Override
    public void info() {
        System.out.println(" Стена " + height);
    }

    @Override
    public boolean isDone(ObjectSkills objectSkills) {
        if (objectSkills.maxJump()>=height){
            return true;
        }
        else{
            return false;
        }

    }
}
