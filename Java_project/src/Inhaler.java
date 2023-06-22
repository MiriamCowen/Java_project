public class Inhaler extends Medicine {

    //Properties
    private double amountOfClick = 0;

    //Function
    @Override
    public void totalInventory() {
        System.out.println("The amount of inhalers are: " + getQuantity());
    }

    //To string
    @Override
    public String toString() {
        return super.toString() + (", amountOfClick = " + amountOfClick);
    }

    //Constructor -empty
    public Inhaler() {
    }

    //Constructor - full
    public Inhaler(String medicineName, String companyName, String companyEmail, double price, int qauntity, int expirationYear, MedicineType medicineType, double amountOfClick) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, qauntity, expirationYear, medicineType);
        setAmountOfClick(amountOfClick);
    }

    //Set
    public void setAmountOfClick(double amountOfClick) {
        this.amountOfClick = amountOfClick;
    }

    //Get
    public double getAmountOfClick() {
        return amountOfClick;
    }
}
