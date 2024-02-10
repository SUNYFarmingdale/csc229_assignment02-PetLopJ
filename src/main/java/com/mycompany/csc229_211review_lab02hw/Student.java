package com.mycompany.csc229_211review_lab02hw;

/**
 *
 * @author MoaathAlrajab
 */
    //Makes Student class a child of Person
public class Student extends Person {

    // ToDo 1: Make this class a child of Person
	// ToDo 2: Fix the resulting errors

	// ToDo 3: Add a field for GPA and create setter and getter
    //initializes GPA to 0.0
    private double gpa = 0.0;

    // Constructor for Student
    public Student(String name, short age) {
        super(name, age);

    }

    // setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // getter for GPA
    public double getGpa(){
        return gpa;
    }

    // setter that inherits from Person class
    public void setAddress(String address){

    }
    // getter that inherits from Person class
    public String getAddress(){
        return null;
    }
    // method that prints name, age, and gpa of student
    public String toString() {
        return "Student Name: " + getName() + ", Age: " + getAge() + ", GPA: " + getGpa();
    }


	// ToDo 4: Add comments to your code


}