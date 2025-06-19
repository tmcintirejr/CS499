/**
 * Abstract base class for all rescue animals.
 * Provides shared properties and behaviors for subclasses.
 */
public abstract class RescueAnimal {

    // Core attributes shared across all animal types
    private String id;
    private String name;
    private String gender;
    private String age;
    private String weight;
    private String acquisitionDate;
    private String acquisitionLocation;
    private String trainingStatus;
    private boolean reserved;
    private String inServiceCountry;

    /**
     * Constructs a RescueAnimal with the shared base attributes.
     *
     * @param name               the animal's name
     * @param gender             the animal's gender
     * @param age                the animal's age
     * @param weight             the animal's weight
     * @param acquisitionDate    the intake date of the animal
     * @param acquisitionLocation the location where the animal was acquired
     * @param reserved           reservation status
     * @param inServiceCountry   the country where the animal is in service
     * @param trainingStatus     training status (e.g., In Training, Available)
     */
    public RescueAnimal(String name, String gender, String age, String weight,
                        String acquisitionDate, String acquisitionLocation,
                        boolean reserved, String inServiceCountry, String trainingStatus) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
        this.acquisitionDate = acquisitionDate;
        this.acquisitionLocation = acquisitionLocation;
        this.reserved = reserved;
        this.inServiceCountry = inServiceCountry;
        this.trainingStatus = trainingStatus;
    }

    /** @return the unique ID of the animal */
    public String getId() {
        return id;
    }

    /** @param id sets the animal's unique ID */
    public void setId(String id) {
        this.id = id;
    }

    /** @return the animal's name */
    public String getName() {
        return name;
    }

    /** @param name sets the animal's name */
    public void setName(String name) {
        this.name = name;
    }

    /** @return the animal's gender */
    public String getGender() {
        return gender;
    }

    /** @param gender sets the animal's gender */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /** @return the animal's age */
    public String getAge() {
        return age;
    }

    /** @param age sets the animal's age */
    public void setAge(String age) {
        this.age = age;
    }

    /** @return the animal's weight */
    public String getWeight() {
        return weight;
    }

    /** @param weight sets the animal's weight */
    public void setWeight(String weight) {
        this.weight = weight;
    }

    /** @return the acquisition date */
    public String getAcquisitionDate() {
        return acquisitionDate;
    }

    /** @param acquisitionDate sets the acquisition date */
    public void setAcquisitionDate(String acquisitionDate) {
        this.acquisitionDate = acquisitionDate;
    }

    /** @return the location where the animal was acquired */
    public String getAcquisitionLocation() {
        return acquisitionLocation;
    }

    /** @param acquisitionLocation sets the acquisition location */
    public void setAcquisitionLocation(String acquisitionLocation) {
        this.acquisitionLocation = acquisitionLocation;
    }

    /** @return the current training status */
    public String getTrainingStatus() {
        return trainingStatus;
    }

    /** @param trainingStatus sets the training status */
    public void setTrainingStatus(String trainingStatus) {
        this.trainingStatus = trainingStatus;
    }

    /** @return true if reserved, false otherwise */
    public boolean getReserved() {
        return reserved;
    }

    /** @param reserved sets the reservation status */
    public void setReserved(boolean reserved) {
        this.reserved = reserved;
    }

    /** @return the country where the animal is in service */
    public String getInServiceCountry() {
        return inServiceCountry;
    }

    /** @param inServiceCountry sets the in-service country */
    public void setInServiceCountry(String inServiceCountry) {
        this.inServiceCountry = inServiceCountry;
    }

    /**
     * Abstract method to get the animal's general type (e.g., Mammal, Bird).
     * @return type of animal
     */
    public abstract String getAnimalType();

    /**
     * Abstract method to get the animal's family group (e.g., dog, cat).
     * @return family classification
     */
    public abstract String getFamily();

    /**
     * Abstract method to get the animal's species.
     * @return species name
     */
    public abstract String getSpecies();
}
