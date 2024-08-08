public class Problem6 {
    public static void main(String[] args) {
        int b = 8;
        int e = 3;
        int p = power(b,e);
        System.out.println("Base : " + b);
        System.out.println("Power : " + e);
        System.out.println("Result : " + p);
    }
    public static int power (int base , int exp){
        if (exp == 0){
            return 1;
        } else {
            return base *power(base , exp -1);
        }
    }
}
