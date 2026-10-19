class Leap {

    boolean isLeapYear(int year) {
        boolean band = (year % 4 == 0 &&( year % 100 == 0 ^ year % 400 != 0) );
        //if( year % 100 == 0 && year % 400 != 0){band = false;}
        return band;
    }

}
