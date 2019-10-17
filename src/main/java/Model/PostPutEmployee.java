package Model;

public class PostPutEmployee {

    private String name;
    private String salary;
    private String age;

    public PostPutEmployee(String name, String salary, String age) {
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSalary() {
        return salary;
    }

    public String getAge() {
        return age;
    }


}
