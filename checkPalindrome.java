public class checkPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        String revc = new StringBuilder(str).reverse().toString();
        System.out.println(str.equals(revc));
    }
}
