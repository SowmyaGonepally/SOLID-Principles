public class EligibilityCheck {

    private StudentDetails studentDetails;

    //dependency inversion- referring interface instead of creating an object. Avoiding tight coupling

    public EligibilityCheck(StudentDetails studentDetails)
    {
        this.studentDetails = studentDetails;
    }

    public boolean isEligible() {

        boolean isPassedOut= studentDetails.isPassedOut();
        double percentage= studentDetails.getPercentage();

        if( (isPassedOut && percentage>65) || (!isPassedOut && percentage>80))
            return true;
        else
            return false;

    }
}
