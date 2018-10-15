package Projects;

class Sphere {

    private int diameter;

    Sphere(int diameter) {
        this.diameter = diameter;
    }

    double getSurfaceArea() {
        return 4 * Math.PI * Math.pow(diameter / 2, 2);
    }

    double getVolume() {
        return (double) (4 / 3) * Math.PI * Math.pow(diameter / 2, 2);
    }

    void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    int getDiameter() {
        return diameter;
    }

    public String toString() {
        return "Diameter: " + diameter + " Surface Area: " + getSurfaceArea() + " Volume: " + getVolume();
    }
}