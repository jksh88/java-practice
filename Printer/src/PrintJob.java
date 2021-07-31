public class PrintJob {
    private int jobId = 1;
    private int pagesPrinted;
    private int paperUsed;
    private boolean isDoubleSided;

    public PrintJob(int jobId, int pagesPrinted, int paperUsed, boolean isDoubleSided) {
        this.jobId = jobId;
        this.pagesPrinted = pagesPrinted;
        this.paperUsed = paperUsed;
        this.isDoubleSided = isDoubleSided;
    }

    public int getPaperUsed() {
        if (this.isDoubleSided) {
            this.paperUsed = pagesPrinted % 2 == 0 ? pagesPrinted / 2 : pagesPrinted /2 + 1;
        }
        return paperUsed;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setPagesPrinted(int howManyPages) {
        this.pagesPrinted = howManyPages;
    }
}
