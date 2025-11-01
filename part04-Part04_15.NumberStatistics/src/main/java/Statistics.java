
public class Statistics {
    private int count;
    private int number;

    public Statistics() {
        this.count = count;
        this.number = number;
    }

    public void addNumber(int number) {
        this.number += number;
        this.count += 1;
    }

    public int getCount() {
        return this.count;
    }

    public int sum() {
        if (this.number != 0) {
            return this.number;
        } else {
            return 0;
        }
    }

    public double average() {
        if (this.number != 0) {
            return 1.0 * this.number / this.count;
        } else {
            return 0;
        }
    }
}
