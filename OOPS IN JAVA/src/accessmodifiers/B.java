package accessmodifiers;

public class B extends A{
    public int b1;
    private int b2;
    protected int b3;
    int b4;
    public B(){
        this.b1=12;
        this.b2=13;
        this.b3=14;
        this.b4=15;
    }

    public B(int a1,int a2,int a3,int a4,int b1,int b2,int b3,int b4){
        super(a1, a2, a3, a4);
        this.b1=b1;
        this.b2=b2;
        this.b3=b3;
        this.b4=b4;
    }

    public void showAData(){
        System.out.println(" "+this.a1+this.getA2()+this.a3+this.a4);
    }
}
