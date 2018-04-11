package Count;

import java.util.Scanner;

public class Express {
    public String editExpress(String original_String){
        String output_String;



        return original_String;
    }

    //test the express function
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String express = input.nextLine();
        Express deal = new Express();
        String output = deal.editExpress(express);
        System.out.println(output);
    }
}
