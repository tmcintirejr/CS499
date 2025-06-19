/**
 * Represents a mammal in the rescue system.
 * Inherits core attributes from RescueAnimal and introduces
 * mammal-specific details such as family, species, and tail length.
 */
public class Mammal extends RescueAnimal {

    private String family;     // Mammal family (e.g., dog, cat, monkey)
    private String species;    // Specific breed or type (e.g., Labrador, Persian)
    private String tailLength; // Mammal-specific physical trait

    /**
     * Constructs a Mammal object with all required attributes.
     *
     * @param name               animal name
     * @param family             animal family (e.g., dog, cat)
     * @param species            animal species or breed
     * @param gender             gender of the animal
     * @param age                age of the animal
     * @param weight             weight of the animal
     * @param acquisitionDate    date of acquisition
     * @param acquisitionLocation place of acquisition
     * @param reserved           whether the animal is reserved
     * @param inServiceCountry   country where the animal is deployed
     * @param trainingStatus     current training status
     * @param tailLength         tail length (mammal-specific attribute)
     */
    public Mammal(String name, String family, String species, String gender, String age, String weight,
                  String acquisitionDate, String acquisitionLocation, boolean reserved,
                  String inServiceCountry, String trainingStatus, String tailLength) {

        super(name, gender, age, weight, acquisitionDate,
              acquisitionLocation, reserved, inServiceCountry, trainingStatus);

        this.family = family;
        this.species = species;
        this.tailLength = tailLength;
    }

    /**
     * Gets the tail length of the mammal.
     * @return tail length as a string
     */
    public String getTailLength() {
        return tailLength;
    }

    /**
     * Sets the tail length of the mammal.
     * @param tailLength new tail length value
     */
    public void setTailLength(String tailLength) {
        this.tailLength = tailLength;
    }

    /**
     * Returns the type of animal.
     * @return string "Mammal"
     */
    @Override
    public String getAnimalType() {
        return "Mammal";
    }

    /**
     * Returns the animal family (e.g., dog, cat).
     * @return family name
     */
    @Override
    public String getFamily() {
        return family;
    }

    /**
     * Returns the species or breed of the mammal.
     * @return species name
     */
    @Override
    public String getSpecies() {
        return species;
    }
}
