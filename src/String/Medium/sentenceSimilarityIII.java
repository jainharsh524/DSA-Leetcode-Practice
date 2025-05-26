package String.Medium;

//Q.1813 https://leetcode.com/problems/sentence-similarity-iii/
public class sentenceSimilarityIII {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.length() < sentence2.length()) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        int i = 0;
        while (i < words2.length && words1[i].equals(words2[i])) i++;
        int j = 0;
        while (j < words2.length - i && words1[words1.length - 1 - j].equals(words2[words2.length - 1 - j])) j++;
        return i + j == words2.length;
    }
//this code does not works for 1 or 2 edge cases otherwise both the codes are good.
//    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
//        StringBuilder commonPrefix = new StringBuilder();
//        StringBuilder commonSuffix = new StringBuilder();
//        if(sentence1.length()<sentence2.length()){
//            if(sentence2.equals(sentence1)) return true;
//            else if(sentence2.startsWith(sentence1+" ")||sentence2.endsWith(" "+sentence1)) return true;
//            else{
//                int ptr1 = 0;
//                int ptr2 = sentence1.length()-1;
//                int ptr3 = sentence2.length()-1;
//                while (ptr1<sentence1.length()){
//                    if(sentence1.charAt(ptr1)==sentence2.charAt(ptr1)){
//                        commonPrefix.append(sentence1.charAt(ptr1));
//                        ptr1++;
//                    }
//                    else if(sentence1.charAt(ptr1)!=sentence2.charAt(ptr1)) break;
//                }
//                while (ptr2>=ptr1-1&&ptr3>=0){
//                    if(sentence1.charAt(ptr2)==sentence2.charAt(ptr3)){
//                        commonSuffix.append(sentence1.charAt(ptr2));
//                        ptr2--;ptr3--;
//                    }
//                    else if(sentence1.charAt(ptr2)!=sentence2.charAt(ptr3)) break;
//                }
//                String newFullString = commonPrefix.toString() + commonSuffix.reverse();
//                System.out.println(newFullString);
//                if(newFullString.contains("  ")){
//                    newFullString = newFullString.replace("  ", " ");
//                    return newFullString.equals(sentence1);
//                }
//                else return false;
//            }
//        }
//        else return areSentencesSimilar(sentence2, sentence1);
//    }
    public static void main(String[] args) {
        System.out.println(areSentencesSimilar("A B C D B B", "A B B"));
    }
}
