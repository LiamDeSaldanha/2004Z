public class Critter {
    private String code;

    Critter(String code) {
        this.code = code;
    }

    public String mateWith(Critter other) {
        int count = 0;
        String childCode = "";
        String[] parent = code.split("");
        String[] otherParent = other.code.split("");
        int increment = 0;
        if (parent.length == otherParent.length) {

            while (count != 10) {
                childCode = childCode + parent[increment] + otherParent[increment];
                count += 2;
                ++increment;
            }
        } else if (parent.length < otherParent.length) {
            while (count != 10) {

                if (increment > parent.length - 1) {

                    while (count != 10) {
                        childCode = childCode + otherParent[increment];
                        ++count;
                        ++increment;
                    }
                    break;
                }

                childCode = childCode + parent[increment] + otherParent[increment];
                count += 2;
                ++increment;
            }
        } else {
            while (count != 10) {

                if (increment > otherParent.length - 1) {

                    while (count != 10) {
                        childCode = childCode + parent[increment];
                        ++count;
                        ++increment;
                    }
                    break;
                }

                childCode = childCode + parent[increment] + otherParent[increment];
                count += 2;
                ++increment;
            }
        }

        return childCode;
    }

    public String toString() {
        return "[" + code + "]";
    }
}
