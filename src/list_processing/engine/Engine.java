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

    public Engine(ConsoleInputReader inputReader, ConsoleOutputReader outputReader, CustomList customList) {
        this.inputReader = inputReader;
        this.outputReader = outputReader;
        this.customList = customList;
    }

    public void run() {
        String line = this.inputReader.readLine();
        List<String> firstList = Arrays.stream(line.split("\\s+")).collect(Collectors.toList());
        this.customList.inisializeCustomList(firstList);

        while (true) {
            line = this.inputReader.readLine();
            String[] tokkens = line.split("\\s+");
            executeCommand(tokkens);
            if ("end".equals(line)) {
                break;
            }
        }
    }

    private void executeCommand(String[] tokkens) {

    }
}
