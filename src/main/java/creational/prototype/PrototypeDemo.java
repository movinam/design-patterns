package creational.prototype;

public class PrototypeDemo {

    public static void main(String[] args) {

        Registry registry = new Registry();

        // Can use enum instead of passing type as a String.
        // We aren't calling new each time we want an instance of movie. But, we get a unique instance.
        Movie movie = (Movie) registry.createItem("Movie");
        movie.setTitle("Avengers: End Game");
        System.out.println(movie);
        System.out.println(movie.getTitle());
        System.out.println(movie.getRuntime());
        System.out.println(movie.getPrice());
        System.out.println(movie.getUrl());

        Movie anotherMovie = (Movie) registry.createItem("Movie");
        anotherMovie.setTitle("A Quiet Place");
        System.out.println(anotherMovie);
        System.out.println(anotherMovie.getTitle());
        System.out.println(anotherMovie.getRuntime());
        System.out.println(anotherMovie.getPrice());
        System.out.println(anotherMovie.getUrl());


    }

}
