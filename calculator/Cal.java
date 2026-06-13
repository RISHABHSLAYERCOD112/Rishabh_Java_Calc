import java.util.*;

class Calculator {
    double a;
    double b;

    Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    void Add() {
        System.out.println("Addition: " + (a + b));
    } 

    void Sub() {
        System.out.println("Subtraction: " + (a - b));
    }

    void Mul() {
        System.out.println("Multiplication: " + (a * b));
    }

    void Div() {
        if (b != 0) {
            System.out.println("Division: " + (a / b)); 
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        
        Calculator e = new Calculator(a, b);
        char op = '*'; 
        switch (op) {
            case '+':
                e.Add();
                break;
            case '-':
                e.Sub();
                break;
            case '*':
                e.Mul();
                break;
            case '/':
                e.Div();
                break;
            default:
                System.out.println("Invalid operator.");
        }
    }
}
