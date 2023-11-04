public class Customer {
    int age;
    String sex;
    double bmi;
    int children;
    boolean smoker;
    String region;
    double charges;
    int id;




    public Customer(int age, String sex, double bmi, int children, boolean smoker, String region, double charges, int id) {
        this.age = age;
        this.sex = sex;
        this.bmi = bmi;
        this.children = children;
        this.smoker = smoker;
        this.region = region;
        this.charges = charges;
        this.id = id;
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

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", bmi=" + bmi +
                ", children=" + children +
                ", smoker=" + smoker +
                ", region='" + region + '\'' +
                ", charges=" + charges +
                '}';
    }
}
