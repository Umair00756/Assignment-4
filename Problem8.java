public class Problem8 {
    public static void main(String[] args) {
        System.out.println("The non zero product of three is: ");
        System.out.println(nonZeroProd(3));

    }
    private static final long MOD = 1_000_000_007;
    public static int nonZeroProd(int p) {
        if (p == 1) {
            return 1;
        }
        long maxValue = (1L << p) - 2;
        long count = (1L << (p - 1)) - 1;
        long maxProduct = powMod(maxValue, count, MOD);

        long result = (maxProduct * ((maxValue + 1) % MOD)) % MOD;
        return (int) result;
    }
    private static long powMod(long base, long exp, long mod) {
        long result = 1;
        while (exp > 0) {
            if ((exp & 1) == 1) {
                result = (result * base) % mod;
            }
            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
}
