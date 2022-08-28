class Geeks {
    static void isPrime(int n) {
        if(n==1){
            System.out.println("No");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            // Your code here
            if(n%i==0){
                System.out.println("No");
                return;
            }
        }

        System.out.println("Yes");
    }
}
