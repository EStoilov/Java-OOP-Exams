package panzer.core.vehicles;

import panzer.contracts.Part;
import panzer.contracts.Vehicle;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Revenger extends BaseVehicle {

    public Revenger(String model, double weight, BigDecimal price, int attack, int defense, int hitPoints) {
        super(model, weight, price, attack, defense, hitPoints);
    }

    protected void setPrice(BigDecimal price){
        super.setPrice(price.multiply(BigDecimal.valueOf(1.5)));
    }

    protected void setAttack(int attack){
        super.setAttack((int)(attack * 2.5));
    }

    protected void setDefense(int defense){
        super.setDefense((int) (defense * 0.5));
    }

    protected void setHitPoints(int points){
        super.setHitPoints((int)(points * 0.5));
    }

    @Override
    public String toString() {

        List<Part> parts=new ArrayList<Part>((Collection<? extends Part>) super.getParts());

        StringBuilder sb = new StringBuilder();
        sb.append("Revenger - ").append(super.getModel()).append(System.lineSeparator())
                .append(String.format("Total Weight: %.3f", super.getTotalWeight())).append(System.lineSeparator())
                .append(String.format("Total Price: %.3f", super.getTotalPrice())).append(System.lineSeparator())
                .append(String.format("Attack: %d", super.getTotalAttack())).append(System.lineSeparator())
                .append(String.format("Defense: %d", super.getTotalDefense())).append(System.lineSeparator())
                .append(String.format("HitPoints: %d", super.getTotalHitPoints())).append(System.lineSeparator())
                .append("Parts: ");

            if(parts.isEmpty()){
                sb.append("None");
            }else {
                List<String> toJoinPartsRes = new ArrayList<>(parts.size());
                for (Part part : parts) {
                    toJoinPartsRes.add(part.getModel());
                }
                sb.append(String.join(", ",toJoinPartsRes));
            }
        return sb.toString();
    }
}
