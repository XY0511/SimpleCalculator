
package javaapplication12;

import java.util.Scanner;

/**
 *
 * @author Mark Xyruz Magnampo
 */
public class SimpleCalculator {

    private static int operator;

    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1=0;
        int num2=0;
        
        System.out.println("Calculator");
        System.out.println("Choose operator:\n"
                + "1 - Addition\n"
                + "2 - Subtraction\n"
                + "3 - Multiplication\n"
                + "4 - Division\n");
        
        Scanner input =new Scanner(System.in);
        operator = input.nextInt();
        if((operator < 1) || (operator > 5)){
            System.out.println("Enter Valid Input!");
        }
        System.out.println("Enter First Number");
        num1 = input.nextInt();
        
        System.out.println("Enter Second Number");
        num2 = input.nextInt();
        
        
        switch(operator){
                case 1:
                    int sum = num1 + num2;
                    System.out.println(num1 + "+" + num2 + "=" + sum);
                    break;
                case 2:
                    int diff = num1 - num2;
                    System.out.println(num1 + "-" + num2 + "=" + diff);
                    break;
                case 3:    
                    int product = num1 * num2;
                    System.out.println(num1 + "x" + num2 + "=" + product);
                    break;
                case 4:    
                    int quotient = num1 / num2;
                    System.out.println(num1 + "/" + num2 + "=" + quotient);
                    break;
                default:
                    System.out.println("");
    }}
    
}
