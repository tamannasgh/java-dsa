public class Address {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        String ans = defangIPaddr(address);
        System.out.println(ans);
    }
    static String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}