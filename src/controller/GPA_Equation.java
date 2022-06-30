package controller;

public class GPA_Equation implements Repository{
    
    private double currentPoints1;
    private double currentPoints2;
    private double CurrentTermGPA;
    private double previousPoints;
    private double CumulativeGPA;
    private int totalHours;
    
    public GPA_Equation() {
        //
    }

    public double pointsCounter() {
        currentPoints1 = 3 * (subject.getGPA1_hour3() +  subject.getGPA2_hour3() + subject.getGPA3_hour3() + subject.getGPA4_hour3() 
                + subject.getGPA5_hour3() + subject.getGPA6_hour3());
        
        currentPoints2 = 2 * (subject.getGPA1_hour2() +  subject.getGPA2_hour2() + subject.getGPA3_hour2() + subject.getGPA4_hour2() 
                + subject.getGPA5_hour2() + subject.getGPA6_hour2());

        return currentPoints1 + currentPoints2;        
    }
    
    @Override
    public double calculateTermGPA() {
        CurrentTermGPA = pointsCounter() / data.getTermHours();
        return CurrentTermGPA;
    }
    
    @Override
    public double calculateCumulativeGPA() {
        previousPoints = data.getPreviousGPA() * data.getPreviousCompletedHours();
        totalHours = data.getPreviousCompletedHours() + data.getTermHours();
        
        CumulativeGPA = (previousPoints + pointsCounter()) / totalHours;
        return CumulativeGPA;
    }
    
    @Override
    public void gradeType(String grade) {
        switch (grade) {
            
            case "A+":
                subject.setSubjectGPA(4);
                break;

            case "A":
                subject.setSubjectGPA(3.75);
                break;
                
            case "B+":
                subject.setSubjectGPA(3.4);
                break;
                
            case "B":
                subject.setSubjectGPA(3.1);
                break;
                
            case "C+":
                subject.setSubjectGPA(2.8);
                break;
                
            case "C":
                subject.setSubjectGPA(2.5);
                break;
                
            case "D+":
                subject.setSubjectGPA(2.25);
                break;
                
            case "D":
                subject.setSubjectGPA(2);
                break;
                
            case "F":
                subject.setSubjectGPA(1);
                break;
                
            case "Grade":
                subject.setSubjectGPA(0.0);
                break;
            
        }
    }
            
}
