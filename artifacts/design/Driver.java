import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main driver class for the Rescue Animal System.
 * Handles intake, reservation, and printing of various animal types.
 */
public class Driver {

    // Lists to store animals by kingdom category
    private static ArrayList<Mammal> mammals = new ArrayList<>();
    private static ArrayList<Bird> birds = new ArrayList<>();
    private static ArrayList<Reptile> reptiles = new ArrayList<>();
    private static ArrayList<Amphibian> amphibians = new ArrayList<>();
    private static ArrayList<Fish> fish = new ArrayList<>();
    private static ArrayList<Other> others = new ArrayList<>();

    /**
     * Entry point of the program.
     * Displays the main menu and processes user input.
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMainMenu();
            String selection = scnr.nextLine().toLowerCase();

            switch (selection) {
                case "1":
                    displayIntakeMenu(scnr);
                    break;
                case "2":
                    reserveAnimalById(scnr);
                    break;
                case "3":
                    displayAllAnimals();
                    break;
                case "q":
                    System.out.println("Exiting the program.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid selection. Try again.");
            }
        }

        scnr.close();
    }

    /**
     * Displays the main menu options.
     */
    private static void displayMainMenu() {
        System.out.println("\n==== Rescue Animal System Menu ====");
        System.out.println("[1] Intake a new animal");
        System.out.println("[2] Reserve an animal (by ID)");
        System.out.println("[3] Print a list of animals");
        System.out.println("[q] Quit application");
        System.out.print("Enter selection: ");
    }

    /**
     * Displays the intake submenu and routes based on animal kingdom.
     * @param scnr Scanner for user input
     */
    private static void displayIntakeMenu(Scanner scnr) {
        System.out.println("\nSelect Animal Type:");
        System.out.println("[1] Mammal");
        System.out.println("[2] Bird");
        System.out.println("[3] Reptile");
        System.out.println("[4] Amphibian");
        System.out.println("[5] Fish");
        System.out.println("[6] Other");
        System.out.print("Enter selection: ");

        String type = scnr.nextLine();

        switch (type) {
            case "1": intakeMammal(scnr); break;
            case "2": intakeBird(scnr); break;
            case "3": intakeReptile(scnr); break;
            case "4": intakeAmphibian(scnr); break;
            case "5": intakeFish(scnr); break;
            case "6": intakeOther(scnr); break;
            default: System.out.println("Invalid selection.");
        }
    }

    /**
     * Attempts to reserve an animal by unique ID.
     * @param scnr Scanner for user input
     */
    private static void reserveAnimalById(Scanner scnr) {
        System.out.print("Enter Animal ID to reserve: ");
        String id = scnr.nextLine();

        for (RescueAnimal animal : getAllAnimals()) {
            if (animal.getId().equalsIgnoreCase(id)) {
                if (animal.getReserved()) {
                    System.out.println("Animal is already reserved.");
                } else {
                    animal.setReserved(true);
                    System.out.println("Animal [" + id + "] reserved successfully.");
                }
                return;
            }
        }

        System.out.println("Animal with ID [" + id + "] not found.");
    }

    /**
     * Prints all animals from every kingdom.
     */
    private static void displayAllAnimals() {
        printAnimals("Mammals", mammals);
        printAnimals("Birds", birds);
        printAnimals("Reptiles", reptiles);
        printAnimals("Amphibians", amphibians);
        printAnimals("Fish", fish);
        printAnimals("Other", others);
    }

    /**
     * Prints formatted output of animals from a list.
     * @param label Category label
     * @param list Animal list
     * @param <T> Subclass of RescueAnimal
     */
    private static <T extends RescueAnimal> void printAnimals(String label, ArrayList<T> list) {
        System.out.println("\n[" + label + "]");
        if (list.isEmpty()) {
            System.out.println("None found.");
        } else {
            for (T animal : list) {
                System.out.println("ID: " + animal.getId() + ", Name: " + animal.getName() +
                        ", Family: " + animal.getFamily() + ", Species: " + animal.getSpecies() +
                        ", Reserved: " + animal.getReserved());
            }
        }
    }

