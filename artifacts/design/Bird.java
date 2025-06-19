/**
 * Represents a bird in the rescue system.
 * Inherits shared attributes from RescueAnimal and introduces
 * bird-specific details such as family, species, and wingspan.
 */
public class Bird extends RescueAnimal {

    private String family;      // Bird family (e.g., eagle, parrot)
    private String species;     // Specific type or breed (e.g., Bald Eagle, Macaw)
    private String wingSpan;    // Bird-specific attribute for wing span

    /**
     * Constructs a Bird object with all required attributes.
     *
     * @param name               bird's name
     * @param family             bird family (e.g., eagle, parrot)
     * @param species            specific bird species or type
     * @param gender             gender of the bird
     * @param age                age of the bird
     * @param weight             weight of the bird
     * @param acquisitionDate    date of acquisition
     * @param acquisitionLocation location where bird was acquired
     * @param reserved           whether the bird is currently reserved
     * @param inServiceCountry   country where bird is deployed
     * @param trainingStatus     training status of the bird
     * @param wingSpan           wingspan measurement of the bird
     */
    public Bird(String name, String family, String species, String gender, String age, String weight,
                String acquisitionDate, String acquisitionLocation, boolean reserved,
                String inServiceCountry, String trainingStatus, String wingSpan) {

        super(name, gender, age, weight, acquisitionDate,
              acquisitionLocation, reserved, inServiceCountry, trainingStatus);

        this.family = family;
        this.species = species;
        this.wingSpan = wingSpan;
    }

    /**
     * Gets the wingspan of the bird.
     * @return wingspan as a string
     */
    public String getWingSpan() {
        return wingSpan;
    }

    /**
     * Sets the wingspan of the bird.
     * @param wingSpan new wingspan value
     */
    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }

    /**
     * Returns the animal type.
     * @return string "Bird"
     */
    @Override
    public String getAnimalType() {
        return "Bird";
    }

    /**
     * Returns the bird family.
     * @return bird family name
     */
    @Override
    public String getFamily() {
        return family;
    }

    /**
     * Returns the bird species.
     * @return species name
     */
    @Override
    public String getSpecies() {
        return species;
    }
}
