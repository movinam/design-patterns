package creational.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

    protected List<Page> pages = new ArrayList<>();

    public Website() {
        this.createWebsite();
    }

    public List<Page> getPages() {
        return pages;
    }

    // AKA factory method.
    // All of the concrete classes that implement the base class will override this method.
    public abstract void createWebsite();
}
