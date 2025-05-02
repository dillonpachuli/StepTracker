public class StepTracker{
    private int days;

    private int daysActive;

    private int steps;

    private int requiredSteps;

    public StepTracker(int steps){
        requiredSteps = steps;
    }
    public void addDailySteps(int steps){
        this.steps += steps;
        this.days ++;
        if (steps >= requiredSteps) daysActive++;
    }

    public int activeDays(){
        return daysActive;
    }

    public double averageSteps(){
        if (days == 0) return 0;
        return steps / days;
    }
}