import java.util.StringTokenizer;

public class Date {

    private int day;
    private int month;
    private int year;


    Date(int day, int month,int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    Date (Date date){
        this.day = date.day;
        this.month = date.month;
        this.year = date.year;
    }

    public int getMaxDays(){
        switch (month) {
            case 1:
                return 31;

                case 2:
                if   (year%400 ==0 || (year%4 ==0 && year%100!=0 )){
                  return 29;
                }else{
                    return 28;
                }



              
                case 3:
                return 31;
                case 4:
                return 30;
                case 5:
                return 31;
                case 6:
                return 30;
                case 7:
                return 31;
                case 8:
                return 31;
                case 9:
                return 30;
                case 10:
                return 31;
                case 11:
                return 30;

                case 12:
                return 31;
                
        
            default:
                return -1;
        }
    }
    public boolean isOdd(){
        Boolean flag = true;
        String digits = Integer.toString(day)+Integer.toString(month)+Integer.toString(year); 
        

        for(String digit:digits.split("")){
            if(!(Integer.parseInt(digit)%2==0)){
               
            } else {

                flag =  false;
                break;
            }
            
        }
        return flag;
       
        
            
    }
    public String toString(){
        return day+"/"+month+"/"+year;
    }

    public void inc(){
        if (day == this.getMaxDays() ){
            if (month == 12){
                ++year;
                month = 1;
                day=1;
            }else{
            day =1;
            ++month;
        }
        } else{
            ++day;
        }
    }



}
