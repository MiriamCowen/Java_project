public class Pills extends Medicine {

    //Properties
    private double numOfPillsInBox = 0;

    //Function
    @Override
    public void totalInventory() {
        System.out.println("The total amount of pills are: " + getQuantity()*getNumOfPillsInBox());
    }

    //To string
    @Override
    public String toString() {
        return super.toString() + (", numOfPillsInBox = " + numOfPillsInBox);
    }

    //Constructor -empty
    public Pills() {
    }

    //Constructor - full
    public Pills(String medicineName, String companyName, String companyEmail, double price, int qauntity, int expirationYear, MedicineType medicineType, double numOfPillsInBox) throws InvalidEmailAddressException {
        super(medicineName, companyName, companyEmail, price, qauntity, expirationYear, medicineType);
        setNumOfPillsInBox(numOfPillsInBox);
    }

    //Set
    public void setNumOfPillsInBox(double numOfPillsInBox) {
        this.numOfPillsInBox = numOfPillsInBox;
    }

    //Get
    public double getNumOfPillsInBox() {
        return numOfPillsInBox;
    }
}
