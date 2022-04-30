import java.util.Scanner;

public class NumberVerification {
    public static int getNumbers()  {
        int numberToUse = 0;
        Scanner input = new Scanner(System.in);

        try{
            numberToUse = Integer.parseInt((input.nextLine()));
        }
        catch(NumberFormatException e){
            System.out.println("Type a number next time.");
        }

        return numberToUse;
    }
}
