import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Main driver class for the Rescue Animal System.
 * Handles intake, reservation, and printing of various animal types.
 */
public class Driver {

    // HashMaps to store animals by ID per kingdom
    private static Map<String, Mammal> mammals = new HashMap<>();
    private static Map<String, Bird> birds = new HashMap<>();
    private static Map<String, Reptile> reptiles = new HashMap<>();
    private static Map<String, Amphibian> amphibians = new HashMap<>();
    private static Map<String, Fish> fish = new HashMap<>();
    private static Map<String, Other> others = new HashMap<>();

    /**
     * Entry point of the program.
     * Displays the main menu and processes user input.
     */
    public static void main(String[] args) {
        // Initialize database tables on startup
        DatabaseUtility.createTables();

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
     * Updates both in-memory HashMap and database.
     * @param scnr Scanner for user input
     */
    private static void reserveAnimalById(Scanner scnr) {
        System.out.print("Enter Animal ID to reserve: ");
        String id = scnr.nextLine().toUpperCase();

        RescueAnimal animal = getAllAnimals().get(id);

        if (animal != null) {
            if (animal.getReserved()) {
                System.out.println("Animal is already reserved.");
            } else {
                animal.setReserved(true);
                System.out.println("Animal [" + id + "] reserved successfully.");

                // Update reservation in database
                DatabaseUtility.updateReservation(id, true);
            }
        } else {
            System.out.println("Animal with ID [" + id + "] not found.");
        }
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
     * @param map Animal map (HashMap)
     * @param <T> Subclass of RescueAnimal
     */
    private static <T extends RescueAnimal> void printAnimals(String label, Map<String, T> map) {
        System.out.println("\n[" + label + "]");
        if (map.isEmpty()) {
            System.out.println("None found.");
        } else {
            for (Map.Entry<String, T> entry : map.entrySet()) {
                T animal = entry.getValue();
                System.out.println("ID: " + animal.getId() + ", Name: " + animal.getName() +
                        ", Family: " + animal.getFamily() + ", Species: " + animal.getSpecies() +
                        ", Reserved: " + animal.getReserved());
            }
        }
    }

    /**
     * Combines all animal maps into a single map for universal searching.
     * @return Combined map of all RescueAnimal objects
     */
    private static Map<String, RescueAnimal> getAllAnimals() {
        Map<String, RescueAnimal> all = new HashMap<>();
        all.putAll(mammals);
        all.putAll(birds);
        all.putAll(reptiles);
        all.putAll(amphibians);
        all.putAll(fish);
        all.putAll(others);
        return all;
    }

    // ==================== INTAKE METHODS ====================

    // Each intake method below prompts the user for animal attributes,
    // instantiates an object of the appropriate class, assigns an ID,
    // adds the animal to its corresponding map, and inserts it into the database.

    private static void intakeMammal(Scanner scnr) {
        String id = prompt(scnr, "ID").toUpperCase();
        Mammal mammal = new Mammal(
                prompt(scnr, "Name"),
                prompt(scnr, "Family"),
                prompt(scnr, "Species"),
                prompt(scnr, "Gender"),
                prompt(scnr, "Age"),
                prompt(scnr, "Weight"),
                prompt(scnr, "Acquisition Date"),
                prompt(scnr, "Acquisition Location"),
                Boolean.parseBoolean(prompt(scnr, "Reserved (true/false)")),
                prompt(scnr, "In-Service Country"),
                prompt(scnr, "Training Status"),
                prompt(scnr, "Tail Length")
        );
        mammal.setId(id);
        mammals.put(id, mammal);

        // Insert into database
        DatabaseUtility.insertAnimal(mammal, mammal.getTailLength());
    }

    private static void intakeBird(Scanner scnr) {
        String id = prompt(scnr, "ID").toUpperCase();
        Bird bird = new Bird(
                prompt(scnr, "Name"),
                prompt(scnr, "Family"),
                prompt(scnr, "Species"),
                prompt(scnr, "Gender"),
                prompt(scnr, "Age"),
                prompt(scnr, "Weight"),
                prompt(scnr, "Acquisition Date"),
                prompt(scnr, "Acquisition Location"),
                Boolean.parseBoolean(prompt(scnr, "Reserved (true/false)")),
                prompt(scnr, "In-Service Country"),
                prompt(scnr, "Training Status"),
                prompt(scnr, "Wing Span")
        );
        bird.setId(id);
        birds.put(id, bird);

        DatabaseUtility.insertAnimal(bird, bird.getWingSpan());
    }

    private static void intakeReptile(Scanner scnr) {
        String id = prompt(scnr, "ID").toUpperCase();
        Reptile reptile = new Reptile(
                prompt(scnr, "Name"),
                prompt(scnr, "Family"),
                prompt(scnr, "Species"),
                prompt(scnr, "Gender"),
                prompt(scnr, "Age"),
                prompt(scnr, "Weight"),
                prompt(scnr, "Acquisition Date"),
                prompt(scnr, "Acquisition Location"),
                Boolean.parseBoolean(prompt(scnr, "Reserved (true/false)")),
                prompt(scnr, "In-Service Country"),
                prompt(scnr, "Training Status"),
                prompt(scnr, "Scale Texture")
        );
        reptile.setId(id);
        reptiles.put(id, reptile);

        DatabaseUtility.insertAnimal(reptile, reptile.getScaleTexture());
    }

    private static void intakeAmphibian(Scanner scnr) {
        String id = prompt(scnr, "ID").toUpperCase();
        Amphibian amphibian = new Amphibian(
                prompt(scnr, "Name"),
                prompt(scnr, "Family"),
                prompt(scnr, "Species"),
                prompt(scnr, "Gender"),
                prompt(scnr, "Age"),
                prompt(scnr, "Weight"),
                prompt(scnr, "Acquisition Date"),
                prompt(scnr, "Acquisition Location"),
                Boolean.parseBoolean(prompt(scnr, "Reserved (true/false)")),
                prompt(scnr, "In-Service Country"),
                prompt(scnr, "Training Status"),
                prompt(scnr, "Moisture Level")
        );
        amphibian.setId(id);
        amphibians.put(id, amphibian);

        DatabaseUtility.insertAnimal(amphibian, amphibian.getMoistureLevel());
    }

    private static void intakeFish(Scanner scnr) {
        String id = prompt(scnr, "ID").toUpperCase();
        Fish fishEntry = new Fish(
                prompt(scnr, "Name"),
                prompt(scnr, "Family"),
                prompt(scnr, "Species"),
                prompt(scnr, "Gender"),
                prompt(scnr, "Age"),
                prompt(scnr, "Weight"),
                prompt(scnr, "Acquisition Date"),
                prompt(scnr, "Acquisition Location"),
                Boolean.parseBoolean(prompt(scnr, "Reserved (true/false)")),
                prompt(scnr, "In-Service Country"),
                prompt(scnr, "Training Status"),
                prompt(scnr, "Fin Type")
        );
        fishEntry.setId(id);
        fish.put(id, fishEntry);

        DatabaseUtility.insertAnimal(fishEntry, fishEntry.getFinType());
    }

    private static void intakeOther(Scanner scnr) {
        String id = prompt(scnr, "ID").toUpperCase();
        Other other = new Other(
                prompt(scnr, "Name"),
                prompt(scnr, "Family"),
                prompt(scnr, "Species"),
                prompt(scnr, "Gender"),
                prompt(scnr, "Age"),
                prompt(scnr, "Weight"),
                prompt(scnr, "Acquisition Date"),
                prompt(scnr, "Acquisition Location"),
                Boolean.parseBoolean(prompt(scnr, "Reserved (true/false)")),
                prompt(scnr, "In-Service Country"),
                prompt(scnr, "Training Status"),
                prompt(scnr, "Behavior Pattern")
        );
        other.setId(id);
        others.put(id, other);

        DatabaseUtility.insertAnimal(other, other.getBehaviorPattern());
    }

    /**
     * Helper method for prompting user input.
     * @param scnr Scanner for input
     * @param field Field to prompt
     * @return String user input
     */
    private static String prompt(Scanner scnr, String field) {
        System.out.print(field + ": ");
        return scnr.nextLine();
    }
}
