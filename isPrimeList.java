public class listPrimeNumberFile {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
       
        FileWriter outFile = new FileWriter("Prime-Numbers-Output.txt");
        PrintWriter out = new PrintWriter(outFile);
        for (int x = 2; x <= 10000; x++) {

            int num = x;
            if (isPrime(num)) {
                System.out.println(num + " Is Prime. ");
                
                out.println(num); // Prints primes to list

            } //else {//test code
            //System.out.println(num + " is not a prime number"); //test code
             }
       
        out.close();   // closes File
    }
    public static boolean isPrime(int n) throws IOException {
        if (n > 2 && n % 2 == 0) {
            //System.out.println(n+ " is not prime"); // Test code
            return false;
        }

        /**
         * if (n == 2 ) { return (true); }
         */
        for (int i = 3; i <= Math.sqrt(n) + 1; i += 2) {
            if (n % i == 0 || n <= 1) {
                return (false);
            }
        }

        return (true);
    }
}



       
                


    
