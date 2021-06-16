package creational.builder;

public class SandwichTeleDemo {

    public static void main(String[] args) {

        SandwichTele sandwichTele = new SandwichTele("Rye", "Lettuce",
                "Ranch", "Turkey");

        System.out.println(sandwichTele.getBread());
        System.out.println(sandwichTele.getCondiments());
        System.out.println(sandwichTele.getDressing());
        System.out.println(sandwichTele.getMeat());

    }



}
