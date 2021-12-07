package assignment.time;

public class Main {
    public static void main(String[] args) {
        Time theTime = new Time(0,34,4);
        System.out.println(theTime.getHour());
        System.out.println(theTime.getMinute());
        System.out.println(theTime.getSecond());
        theTime.setSecond(-1);
        theTime.setMinute(3);
        theTime.setHour(-3);
        System.out.println(theTime);
        theTime.setTime(-3,6,59);
        System.out.println(theTime.nextSecond());
        theTime.setTime(0,0,0);
        System.out.println(theTime.previousSecond());


    }


}
