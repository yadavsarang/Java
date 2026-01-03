package com.sarang;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
//        System.out.println(inp.nextInt());
        int roll = inp.nextInt();
        System.out.println("Your roll no is: " +  roll);

//        String n1 = inp.next();
//        System.out.println(n1);

        /*
        When you typed 23(example) and pressed Enter, you actually sent two things to the computer's input buffer:
        1. The number 23.
        2. The "Newline" character (\n) created by pressing the Enter key.

        Here is exactly what happened inside the code:
        1. inp.nextInt() ran. It grabbed the 23, but it left the \n (Enter) sitting in the buffer.
        2. inp.nextLine() ran immediately after. It looked at the buffer, saw the \n waiting there, and thought:
           "Oh, the user has already pressed Enter!"
        3. It captured that empty "newline," stored it in n2 (as an empty string), and the program finished immediately
           without waiting for you to type anything else.
         */

        inp.nextLine(); // Consume the leftover newline
        String n2 = inp.nextLine();
        System.out.println(n2);

        float marks = inp.nextFloat();
        System.out.println(marks);
    }
}
