package list_processing.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleInputReader {
    private BufferedReader reader;

    public ConsoleInputReader() {
        this.reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String readLine(){
        String result = "";
        try{
            result = this.reader.readLine();
        }catch (IOException ioe){}

        return result;
    }
}