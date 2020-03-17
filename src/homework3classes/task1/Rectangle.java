package homework3classes.task1;

public class Rectangle {
    private int a;
    private int b;

    public void setA(int a) {
        if (a > 0) {
            this.a = a;
        }
    }

    public void setB(int b) {
        if (b > 0) {
            this.b = b;
        }
    }

    public int perimeter()    {
        int per = a + b;
        return per;
    }

    public int surface()    {
        int sur = a * b;
        return sur;
    }
}
