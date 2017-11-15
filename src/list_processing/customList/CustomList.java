package list_processing.customList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomList {
    private List<String> customList;

    public CustomList() {
        this.customList = new ArrayList<>();
    }


    public void inisializeCustomList(List<String> tokens) {
        this.customList.addAll(tokens);
    }


    public String reverse() {
        List<String> reversedList = new ArrayList<>();

        for (int i = this.customList.size() - 1; i >= 0; i--) {
            reversedList.add(this.customList.get(i));
        }
        this.customList = reversedList;

        return String.join(" ", this.customList);

    }

    public String prepend(String inputToken) {
        int len = this.customList.size() + 1;
        String[] temp = new String[len];

        temp[0] = inputToken;

        for (int i = 1; i < len - 1; i++) {

            temp[1] = this.customList.get(1);
        }

        List<String> result = new ArrayList<>();
        result.addAll(Arrays.asList(temp));

        this.customList = result;

        /* By Stefan - Java trainee */

        return String.join(" ", this.customList);

    }

    public String append(String token) {
        List<String> appendList = new ArrayList<>();

        for (int i = 0; i < this.customList.size(); i++) {
            appendList.add(this.customList.get(i));
        }
        appendList.add(token);
        this.customList = appendList;
        return String.join(" ", this.customList);


    }

    public String insert(int index, String string) {
        if (index < 0 || index > this.customList.size() - 1) {
            return String.format("Error: invalid index %d", index);
        }
        List<String> tempList = new ArrayList<>();

        for (int i = 0; i < this.customList.size() - 1; i++) {
            if (index == i) {
                if (i == this.customList.size() - 1) {
                    tempList.add(this.customList.get(i));
                    tempList.add(string);
                    break;
                }
                tempList.add(string);
            }
            tempList.add(this.customList.get(i));
        }

        this.customList = tempList;
        return String.join(" ", this.customList);
    }

    public String delete(int index){
        if (index < 0 || index > this.customList.size() - 1) {
            return String.format("Error: invalid index %d", index);
        }
        List<String> tempList = new ArrayList<>();

        for (int i = 0; i < this.customList.size() - 1; i++) {
            if(index == i){
                continue;
            }
            tempList.add(this.customList.get(i));
        }

        this.customList = tempList;
        return String.join(" ",this.customList);
    }



    public int count(String searcheWord){
        int counter = 0;
        for (String string : this.customList) {
            if(string.equals(searcheWord)){
                counter++;
            }
        }
        return counter;
    }

    public String rollLeft() {
        List<String> temp = new ArrayList<>();
        for (int i = 1; i < this.customList.size(); i++) {

            temp.add(this.customList.get(i));
        }

        temp.add(this.customList.get(0));
        this.customList = temp;


        return String.join(" ", this.customList);
    }
  public String sort(){
        java.util.Collections.sort(this.customList);
        return String.join(" ",this.customList);
}

public String rollRight() {
        int len = customList.size();

        List<String> temp = new ArrayList<>();
        temp.add(this.customList.get(len - 1));

        for (int i = len - 1; i >= 1; i--) {
            temp.add(this.customList.get(i - 1));
        }
        this.customList = temp;
        return String.join(" ", this.customList);
    }
}
