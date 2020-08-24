package decorator;

public class ConcreteSmartPhone1 extends SmartPhone{
    public ConcreteSmartPhone1(Phone phone){
        super(phone);
    }
    public void call(){
        super.call();
        //额外的新功能
        changeColor();
    }
    public void changeColor(){
        System.out.println("智能变色");
    }

}
