package homeworkweek_7;

public class Wall {
    double width, height;

    public Wall() // 1st constructor without parameter
    {

    }

    public Wall(double width, double height) //2nd constructor with parameters
    {
        if (width > 0 && height < 0) {
            this.width = width;
            this.height = 0;
        } else if (width < 0 && height > 0) {
            this.width = 0.0;
            this.height = height;
        } else if (width < 0 && height < 0) {
            this.width = 0.0;
            this.height = 0.0;
        } else {
            this.width = width;
            this.height = height;
        }
    }

    public static void main(String[] args) {
        Wall wall = new Wall(5, 4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());

    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {

        if (width < 0) {

            this.width = 0;
        } else this.width = width;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {

        if (height < 0) {

            this.height = 0;
        } else this.height = height;
    }

    public double getArea() {
        //new Wall(height,width);

        double area;
        area = this.height * this.width;
        return area;

    }

}
