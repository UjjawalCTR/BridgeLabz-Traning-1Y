package AssignmentExtra;
public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "success";
        int maxCount = 0;
        char mostFrequent = ' ';
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == c) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mostFrequent = c;
            }
        }
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
    }
}