abstract class programming{
    abstract void developer(); 
}
class html extends programming{
   
    void developer(){
        System.out.println("lee");
    }
}
class java extends programming{
    
    void developer(){
        System.out.println("goslin");
    }
}
class Abstraction {
    public static void main(String[] args) {
        html h = new html();
    //  programming h = new html();  
        h.developer();
        java j = new java();
    //  programming h = new html();  
        j.developer();
    }
}
