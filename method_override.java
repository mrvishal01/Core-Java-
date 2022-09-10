class shape{
    void draw(){
        System.out.println("Draw the shape");
    }
}
class square extends shape{
    
    void draw(){
        System.out.println("square shape");
    }
}
public class method_override {
    public static void main() {
        shape r = new square();
        r.draw();
    }
}
