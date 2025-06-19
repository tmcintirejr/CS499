/**
 * Adoptable interface defines shared adoption-related behaviors
 * for all rescue animals in the system.
 */
public interface Adoptable {

    /**
     * Returns the animal's unique ID.
     * @return ID string
     */
    String getId();

    /**
     * Returns the animal's name.
     * @return name string
     */
    String getName();

    /**
     * Indicates whether the animal is reserved.
     * @return true if reserved; false otherwise
     */
    boolean getReserved();

    /**
     * Updates the reserved status of the animal.
     * @param reserved true to mark as reserved; false otherwise
     */
    void setReserved(boolean reserved);

    /**
     * Returns the country where the animal is in service.
     * @return in-service country
     */
    String getInServiceCountry();

    /**
     * Sets the country where the animal is in service.
     * @param country new in-service country
     */
    void setInServiceCountry(String country);
}
