import java.util.Scanner;

public class input {

    public String input(){
        out();
        String x = inp();
        return x;

    }
    public static String inp(){
        out();
        Scanner name = new Scanner(System.in);
        return name.nextLine();
    }

    static void out(){
        System.out.println("Введите ченить");
    }

}
