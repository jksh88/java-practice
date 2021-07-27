public class TotalEstimate {
    private Floor floor;
    private Carpet carpet;

    public TotalEstimate(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return floor.getArea() * carpet.getCarpetCost();
    }
}
