package Java;

class Main{
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        Car car = new Car();
        car.license="AMQ123";
        car.driver="Andres Herrera";
        car.passengers=4;
        car.printDataCar();

        Car car2= new Car();
        car2.license="750BMR";
        car2.driver="Juan Perez";
        car2.passengers=3;
        car.printDataCar();
    }
}