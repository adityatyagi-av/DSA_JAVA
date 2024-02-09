package principlesjava;

public class boxweight extends box{
    double weight;
    public boxweight(){
        this.weight=-1;
    }
    boxweight(double length,double width,double height){
        super(length,width,height);
    }

    public boxweight(double height,double width,double length,double weight){
        super(length,height,width);
        this.weight=weight;
    }
    boxweight(boxweight obj){
        super(obj);
    }
}
