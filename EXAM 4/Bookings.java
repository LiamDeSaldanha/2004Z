import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Bookings {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bookings:");
        int numBookings = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the bookings, one per line:");
        ArrayList<Time> times = new ArrayList<>();
        ArrayList<TimeSlot> bookings = new ArrayList<>();
        for (int i = 0; i < numBookings; i++) {
            times.clear();
            StringTokenizer st = new StringTokenizer(sc.nextLine(), "-");
            while (st.hasMoreTokens()) {
                StringTokenizer st2 = new StringTokenizer(st.nextToken().trim());
                StringTokenizer st3 = new StringTokenizer(st2.nextToken(), ":");
                Time time = new Time(Integer.parseInt(st3.nextToken()), Integer.parseInt(st3.nextToken()),
                        st2.nextToken());
                times.add(time);
            }
            bookings.add(new TimeSlot(times.get(0), times.get(1)));
        }
        int count = 0;

        for (int i = 0; i < bookings.size() - 1; i++) {
            for (int j = i + 1; j <= bookings.size() - 1; j++) {
                if (bookings.get(i).isClash(bookings.get(j))) {
                    ++count;
                }
            }
        }

        if (count > 0) {
            System.out.println("Let's play Sardines! Number of pairs that clash: " + count + ".");
        } else {
            System.out.println("Good to go!");
        }

    }
}