public class Time {
    private int hour;
    private int minute;
    private String suffix;

    Time(int hour, int minute, String suffix) {
        this.hour = hour;
        this.minute = minute;
        this.suffix = suffix;
        if (suffix.equals("pm")) {
            if (this.hour == 12) {

            } else {
                this.hour = this.hour + 12;
                if (hour == 24) {
                    this.hour = 0;
                }
            }
        }
    }

    public int compareTo(Time other) {
        if (this.hour > other.hour) {
            return 1;
        } else if (this.hour < other.hour) {
            return -1;
        } else {
            if (this.minute > other.minute) {
                return 1;
            } else if (this.minute < other.minute) {
                return -1;
            } else {
                return 0;
            }
        }
    }

}
