public class Car extends Vehicle {
    public Car(String modelName) {
        setWheelsCount(4);
        setModelName(modelName);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}
