package creational.builder;

public class SandwichBeanDemo {

    public static void main(String[] args) {

        SandwichBean sandwichBean = new SandwichBean();

        sandwichBean.setBread("Rye");
        sandwichBean.setCondiments("Lettuce");
        sandwichBean.setDressing("Ranch");
        sandwichBean.setMeat("Turkey");

        System.out.println(sandwichBean.getBread());
        System.out.println(sandwichBean.getCondiments());
        System.out.println(sandwichBean.getDressing());
        System.out.println(sandwichBean.getMeat());

    }

}
