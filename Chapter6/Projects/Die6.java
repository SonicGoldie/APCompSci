package Projects;

public class Die6 
{
	private final int MAX = 6;
    private int faceValue;

    public Die6() {
        this.faceValue = 1;
    }

    public int roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
        return faceValue;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(int faceValue) 
    {
    	if (faceValue >= 6)
    		this.faceValue = faceValue;
    }

    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }
}
