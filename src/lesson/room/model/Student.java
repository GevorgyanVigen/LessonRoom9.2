package lesson.room.model;

public class Student {

    private String name;
    private String surname;
    private int year;
    private boolean PHD;
    private char gender;
    private double mark;


    public Student(String name, String surname, int year, boolean PHD, char gender, double mark) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.PHD = PHD;
        this.gender = gender;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isPHD() {
        return PHD;
    }

    public void setPHD(boolean PHD) {
        this.PHD = PHD;
    }

    public char getGender() {
        return gender;
    }



    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Year: " + year);
        System.out.println("Is PHD: " + (PHD ? "Yes": "No"));
        System.out.println("Gender: " + (gender == 'M' ? "Male": "Female"));
        System.out.println("Mark: " + mark);
    }
}
