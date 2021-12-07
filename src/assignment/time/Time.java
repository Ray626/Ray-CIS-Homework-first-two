package assignment.time;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        timeCheck();
    }
    public Time timeCheck(){
        if(this.hour < 0 || this.hour > 23){
            this.hour = 0;
        }
        if(this.minute < 0 || this.minute > 59){
            this.minute = 0;
        }
        if(this.second < 0 || this.second > 59){
            this.second = 0;
        }
        return this;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
        timeCheck();
    }

    public void setMinute(int minute) {
        this.minute = minute;
        timeCheck();
    }

    public void setSecond(int second) {
        this.second = second;
        timeCheck();
    }
    public void setTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        timeCheck();
    }
    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
    public Time nextSecond(){
        if(second == 59){
            second = 0;
            if (minute ==59){
                minute = 0;

                if (hour ==23){
                    hour = 0;
                }else{
                    hour--;
                }
            }else{
                minute++;
            }
        }else{
            second++;
        }
        return this;
    }
    public Time previousSecond(){
        if(second == 0){
            second = 59;
            if (minute ==0){
                minute = 59;

                if (hour ==0){
                    hour = 23;
                }else{
                    hour--;
                }
            }else{
                minute--;
            }
        }else{
            second--;
        }
        return this;
    }

}
