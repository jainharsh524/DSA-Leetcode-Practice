package String.Easy;

//Q.1108 https://leetcode.com/problems/defanging-an-ip-address/
public class defangingAnIPAddress {
    public static String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
