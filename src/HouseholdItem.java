public interface HouseholdItem {

    public double accept(CalculationVisitor visitor );
    public void accept(PackingVisitor visitor) ;
}
