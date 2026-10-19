class Leap {

    boolean isLeapYear(int year) {
        boolean band = false;
        if( year % 4 == 0 ){band = true;};
        if( year % 100 == 0 && year % 400 != 0){band = false;}
        return band;
    }

}
