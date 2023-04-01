public class Truck extends Car {
    public Truck(String modelName, int wheelsCount) {
        super(modelName);
        setWheelsCount(wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
