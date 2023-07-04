package HW6;
import java.util.ArrayList;
import java.util.HashMap;

public class BookListToHashMap {
    public static HashMap<Integer, String> convertToHashMap(ArrayList<String> bookList) {
        HashMap<Integer, String> bookMap = new HashMap();

        for (int i = 0; i < bookList.size(); i++) {
            bookMap.put(i, bookList.get(i));
        }
        return bookMap;
    }
    public static void main(String[] args) {
        ArrayList<String> bookList = new ArrayList<>();
        bookList.add("Harry Potter 1");
        bookList.add("Harry Potter 2");
        bookList.add("Harry Potter 3");
        bookList.add("Harry Potter 4");
        bookList.add("Harry Potter 5");

        HashMap<Integer, String> bookMap = convertToHashMap(bookList);

        for (Integer key : bookMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + bookMap.get(key));
        }
    }
}
