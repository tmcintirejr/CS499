/**
 * Represents a fish in the rescue system.
 * Extends RescueAnimal and adds a fin type field
 * specific to fish, along with family and species classification.
 */
public class Fish extends RescueAnimal {

    private String family;   // Fish family (e.g., carp, salmon, catfish)
    private String species;  // Specific fish species
    private String finType;  // Kingdom-specific attribute indicating fin structure

    /**
     * Constructs a Fish object with the specified attributes.
     *
     * @param name                fish's name
     * @param family              general fish family
     * @param species             specific fish species
     * @param gender              gender of the fish
     * @param age                 age of the fish
     * @param weight              weight of the fish
     * @param acquisitionDate     date fish was acquired
     * @param acquisitionLocation location fish was acquired from
     * @param reserved            true if reserved, false otherwise
     * @param inServiceCountry    country where fish is deployed
     * @param trainingStatus      current training status
     * @param finType             type of fin structure
     */
    public Fish(String name, String family, String species, String gender, String age, String weight,
                String acquisitionDate, String acquisitionLocation, boolean reserved, String inServiceCountry,
                String trainingStatus, String finType) {
        super(name, gender, age, weight, acquisitionDate, acquisitionLocation, reserved, inServiceCountry, trainingStatus);
        this.family = family;
        this.species = species;
        this.finType = finType;
    }

    /**
     * Gets the type of fin the fish has.
     * @return fin type
     */
    public String getFinType() {
        return finType;
    }

    /**
     * Gets the type of animal.
     * @return "Fish"
     */
    @Override
    public String getAnimalType() {
        return "Fish";
    }

    /**
     * Gets the family classification of the fish.
     * @return fish family
     */
    @Override
    public String getFamily() {
        return family;
    }

    /**
     * Gets the species of the fish.
     * @return fish species
     */
    @Override
    public String getSpecies() {
        return species;
    }

    /**
     * Checks if the fish is currently reserved.
     * @return true if reserved, false otherwise
     */
    @Override
    public boolean getReserved() {
        return super.getReserved();
    }
}
