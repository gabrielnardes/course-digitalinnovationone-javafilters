import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String color = sc.next();
            String shirtSize = sc.nextLine();
            
            students.add(new Student(name, color, shirtSize));
        }
        
        Comparator <Student> comparator = Comparator
                .comparing(Student::getColor).reversed()
                .thenComparing(Student::getShirtSize).reversed()
                .thenComparing(Student::getName);
        
        students.stream().sorted(comparator).forEach(System.out::println);
        
        sc.close();
    }
}

class Student {
    private String name;
    private String color;
    private String shirtSize;
    
    public Student (String name, String color, String shirtSize) {
        this.name = name;
        this.color = color;
        this.shirtSize = shirtSize;
    }
    
    public void print() {
        System.out.printf("%s: %s - %s\n", name, color, shirtSize);
    }
    
    public String getName() {
        return name;
    }
    
    public String getColor() {
        return color;
    }
    
    public String getShirtSize() {
        return shirtSize;
    }
    
    @Override
    public String toString() {
        return color + " " + shirtSize + " " + name;
    }
}
