import java.math.BigDecimal;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


import static java.util.stream.Collectors.toList;


public class Kata {
    public static void main(String[] args) {
        //System.out.println(addLetters("a", "b", "c"));
        //System.out.println(removeDuplicateWords("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
        //System.out.println(canMakeNote("Gimme all ur munny", "The rain in spain falls mainly in the plain"));
        //System.out.println(canMakeNote("Gimme all ur munny", "I went running one day over the hills and far away. I passed groves of murmuring groves of mixed alder and doug fir."));
        //System.out.println(canMakeNote("Clint Eastwood!", "If you want to see some good old action movies, watch a western or two"));
        //System.out.println(canMakeNote("NyxDx7MVoB8NHplCHnk0yPh9omFP1mnvrhkCO1kt1KB3DfrXMMKzrVckW0v6n9fWSg3LiYUB4Ys2Dxwt", "X1DyfCpKD0B6M9xBnWrflLrm8hcNiyvkwmDS041YkMU1nvHt70P2BVHKxgPWzn0x39kNkVhFrtsYC0M3"));
        //System.out.println(primeString("abac"));
        //System.out.println(add(3, 2));
        //System.out.println(numPrimorial(5));
        //System.out.println(high("man i need a taxi up to ubud"));







    }

    public static String addLetters(String... letters) {
        if(letters.length == 0) return "z";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int a = 96;
        for(String i : letters) {
            //System.out.println((int)i.charAt(0));
            a += (i.charAt(0) - 96);
            //System.out.println(a);
        }
        if (a > 122) {
            a -= 26;
        }
        return String.valueOf((char)a);



    }
    public static String removeDuplicateWords(String s){

        return Arrays.stream(s.split(" ")).distinct().collect(Collectors.joining(" "));
    }

    public static boolean canMakeNote(String note, String magazine) {
        String[] lsNote = note.toLowerCase().replaceAll("[^a-z'0-9]", "").split("");
        List<String> lsMag = new ArrayList<String>(Arrays.asList(magazine.toLowerCase().replaceAll("[^a-z'0-9]", "").split("")));
        Map<String, String> hash = new HashMap<String, String>(){
            {
                put("a", "4");
                put("e", "3");
                put("i", "1");
                put("o", "0");
                put("s", "5");
                put("z", "2");
            }
        };
        for(String s : lsNote) {
            if(!lsMag.contains(s) && !lsMag.contains(hash.get(s))) {
                System.out.println(s);
                System.out.println(lsMag.toString());
                return false;
            } else if (lsMag.contains(s)) {
                lsMag.remove(s);
            } else lsMag.remove(hash.get(s));
        }
        return true;
    }

    public static boolean primeString(String s) {
        int x = 0;
        StringBuilder str1 = new StringBuilder();
        while (x++ < s.length()/2) {
            int z = s.length()/s.substring(0, x).length();
            if ((s.substring(0, x)+s.substring(0, x)).equals(s)) return false;
            while (z-- != 0) {
                str1.append(s, 0, x);
                if (str1.toString().equals(s)) return false;
            }
            str1 = new StringBuilder();
        }
        return true;
    }

    public static int add(int x, int y)
    {
        while (y != 0)
        {
            int carry = x & y;
            System.out.println(Integer.toBinaryString(carry)+" - carry");
            System.out.println(Integer.toBinaryString(x)+" - x");
            System.out.println(Integer.toBinaryString(y)+" - y");
            x = x ^ y;
            System.out.println(Integer.toBinaryString(x)+" - x2 " + x);
            y = carry << 1;
            System.out.println(Integer.toBinaryString(y)+" - y2 " + y);
        }
        return x;
    }
    public static String numPrimorial(int n) {
        if (n == 1 || n == 2) return Integer.toString(n+1);
        BigDecimal z = new BigDecimal(6);
        long sum = 5;
        while (n-- > 2) {
            z = z.multiply(new BigDecimal(sum++));
            while (!checker(sum)) {
                System.out.println(sum);
                sum++;
            }
        }
        return z.toString();

    }

    public static boolean checker(long x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static String high(String s) {
        int w = 0;
        int z;
        String st = "";
        //Arrays.stream(s.split(" ")).filter(i -> (Stream.of(i.toCharArray()).map(x -> Integer.parseInt(String.valueOf(x))).reduce(0, Integer::sum)) > w).map();
        for(String i : s.split(" ")) {
            z = 0;
            for(char j : i.toCharArray()) {

                z += (int) j;
            }
            if ( z > w) {
                w = z;
                st = i;
            }
        }
        return st;
    }

    public static int  isIsogram(String text) {
        int count = 0;
        for(int i : text.chars().distinct().toArray()) {
            for(int j : text.chars().toArray()) {
                if(j == i) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }





}



