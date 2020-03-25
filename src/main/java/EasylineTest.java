import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EasylineTest {
    public static void main(String[] args) {
        System.out.println(EasyLine.easyLine(17));

    }
}

class EasyLine{
    public static BigInteger easyLine(int n){
        BigInteger x = BigInteger.valueOf(n);
        return new BigInteger(line(x).toString());
    }

    public static BigInteger line(BigInteger a){
        if(a.compareTo(BigInteger.valueOf(0))>0){
            BigInteger a1 = a.multiply(BigInteger.valueOf(4));
            BigInteger a2 = a1.subtract(BigInteger.valueOf(2));
            BigInteger a3 = a.subtract(BigInteger.valueOf(1));
            BigInteger a4 = a2.multiply(line(a3));
            BigInteger a5 = a4.divide(a);

            return a5;
        }
        else {return new BigInteger("1");}

    }
}
