import org.junit.Test;

public class isPolindrom {



    @Test
public void tsetCode(){
    findPalindrome(122);
}
    public boolean findPalindrome(int x) {

        if(x<0||(x/10==0&& x==0)){
            return false; }
        int LastPart=0;
        while(x>LastPart){

                    LastPart= LastPart*10+x%10;
            x/=10;
        }

        return x==LastPart||x==LastPart/10;

}
}
