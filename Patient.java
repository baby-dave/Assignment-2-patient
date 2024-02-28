/*
 * Class: CMSC203 
 * Instructor: Professor Khandan
 * Description: The Patient class represents an individual who is a patient at a medical facility.
 * 				It stores various attributes related to the patient's personal information and emergency 
 * 				contact details.
 * 				The Procedure class represents a medical procedure that has been performed on a patient. 
 * 				It stores information about the procedure, such as its name, date, practitioner, and associated charges.
 * 				And the patient Driver class uses the patient and Procedure class and displays all the attributes.
 * Due: 02/27/20024
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: Dave|Dawit Hailu
*/
public class Patient {
	
	  private String firstName;
	    private String middleName;
	    private String lastName;
	    private String streetAddress;
	    private String city;
	    private String state;
	    private String zipCode;
	    private String phoneNumber;
	    private String emergencyContactName;
	    private String emergencyContactPhoneNumber;

	    // Constructors
	    /**
	     * 
	     */
	    public Patient() {
	        // No-arg constructor
	    }
	    
	    /**
	     * 
	     * @param firstName
	     * @param middleName
	     * @param lastName
	     */
	    public Patient(String firstName, String middleName, String lastName) {
	       // Parametrized constructor to initialize first, middle, and last name
	    	this.firstName = firstName;
	        this.middleName = middleName;
	        this.lastName = lastName;
	    }
	    /**
	     * 
	     * @param firstName
	     * @param middleName
	     * @param lastName
	     * @param streetAddress
	     * @param city
	     * @param state
	     * @param zipCode
	     * @param phoneNumber
	     * @param emergencyContactName
	     * @param emergencyContactPhoneNumber
	     */
	    public Patient(String firstName, String middleName, String lastName, 
	    		String streetAddress, String city, String state, String zipCode, 
	            String PhoneNumber, String emergencyContactName, String emergencyContactPhoneNumber) {
	        // Parametrized constructor to initialize all attributes
	    	 this.firstName = firstName;
	         this.middleName = middleName;
	         this.lastName = lastName;
	         this.streetAddress = streetAddress;
	         this.city = city;
	         this.state = state;
	         this.zipCode = zipCode;
	         this.phoneNumber = phoneNumber;
	         this.emergencyContactName = emergencyContactName;
	         this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	    }

	    
	    // Accessors for all attributes
	    // Mutators for all attributes
	   // Accessors
	    /**
	     * 
	     * @return string
	     */
	    public String getFirstName() {
	        return firstName;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getMiddleName() {
	        return middleName;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getLastName() {
	        return lastName;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getStreetAddress() {
	        return streetAddress;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getCity() {
	        return city;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getState() {
	        return state;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getZipCode() {
	        return zipCode;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getPhoneNumber() {
	        return phoneNumber;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getEmergencyContactName() {
	        return emergencyContactName;
	    }
	    /**
	     * 
	     * @return string
	     */
	    public String getEmergencyContactPhoneNumber() {
	        return emergencyContactPhoneNumber;
	    }

	    // Mutators
	    /**
	     * 
	     * @param firstName
	     */
	    public void setFirstName(String firstName) {
	        this.firstName = firstName;
	    }
	    /**
	     * 
	     * @param middleName
	     */
	    public void setMiddleName(String middleName) {
	        this.middleName = middleName;
	    }
	    /**
	     * 
	     * @param lastName
	     */
	    public void setLastName(String lastName) {
	        this.lastName = lastName;
	    }
	    /**
	     * 
	     * @param streetAddress
	     */
	    public void setStreetAddress(String streetAddress) {
	        this.streetAddress = streetAddress;
	    }
	    /**
	     * 
	     * @param city
	     */
	    public void setCity(String city) {
	        this.city = city;
	    }
	    /**
	     * 
	     * @param state
	     */
	    public void setState(String state) {
	        this.state = state;
	    }
	    /**
	     * 
	     * @param zipCode
	     */
	    public void setZipCode(String zipCode) {
	        this.zipCode = zipCode;
	    }
	    /**
	     * 
	     * @param phoneNumber
	     */
	   public void setPhoneNumber(String phoneNumber) {
		   	this.phoneNumber = phoneNumber;
	   	}
	   /**
	    * 
	    * @param emergencyContactName
	    */
	    public void setEmergencyContactName(String emergencyContactName) {
	        this.emergencyContactName = emergencyContactName;
	    }
	    /**
	     * 
	     * @param emergencyContactPhoneNumber
	     */
	    public void setEmergencyContactPhoneNumber(String emergencyContactPhoneNumber) {
	        this.emergencyContactPhoneNumber = emergencyContactPhoneNumber;
	    }
	    /**
	     * 
	     * @return
	     */
	    // Method to build full name
	    public String buildFullName() {
	        // Return the concatenation of first, middle, and last name separated by space
	    	return firstName+" "+middleName+" "+lastName;
	    }
	    /**
	     * 
	     * @return
	     */
	    // Method to build address
	    public String buildAddress() {
	        // Return the concatenation of address, city, state, and zip separated by space
	    	return streetAddress+" "+city+" "+state+" "+zipCode;
	    }
	    /**
	     * 
	     * @return
	     */
	    // Method to build emergency contact
	    public String buildEmergencyContact() {
	        // Return the concatenation of emergency contact name and phone separated by space
	    	return emergencyContactName+" "+emergencyContactPhoneNumber;
	    }

	    // toString method
	    @Override
	    public String toString() {
	        // Display all information of a patient using build methods
	    		    	
	    	StringBuilder builder = new StringBuilder();
	        builder.append("Patient Info:\n");
	        builder.append(" Name: ").append(buildFullName()).append("\n");
	        builder.append(" Address: ").append(buildAddress()).append("\n");
	        builder.append(" Emergency Contact: ").append(buildEmergencyContact()).append("\n");
	        return builder.toString();
	    
	}
}
