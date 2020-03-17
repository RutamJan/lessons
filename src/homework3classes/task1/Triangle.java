package homework3classes.task1;

public class Triangle {
    private int a;
    private int b;
    private int c;

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

    public void setC(int c) {
        if (c > 0) {
            this.c = c;
        }
    }

    public int perimeter()  {
        int per = a + b + c;
        return per;
    }

    public float surface()    {
        int hper = (a + b + c)/2;
        float sur = (float) (Math.sqrt(hper) * Math.sqrt(hper - a) * Math.sqrt(hper - b) * Math.sqrt(hper - c));
        return sur;
    }
}
