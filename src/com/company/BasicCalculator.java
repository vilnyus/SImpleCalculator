package com.company;

public class BasicCalculator {
    public void AddNumbers(double numberA, double numberB){
        System.out.println(numberA + numberB);

    }

    public void SubtractNumbers(double numberA, double numberB){
        System.out.println(numberA - numberB);
    }

    public void DivideNumbers(double numberA, double numberB){
        if(numberB==0)
        {
            System.out.println("Can't divide to zero.");
        }
        else {
            System.out.println(numberA / numberB);
        }
    }

    public void MultipleNumbers(double numberA, double numberB){
        System.out.println(numberA * numberB);
    }
}
