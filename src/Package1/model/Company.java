package Package1.model;

import java.util.Arrays;

public class Company {
    private  Long id;
    private String name;
    private String adress;
    private String country;
    private Group[]groups;
    private Instructor[]instructors;
    private Student[]students;

    public Company(Long id, String name, String adress, String country) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.country = country;
    }

    public Company(Long id, String name, String adress, String country, Group[] groups, Instructor[] instructors, Student[] students) {
        this.id = id;
        this.name = name;
        this.adress = adress;
        this.country = country;
        this.groups = groups;
        this.instructors = instructors;
        this.students = students;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Group[] getGroups() {
        return groups;
    }

    public void setGroups(Group[] groups) {
        this.groups = groups;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Company{" +
                "\nid=" + id +
                "\nname='" + name + '\'' +
                "\nadress='" + adress + '\'' +
                "\ncountry='" + country + '\'' +
                "\ngroups=" + Arrays.toString(groups) +
                "\ninstructors=" + Arrays.toString(instructors) +
                "\nstudents=" + Arrays.toString(students) +
                '}';
    }
}
