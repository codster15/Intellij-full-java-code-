


// parimeter  of rectangle

public class Rectangle {

    public int width ;
    public int height ;

    int areaOfParimeter (int w , int h){

        this.width = w;
        this.height = h;

            int parimeter = 2*(width+height);
       return parimeter;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
       int par = r.areaOfParimeter(10 , 10);

        System.out.println("Parimeter of Rectangle - " +  par);
    }
}
