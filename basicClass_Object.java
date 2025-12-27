class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("writing");
    }
}
public class basicClass_Object{
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.type ="gel";
        pen1.color ="blue";
        pen1.write();
    }
}
