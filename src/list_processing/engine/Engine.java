package list_processing.engine;

import list_processing.customList.CustomList;
import list_processing.io.ConsoleInputReader;
import list_processing.io.ConsoleOutputReader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Engine {
    private ConsoleInputReader inputReader;
    private ConsoleOutputReader outputReader;
    private CustomList customList;
    private CommandInterpreter commandInterpreter = new CommandInterpreter();

    public Engine(ConsoleInputReader inputReader, ConsoleOutputReader outputReader, CustomList customList) {
        this.inputReader = inputReader;
        this.outputReader = outputReader;
        this.customList = customList;
    }

    public void run() {
        String line = this.inputReader.readLine();
        List<String> firstList = Arrays.stream(line.split("\\s+")).collect(Collectors.toList());
        this.customList.initializeCustomList(firstList);

        while (true) {
            line = this.inputReader.readLine();
            String[] tokens = line.split("\\s+");

            this.outputReader.write(this.commandInterpreter.interpret(tokens, this.customList));

            if ("end".equals(line))
                break;
        }
    }
}
