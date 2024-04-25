import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

class Populations {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name:");
        String fileName = sc.nextLine();
        ArrayList<Critter> critters = new ArrayList<>();
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            int critterNum = fileReader.nextInt();
            fileReader.nextLine();
            for (int i = 0; i < critterNum; i++) {
                critters.add(new Critter(fileReader.nextLine()));
            }
            int matingNum = fileReader.nextInt();
            fileReader.nextLine();
            for (int i = 0; i < matingNum; i++) {
                StringTokenizer st = new StringTokenizer(fileReader.nextLine());
                String firstMate = st.nextToken();
                String secondMate = st.nextToken();
                Critter fristParent = critters.get(Integer.parseInt(firstMate)-1);
                Critter secondParent = critters.get(Integer.parseInt(secondMate)-1);
                critters.add(new Critter(fristParent.mateWith(secondParent)));
            }
            for(Critter c : critters){
                System.out.println(c.toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}