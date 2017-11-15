package list_processing.customList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomList {
    private List<String> customList;

    public CustomList() {
        this.customList = new ArrayList<>();
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

        return String.join(" ", result);

        /* By Stefan - Java trainee */
    }
}
