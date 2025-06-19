/**
 * Represents an amphibian in the rescue system.
 * Extends RescueAnimal and adds a moisture level field
 * specific to amphibians, along with family and species.
 */
public class Amphibian extends RescueAnimal {

    private String family;         // Amphibian family (e.g., frog, salamander)
    private String species;        // Specific amphibian species
    private String moistureLevel;  // Amphibian-specific attribute indicating skin moisture level

    /**
     * Constructs an Amphibian object with all required attributes.
     *
     * @param name                amphibian's name
     * @param family              amphibian family group
     * @param species             specific amphibian species
     * @param gender              gender of the amphibian
     * @param age                 age of the amphibian
     * @param weight              weight of the amphibian
     * @param acquisitionDate     date amphibian was acquired
     * @param acquisitionLocation location amphibian was acquired from
     * @param reserved            true if amphibian is reserved, false otherwise
     * @param inServiceCountry    country where amphibian is deployed
     * @param trainingStatus      training status of the amphibian
     * @param moistureLevel       amphibian-specific moisture level description
     */
    public Amphibian(String name, String family, String species, String gender, String age, String weight,
                     String acquisitionDate, String acquisitionLocation, boolean reserved,
                     String inServiceCountry, String trainingStatus, String moistureLevel) {
        super(name, gender, age, weight, acquisitionDate, acquisitionLocation, reserved, inServiceCountry, trainingStatus);
        this.family = family;
        this.species = species;
        this.moistureLevel = moistureLevel;
    }

    /**
     * Gets the moisture level of the amphibian.
     * @return moisture level description
     */
    public String getMoistureLevel() {
        return moistureLevel;
    }

    /**
     * Gets the type of animal.
     * @return "Amphibian"
     */
    @Override
    public String getAnimalType() {
        return "Amphibian";
    }

    /**
     * Gets the amphibian's family classification.
     * @return family name
     */
    @Override
    public String getFamily() {
        return family;
    }

    /**
     * Gets the amphibian's species.
     * @return species name
     */
    @Override
    public String getSpecies() {
        return species;
    }

    /**
     * Checks if the amphibian is currently reserved.
     * @return true if reserved, false otherwise
     */
    @Override
    public boolean getReserved() {
        return super.getReserved();
    }
}
