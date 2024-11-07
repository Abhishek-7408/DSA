public class isprime {
    public static void main(String[] args) {
        int n=12;
        boolean isPrime=true;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
