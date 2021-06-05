package simpleOOP;

public class Worker implements Person{
    @Override
    public String getSex() {
        return sex;
    }

    private String sex;
    private String country;

    public Worker(String sex, String country) {
        this.sex = sex;
        this.country = country;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
