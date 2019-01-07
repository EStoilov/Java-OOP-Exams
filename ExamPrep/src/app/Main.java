package app;

import app.engine.Engine;
import app.io.ConsoleInputReader;
import app.io.ConsoleOutputWriter;

public class Main {
    public static void main(String[] args) {

        ConsoleInputReader reader = new ConsoleInputReader();
        ConsoleOutputWriter writer = new ConsoleOutputWriter();
        Engine engine = new Engine(reader, writer);
        engine.run();
    }
}
