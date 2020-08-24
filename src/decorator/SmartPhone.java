package decorator;

public abstract class SmartPhone implements Phone{
   private Phone phone;//装饰者 持有 主题的一个引用
   public SmartPhone(Phone phone){
      this.phone = phone;
   }
   public SmartPhone(){
   }

   //装饰着包含原主题已有的功能
   @Override
   public void call() {
      phone.call();
   }
}
