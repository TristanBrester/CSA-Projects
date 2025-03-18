package Polymorphism;

public class athelete {
    //instance variables
    private String name;
    private int grade;
    private double height;
    private double weight;

    //constructor
    public athelete(String name, int grade, double height, double weight) {
        this.name = name;
        this.grade = grade;
        this.height = height;
        this.weight = weight;
    }

    //methods
    public void compete(){
        System.out.printf("My name is %s and I am competing.\n", name);
    }

    @Override
    public String toString() {
        return String.format("""
                \nName: %s
                Grade: %d
                Height: %.2f in.
                Weight: %.2f lbs.
                """, name, grade, height, weight);
    }

    public boolean equals(athelete a) {
        return this.name.equals(a.getName()) && this.grade == a.getGrade() && this.height == a.getHeight() && this.weight == a.getWeight();
    }

    //getters
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
