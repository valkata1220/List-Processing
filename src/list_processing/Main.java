package list_processing;

import list_processing.engine.Engine;
import list_processing.io.ConsoleInputReader;
import list_processing.io.ConsoleOutputReader;

public class Main {
<<<<<<< HEAD
    
=======
    public static void main(String[] args) {
        ConsoleInputReader inputReader = new ConsoleInputReader();
        ConsoleOutputReader outputReader = new ConsoleOutputReader();

        Engine engine = new Engine(inputReader, outputReader);
        engine.run();
    }
>>>>>>> 59c2c4e7a9758161fc0ee04dc930cf793575010b
}
