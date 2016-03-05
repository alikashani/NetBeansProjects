/* 
    Service class for StudentClient application.

    Written by: Mohammad Ali Kashani
    Student ID: 733768
    Course: CS 38 - Java Programming
    Professor: Howard Dachslager, Albert Murtz
 */

package studentclient;

public class Student {
    
    String name;
    String ssn;
    double gpa;
    
    public Student (String newName, String newSSN, double newGPA) {
        name = newName;
        ssn = newSSN;
        gpa = newGPA;
    }
    
    public String getName() {
        
        return name;
    }
    
    public void setName(String newName) {
        name = newName;
    }
    
    public String getSSN() {
        
        return ssn;
    }
    
    public void setSSN(String newSSN) {
        ssn = newSSN;
    }
    
    public double getGPA() {
        
        return gpa;
    }
    
    public void setGPA(double newGPA) {
        if (newGPA < 0 || newGPA > 4.0)
            throw new  IllegalArgumentException("Invalid GPA entered!");
        else
            gpa = newGPA;            
    }
    
    public String convertToString() {
        String objString = name + "\n" + ssn + "\n" + gpa + "\n";
        return objString;
    }
    
    public boolean isEqualTo(Object obj) {
        boolean tof;
        if (obj.equals(this)){
            tof = true;
        } else {
            tof = false;
        }
        
        return tof;
    }
}
