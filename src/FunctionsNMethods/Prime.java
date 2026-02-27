package FunctionsNMethods;

public class Prime {

        static boolean isPrime(int n)
        {
            // Corner case
            if (n <= 1)
                return false;
            // For n=2 or n=3 it will check
            if (n == 2 || n == 3)
                return true;
            // For multiple of 2 or 3 This will check
            if (n % 2 == 0 || n % 3 == 0)
                return false;
            // It will check all the others condition
            for (int i = 5; i <= Math.sqrt(n); i = i + 6)
                if (n % i == 0 || n % (i + 2) == 0)
                    return false;

            return true;
        }

        // Driver Program
        public static void main(String args[])
        {
            if (isPrime(11))
                System.out.println(" true");
            else
                System.out.println(" false");
            if (isPrime(121))
                System.out.println(" true");
            else
                System.out.println(" false");
        }

}
