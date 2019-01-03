public class Palindrome {
    public int reverse(int n){
        int sum=0;
        for(;n>0;n/=10){
            int d=n%10;
            sum=sum*10+d;
        }
        return sum;
    }

    public boolean palindrome(int n){
        int rev=reverse(n);
        if(rev==n){
            return true;
        }else{
            return false;
        }
    }
}
