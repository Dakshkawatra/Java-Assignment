public class Rectangle {
    private double height;
    private double width;
    
    Rectangle(){
        this(2,2);
    }

    Rectangle(double a){
        this.height=a;
        this.width=a;
    }

    Rectangle(double a,double b){
        if(a>=0 && b>=0){
            this.height=a;
            this.width=b;
        }
        else{
            System.out.println("invalid dimension");
        }
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    boolean isSquare() {
        return width == height;
    }

    void scale(double factor) {
        if (factor <= 0)
            throw new IllegalArgumentException("Factor must be positive");

        width *= factor;
        height *= factor;
    }

    public String toString() {
        return "Rectangle[width=" + width + ", height=" + height + "]";
    }
}
