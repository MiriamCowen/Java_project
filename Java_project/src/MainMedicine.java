import java.util.ArrayList;

public class MainMedicine {
    public static void main(String[] args) throws InvalidEmailAddressException, MedicineAlreadyExistException, MedicineDoesNotExistException {

        //Creating a new inventory
        Inventory myInventory = new Inventory();

        //Sub array list
        ArrayList<Medicine> subArrayList = new ArrayList<>();

        //Validate that the following medicines have a correct email
        try {
        //3 medicines of each type
        Inhaler m1 = new Inhaler("Ventolin", "Company Ventolin", "ventolin@gmail.com", 48, 0, 2028, Medicine.MedicineType.INHALER, 2);
        Inhaler m11 = new Inhaler("albuterol", "Company  albuterol", " albuterol@gmail.com", 58, 1, 2030, Medicine.MedicineType.INHALER, 5);
        Inhaler m111 = new Inhaler("inhaler", "Company inhalers", "inhalers@gmail.com", 67, 1, 2027, Medicine.MedicineType.INHALER, 3);

        Pills m2 = new Pills("Tylenol", "Company Tylenol", "tylenol@gmail.com", 56, 2, 2028, Medicine.MedicineType.PILLS, 40);
        Pills m22 = new Pills("Aca-mol", "Company Aca-mol", "aca-mol@gmail.com", 78, 2, 2025, Medicine.MedicineType.PILLS, 25);
        Pills m222 = new Pills("Amoxicillin", "Company Amoxicillin", "Amoxicillin@gmail.com", 2, 0, 2028, Medicine.MedicineType.PILLS, 36);

        Syrup m3 = new Syrup("Nora-fen", "Company Nora-fen", "nora-fen@gmail.com", 35, 3, 2028, Medicine.MedicineType.SYRUP, 70);
        Syrup m32 = new Syrup("Nora-fen2", "Company Nora-fen2", "nora-fen2@gmail.com", 35, 3, 2028, Medicine.MedicineType.SYRUP, 70);
        Syrup m33 = new Syrup("NyQuil", "Company NyQuil", "nyquil@gmail.com", 58, 0, 2025, Medicine.MedicineType.SYRUP, 60);
        Syrup m333 = new Syrup("Cough Syrup", "Company Cough Syrups", "Coughsyrups@gmail.com", 99, 3, 2026, Medicine.MedicineType.SYRUP, 150);

        //Verify that the medicine name is stored with uppercase letters
        System.out.println("\n" + m1.getMedicineName());
        System.out.println("\n");

        //Test out the medicine to string function
        System.out.println("Test Inhaler m111 - " + m111.toString() + "\n");
        System.out.println("Test Pill m222 - " + m222.toString() + "\n");
        System.out.println("Test Syrup m333 - " + m333.toString() + "\n");

        //Test in stock function
        System.out.println("Is medicine m1 in stock? " + m1.inStock());
        System.out.println("-----------------------------------");
        System.out.println("Is medicine m2 in stock? " + m2.inStock());
        System.out.println("-----------------------------------");
        System.out.println("Is medicine m2 in stock? " + m3.inStock());
        System.out.println("-----------------------------------\n");

        //Test total inventory function
        m1.totalInventory();
        System.out.println("-----------------------------------");
        m2.totalInventory();
        System.out.println("-----------------------------------");
        m3.totalInventory();
        System.out.println("-----------------------------------\n");

        //Adding medicines to the inventory.
        try {
            myInventory.addMedicine(m1);
            myInventory.addMedicine(m11);
            myInventory.addMedicine(m111);
            myInventory.addMedicine(m2);
            myInventory.addMedicine(m22);
            myInventory.addMedicine(m222);
            myInventory.addMedicine(m3);
            myInventory.addMedicine(m33);
            myInventory.addMedicine(m333);
            myInventory.printAllMedicine();

            //Searching for a specific medicine by name
            Medicine foundMedicine = null;
            try {
                foundMedicine = myInventory.searchMedicineByName(m1);
                System.out.println("\nThe medicine found is: " + foundMedicine.getMedicineName());
                foundMedicine = myInventory.searchMedicineByName(m2);
                System.out.println("The medicine found is: " + foundMedicine.getMedicineName());

            //Searching for all medicines by type
            System.out.println("\nArray of medicine type Pills: \n");
            subArrayList = myInventory.searchMedicineByType(Medicine.MedicineType.PILLS);
            myInventory.printArray(subArrayList);
            System.out.println("\nArray of medicine type Syrup: \n");
            subArrayList = myInventory.searchMedicineByType(Medicine.MedicineType.SYRUP);
            myInventory.printArray(subArrayList);
            System.out.println("\nArray of medicine type Inhaler: \n");
            subArrayList = myInventory.searchMedicineByType(Medicine.MedicineType.INHALER);
            myInventory.printArray(subArrayList);

            //Print all medicines in stock
            System.out.println("\nArray of medicines in stock: \n");
            subArrayList = myInventory.getMedicineInStock(true);
            myInventory.printArray(subArrayList);
            //Print all medicines out of stock
            System.out.println("\nArray of medicines out of stock: \n");
            subArrayList = myInventory.getMedicineInStock(false);
            myInventory.printArray(subArrayList);
            System.out.println("\n");

            //Trying to add an existing medicine to inventory
            myInventory.addMedicine(m33);


        } catch (MedicineAlreadyExistException maee) {
            maee.printStackTrace();
        }

            //Searching for a non-existing medicine.
            foundMedicine = myInventory.searchMedicineByName(m32);
            System.out.println("The medicine found is: " + foundMedicine.getMedicineName());
        } catch (MedicineDoesNotExistException e) {
            e.printStackTrace();
        }

            //Trying to add 3 medicines (1 from each type) with an incorrect email
            Inhaler m1111 = new Inhaler("inhaler incorrect email", "Company inhalers", "inhal.ers@gmailcom", 67, 1, 2027, Medicine.MedicineType.INHALER, 3);
            System.out.println("\n" + m1111.toString() + "\n");
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

        //Starting new try and catch since the first Invalid email address error will cause program to stop after Inhaler m1111
        try {
            Pills m2222 = new Pills("Amoxicillin incorrect email", "Company Amoxicillin", "" +
                    "Amoxicillingmail.com", 2, 0, 2028, Medicine.MedicineType.PILLS, 36);
            System.out.println("\n" + m2222.toString() + "\n");
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }

        //Starting new try and catch since the second Invalid email address error will cause program to stop after Pills m2222
        try {
            Syrup m3333 = new Syrup("Cough Syrup incorrect email", "Company Cough Syrups", "@Coughsyrupsgmail.com", 99, 3, 2026, Medicine.MedicineType.SYRUP, 150);
            System.out.println("\n" + m3333.toString() + "\n");
        } catch (InvalidEmailAddressException ieae) {
            ieae.printStackTrace();
        }
    }
}














