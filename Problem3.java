public class Problem3 {
    public static void main(String[] args) {
        int number =660;
        int digit = 6;
        int count = countDigit(number,digit);
        System.out.println("The number is : " + number);
        System.out.println("The digit to find : " + digit);
        System.out.println("The number of digits in that number : " + count);

    }
    public static int countDigit (int n , int digit){
        if (n==0)
            return 0;

        int lastdigit = n%10;
        if (lastdigit==digit){
            return 1+countDigit(n/10 , digit);
        } else {
            return countDigit(n/10 , digit);
        }

    }
}
