package homework3classes.task1;

public class Circle {
    private int radius;

    public void setRadius(int radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public float perimeter()  {
        float per = (float) (2 * Math.PI * radius);
        return per;
    }

    public float surface()  {
        float sur = (float) (Math.PI * radius * radius);
        return sur;
    }
}
