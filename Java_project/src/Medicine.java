public abstract class Medicine {

    //Properties
    private String medicineName = null;
    private String companyName = null;
    private String companyEmail = null;
    private double price = 0;
    private int quantity = 0;
    private int expirationYear = 0;
    public MedicineType medicineType;

    //Enum
    enum MedicineType {
        PILLS, SYRUP, INHALER
    }

    //Functions
    public abstract void totalInventory();{
    }

    public boolean inStock () {
        if (quantity>0)
            return true;
        else
            return false;
    }

    //To string
    public String toString() {
        return ("medicineName = " + medicineName + ", companyName = " + companyName + ", companyEmail = " + companyEmail + ", price = " + price +
                ", quantity = " + quantity + ", expirationYear = " + expirationYear + ", medicineType = " + medicineType);}

    //Constructor - empty
    public Medicine() {
    }

    //Constructor - full
    public Medicine(String medicineName, String companyName, String companyEmail, double price, int quantity, int expirationYear, MedicineType medicineType) throws InvalidEmailAddressException {
        setMedicineName(medicineName);
        setCompanyName(companyName);
        setCompanyEmail(companyEmail);
        setPrice(price);
        setQuantity(quantity);
        setExpirationYear(expirationYear);
        setMedicineType(medicineType);
    }

    //Setters
    public void setMedicineName(String medicineName) {
                //Medicine name stored with uppercase
        this.medicineName= medicineName.toUpperCase();
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    //Validation of correct email
    public void setCompanyEmail(String companyEmail)throws InvalidEmailAddressException {
        if (!companyEmail.contains("@"))
            throw new InvalidEmailAddressException(companyEmail, " does not contain a '@'.");
       if (!companyEmail.contains("."))
            throw new InvalidEmailAddressException(companyEmail, " does not contain a '.'.");
            //if (!companyEmail.contains("@")) - another option to have it included in if
        if (companyEmail.charAt(0) == ('@'))
            throw new InvalidEmailAddressException(companyEmail, " starts with a '@'.");
        if (companyEmail.endsWith("@"))
            throw new InvalidEmailAddressException(companyEmail, " ends with a '@'.");
        if ((companyEmail.indexOf("."))<(companyEmail.indexOf("@")))
            throw new InvalidEmailAddressException(companyEmail, " does not have a '.' after the '@'.");
        this.companyEmail = companyEmail;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setExpirationYear(int expirationYear) {
        this.expirationYear = expirationYear;
    }

    public void setMedicineType(MedicineType medicineType) {
        this.medicineType = medicineType;
    }

   //Getters
    public String getMedicineName() {
        return medicineName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCompanyEmail() {return companyEmail;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getExpirationYear() {
        return expirationYear;
    }

    public MedicineType getMedicineType() {
        return medicineType;
    }
}

