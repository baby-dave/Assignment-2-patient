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

public class PatientDriverApp {

	public static void main(String[] args) {
		
	
		/**
		 * displays all info
		 */
		Patient p1= new Patient("Jenny","Elaine","Santori", "123 Main Street", "My Town",
				"CA","01234","240-678-8907", "Bill Santori","777-555-1212");
			System.out.println(p1.toString());
		
		Procedure p2= new Procedure("Physical Exam", "7/20/2029","Dr. Irvine",3250.0);
			System.out.println(p2.toString());
		
		Procedure p3= new Procedure("X-ray","7/20/2019","Dr. Jamison", 5500.43);
			System.out.println(p3.toString());
		
		Procedure p4= new Procedure("Blood Test", "7/20/2019","Dr. Smith",1400.75);
			System.out.println(p4.toString());
		
		double result=total(p2, p3, p4);
			System.out.println("Total charges: $"+result);
		
			System.out.println("\nStudent Name: Dave| Dawit Hailu"+
							"\nMC#: M21167331\n"+"Due Date: 06/12/2023");
		}
	
	/**
	 * 
	 * @param p2
	 * @param p3
	 * @param p4
	 * @return
	 */
	public static double total(Procedure p2, Procedure p3, Procedure p4) {
		
		double cost=p2.getProcedureCharges();
		double cost2=p3.getProcedureCharges();
		double cost3=p4.getProcedureCharges();
		
		double total=(cost+cost2+cost3);
		
		return total;
	}
}
