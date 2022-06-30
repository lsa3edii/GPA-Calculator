package controller;

import model.*;

public interface Repository {
    
    Subject subject = new Subject();
    Data data = new Data();
    
    public double calculateTermGPA();
    public double calculateCumulativeGPA();
    public void gradeType(String grade);
    
}
