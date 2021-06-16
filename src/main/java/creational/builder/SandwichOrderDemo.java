package creational.builder;

public class SandwichOrderDemo {

    public static void main(String[] args) {

        SandwichOrder.Builder builder = new SandwichOrder.Builder();

        // Creates order. Builder does not enforce that we need all of the parameters. Returning an
        // instance of the builder in each method, allows us to stack methods like this.
        builder.bread("Rye").condiments("Lettuce").meat("Turkey");

        // Builds sandwich
        SandwichOrder sandwichOrder = builder.build();

        System.out.println(sandwichOrder.getBread());
        System.out.println(sandwichOrder.getCondiments());
        System.out.println(sandwichOrder.getDressing());
        System.out.println(sandwichOrder.getMeat());


    }


}
