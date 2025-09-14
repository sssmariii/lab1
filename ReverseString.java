public class ReverseString {
    public static void main(String[] args) {
        String original = "make install";
        String reversed = "";
        
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        
        System.out.println(reversed);
    }
}
