package strategy;

public class StrategyDemo {
    public static void main(String[] args) {

        AddMethod addMethod = new AddMethod();
        Content content = new Content(addMethod);
        System.out.println("addMethod结果为 ： " + content.executeStrategy(1, 2));

        SubtractMethod subtractMethod = new SubtractMethod();
        content = new Content(subtractMethod);
        System.out.println("subtractMethod结果为 ： " + content.executeStrategy(1, 2));
    }
}
