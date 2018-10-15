package Projects;

class Car {

    private String make, model;
    private int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    String getMake() {
        return make;
    }

    void setMake(String make) {
        this.make = make;
    }

    int getYear() {
        return year;
    }

    int setYear(int year) {
        return this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    boolean isAntique() {
        return 2018 - year >= 45;
    }
}