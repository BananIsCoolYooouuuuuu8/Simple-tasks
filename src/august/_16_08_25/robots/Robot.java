package august._16_08_25.robots;

public abstract class Robot {

    protected String name;
    protected String dateOfManufacture;

    public Robot(String name, String dateOfManufacture) {
        this.name = name;
        this.dateOfManufacture = dateOfManufacture;
    }

    @Override
    public String toString() {
        return "Robot: " + name + ", manufactured: " + dateOfManufacture;
    }
}
