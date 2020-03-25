public class SolutionTest {
    public static void main(String[] args) {
        System.out.println((Solution.capitalize("sdfsffsf")).toString());

    }
}

class Solution{
    public static String[] capitalize(String s){
        String[] done = new String[2];
        String[] ls = s.split("");
        String x = "";
        String X = "";
        int y = 0;
        for(String i:ls){
            if(y%2==0){
                x+=i.toLowerCase();
                X+=i.toUpperCase();
            }
            else{
                X+=i.toLowerCase();
                x+=i.toUpperCase();
            }
            y++;
        }
        done[0]=x;
        done[1]=X;
        return done;
    }
}
