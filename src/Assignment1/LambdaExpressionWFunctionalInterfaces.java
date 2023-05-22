package Assignment1;

public class LambdaExpressionWFunctionalInterfaces {
    public static void main(String[] args) {
        CustomFunctional customFunctionalInterfaces;
        customFunctionalInterfaces = () -> System.out.println("Hello");

        customFunctionalInterfaces.show();

    }
}
