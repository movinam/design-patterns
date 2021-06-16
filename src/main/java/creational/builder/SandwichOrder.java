package creational.builder;

public class SandwichOrder {

    public static class Builder {

        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        // Want mandatory fields? Make the constructor take arguments.
        public Builder() {

        }

        // Assigns the builder parameters to SandwichOrder.
        public SandwichOrder build() {
            return new SandwichOrder(this);
        }

        // Methods that look like constructors but are not. Returning an instance of the builder in
        // each method, allows us to stack methods.

        public Builder bread(String bread) {
            this.bread = bread;
            return this;            // Returns an instance of the Builder object.
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }

    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    private SandwichOrder(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
