package list_processing;

import list_processing.customList.CustomList;
import list_processing.engine.Engine;
import list_processing.io.ConsoleInputReader;
import list_processing.io.ConsoleOutputReader;

public class Main {


    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        ConsoleOutputReader outputReader = new ConsoleOutputReader();
        CustomList customList = new CustomList();

        Engine engine = new Engine(inputReader, outputReader,customList);
        engine.run();
    }

}
