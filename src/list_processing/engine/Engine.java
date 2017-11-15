package list_processing.engine;

import list_processing.customList.CustomList;
import list_processing.io.ConsoleInputReader;
import list_processing.io.ConsoleOutputReader;

public class Engine {
    private ConsoleInputReader inputReader;
    private ConsoleOutputReader outputReader;
    private CustomList customList;

    public Engine(ConsoleInputReader inputReader, ConsoleOutputReader outputReader, CustomList customList) {
        this.inputReader = inputReader;
        this.outputReader = outputReader;
        this.customList = customList;
    }

    public void run() {
        String line = "";

    }
}
