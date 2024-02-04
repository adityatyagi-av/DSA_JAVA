package principlesjava;

public class box {
    double length;
    double height;
    double width;
    static int np=23;

    box(){
        super();
        this.height =-1;
        this.length =-1;
        this.width =-1;

    }
    //cube
    box(double side){
        this.width =side;
        this.height =side;
        this.length =side;
    }
    box(double l, double h,double w){
        this.length =l;
        this.width =w;
        this.height =h;
    }
    box(box old){
        this.height = height;
        this.length = length;
        this.width = width;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
