package String.Easy;

//Q.168 https://leetcode.com/problems/excel-sheet-column-title/
public class excelSheetColumnTitle {
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber>0){
            char ch = (char)(columnNumber%26+64);
            if(ch=='@') {
                sb.append('Z'); columnNumber--;
            }
            else sb.append(ch);
            columnNumber = columnNumber/26;
        }
        return sb.reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(convertToTitle(52));
    }
}