    /**
     * Combines all animal lists into a single list for universal searching.
     * @return Combined list of all RescueAnimal objects
     */
    private static ArrayList<RescueAnimal> getAllAnimals() {
        ArrayList<RescueAnimal> all = new ArrayList<>();
        all.addAll(mammals);
        all.addAll(birds);
        all.addAll(reptiles);
        all.addAll(amphibians);
        all.addAll(fish);
        all.addAll(others);
        return all;
    }

    // ==================== INTAKE METHODS ====================

    // Each intake method below prompts the user for animal attributes,
    // instantiates an object of the appropriate class, assigns an ID,
    // and adds the animal to its corresponding list.

    private static void intakeMammal(Scanner scnr) {
        System.out.print("ID: ");
        String id = scnr.nextLine();
        System.out.print("Name: ");
        String name = scnr.nextLine();
        System.out.print("Species: ");
        String species = scnr.nextLine();
        System.out.print("Family: ");
        String family = scnr.nextLine();
        System.out.print("Gender: ");
        String gender = scnr.nextLine();
        System.out.print("Age: ");
        String age = scnr.nextLine();
        System.out.print("Weight: ");
        String weight = scnr.nextLine();
        System.out.print("Acquisition Date: ");
        String acquisitionDate = scnr.nextLine();
        System.out.print("Acquisition Location: ");
        String acquisitionLocation = scnr.nextLine();
        System.out.print("Training Status: ");
        String trainingStatus = scnr.nextLine();
        System.out.print("Reserved (true/false): ");
        boolean reserved = Boolean.parseBoolean(scnr.nextLine());
        System.out.print("In-Service Country: ");
        String inServiceCountry = scnr.nextLine();
        System.out.print("Tail Length: ");
        String tailLength = scnr.nextLine();

        Mammal mammal = new Mammal(name, species, gender, age, weight, acquisitionDate, acquisitionLocation,
                trainingStatus, reserved, inServiceCountry, tailLength, family);
        mammal.setId(id);
        mammals.add(mammal);
    }

    private static void intakeBird(Scanner scnr) {
        System.out.print("ID: ");
        String id = scnr.nextLine();
        System.out.print("Name: ");
        String name = scnr.nextLine();
        System.out.print("Species: ");
        String species = scnr.nextLine();
        System.out.print("Family: ");
        String family = scnr.nextLine();
        System.out.print("Gender: ");
        String gender = scnr.nextLine();
        System.out.print("Age: ");
        String age = scnr.nextLine();
        System.out.print("Weight: ");
        String weight = scnr.nextLine();
        System.out.print("Acquisition Date: ");
        String acquisitionDate = scnr.nextLine();
        System.out.print("Acquisition Location: ");
        String acquisitionLocation = scnr.nextLine();
        System.out.print("Training Status: ");
        String trainingStatus = scnr.nextLine();
        System.out.print("Reserved (true/false): ");
        boolean reserved = Boolean.parseBoolean(scnr.nextLine());
        System.out.print("In-Service Country: ");
        String inServiceCountry = scnr.nextLine();
        System.out.print("Wing Span: ");
        String wingSpan = scnr.nextLine();

        Bird bird = new Bird(name, species, gender, age, weight, acquisitionDate, acquisitionLocation,
                trainingStatus, reserved, inServiceCountry, wingSpan, family);
        bird.setId(id);
        birds.add(bird);
    }

    private static void intakeReptile(Scanner scnr) {
        System.out.print("ID: ");
        String id = scnr.nextLine();
        System.out.print("Name: ");
        String name = scnr.nextLine();
        System.out.print("Species: ");
        String species = scnr.nextLine();
        System.out.print("Family: ");
        String family = scnr.nextLine();
        System.out.print("Gender: ");
        String gender = scnr.nextLine();
        System.out.print("Age: ");
        String age = scnr.nextLine();
        System.out.print("Weight: ");
        String weight = scnr.nextLine();
        System.out.print("Acquisition Date: ");
        String acquisitionDate = scnr.nextLine();
        System.out.print("Acquisition Location: ");
        String acquisitionLocation = scnr.nextLine();
        System.out.print("Training Status: ");
        String trainingStatus = scnr.nextLine();
        System.out.print("Reserved (true/false): ");
        boolean reserved = Boolean.parseBoolean(scnr.nextLine());
        System.out.print("In-Service Country: ");
        String inServiceCountry = scnr.nextLine();
        System.out.print("Scale Texture: ");
        String texture = scnr.nextLine();

        Reptile reptile = new Reptile(name, species, gender, age, weight, acquisitionDate, acquisitionLocation,
                trainingStatus, reserved, inServiceCountry, texture, family);
        reptile.setId(id);
        reptiles.add(reptile);
    }

