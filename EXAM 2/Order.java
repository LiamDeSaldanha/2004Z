import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Order {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the word lists text file:");
        String fileName = sc.nextLine();
        File file = new File(fileName);
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {

                Sequence seq = new Sequence(fileReader.nextLine());
                seq.maxSeq();
                if (seq.hasMultiSolutions()) {

                    System.out.println("Multiple solutions length " + seq.getMax() + ".");
                } else {
                    System.out.println("Longest is " + seq.getMax() + ".");
                }

            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println("Done");

    }

}
