import java.util.Random;

class TimeGenerator{
    public static void main(String[] args) {
        TimeGenerator obj = new TimeGenerator();
        System.out.println(obj.properTime());
    }
    int randomNumGenerator(int upperLimit,int lowerLimit){
        Random rand = new Random();
        return rand.nextInt(upperLimit) + lowerLimit;
    }

    String convertHourTimeToString(){
        int hour = randomNumGenerator(24, 1);
        String formattedHour;
        if(hour<10){
            formattedHour = "0" + hour;
        }
        else{formattedHour = String.valueOf(hour);}
        return formattedHour;
    }
    String convertMinuteTimeToString(){
        int min = randomNumGenerator(11,0);
        min = min*5;
        String formattedMinute;
        if(min<10){
            formattedMinute = "0" + min;
        }
        else{formattedMinute = String.valueOf(min);}
        return formattedMinute;
    }
    String properTime(){
        String hour = convertHourTimeToString();
        String min = convertMinuteTimeToString();
        return (hour + ":" + min);
    }

}
//no of methods = 4