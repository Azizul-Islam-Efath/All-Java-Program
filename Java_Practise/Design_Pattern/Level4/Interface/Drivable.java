package Level4.Interface;

public interface Drivable {
    public void start();
    public void stop();
}

class Car implements Drivable{
    public void start(){
        System.out.println("The Car has started .");
    }

    public void stop(){
        System.out.println("The Car has stopped .");
    }

}

class Bike implements Drivable{
    public void start(){
        System.out.println("The Bike has started .");
    }

    public void stop(){
        System.out.println("The Bike has stopped .");
    }

    public static void main(String[] args) {
        Drivable C = new Car();
        C.start();
        C.stop();

        Drivable B = new Bike();
        B.start();
        B.stop();
    }

}
