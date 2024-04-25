public class Time {
    private int hour;
    private int minute;

    Time(int hour,int minute){
        this.hour = hour;
        this.minute = minute;
    }


    public String getHour(){
        switch (hour) {
            case 1:
                return "one";
                
                case 2:
                return "two";
                
                case 3:
                return "three";
                
                case 4:
                return "four";
                
                case 5:
                return "five";
                
                case 6:
                return "six";
                
                case 7:
                return "seven";
                
                case 8:
                return "eight";
                
                case 9:
                return "nine";
                
                case 10:
                return "ten";
                
                case 11:
                return "eleven";
                
                case 12:
                return "twelve";
                case 13:
                return "one";
                
        
            default:
            return null;
        }
        
    }

    public String getMinute(){
        switch (minute) {
            case 0:
                return "o'clock";
                
                case 5:
                return "five past";
                
                case 10:
                return "ten past";
                
                case 15:
                return "quarter past";
                
                case 20:
                return "twenty past";
                
                case 25:
                return "twenty five past";
                
                case 30:
                return "half past";
                
                case 35:
                return "twenty five to";
                
                case 40:
                return "twenty to";
                
                case 45:
                return "quarter to";
                
                case 50:
                return "ten to";
                
                case 55:
                return "five to";
                
                
        
            
        }
        return null;
    }
    public void incHour(){
        ++hour;
    }


}
