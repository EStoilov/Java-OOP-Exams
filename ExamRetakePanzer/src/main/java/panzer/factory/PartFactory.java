package panzer.factory;

import panzer.contracts.Part;
import panzer.core.parts.ArsenalPart;
import panzer.core.parts.EndurancePart;
import panzer.core.parts.ShellPart;

import java.math.BigDecimal;
import java.util.List;

public class PartFactory {

    private PartFactory(){}

    public static Part madePart(List<String> arguments){

        //INPUT -> Part SA-203 Arsenal     Cannon-KA2 300 500 450
        //Constructor -> String model, double weight, BigDecimal price
        //String model, double weight, BigDecimal price, int attackModifier

        String type = arguments.get(2);
        String model = arguments.get(3);
        double weight = Double.parseDouble(arguments.get(4));
        BigDecimal price = new BigDecimal(arguments.get(5));
        int intModifier = Integer.parseInt(arguments.get(6));

        Part part = null;

        if("Arsenal".equals(type)){
            part = new ArsenalPart(model, weight, price, intModifier);
        } else if ("Shell".equals(type)){
            part = new ShellPart(model, weight, price, intModifier);
        } else {
            part = new EndurancePart(model, weight, price, intModifier);
        }

        return part;
    }
}
