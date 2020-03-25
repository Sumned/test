import java.util.Arrays;

public class DivSevenTest {
    public static void main(String[] args) {
        int x = 123;
        int y = 10;
        System.out.println(Arrays.toString(DivSeven.seven(1603)));
    }

}

class DivSeven {
    public static long[] seven(long m) {
        int x = 0;
        if(m<100) return new long[] {m, x};
        long n;
        while (m>=100){
            n = m-(m/10)*10;
            m = (m/10)-(2*n);
            x++;
        }
        return new long[] {m, x};
    }

    public static void print(Long w){
        System.out.println(w);
    }
}