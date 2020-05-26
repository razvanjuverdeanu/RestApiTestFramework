package Model;

public class Employee {
    private String id;
    private String employee_name;
    private String employee_salary;
    private String employee_age;
    private String profile_image;

    public Employee(String profile_image, String employee_name, String employee_salary, String id, String employee_age) {
        setProfileImage(profile_image);
        setName(employee_name);
        setSalary(employee_salary);
        setId(id);
        setAge(employee_age);
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String employee_name) {
        this.employee_name = employee_name;
    }

    public void setSalary(String employee_salary) {
        this.employee_salary = employee_salary;
    }

    public void setAge(String employee_age) {
        this.employee_age = employee_age;
    }

    public void setProfileImage(String profile_image) {
        this.profile_image = profile_image;
    }

    public String getId() {
        return id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public String getEmployee_salary() {
        return employee_salary;
    }

    public String getEmployee_age() {
        return employee_age;
    }

    public String getProfile_image() {
        return profile_image;
    }

}
