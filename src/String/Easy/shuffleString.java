package String.Easy;

//Q.1528 https://leetcode.com/problems/shuffle-string/
public class shuffleString {
    public static int[] swap(int[] indices, int index1, int index2){
        int temp = indices[index1];
        indices[index1] = indices[index2];
        indices[index2] = temp;
        return indices;
    }
    public static String swap(char[] s, int index1, int index2){
        char temp = s[index1];
        s[index1] = s[index2];
        s[index2] = temp;
        return String.valueOf(s);
    }
    public static String restoreString(String s, int[] indices) {
        char[] charArray = s.toCharArray();
        int i = 0;
        while(i<s.length()){
            if(indices[i]!=i){
                swap(charArray, i, indices[i]);
                swap(indices, i, indices[i]);
            }
            else i++;
        }
        return String.valueOf(charArray);
    }
    public static void main(String[] args) {
        int[] indices = {3,1,4,2,0};
        System.out.println(restoreString("aiohn", indices));
    }
}
