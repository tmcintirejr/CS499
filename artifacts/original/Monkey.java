// Monkey class for monkeys in the rescue system
public class Monkey extends RescueAnimal {

    // Instance variables
    private String tailLength;
    private String height;
    private String bodyLength;
    private String species;
    
    // Available monkey species
    String[] monkeySpecies = {"Capuchin", "Guenon", "Macaque", "Marmoset", "Squirrel Monkey", "Tamarin"};
    
    // Constructor for monkey attributes
    public Monkey(String name, String gender, String age, String weight, String acquisitionDate, String acquisitionCountry, String trainingStatus, 
    		boolean reserved, String inServiceCountry, String tailLength, String height, String bodyLength, String species) {
    setName(name);
    setGender(gender);
    setAge(age);
    setWeight(weight);
    setAcquisitionDate(acquisitionDate);
    setAcquisitionLocation(acquisitionCountry);
    setTrainingStatus(trainingStatus);
    setReserved(reserved);
    setInServiceCountry(inServiceCountry);
    setTailLength(tailLength);
    setHeight(height);
    setBodyLength(bodyLength);
    setSpecies(species);
    }
    
    // Accessor method to get attribute followed by Mutator method to set attribute
    public String getTailLength() {
    	return tailLength;
    }
    public void setTailLength(String monkeyTailLength ) {
    	tailLength = monkeyTailLength;
    }
    public String getHeight() {
    	return height;
    }
    public void setHeight(String monkeyHeight) {
    	height = monkeyHeight;
    }
    public String getBodyLength() {
    	return bodyLength;
    }
    public void setBodyLength(String monkeyBodyLength) {
    	bodyLength = monkeyBodyLength;
    }
    public String getSpecies() {
    	return species;
    }
    public void setSpecies(String monkeySpecies) {
    	species = monkeySpecies;
    }
}
    
    
    