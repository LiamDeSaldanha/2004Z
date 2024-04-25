import java.util.ArrayList;
import java.util.StringTokenizer;

public class Sequence {
    private int maxSequence;
    private String sequence;
    private boolean multiSolutions;

    Sequence(String sequence) {
        this.sequence = sequence;
        this.maxSequence = 1;
        this.multiSolutions = false;
    }

    public void maxSeq() {
        ArrayList<Integer> solutions = new ArrayList();
        int max = 1;
        ArrayList<String> words = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(sequence);
        while (st.hasMoreTokens()) {
            words.add(st.nextToken());
        }
        if (words.size() != 1) {
            for (int i = 0; i < words.size() - 1; i++) {

                if (words.get(i).compareToIgnoreCase(words.get(i + 1)) < 0) {

                    ++max;

                } else {
                    solutions.add(max);
                    max = 1;
                }
                if (i == words.size() - 2) {
                    solutions.add(max);
                }

            }
        } else {
            solutions.add(max);

        }

        max = 0;
        for (Integer value : solutions) {
            if (value > max) {
                max = value;
            }
        }
        int count = 0;
        for (Integer value : solutions) {
            if (value == max) {
                ++count;
            }
        }

        if (count > 1) {
            multiSolutions = true;
        }
        maxSequence = max;

    }

    public int getMax() {
        return maxSequence;
    }

    public boolean hasMultiSolutions() {
        return multiSolutions;
    }
}
