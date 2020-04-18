import vehicles.Car;

public class VehiclesMain {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0]= new Car("BMW","e46");
        //CTR D
        cars[1]= new Car("Fiat","Punto");
        cars[2]= new Car("Mercedes","AMG");
        cars[3]= new Car("Audi","A6");
        cars[4]= new Car("Subaru","Impreza WRX");

        cars[2].setModel("A7");

        for (Car myCars: cars) {
            myCars.show();
        }



    }
}
