package Projects;

public class PairOfDice6 
{
	private DieChapter5 die1 = new DieChapter5();
    private DieChapter5 die2 = new DieChapter5();

    private int sum;

    public int getDie1() {
        return die1.getFaceValue();
    }

    public void setDie1(int faceValue) {
        this.die1.setFaceValue(faceValue);
    }

    public int getDie2() {
        return die2.getFaceValue();
    }

    public void setDie2(int faceValue) {
        this.die2.setFaceValue(faceValue);
    }

    public int getSum() {
        return sum;
    }

    public int roll() {
        int faceValue1 = die1.roll();
        int faceValue2 = die2.roll();

        sum = faceValue1 + faceValue2;

        return sum;
    }
}
