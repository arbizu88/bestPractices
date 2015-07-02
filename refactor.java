public boolean function1(Person person, boolean isTrue)
{
     
    String String1 = person.getName(); 

	if (string1.equals("Nombre")){
        isTrue = true;
    }else{
        isTrue = false;
    }
    
	return isTrue;

}


==================================================
    
function askDelete() {
    if (confirm("Are you sure you want to delete?") == true)
        return true;
    else
        return false;
}        

//=========================Pronounceable Names=========================
    
class DtaRcrd102 {
    private Date genymdhms; // (generation date, year, month, day, hour, minute, second)
    private Date modymdhms;
    private final String pszqint = "102";
   /* ... */
};

//=======================Meaningful Names==========================
	
//The name of a variable, function, or class, should answer all the big questions.

int d; // elapsed time in days

//The name d reveals nothing. It does not evoke a sense of elapsed time, nor of days.

int elapsedTimeInDays;
int daysSinceCreation;
int daysSinceModification;
int fileAgeInDays;


//=========================Comments========================
	
//“Don’t comment bad code—rewrite it.”
//Explain Yourself in Code

	
// Check to see if the employee is eligible for full benefits
if ((employee.flags & HOURLY_FLAG) &&  (employee.age > 65)) 

//Or this?
if (employee.isEligibleForFullBenefits())