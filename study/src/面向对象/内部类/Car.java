package 面向对象.内部类;

public class Car {
    String carName;
    int carAge;
    String  carColor;
    public void show(Car this){
        System.out.println(this.carName);
        Engine e=new Engine();
        System.out.println(e.engineName);
    }
    class Engine{
        String engineName;
        int engineAge;
        public  void  show(){
            System.out.println(engineName);
            System.out.println(carName);
        }
    }
}
