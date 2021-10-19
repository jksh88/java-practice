public class Printer {
    private int tonerLevel;
    private int papersInTray;

    public Printer(int tonerLevel, int papersGiven) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.papersInTray = papersGiven;
    }

    public int addToner(int tonerAmount) {
        if (this.tonerLevel + tonerAmount < 0 || this.tonerLevel + tonerAmount > 100) {
            return -1;
        } else if (tonerAmount < 0) {
            return -1;
        } else if (tonerAmount > 0 && tonerAmount <= 100) {
            this.tonerLevel += tonerAmount;
        return this.tonerLevel;
        }
        return -1;
    }

    public int getRemainingPaper() {
        return papersInTray;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
