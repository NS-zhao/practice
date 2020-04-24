package ideal;

class Rectangle{
    double x;
    double y;
    double width;
    double height;
    public void setX(double a){
        x = a;
    }

    public double getX(){
        return x;
    }

    public void setY(double b){
        y = b;
    }

    public double getY(){
        return y;
    }

    public void setWidth(double w){
        width = w;
    }

    public double getWidth(){
        return width;
    }

    public void setHeight(double h){
        height = h;
    }

    public double getHeight(){
        return height;
    }

}

class Circle{
    double x;
    double y;
    double radius;
    public void setX(double a){
        x = a;
    }

    public double getX(){
        return x;
    }

    public void setY(double b){
        y = b;
    }

    public double getY(){
        return y;
    }

    public void setRadius(double r){
        if(r>0)
            radius = r;
    }

    public double getRadius(){
        return radius;
    }

}

class Geometry{
    Rectangle rect;
    Circle circle;
    Geometry(Rectangle rect,Circle circle){
        this.rect = rect;
        this.circle = circle;
    }

    void setCirclePosition(double x,double y){
        circle.setX(x);
        circle.setY(y);
    }

    void setCircleRadius(double radius){
        circle.setRadius(radius);
    }

    void setRectPosition(double x,double y){
        rect.setX(x);
        rect.setY(y);
    }

    void setRectWidthAndHeight(double x,double y){
        rect.setWidth(x);
        rect.setHeight(y);
    }

    void showState(){
        double circleX = circle.getX();
        double rectX = rect.getX();
        if(rectX>=circleX+circle.getRadius()){
            System.out.println("矩形在圆的右侧");
        }

        if(rectX+rect.getWidth()<=circleX-circle.getRadius()){
            System.out.println("矩形在圆的左侧");
        }
    }
}

public class H {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();
        Geometry geometry;
        geometry = new Geometry(rect,circle);
        geometry.setRectPosition(30,40);
        geometry.setRectWidthAndHeight(120,80);
        geometry.setCirclePosition(260,30);
        geometry.setCircleRadius(60);
        System.out.print("几何图形中圆和矩形的位置关系是：");
        geometry.showState();
        System.out.print("几何图形重新调整了圆和矩形的位置：");
        geometry.setRectPosition(220,160);
        geometry.setCirclePosition(40,30);
        System.out.print("调整后，几何图形中圆和矩形的位置关系是：");
        geometry.showState();
    }
}
