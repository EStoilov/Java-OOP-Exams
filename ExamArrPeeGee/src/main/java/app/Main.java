package app;

import app.contracts.Battlefield;
import app.contracts.Reader;
import app.contracts.Writer;
import app.core.BattlefieldImplementation;
import app.io.ConsoleReader;
import app.io.ConsoleWriter;

import java.io.IOException;
import java.util.Arrays;

public class  Main {
    public static void main(String[] args) throws IOException {

        Reader reader = new ConsoleReader();
        Writer writer = new ConsoleWriter();
        Battlefield battleField = new BattlefieldImplementation(writer);



    }
}
