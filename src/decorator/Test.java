package decorator;

public class Test {
    public static void main(String[] args) {
        Phone call = new ConretePhone();
        call.call();

        Phone call1 = new ConcreteSmartPhone1(call);
        call1.call();

        Phone call2 = new ConcreteSmartPhone2(call);
        call2.call();
    }
}
