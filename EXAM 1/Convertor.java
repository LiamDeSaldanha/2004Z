import java.util.Scanner;
import java.util.StringTokenizer;

class Convertor{
    public static void main(String[] args){
        String status = "";
        int hour=0;
        int minute =0;
        Time time = null;
        boolean isRounded = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a time or 'quit':\n");
            status = sc.nextLine();
        while(!status.equals("quit")){
            isRounded = false;
            
            StringTokenizer st = new StringTokenizer(status,":");
            hour = Integer.parseInt(st.nextToken());
            minute = Integer.parseInt(st.nextToken());
            if(minute %5 <3){
                while(minute%5 !=0){
                    --minute;
                    isRounded = true;
                }
            } else {
                while(minute%5 !=0){
                    ++minute;
                    isRounded = true;
                }
            }


            if (minute >30){
                ++hour;
            }

            if(minute == 60){
                 time = new Time(hour, 0);
                 minute = 0;
                 
            }else{
             time = new Time(hour, minute);
            }





            if(minute ==0 ){
                if(isRounded){
                    System.out.println("about "+time.getHour()+" "+time.getMinute());
                } else{
                System.out.println(time.getHour()+" "+time.getMinute());
            }}

           

           
          

            else {
                if(isRounded){
                    System.out.println("about "+time.getMinute()+" " +time.getHour());
                } else{
                System.out.println(time.getMinute()+" "+time.getHour());
            }
            }

            





            System.out.print("Enter a time or 'quit':\n");
            status = sc.nextLine(); 
        }
        System.out.println("Done");
    }
}