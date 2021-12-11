package lesson1;

public class RunningTrack implements Tests{

    private int distance;

    public RunningTrack (int distance){
        this.distance = distance;
    }

    public void info() {
        System.out.println(" Беговая дорожка" + distance);
    }

    @Override
    public boolean isDone(ObjectSkills objectSkills) {
        if (distance<=objectSkills.maxRun()){
            return true;
        }
        else {
            return false;
        }

    }
}
