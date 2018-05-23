package sqrtofx;

public class SqrtOfx {
    public int sqrtofx(int n){
        if(n <= 0)
            return 0;
        int curr = 0;
        int res = 0;
        int add = 1;
        while(curr <= n){
            if(Integer.MAX_VALUE-curr < add)
                return res;
            curr += add;
            res++;
            add += 2;
        }
        return res-1;
    }
}
