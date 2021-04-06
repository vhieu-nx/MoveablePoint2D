public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point() {
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }
    public float[] getXY(){
        float[] xy=new float[2];
        xy[0]=this.x;
        xy[1]=this.y;
        return xy;
    }
    public void setXY(float x, float y){
        this.setX(x);
        this.setY(y);
    }
}
