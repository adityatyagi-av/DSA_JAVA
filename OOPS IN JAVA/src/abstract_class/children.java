package abstract_class;

public  class  children extends parent {
    @Override
    public void career(String name){
        System.out.println(name);
    };
    @Override
    public void partner(String name,int age){
        System.out.println(name);
        System.out.println(age);
    }

}
