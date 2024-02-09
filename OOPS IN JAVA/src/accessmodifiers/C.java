package accessmodifiers;

public class C extends B{
    public int c1;
    public int c2;
    public int c3;
    public int c4;
    public C(int a1,int a2,int a3,int a4,int b1,int b2,int b3,int b4,int c1,int c2,int c3,int c4){
        super(a1, a2, a3, a4, b1, b2, b3, b4);
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.c4=c4;
    }
    public void setValue(){
    }
}
