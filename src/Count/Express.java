package Count;

import java.util.Scanner;

public class Express {

    //edit the regular express
    public String editExpress(String original_String){
        String output_String;
        String normal = "(s|ing|ness|ed|ly)*\\b";

        char head = original_String.charAt(0);

        char output_char = ' ';

        if (Character.isUpperCase(head)){
             output_char = Character.toLowerCase(head);
        }
        else if (Character.isLowerCase(head)){
            output_char = Character.toUpperCase(head);
        }


        output_String ="\\b(" + Character.toString(head) + "|" + Character.toString(output_char) + ")" +  original_String.substring(1) + normal;

        return output_String;
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
