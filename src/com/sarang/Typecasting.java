package com.sarang;

/*
When one type of data is assigned to another type of variable, an automatic type conversion will take place if the
following conditions are met:
1. The two types must be compatible.
2. The destination type should be greater than the source type.
 */

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float n1 = input.nextFloat();
        int n2 = input.nextInt();
//        int n3 = input.nextFloat(); // This will give an error

        System.out.println(n1);
        System.out.println(n2);

        // Type Casting
        int num = (int)(75.45f); // But this will only give the integer part
        System.out.println(num);

        int a = 258;
        byte b = (byte)(a); // 258 % 256  = 2
        System.out.println(b);

        int number = 'A'; // This will give the ascii value for this
        System.out.println(number);

    }
}
