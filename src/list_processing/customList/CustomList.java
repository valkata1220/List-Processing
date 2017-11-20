package list_processing.customList;

import java.util.*;

public class CustomList implements Iterable<String> {
    private List<String> customList;

    public CustomList() {
        this.customList = new ArrayList<>();
    }


    public void initializeCustomList(List<String> tokens) {
        this.customList.addAll(tokens);
    }


    public void reverse() {
        Collections.reverse(this.customList);
    }

    public void prepend(String inputToken) {
        this.customList.add(0, inputToken);
    }

    public void append(String token) {
        this.customList.add(token);
    }

    public void insert(int index, String string) {
        try {
            this.customList.add(index, string);
        } catch (IndexOutOfBoundsException iobe) {
            throw new IndexOutOfBoundsException(String.format("Error: invalid index %s", index));
        }
    }

    public void delete(int index) {
        try {
            this.customList.remove(index);
        } catch (IndexOutOfBoundsException iobe) {
            throw new IndexOutOfBoundsException(String.format("Error: invalid index %s", index));
        }
    }

    public int count(String searcheWord) {
        int counter = 0;
        for (String string : this.customList) {
            if (string.equals(searcheWord)) {
                counter++;
            }
        }
        return counter;
    }

    public void rollLeft() {
        String temp = this.customList.get(0);
        for (int i = 0; i < this.customList.size() - 1; i++) {
            String nextString = this.customList.get(i + 1);
            this.customList.set(i, nextString);
        }

        this.customList.set(this.customList.size() - 1, temp);
    }

    public void sort() {
        Collections.sort(this.customList);
    }

    public void rollRight() {
        String temp = this.customList.get(this.customList.size() - 1);

        for (int i = this.customList.size() - 1; i > 0; i--) {
            String previousString = this.customList.get(i - 1);
            this.customList.set(i, previousString);
        }

        this.customList.set(0, temp);
    }

    @Override
    public Iterator<String> iterator() {
        return this.customList.iterator();
    }

    @Override
    public String toString() {
        return String.join(" ", this.customList);
    }
}
