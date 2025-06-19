/**
 * Represents an animal that does not fall into standard biological kingdoms
 * such as mammals, birds, reptiles, etc. Examples include insects, jellyfish, and snails.
 * Extends RescueAnimal and adds a unique behavior pattern attribute.
 */
public class Other extends RescueAnimal {

    private String family;          // General category (e.g., insect, snail, jellyfish)
    private String species;         // Specific species within the category
    private String behaviorPattern; // Unique behavioral trait or classification

    /**
     * Constructs an Other animal with all required attributes.
     *
     * @param name                name of the animal
     * @param family              general family or classification
     * @param species             specific species
     * @param gender              gender of the animal
     * @param age                 age of the animal
     * @param weight              weight of the animal
     * @param acquisitionDate     date acquired by the organization
     * @param acquisitionLocation location where acquired
     * @param reserved            true if reserved for service, false otherwise
     * @param inServiceCountry    current assigned country
     * @param trainingStatus      training completion status
     * @param behaviorPattern     unique behavioral identifier
     */
    public Other(String name, String family, String species, String gender, String age, String weight,
                 String acquisitionDate, String acquisitionLocation, boolean reserved, String inServiceCountry,
                 String trainingStatus, String behaviorPattern) {
        super(name, gender, age, weight, acquisitionDate, acquisitionLocation, reserved, inServiceCountry, trainingStatus);
        this.family = family;
        this.species = species;
        this.behaviorPattern = behaviorPattern;
    }

    /**
     * Gets the behavioral pattern of the animal.
     * @return behavior pattern string
     */
    public String getBehaviorPattern() {
        return behaviorPattern;
    }

    /**
     * Returns the animal type as a string.
     * @return "Other"
     */
    @Override
    public String getAnimalType() {
        return "Other";
    }

    /**
     * Returns the family classification.
     * @return general family or group
     */
    @Override
    public String getFamily() {
        return family;
    }

    /**
     * Returns the specific species name.
     * @return species name
     */
    @Override
    public String getSpecies() {
        return species;
    }

    /**
     * Returns the reservation status.
     * @return true if reserved, false otherwise
     */
    @Override
    public boolean getReserved() {
        return super.getReserved();
    }
}
