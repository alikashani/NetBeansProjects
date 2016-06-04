package grade;

public class CourseGrade {
    // Fields
    public static String name;
    public static char letter;
    
    // Constructor
    public CourseGrade(String newName, char newLetter) {
        name = newName;
        letter = newLetter;
        System.out.println("New CourseGrade has been created!");
    }
    
    // Methods
    public static String getName() { return name; }
    
    public static String setName(String newName) {
        name = newName;
        return name;
    }
    
    public static char getLetter() { return letter; }
    
    public static char setLetter(char newLetter) {
        letter = newLetter;
        return letter;
    }
    
    @Override
    public String toString() {
        String objString = "";
        objString += "Name: " + this.getName() + "\n";
        objString += "Letter Grade: " + this.getLetter() + "\n";                
                
        return objString;
    }
    
    @Override
    public boolean equals(Object a) {
        boolean b = false;
        
        if (this == a) b = true;
        
        return b;
    }
}
