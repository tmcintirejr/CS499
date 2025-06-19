/**
 * Represents a reptile in the rescue system.
 * Inherits attributes from RescueAnimal and adds a reptile-specific
 * field for scale texture, along with family and species identifiers.
 */
public class Reptile extends RescueAnimal {

    private String family;         // Reptile family (e.g., lizard, turtle, snake)
    private String species;        // Specific reptile species (e.g., Iguana, Box Turtle)
    private String scaleTexture;   // Reptile-specific attribute describing scale texture

    /**
     * Constructs a Reptile object with all required attributes.
     *
     * @param name                reptile's name
     * @param family              reptile family group
     * @param species             specific reptile species
     * @param gender              gender of the reptile
     * @param age                 age of the reptile
     * @param weight              weight of the reptile
     * @param acquisitionDate     date reptile was acquired
     * @param acquisitionLocation location reptile was acquired from
     * @param reserved            true if reptile is reserved, false otherwise
     * @param inServiceCountry    country where reptile is deployed
     * @param trainingStatus      training status of the reptile
     * @param scaleTexture        description of the reptile's scale texture
     */
    public Reptile(String name, String family, String species, String gender, String age, String weight,
                   String acquisitionDate, String acquisitionLocation, boolean reserved,
                   String inServiceCountry, String trainingStatus, String scaleTexture) {
        super(name, gender, age, weight, acquisitionDate, acquisitionLocation, reserved, inServiceCountry, trainingStatus);
        this.family = family;
        this.species = species;
        this.scaleTexture = scaleTexture;
    }

    /**
     * Gets the scale texture of the reptile.
     * @return description of the reptile's scale texture
     */
    public String getScaleTexture() {
        return scaleTexture;
    }

    /**
     * Gets the type of animal.
     * @return "Reptile"
     */
    @Override
    public String getAnimalType() {
        return "Reptile";
    }

    /**
     * Gets the reptile's family classification.
     * @return family name
     */
    @Override
    public String getFamily() {
        return family;
    }

    /**
     * Gets the reptile's species.
     * @return species name
     */
    @Override
    public String getSpecies() {
        return species;
    }

    /**
     * Checks if the reptile is currently reserved.
     * @return true if reserved, false otherwise
     */
    @Override
    public boolean getReserved() {
        return super.getReserved();
    }
}
