 class   A1{
        public int a = 10;
        private int b =20;
        int c = 30;
        protected int d =40;

        public void meth1(){
            System.out.println(a);
            System.out.println(b);                                                      //Same class all modifire all support
            System.out.println(c);
            System.out.println(d);
        }
}
public class Modifire {
    public static void main(String[] args) {
            A1 a = new A1();
           // a.meth1();
           System.out.println(a.a);
//            System.out.println(a.b);                                                   //Same Package not support private modifire
            System.out.println(a.c);
            System.out.println(a.d);
    }
}
