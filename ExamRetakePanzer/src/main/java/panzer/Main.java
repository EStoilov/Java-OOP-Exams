package panzer;

import panzer.contracts.InputReader;
import panzer.contracts.Manager;
import panzer.contracts.OutputWriter;
import panzer.contracts.Vehicle;
import panzer.core.parts.EndurancePart;
import panzer.core.vehicles.Revenger;
import panzer.core.vehicles.Vanguard;
import panzer.io.ConsoleInputReader;
import panzer.io.ConsoleOutputWriter;

import java.math.BigDecimal;
import java.nio.file.WatchService;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        InputReader reader = new ConsoleInputReader();
        OutputWriter writer = new ConsoleOutputWriter();
        Manager manager = new ManagerImpl();

        String line;
        while (true) {
            if ("Terminate".equals(line = reader.readLine())) {
                break;
            }

            String[] token = line.split("\\s+");

            switch (token[0]){
                case "Vehicle":
                    writer.println(manager.addVehicle(Arrays.asList(token)));
                    break;
                case "Part":
                    writer.println(manager.addPart(Arrays.asList(token)));
                    break;
                case "Inspect":
                    writer.println(manager.inspect(Arrays.asList(token)));
                    break;
            }
        }
    }
}
