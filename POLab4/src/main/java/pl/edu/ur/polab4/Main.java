package pl.edu.ur.polab4;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO zad 4, 5
        
        Student student = new Student("Jan", "Nowak",123123,"inf",1);
        student.pokazDane();
        
        Student student1 = new Student("Jan", "Nowak");
        student1.pokazDane();
        
        Student student3 = new Student("inf",1);
        student3.pokazDane();
        
        Student student4 = new Student("Jan", "Nowak",123123);
        student4.pokazDane();
        
        
        
    }
    
}
