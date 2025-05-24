package String.Easy;

//Q.1668 https://leetcode.com/problems/maximum-repeating-substring/description/
public class maximumRepeatingSubstring {
    public static int maxRepeating(String sequence, String word) {
        String find="";
        while(sequence.contains(find)) find += word;
        return (find.length()-word.length())/word.length();
    }
    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc", "ab"));
    }
}
