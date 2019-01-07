package panzer;

import panzer.contracts.Manager;
import panzer.contracts.Part;
import panzer.contracts.Vehicle;
import panzer.factory.PartFactory;
import panzer.factory.VehicleFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerImpl implements Manager {

    private Map<String, Vehicle> vehicles ;
    private Map<String, Part> parts;

    public ManagerImpl(){
        this.vehicles = new HashMap<>();
        this.parts = new HashMap<>();
    }

    @Override
    public String addVehicle(List<String> arguments) {

        Vehicle vehicle = VehicleFactory.madeVehicle(arguments);
        this.vehicles.putIfAbsent(vehicle.getModel(), vehicle);

        return String.format("Created %s Vehicle - %s",
                vehicle.getClass().getSimpleName(),
                vehicle.getModel());
    }

    @Override
    public String addPart(List<String> arguments) {

        String type = arguments.get(2);
        String vehicleModel = arguments.get(1);
        Vehicle vehicle = vehicles.get(vehicleModel);
        Part part = PartFactory.madePart(arguments);
        this.parts.putIfAbsent(part.getModel(), part);
        vehicle.addPart(part);

        if("Arsenal".equals(type)){
            vehicle.addArsenalPart(part);
        }else if ("Shell".equals(type)){
            vehicle.addShellPart(part);
        }else {
            vehicle.addEndurancePart(part);
        }

        return String.format("Added %s - %s to Vehicle - %s", type,part.getModel(), vehicle.getModel());
    }

    @Override
    public String inspect(List<String> arguments) {
        String vehicleMOdel = arguments.get(1);
        Vehicle vehicle = this.vehicles.get(vehicleMOdel);
        return vehicle.toString();
    }

    @Override
    public String battle(List<String> arguments) {
        return null;
    }

    @Override
    public String terminate(List<String> arguments) {
        return null;
    }
}
