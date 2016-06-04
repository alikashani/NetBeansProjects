package grade;

public class Grade {
    
    public static void main(String[] args) {
        
        CourseGrade java = new CourseGrade("CS 38 - Java Programming", 'A');
        
        
        System.out.println(java.getName());        
        System.out.println(java.setName("CS 6B - Discrete Math II"));        
        System.out.println(java.getLetter());        
        System.out.println(java.setLetter('B'));        
        System.out.println(java.toString());
        
        CourseGrade c = new CourseGrade("CS 36 - C Programming", 'A');
        
        System.out.println(c.getName());        
        System.out.println(c.setName("MATH 4A - Calculus III"));        
        System.out.println(c.getLetter());        
        System.out.println(c.setLetter('C'));       
        System.out.println(c.toString());     
        System.out.println(c.equals(java));
        System.out.println(c.equals(c));
        System.out.println(java.equals(java));
        
    }
    
}
