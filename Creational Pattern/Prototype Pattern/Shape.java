public abstract class Shape implements Cloneable {
    String type = null;

    public String getType()
    {
        return type;
    }
    public abstract void draw();
    
    public Object clone()
    {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return clone;
    }
}