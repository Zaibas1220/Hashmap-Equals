import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    private static HashMap<RegistrationPlate, String> list = new HashMap<>();

    public static void main(String[] args) {
        RegistrationPlate reg1 = new RegistrationPlate("F1", "ABC-123");
        RegistrationPlate reg2 = new RegistrationPlate("F1", "UXE-456");
        RegistrationPlate reg3 = new RegistrationPlate("D", "B WQ-431");

        ArrayList<RegistrationPlate> finnish = new ArrayList<>();
        finnish.add(reg1);
        finnish.add(reg2);

        RegistrationPlate newReg = new RegistrationPlate("F1", "ABC-123");
        if (finnish.contains(newReg)) {
            finnish.add(newReg);
        }

        System.out.println("Finish: " + finnish);

        list.put(reg1, "Arto");
        list.put(reg3, "Jurgen");

        System.out.println("owners:");
        System.out.println(list.get(new RegistrationPlate("F1", "ABC-123")));
        System.out.println(list.get(new RegistrationPlate("D", "B WQ-431")));

        add(reg1, "Arto");
        add(reg3, "Jurgen");

        System.out.println(getList());

        printRegistrationPlates();
        printOwners();

        delete(reg3);

        printRegistrationPlates();
        printOwners();
    }

    public static boolean add(RegistrationPlate plate, String owner) {
        if (list.get(plate) == null){
            return false;
        }
        list.put(plate, owner);
        return true;
    }

    public static boolean delete(RegistrationPlate plate) {
        if (list.get(plate) == null){
            return false;
        }
        list.remove(plate);
        return true;
    }

    public static HashMap<RegistrationPlate, String> getList() {
        return list;
    }

    public static void printRegistrationPlates() {
        for (RegistrationPlate plate : list.keySet()){
            System.out.println(plate);
        }
    }

    public static void printOwners() {
        for (String owner : list.values()) {
            System.out.println(owner);
        }
    }
}
