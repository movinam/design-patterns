package creational.prototype;

import java.util.HashMap;
import java.util.Map;

// Good way to set a bunch of default information and then change it accordingly.

public class Registry {

    private Map<String, Item> items = new HashMap<>();

    public Registry() {
        loadItems();
    }

    // Create clones of the item.
    public Item createItem(String type) {

        Item item = null;

        try {
            item = (Item) (items.get(type)).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;

    }

    // Set deefault information.
    private void loadItems() {

        Movie movie = new Movie();
        movie.setTitle("Die Hard");
        movie.setPrice(27.46);
        movie.setRuntime("2 hours 12 minutes");
        items.put("Movie", movie);

        Book book = new Book();
        book.setTitle("Harry Potter");
        book.setNumberOfPages(324);
        book.setPrice(20.99);
        items.put("Book", book);


    }

}
