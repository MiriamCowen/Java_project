public class Syrup extends Medicine {

    //Properties
    private double bottleContent = 0;

    //Function
    @Override
    public void totalInventory() {
        System.out.println("The total amount of syrup is: " + getQuantity() * getBottleContent() + " milliliters.");
    }


    //To string
    @Override
    public String toString() {
        return super.toString() + (", bottleContent = " + bottleContent + " milliliters.");
    }

    //Constructor -empty
    public Syrup() {
    }

    //Constructor - full
    public Syrup(String medicineName, String companyName, String companyEmail, double price, int qauntity, int expirationYear, MedicineType medicineType, double bottleContent) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, qauntity, expirationYear, medicineType);
        setBottleContent(bottleContent);
    }

    //Set
    public void setBottleContent(double bottleContent) {
        this.bottleContent = bottleContent;
    }

    //Get
    public double getBottleContent() {
        return bottleContent;
    }
}
