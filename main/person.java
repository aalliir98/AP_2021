package main;

public class person{
   public String name;
    String family_name;
    int Year_of_Birth;
    String city_of_birth;
    String job;
    String Gender;
    int salary;
   public int id;

    public person(String name, String family_name, int year_of_Birth, String city_of_birth, String job, String gender, int salary,int id) {
        this.name = name;
        this.family_name = family_name;
        Year_of_Birth = year_of_Birth;
        this.city_of_birth = city_of_birth;
        this.job = job;
        Gender = gender;
        this.salary = salary;
        this.id = id;
    }

    public  String getJob() {
        return job;
    }
}
