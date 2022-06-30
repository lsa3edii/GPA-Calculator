package model;

public class Data {
    
    private double previousGPA;
    private int previousCompletedHours;
    private int termHours;

    public Data() {
        
    }
    
    public double getPreviousGPA() {
        return this.previousGPA;
    }
    
    public void setPreviousGPA(double previousGPA) {
        this.previousGPA = previousGPA;
    }

    public int getPreviousCompletedHours() {
        return this.previousCompletedHours;
    }
    
    public void setPreviousCompletedHours(int previousCompletedHours) {
        this.previousCompletedHours = previousCompletedHours;
    }
    
    public int getTermHours() {
        return this.termHours;
    }
    
    public void setTermHours(int termHours) {
        this.termHours = termHours;
    }
        
}
