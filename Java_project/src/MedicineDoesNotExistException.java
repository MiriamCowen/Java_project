public class MedicineDoesNotExistException extends Exception{

    //Constructor
    public MedicineDoesNotExistException(String medicineName){
        System.out.println("ERROR: The medicine " + medicineName + " doesn't exists in the inventory. The search failed. \n");
    }
}
