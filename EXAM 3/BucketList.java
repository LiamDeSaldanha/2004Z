import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.File;

public class BucketList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the categories file:");
        String fileName = sc.nextLine();
        System.out.println("Enter a comma-separated list of words:");
        String list = sc.nextLine();
        try {
            File file = new File(fileName);
            Scanner fileReader = new Scanner(file);
            HashMap<String, String> category = new HashMap<String, String>();
            StringTokenizer st = new StringTokenizer(list, ",");
            ArrayList<String> categories = new ArrayList<>();
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                category.put(line, "");
                categories.add(line);
            }
            categories.add("Uncategorised");
            category.put("Uncategorised", "");
            while (st.hasMoreTokens()) {
                int similarCount = 0;
                String keySimilar = "";
                String token = st.nextToken().trim();
                for (String key : category.keySet()) {
                    if (token.startsWith(key) && key.length() > similarCount) {
                        similarCount = key.length();
                        keySimilar = key;
                    }
                }
                if (similarCount == 0) {
                    keySimilar = "Uncategorised";

                }

                String temp = category.get(keySimilar) + token + ", ";
                category.put(keySimilar, temp);

            }
            System.out.println("Categorised:");
            for (String key : categories) {

                if (!category.get(key).equals("")) {

                    if (!key.equals("Uncategorised")) {
                        String formattedString = category.get(key).substring(0, category.get(key).lastIndexOf(","))
                                + ".";
                        System.out.println(key + ": " + formattedString);
                    } else {
                        String formattedString = category.get(key).substring(0, category.get(key).lastIndexOf(","))
                                + ".";
                        System.out.println(key + ":\n" + formattedString);

                    }

                } else {
                    if (!key.equals("Uncategorised"))
                        System.out.println(key + ":");
                }

            }

        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done");
    }
}
