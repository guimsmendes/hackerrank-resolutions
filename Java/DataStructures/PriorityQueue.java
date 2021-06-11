import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 * Create the Student and Priorities classes here.
 */
 import java.util.Comparator;
 import java.util.PriorityQueue;
 class Student{
    private int id;
    private String name;
    private double cgpa;

      public Student(String name, double cgpa, int id){
          super();
          this.id = id;
          this.name = name;
          this.cgpa = cgpa;
      }

    public int getID(){
        return id;
    }
        public String getName(){
        return name;
    }
        public double getCGPA(){
        return cgpa;
    }

 }

class Priorities{

    public List < Student > getStudents(List <String> events){

    PriorityQueue < Student > pq = new PriorityQueue(Comparator.comparing(Student::getCGPA).reversed().thenComparing(Student::getName).thenComparing(Student::getID));
    
        List< Student> students = new ArrayList<Student>();
        for(String e: events){
            Scanner sc = new Scanner(e);
            String event = sc.next();
            
        if(event.equals("ENTER")){
            String name = sc.next();
            float cgpa = sc.nextFloat();
            int id = sc.nextInt();

            Student student = new Student (name, cgpa, id);
            pq.add(student);
        } else if (event.equals("SERVED")){
            Student first = pq.poll();
        }sc.close();

        } 
        Student first = pq.poll();

        if(first == null) {
            return students;
        }
        else {
            while(first!= null){
                    students.add(first);
                    first = pq.poll();
            }
            return students;
        }
    }
}


public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();
    
    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());    
        List<String> events = new ArrayList<>();
        
        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }
        
        List<Student> students = priorities.getStudents(events);
        
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}