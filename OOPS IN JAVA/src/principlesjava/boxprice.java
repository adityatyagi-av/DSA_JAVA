package principlesjava;

public class boxprice extends boxweight{
    String price;



    boxprice(int height,int length,int width,int weight,String price){
        super(length,height,width,weight);
        this.price=price;
    }
    boxprice (boxprice obj){
        super(obj);
    }
}
