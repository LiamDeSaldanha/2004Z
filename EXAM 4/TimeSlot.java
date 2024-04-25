public class TimeSlot {
    private Time start;
    private Time end;

    TimeSlot(Time start, Time end) {
        this.start = start;
        this.end = end;
    }

    public boolean isClash(TimeSlot other) {
        if (this.end.compareTo(other.start) <= 0 || other.end.compareTo(this.start) <= 0) {
            return false;
        } else {
            return true;
        }
    }

}
