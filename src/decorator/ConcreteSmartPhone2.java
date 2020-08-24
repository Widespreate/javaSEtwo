package decorator;

public class ConcreteSmartPhone2 extends SmartPhone {
    public ConcreteSmartPhone2(Phone phone){
        super(phone);
    }
    public void call(){
        super.call();
        //额外的新功能
        changeSize();
    }
    public void changeSize(){
        System.out.println("智能改变尺寸");
    }
}
