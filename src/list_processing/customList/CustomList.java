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

    public String insert(int index,String string){
        if(index < 0 || index > this.customList.size()-1){
            return String.format("Error: invalid index %d",index);
        }
        List<String> tempList = new ArrayList<>();

        for (int i = 0; i < this.customList.size()-1; i++) {
            if(index == i){
                if(i == this.customList.size()-1){
                    tempList.add(this.customList.get(i));
                    tempList.add(string);
                    break;
                }
                tempList.add(string);
            }
            tempList.add(this.customList.get(i));
        }

        this.customList = tempList;
        return String.join(" ",this.customList);
    }
}
