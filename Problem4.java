public class Problem4 {
    public static void main(String[] args) {
        int n = 5;
        int handshakes = handshake(n);
        System.out.println("The number of persons : " + n + " persons.");
        System.out.println("The number of handshakes : " + handshakes + " handshakes.");
    }
    public static int handshake (int n){
        if (n==1)
            return 0;

            return (n-1) + handshake(n-1);

    }
}
