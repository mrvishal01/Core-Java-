class A{
    void add(){
        int a=10, b=20, c;
        c=a+b;
        System.out.println(c);
    }
    void add(int x, int y){
        int c;
        c= x+y;
        System.out.println(c);
    }
    void add(int x,double y){
        double c;
        c= x+y;
        System.out.println(c);
    }
}

public class mehod_ovrlod {
        public static void main(String[]args){
        A a = new A();
        a.add();
        a.add(200,10);
        a.add(10,10.12);
        }
}
