package Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee {
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("employee_name")
    private String name;

    @JsonProperty("employee_salary")
    private Integer salary;

    @JsonProperty("employee_age")
    private Integer age;

    @JsonProperty("profile_image")
    private String image;

    public Employee(String image, String name, Integer salary, Integer id, Integer age) {
        setProfileImage(image);
        setName(name);
        setSalary(salary);
        setId(id);
        setAge(age);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String employee_name) {
        this.name = employee_name;
    }

    public void setSalary(Integer employee_salary) {
        this.salary = employee_salary;
    }

    public void setAge(Integer employee_age) {
        this.age = employee_age;
    }

    public void setProfileImage(String profile_image) {
        this.image = profile_image;
    }


}
