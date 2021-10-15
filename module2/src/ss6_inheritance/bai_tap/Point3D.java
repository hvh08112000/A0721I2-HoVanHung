package ss6_inheritance.bai_tap;

public class Point3D extends Point2D{
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public float[] getXYZ() {
        float[] result = new float[3];
        result[0] = super.getX();
        result[1] = super.getY();
        result[2] = this.z;
        return result;
    }

    public void setXYZ(float x, float y, float z) {
        setXY(x,y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "x =" + getX() +
                ", y =" + getY() +
                ", z =" + getZ() +
                '}';
    }
}
