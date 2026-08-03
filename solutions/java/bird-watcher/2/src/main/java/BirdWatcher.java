
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay;
    }

    public static int[] getLastWeek() {
       return new int[] { 0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        int today= birdsPerDay.length-1;
        return birdsPerDay [today];
    }

    public void incrementTodaysCount() {
        birdsPerDay [6] ++;
        return;
    }

    public boolean hasDayWithoutBirds() {
        boolean band = false;
        for(int i=0 ; i < birdsPerDay.length ; i++){
            if(birdsPerDay[i]==0)
            {
                return true;
            }
        }
        return band;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sumatory=0;
        if(numberOfDays>6){numberOfDays=7;}
        for(int i=0 ; i < numberOfDays; i++){
            sumatory += birdsPerDay[i];
        }
        return sumatory;
    }

    public int getBusyDays() {
        int cantOfBusyDays=0;
        for(int i=0 ; i<6; i++){
            if(birdsPerDay[i]>=5){cantOfBusyDays++;}
        }
        return cantOfBusyDays;
    }
}
