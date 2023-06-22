public class MedicineAlreadyExistException extends Exception{

    //Constructor
    public MedicineAlreadyExistException(String medicineName){
        System.out.println("ERROR: The medicine " + medicineName + " already exists in the inventory, it can't be added. \n");
    }
}
