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
public class Procedure {
	
	 // Fields
    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double procedureCharges;

    // Constructors
    /**
     * 
     */
    public Procedure() {
        // No-arg constructor
    }
    /**
     * 
     * @param procedureName
     * @param procedureDate
     */
    public Procedure(String procedureName, String procedureDate) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
    }
    /**
     * 
     * @param procedureName
     * @param procedureDate
     * @param practitionerName
     * @param procedureCharges
     */
    public Procedure(String procedureName, String procedureDate, String practitionerName, double procedureCharges) {
        this.procedureName = procedureName;
        this.procedureDate = procedureDate;
        this.practitionerName = practitionerName;
        this.procedureCharges = procedureCharges;
    }
    
    // Accessors for all attributes
    // Mutators for all attributes
    /**
     * 
     * @return string
     */
    public String getProcedureName() {
        return procedureName;
    }
    /**
     * 
     * @return string
     */
    public String getProcedureDate() {
        return procedureDate;
    }
    /**
     * 
     * @return string
     */
    public String getPractitionerName() {
        return practitionerName;
    }
    /**
     * 
     * @return string
     */
    public double getProcedureCharges() {
        return procedureCharges;
    }

    // Mutators
    /**
     * 
     * @param procedureName
     */
    public void setProcedureName(String procedureName) {
        this.procedureName = procedureName;
    }
    /**
     * 
     * @param procedureDate
     */
    public void setProcedureDate(String procedureDate) {
        this.procedureDate = procedureDate;
    }
    /**
     * 
     * @param practitionerName
     */
    public void setPractitionerName(String practitionerName) {
        this.practitionerName = practitionerName;
    }
    /**
     * 
     * @param procedureCharges
     */
    public void setProcedureCharges(double procedureCharges) {
        this.procedureCharges = procedureCharges;
    }

    

    // toString method
    @Override
    public String toString() {
        // Display all information of a procedure
    	
    	StringBuilder builder = new StringBuilder();
        
        builder.append("\tProcedure: ").append(procedureName).append("\n");
        builder.append("\tProcedureDate: ").append(procedureDate).append("\n");
        builder.append("\tPractitioner: ").append(practitionerName).append("\n");
        builder.append("\tCharges: ").append(procedureCharges).append("\n");
        return builder.toString();
    }
}
