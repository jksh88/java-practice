public class PrintJob extends Printer {
    private int jobId = 1;
    private int pagesPrinted;
    private int paperUsed;
    private boolean isDoubleSided;

    public PrintJob(int tonerLevel, int papersGiven, int jobId, int pagesPrinted, boolean isDoubleSided) {
        super(tonerLevel, papersGiven);
        this.jobId = jobId;
        this.pagesPrinted = pagesPrinted;
        this.isDoubleSided = isDoubleSided;
    }

    public int getPaperUsed() {
        if (this.isDoubleSided) {
            paperUsed = pagesPrinted % 2 == 0 ? pagesPrinted / 2 : pagesPrinted /2 + 1;
        }
        return paperUsed;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setPagesPrinted(int howManyPages) {
        this.pagesPrinted = howManyPages;
    }

    public int addToner(int tonerAmount) {
        return super.addToner(tonerAmount);
    }

//    @Override
//    public int getTonerLevel() {
//
//    }
}
