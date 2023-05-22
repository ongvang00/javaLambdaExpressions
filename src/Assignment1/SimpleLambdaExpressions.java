package Assignment1;

import java.sql.SQLOutput;
import java.sql.Time;

public class SimpleLambdaExpressions {
    public static void main(String[] args) {
        //addition lambda expression
        AddInterface sumExpression;
        sumExpression = (a, b) -> a + b;
        System.out.println("sum value is : " + sumExpression.addNumbers(1,2));

        //subtraction lambda expression

        MinusInterface subtractExpression;
        subtractExpression = (a, b) -> a -b;
        System.out.println("subtraction value is: " + subtractExpression.subtractNumbers(4,2));

        //multiplication lambda expression

        TimesInterface multiplicationExpression;
        multiplicationExpression = (a, b) -> a * b;
        System.out.println("multiplication value is: " + multiplicationExpression.multiplyNumbers(2,2));

        //division lambda expression

        DivideInterface divisionExpression;
        divisionExpression = (a, b) -> a / b;
        System.out.println("division value is: " + divisionExpression.divideNumbers(6, 2));
    }

}

interface AddInterface {
    int addNumbers(int a, int b);
}

interface MinusInterface {
    int subtractNumbers (int a, int b);
}

interface TimesInterface {
    int multiplyNumbers (int a, int b);
}

interface DivideInterface {
    int divideNumbers (int a, int b);
}