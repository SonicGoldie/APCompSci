package Projects;

public class Die {

    private final int MAX = 6;
    private int faceValue;

    public Die() {
        this.faceValue = 1;
    }

    public int roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) {
        this.faceValue = faceValue;
    }

    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}