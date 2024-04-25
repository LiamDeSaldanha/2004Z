import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Oddities {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the text file of dates:");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        String currentLine = "";
        try {
            Scanner fileReader = new Scanner(file);
            while(fileReader.hasNextLine()){
                currentLine = fileReader.nextLine();
                StringTokenizer st = new StringTokenizer(currentLine , "/");
                Date date = new Date(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
                if (date.isOdd()){
                    System.out.println("The date "+date.toString()+" has all odd digits.");
                }else{
                    int count =0;
                    Date oddDate = new Date(date);
                    while (!oddDate.isOdd()) {
                        oddDate.inc();
                        ++count;                        
                    }
                    if (count ==1){
                        System.out.println("The first date after "+date.toString()+" with all odd digits is "+ oddDate.toString()+" which is "+count +" day later.");
                    }else{
                        System.out.println("The first date after "+date.toString()+" with all odd digits is "+ oddDate.toString()+" which is "+count +" days later.");
                    }




                }
            }







        } catch (FileNotFoundException e) {
            
            e.printStackTrace();
        }
        System.out.println("Done");
        
    }
}
