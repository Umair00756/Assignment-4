public class Problem5 {
    public static void main(String[] args) {
        int x = 10;
        int y = 15;
        int gcd = GCD(x,y);
        System.out.println("X : " + x);
        System.out.println("Y : " + y);
        System.out.println("GCD : " + gcd);
    }
    public static int GCD (int x , int y){
        if (y==0)
            return x;
        return GCD(y ,x%y);
    }
}
