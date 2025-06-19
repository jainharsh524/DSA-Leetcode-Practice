package bitwise.Easy;

//Q.1720 https://leetcode.com/problems/decode-xored-array/
public class decodedXORArray {
    public int[] decode(int[] encoded, int first) {
        int[] decoded = new int[encoded.length+1];
        decoded[0] = first;
        for (int i = 0; i < encoded.length;  i++) {
            decoded[i+1] = decoded[i-1]^encoded[i];
        }
        return decoded;
    }
    public static void main(String[] args) {

    }
}
