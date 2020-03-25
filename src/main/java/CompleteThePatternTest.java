public class CompleteThePatternTest {
    public static void main(String[] args) {
        System.out.println(CompleteThePattern.pattern(5));

    }
}

class CompleteThePattern {
    public static String pattern ( int n) {
        StringBuilder str = new StringBuilder();
        int x = n;
        for(int i=0; i<n; i++){
            int y = n;
            for(int ii=i; ii<n; ii++){
                str.append(Integer.toString(y));
                y--;}
            if(i!=(n-1)){str.append("\n");}
            x--;
        }
        return str.toString();


    }
}
