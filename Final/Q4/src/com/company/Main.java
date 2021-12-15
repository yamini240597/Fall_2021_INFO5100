package com.company;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Main {
    Netflix netflix;

    public Main(){
        netflix = createNetflix();
    }

    //Adding classic and printing
    public void addClassic(){
        netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    Date date = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
                    if (movie.getReleaseDate().before(date)) {
                        System.out.println(movie.getTitle() + "(Classic)");
                    }
                });
    }

    //Latest 3 movies
    public void getLatestThreeMovies(){
        List<Movie> latestThreeMovies = netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .sorted((movie1, movie2) -> movie2.getReleaseDate().compareTo(movie1.getReleaseDate()))
                .limit(3)
                .collect(Collectors.toList());

        for(Movie movie: latestThreeMovies){
            Date date = movie.getReleaseDate();
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            System.out.println(movie.getTitle() + ": " + calendar.get(Calendar.YEAR));
        }

    }

    //Predicate
    public void setPredicate(){
        Date twoThousand = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();
        Date ninteenNinty = new GregorianCalendar(1990, Calendar.JANUARY, 1).getTime();
        Predicate<Movie> befor2000 = movie -> movie.getReleaseDate().before(twoThousand);
        Predicate<Movie> after1990 = movie -> movie.getReleaseDate().after(ninteenNinty);

        netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .forEach(movie -> {
                    if(befor2000.and(after1990).test(movie)){
                        System.out.println(movie.getTitle() + ": "
                                + movie.getReleaseDate().toGMTString()
                        );
                    }
                });
    }

    //Release year to title
    public void addReleaseYearToTitle(){
        List<Genre> list= netflix.genreList.stream()
                .map(genre -> {
                    genre.addReleaseYearToTitle();
                    return genre;
                })
                .collect(Collectors.toList());

        netflix.setGenreList(list);

        for(Genre genre: netflix.getGenreList()){
            for(Movie movie: genre.getMovieList()){
                System.out.println(movie.getTitle());
            }
        }
    }

    //Comparator
    public void sortUseComparator(){
        Comparator<Movie> movieTitleComparator = new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };


        List<Movie> list = netflix.genreList.stream()
                .flatMap(genre -> genre.getMovieList().stream())
                .sorted(movieTitleComparator)
                .collect(Collectors.toList());

        for(Movie movie: list){
            System.out.println(movie.getTitle());
        }
    }

    public Netflix createNetflix(){
        Netflix netflix = new Netflix();
        netflix.setGenreList(generateGenres());
        generateMoviesForFiction(netflix.getGenreList().get(0));
        generateMoviesForNonFiction(netflix.getGenreList().get(1));

        return netflix;
    }

    public ArrayList<Genre> generateGenres(){
        Genre fiction = new Genre();
        Genre nonFiction = new Genre();

        ArrayList<Genre> list = new ArrayList<>();
        list.add(fiction);
        list.add(nonFiction);

        return list;
    }

    public void generateMoviesForFiction(Genre fiction){

        Date date1 = new GregorianCalendar(2014, Calendar.FEBRUARY, 11).getTime();
        Movie m1 = new Movie("Me before you", date1);
        Date date2 = new GregorianCalendar(1949, Calendar.JUNE, 4).getTime();
        Movie m2 = new Movie("Casablanca", date2);
        Date date3 = new GregorianCalendar(2001, Calendar.JANUARY, 9).getTime();
        Movie m3 = new Movie("Kabhi Khushi Kabhi Gham", date3);
        Date date4 = new GregorianCalendar(2021, Calendar.SEPTEMBER, 29).getTime();
        Movie m4 = new Movie("Sooryawanshi", date4);
        Date date5 = new GregorianCalendar(1998, Calendar.MARCH, 1).getTime();
        Movie m5 = new Movie("Dark", date5);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        list.add(m4);
        list.add(m5);

        fiction.setMovieList(list);
    }

    public void generateMoviesForNonFiction(Genre nonFiction){
        Date date1 = new GregorianCalendar(2006, Calendar.MAY, 24).getTime();
        Movie m6 = new Movie("Dune", date1);
        Date date2 = new GregorianCalendar(1991, Calendar.APRIL, 23).getTime();
        Movie m7 = new Movie("Dil", date2);

        ArrayList<Movie> list = new ArrayList<>();
        list.add(m6);
        list.add(m7);

        nonFiction.setMovieList(list);
    }

    public static void main(String[] args){
        System.out.println("--Question 4--");
        Main q4 = new Main();

        System.out.println("--Add list of movies based on classes--");
        q4.addClassic();
        System.out.println();

        System.out.println("--Latest 3 movies--");
        q4.getLatestThreeMovies();
        System.out.println();

        System.out.println("--Set predicate--");
        q4.setPredicate();
        System.out.println();

        System.out.println("--Release year to title--");
        q4.addReleaseYearToTitle();
        System.out.println();

        System.out.println("--Comparator--");
        System.out.println("Sort by title");
        q4.sortUseComparator();
        System.out.println();
    }
}
