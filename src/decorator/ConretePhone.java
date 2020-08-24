package decorator;

public class ConretePhone implements Phone{
    @Override
    public void call() {
        System.out.println("打电话......");
    }
}