    private static void intakeAmphibian(Scanner scnr) {
        System.out.print("ID: ");
        String id = scnr.nextLine();
        System.out.print("Name: ");
        String name = scnr.nextLine();
        System.out.print("Species: ");
        String species = scnr.nextLine();
        System.out.print("Family: ");
        String family = scnr.nextLine();
        System.out.print("Gender: ");
        String gender = scnr.nextLine();
        System.out.print("Age: ");
        String age = scnr.nextLine();
        System.out.print("Weight: ");
        String weight = scnr.nextLine();
        System.out.print("Acquisition Date: ");
        String acquisitionDate = scnr.nextLine();
        System.out.print("Acquisition Location: ");
        String acquisitionLocation = scnr.nextLine();
        System.out.print("Training Status: ");
        String trainingStatus = scnr.nextLine();
        System.out.print("Reserved (true/false): ");
        boolean reserved = Boolean.parseBoolean(scnr.nextLine());
        System.out.print("In-Service Country: ");
        String inServiceCountry = scnr.nextLine();
        System.out.print("Skin Type: ");
        String skinType = scnr.nextLine();

        Amphibian amphibian = new Amphibian(name, species, gender, age, weight, acquisitionDate, acquisitionLocation,
                trainingStatus, reserved, inServiceCountry, skinType, family);
        amphibian.setId(id);
        amphibians.add(amphibian);
    }

    private static void intakeFish(Scanner scnr) {
        System.out.print("ID: ");
        String id = scnr.nextLine();
        System.out.print("Name: ");
        String name = scnr.nextLine();
        System.out.print("Species: ");
        String species = scnr.nextLine();
        System.out.print("Family: ");
        String family = scnr.nextLine();
        System.out.print("Gender: ");
        String gender = scnr.nextLine();
        System.out.print("Age: ");
        String age = scnr.nextLine();
        System.out.print("Weight: ");
        String weight = scnr.nextLine();
        System.out.print("Acquisition Date: ");
        String acquisitionDate = scnr.nextLine();
        System.out.print("Acquisition Location: ");
        String acquisitionLocation = scnr.nextLine();
        System.out.print("Training Status: ");
        String trainingStatus = scnr.nextLine();
        System.out.print("Reserved (true/false): ");
        boolean reserved = Boolean.parseBoolean(scnr.nextLine());
        System.out.print("In-Service Country: ");
        String inServiceCountry = scnr.nextLine();
        System.out.print("Fin Type: ");
        String finType = scnr.nextLine();

        Fish fishEntry = new Fish(name, species, gender, age, weight, acquisitionDate, acquisitionLocation,
                trainingStatus, reserved, inServiceCountry, finType, family);
        fishEntry.setId(id);
        fish.add(fishEntry);
    }

    private static void intakeOther(Scanner scnr) {
        System.out.print("ID: ");
        String id = scnr.nextLine();
        System.out.print("Name: ");
        String name = scnr.nextLine();
        System.out.print("Species: ");
        String species = scnr.nextLine();
        System.out.print("Family: ");
        String family = scnr.nextLine();
        System.out.print("Gender: ");
        String gender = scnr.nextLine();
        System.out.print("Age: ");
        String age = scnr.nextLine();
        System.out.print("Weight: ");
        String weight = scnr.nextLine();
        System.out.print("Acquisition Date: ");
        String acquisitionDate = scnr.nextLine();
        System.out.print("Acquisition Location: ");
        String acquisitionLocation = scnr.nextLine();
        System.out.print("Training Status: ");
        String trainingStatus = scnr.nextLine();
        System.out.print("Reserved (true/false): ");
        boolean reserved = Boolean.parseBoolean(scnr.nextLine());
        System.out.print("In-Service Country: ");
        String inServiceCountry = scnr.nextLine();
        System.out.print("Classification: ");
        String classification = scnr.nextLine();

        Other other = new Other(name, species, gender, age, weight, acquisitionDate, acquisitionLocation,
                trainingStatus, reserved, inServiceCountry, classification, family);
        other.setId(id);
        others.add(other);
    }
}
