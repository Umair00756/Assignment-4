public class Problem1 {
    public static void main(String[] args) {
        System.out.println("The factorial of given number is: ");
        System.out.println(fact(7));
    }
    public static int fact (int num){
        if (num == 0 || num ==1)
            return num;
        int prevfact = fact(num-1);
        return num*prevfact;
    }
}
