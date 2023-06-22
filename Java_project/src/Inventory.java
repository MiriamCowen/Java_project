import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Inventory<myPillsList> {
    ArrayList<Medicine> MedicineInStock = new ArrayList<Medicine>();

    //Public array list
    private ArrayList<Medicine> myMedicineList = new ArrayList<Medicine>();

    //function - add medicine + MedicineAlreadyExistException exception
    public void addMedicine(Medicine medicineM) throws MedicineAlreadyExistException {
        for (Medicine medicineI : myMedicineList) {
            if (medicineM.getMedicineName().equals(medicineI.getMedicineName()))
                throw new MedicineAlreadyExistException(medicineM.getMedicineName());
        }
        myMedicineList.add(medicineM);
    }

    //function - search medicine by name + MedicineDoesNotExistException exception
    public Medicine searchMedicineByName(Medicine medicineM) throws MedicineDoesNotExistException {
        for (Medicine medicineI : myMedicineList) {
            if (medicineM.getMedicineName().equalsIgnoreCase(medicineI.getMedicineName()))
                return medicineM;
        }
        throw new MedicineDoesNotExistException(medicineM.getMedicineName());
    }

    //function - Search medicine by type
    public ArrayList<Medicine> searchMedicineByType(Medicine.MedicineType medicineType) {
        //Array list for medicine type
        ArrayList<Medicine> myMedicineType = new ArrayList<Medicine>();
        for (Medicine medicineM : myMedicineList) {
            if (medicineM.getMedicineType() == medicineType)
                myMedicineType.add(medicineM);
        }
        return myMedicineType;
    }

    //function - Print sub array list
    public void printArray (ArrayList <Medicine> arrMedicine) {
        for (Medicine medicineM : arrMedicine) {
            System.out.println(medicineM.getMedicineName() + "**********");
            System.out.println(medicineM.toString());
        }
    }

    //Search medicine in stock + medicines not in stock
    public ArrayList<Medicine> getMedicineInStock(boolean inStock) {
        ArrayList<Medicine> MedicineInStock = new ArrayList<Medicine>();
        for (Medicine medicineM:myMedicineList){
            if (medicineM.inStock()==inStock)
                MedicineInStock.add(medicineM);
            }
        return MedicineInStock;
    }

    //Print all the medicines added to the inventory
        public void printAllMedicine () {
            System.out.println("\n");
            System.out.println("The following are the medicines in the inventory: ");
            System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            for (Medicine medicineI : myMedicineList) {
                System.out.println(medicineI.toString());
                System.out.println("--------------------------------------------------------------------------------------------------------------------------");
            }
        }

        //Get
    public ArrayList<Medicine> getMyMedicineList() {
        return myMedicineList;
    }
}
























