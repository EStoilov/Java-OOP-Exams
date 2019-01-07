package app.engine;

import app.core.Manager;
import app.io.ConsoleInputReader;
import app.io.ConsoleOutputWriter;
import app.utils.Constants;

public class Engine {
    private ConsoleInputReader reader;
    private ConsoleOutputWriter writer;
    private Manager manager;

    public Engine(ConsoleInputReader reader, ConsoleOutputWriter writer) {
        this.reader = reader;
        this.writer = writer;
        this.manager = new Manager();
    }

    public void run(){

        int maxFamilyCount = Integer.parseInt(reader.readLine());
        int maxFamilyCapacity = Integer.parseInt(reader.readLine());

        this.manager.createColony(maxFamilyCount, maxFamilyCapacity);

        String line;
        while (true) {
            if (Constants.TERMINAL_COMMAND.equals(line = reader.readLine())) {
                break;
            }

            String[] token = line.split("\\s+");

            switch (token[0]){
                case "insert":
                    this.writer.writeLine(this.manager.insert(token));
                    break;
                case "remove": break;
                case "grow": break;
                case "potential": break;
                case "capacity": break;
                case "family": break;
            }
        }
    }
}
