package bellamy.armard.Project2ATM;


import java.util.Scanner;

/**
 * Created by armardbellamy on 9/16/16.
 */
public class UserInputHandler {

    public Scanner scanner = new Scanner(System.in);

    public int getUserInt(){
        return scanner.nextInt();
    }

    public double getUserDouble(){
        return scanner.nextDouble();
    }

    public String getUserString(){
        return scanner.nextLine();
    }

}
