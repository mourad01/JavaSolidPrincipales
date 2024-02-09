import java.util.List;

public class ShapePrintter {
    private final  IAreacalculator iAreacalculator;

    public ShapePrintter(IAreacalculator iAreacalculator) {
        this.iAreacalculator = iAreacalculator;
    }

    public String json(List<Shape> shapes){
        return "{sum, %s}".formatted(this.iAreacalculator.sum(shapes));
    }
}
