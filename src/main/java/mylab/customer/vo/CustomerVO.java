package mylab.customer.vo;

import java.util.Date;

public class CustomerVO {
    private int id;
    private String email;
    private String name;
    private int age;
    private Date entryDate;
    
    // 기본 생성자
    public CustomerVO() {}
    
    // 모든 필드를 포함한 생성자
    public CustomerVO(int id, String email, String name, int age, Date entryDate) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.age = age;
        this.entryDate = entryDate;
    }
    
    // Getter & Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Date getEntryDate() {
        return entryDate;
    }
    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
    
    @Override
    public String toString() {
        return "CustomerVO [id=" + id + ", email=" + email + ", name=" + name + ", age=" + age + ", entryDate=" + entryDate + "]";
    }
}
