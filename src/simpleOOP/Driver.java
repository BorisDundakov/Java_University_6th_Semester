package simpleOOP;

public class Driver implements Person{
    @Override
    public String getSex() {
        return sex;
    }

    private String sex;
    private String name;

    public Driver(String sex, String name) {
        this.sex = sex;
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
