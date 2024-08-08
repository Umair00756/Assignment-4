public class Problem7 {
    public static void main(String[] args) {
        String str = "UMAIR";
        String rev = reverse(str);
        System.out.println("Normal String : " + str);
        System.out.println("Reversed String : " + rev);

    }
    public static String reverse(String str){
        if (str.isEmpty()){
            return str;
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }
}
