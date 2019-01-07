package app.engine;

import app.contracts.Engine;
import app.contracts.Reader;
import app.contracts.Writer;

import java.io.IOException;

public class EngineImpl implements Engine {

    private Writer writer;
    private Reader reader;

    public EngineImpl(Writer writer, Reader reader) {
        this.writer = writer;
        this.reader = reader;
    }

    @Override
    public void run() throws IOException {

        String line = reader.readLine();
        while (!line.equals("Peace")){
            String[] lineTokens = line.split("\\s+");
            line = reader.readLine();
        }
    }
}
