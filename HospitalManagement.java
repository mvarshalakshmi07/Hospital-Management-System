import java.util.*;
class Person {
    protected String name;
    protected int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Doctor extends Person {
    private String specialization;
    private double consultationFee;
    public Doctor(String name, int age, String specialization, double consultationFee) {
        super(name, age);
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }
    @Override
    public void display() {
        System.out.println("Role: Doctor");
        super.display();
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: Rs." + consultationFee);
    }
}

class Patient extends Person {
    private String disease;
    private int roomNumber;
    public Patient(String name, int age, String disease, int roomNumber) {
        super(name, age);
        this.disease = disease;
        this.roomNumber = roomNumber;
    }
    @Override
    public void display() {
        System.out.println("Role: Patient");
        super.display();
        System.out.println("Disease: " + disease);
        System.out.println("Room Number: " + roomNumber);
    }
}
public class HospitalManagement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Person person = null;
        System.out.println("Hospital Management System");
        System.out.println("1. Doctor");
        System.out.println("2. Patient");
        System.out.print("Enter choice: ");
        int choice = s.nextInt();
        s.nextLine();
        if (choice == 1) {
            System.out.print("Enter Doctor Name: ");
            String name = s.nextLine();
            System.out.print("Enter Age: ");
            int age = s.nextInt();
            s.nextLine();

            System.out.print("Enter Specialization: ");
            String specialization = s.nextLine();

            System.out.print("Enter Consultation Fee: ");
            double fee = s.nextDouble();
            person = new Doctor(name, age, specialization, fee);
        } 
        else if (choice == 2) {
            System.out.print("Enter Patient Name: ");
            String name = s.nextLine();
            System.out.print("Enter Age: ");
            int age = s.nextInt();
            s.nextLine();
            System.out.print("Enter Disease: ");
            String disease = s.nextLine();
            System.out.print("Enter Room Number: ");
            int room = s.nextInt();
            person = new Patient(name, age, disease, room);
        } 
        else {
            System.out.println("Invalid Choice!");
            System.exit(0);
        }
        System.out.println("--- Details ---");
        person.display();   
        s.close();
    }
}