import java.util.Arrays;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println(CompleteThePattern.pattern(10));
    }
}


class CompleteThePattern1 {
    public static String pattern ( int n) {
        StringBuilder str = new StringBuilder();
        int x = n;
        for(int i=0; i<n; i++){
            str.append(Integer.toString(x));
            x--;
        }
        return str.toString();


    }
}

