public class Customer {
    int age;
    String sex;
    double bmi;
    int children;
    boolean smoker;
    String region;
    double charges;

    public Customer(int age, String sex, double bmi, int children, boolean smoker, String region, double charges) {
        this.age = age;
        this.sex = sex;
        this.bmi = bmi;
        this.children = children;
        this.smoker = smoker;
        this.region = region;
        this.charges = charges;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public double getBmi() {
        return bmi;
    }

    public int getChildren() {
        return children;
    }

    public boolean isSmoker() {
        return smoker;
    }

    public String getRegion() {
        return region;
    }

    public double getCharges() {
        return charges;
    }
}
