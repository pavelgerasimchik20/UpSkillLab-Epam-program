package withClasses.simplestClasses;

public class Task2 {
    public static void main(String[] args) {
        Test2 t = new Test2();
        Test2 t2 = new Test2("Petr","Russia");
        t.setCountry("New country");
        t2.setName("Ivan");
        System.out.println(t);
        System.out.println(t2);
    }
}

class Test2{

    private String name;
    private String country;

    public Test2(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public Test2(){
        name = "Default name";
        country = "Default country";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getName()+ " "+ getCountry();
    }
}
