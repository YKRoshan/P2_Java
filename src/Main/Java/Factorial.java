public class Factorial {
    public long factorial(int n){
        if(n>20){
            System.out.println("Out of range.");
            return 0;
        }
        long fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

}
