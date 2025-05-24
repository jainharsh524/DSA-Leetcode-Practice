package String.Easy;

//Q.2000 https://leetcode.com/problems/reverse-prefix-of-word/
public class reversePrefixOfWord {
    public static void swap(StringBuilder sb,int i,int j){
        char temp = sb.charAt(i);
        sb. replace(i,i+1, ""+sb.charAt(j));
        sb. replace(j,j+1, ""+temp);
    }
    public static String reversePrefix(String word, char ch) {
        StringBuilder sb = new StringBuilder(word);
        int firstOccurrence = word.indexOf(ch);
        int k = 0;
        int l = firstOccurrence;
        while(k<l){
            swap(sb,k,l);
            k++;
            l--;
        }
        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
