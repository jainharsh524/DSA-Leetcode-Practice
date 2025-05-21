package String.Easy;

//Q.1678 https://leetcode.com/problems/goal-parser-interpretation/
public class goalParserInterpretation {
    public static String interpret(String command) {
        command = command.replaceAll("(al)", "al");
        command = command.replaceAll("()", "o");
        return  command;
    }
    public static void main(String[] args) {

    }
}
