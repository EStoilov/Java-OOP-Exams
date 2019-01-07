package panzer.factory;

import panzer.contracts.Vehicle;
import panzer.core.vehicles.Revenger;
import panzer.core.vehicles.Vanguard;

import java.math.BigDecimal;
import java.util.List;

public class VehicleFactory {

    private VehicleFactory(){}

    public static Vehicle madeVehicle( List<String> arguments){

        //Vehicle Vanguard SA-203 100 300 1000 450 2000
        String type = arguments.get(1);
        String model = arguments.get(2);
        double weight = Double.parseDouble(arguments.get(3));
        BigDecimal price = new BigDecimal(arguments.get(4));
        int attack = Integer.parseInt(arguments.get(5));
        int defense = Integer.parseInt(arguments.get(6));
        int hitPoints = Integer.parseInt(arguments.get(7));

        Vehicle vehicle = null;

        if("Revenger".equals(type)){
            vehicle = new Revenger(model, weight, price, attack, defense, hitPoints);
        }else {
            vehicle = new Vanguard(model, weight, price, attack, defense, hitPoints);
        }

        return vehicle;
    }
}
