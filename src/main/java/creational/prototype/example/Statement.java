package creational.prototype.example;

import java.util.List;

public class Statement implements Cloneable{

    private String sql;
    private List<String> parameters;
    private Record record;

    public Statement(String sql, List<String> parameters, Record record) {
        this.sql = sql;
        this.parameters = parameters;
        this.record = record;
    }

    // Here, clone returns references of the objects that were created.
    // Example of Shallow Copy. Changing values in original will change values in clone.
    // Deep copy would return new ArrayList with the parameters passed to it and a new record object
    // with whatever values were stored in it.
    public Statement clone() {
        try {
            return (Statement) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String getSql() {
        return sql;
    }

    public List<String> getParameters() {
        return parameters;
    }

    public Record getRecord() {
        return record;
    }
}
