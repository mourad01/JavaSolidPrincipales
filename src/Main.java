import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        IAreacalculator areacalculator = new Areacalculator();
        Shape Circle= new Circle();

        Shape Square = new Square();
        List<Shape> shapes = List.of(Circle, Square);
        ShapePrintter shapePrintter = new ShapePrintter(areacalculator);
        System.out.println(shapePrintter.json(shapes));
        String java = "java";
        Optional<String> javaOp= Optional.ofNullable(java);
        if(javaOp.isEmpty()){
        System.out.println(javaOp.isEmpty());}
        else {
            System.out.println(javaOp.get());
        }
        javaOp.ifPresentOrElse(s->{
            System.out.println(s.toUpperCase());
        },()->{
            System.out.println(javaOp.isEmpty());
    });
    }
    public static  int divided(int a , int b) throws MycheckedExeprion{
        if(b==0){
            throw new MycheckedExeprion("can not divided by zero");
        }
        return a/b;
    }
}