package withClasses.simplestClasses;

class Test1 {

    private final int a = 1;
    private final int b = 2;

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void show() {
        System.out.println("a= " + a);
        System.out.println("b= " + b);
    }

    public int sum() {
        int result = a + b;
        return result;
    }

    public int findMore() {
        int result = Math.max(this.a, this.b);
        return result;
    }
}

public class Task1 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        System.out.println(test.findMore());
        System.out.println(test.sum());
        test.show();
        System.out.println(test.getB());

    }

}

