package session1;

public class Person extends Animal {
    //Field
    private String name;
    private Integer bornYear;
    private String phone;
    public Person(){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBornYear() {
        return bornYear;
    }

    public void setBornYear(Integer bornYear) {
        this.bornYear = bornYear;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Person(String name, Integer bornYear, String phone) {
        this.name = name;
        this.bornYear = bornYear;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return this.name+this.phone+this.bornYear;
    }
}
