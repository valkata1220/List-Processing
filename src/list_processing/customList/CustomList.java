package list_processing.customList;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<String> customList;

    public CustomList() {
        this.customList = new ArrayList<>();
    }
    public void inisializeCustomList(List<String> tokens){
        this.customList.addAll(tokens);
    }
    
    public String reverse(){
        List<String> reversedList = new ArrayList<>();
        for (int i = this.customList.size()-1; i >= 0; i--) {
             reversedList.add(this.customList.get(i));
        }

        this.customList = reversedList;
        return String.join(" ",this.customList);
    }
    public String append(String token){
        List<String> appendList = new ArrayList<>();

        for(int i=0; i<this.customList.size(); i++){
            appendList.add(this.customList.get(i));
        }
        appendList.add(token);
        this.customList = appendList;
        return String.join(" ",this.customList);

        

    }
}
