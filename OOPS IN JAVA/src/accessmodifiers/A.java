package accessmodifiers;

public class A {
    public int a1;
    private int a2;
    protected int a3;

    int a4;

    public int a5=12;
    private int a6=13;
    protected int a7=14;

    int a8=15;

    public int getA2() {
        return a2;
    }
    public void setA2(int a2){
        this.a2=a2;
    }

    public A(){
        this.a5=22;
        this.a6=23;
        this.a7=24;
        this.a8=25;
    }
    public A(int a1, int a2, int a3, int a4){
        this.a1=a1;
        this.a2=a2;
        this.a3=a3;
        this.a4=a4;
    }
    public void getValues(){
        System.out.println(" a1: "+this.a1+" a2: "+this.a2+" a3: "+this.a3+" a4: "+this.a4+" a5: "+this.a5+" a6: "+this.a6+" a7: "+this.a7+" a8: "+this.a8);
    }

}
