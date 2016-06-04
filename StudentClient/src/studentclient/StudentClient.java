/*
    Written by: Mohammad Ali Kashani
    Student ID: 733768
    Course: CS 38 - Java Programming
    Professor: Howard Dachslager, Albert Murtz
    
    This program will 
*/
package studentclient;

public class StudentClient {

    public static void main(String[] args) {
        
        Student s1, s2;
        
        s1 = new Student("Ali Kashani", "1234567", 3.0);
        s2 = new Student("Eela Rabbani", "7654321", 4.0);
        
        System.out.println(s1.getName());
        System.out.println(s1.getSSN());
        System.out.println(s1.getGPA());
        
        System.out.println(s2.toString());
        
        if (s2.equals(s1))
            System.out.println("The compared objects are equal!");
        else {
            System.out.println("The objects are NOT equal.");
            s2.setName("Ali Kashani");
            s2.setSSN("1234567");
            s2.setGPA(3.0);
            System.out.println("The objects are now equal");
        }
        
    }
    
}
