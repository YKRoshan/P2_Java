public class CheckPowerOfFour {
    public boolean checkPowerOfFour(int n){
        int power=0;
        int count=1;
        while(power<n){
            if(n==Math.pow(4,count)){
                return true;
            }
            power=(int)(Math.pow(4,count));
            count++;
        }
        return false;
    }
}
