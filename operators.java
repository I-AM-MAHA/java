package javaprogram;

public class operators {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Relational operators
        System.out.println("a == b: " + (a == b));     
        System.out.println("a != b: " + (a != b));     
        System.out.println("a > b: " + (a > b));       
        System.out.println("a < b: " + (a < b));       
        System.out.println("a >= b: " + (a >= b));     
        System.out.println("a <= b: " + (a <= b));     

        // logical operators
        System.out.println("a & b: " + (a & b));   
        System.out.println("a | b: " + (a | b));   
        System.out.println("~a: " + (~a));         
        System.out.println("a ^ b: " + (a ^ b));   
    }
}
