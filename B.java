public class B {

    protected int data;
    
    public B() {

        int defaultValue = 0;
        this(defaultValue);
    }

    public B(int data) {

        this.data = data;
    }

    @Override
    public String toString() {

        return new String("Value of data in B is: " + Integer.toString(data));
    }
}