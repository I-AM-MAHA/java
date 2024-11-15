package javaprogram;

public class Returntype {
    
    public static int addNumbers(int num1, int num2) {
        return num1 + num2;
    } 

    public static void main(String[] args) { 
        int number1 = 55; 
        int number2 = 25;

        int result = addNumbers(number1, number2);
        
        System.out.println("The sum of the two numbers is: " + result);
    }
}
