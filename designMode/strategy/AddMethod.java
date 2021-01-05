package strategy;

public class AddMethod implements Strategy{

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2 ;
    }
}
