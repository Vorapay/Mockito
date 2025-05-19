package ru.netology.javaqa.javaqamvn.servises;

public class MovieManager {
    private String[] movies = new String[0];
    private int lastMovies;

    public MovieManager(int lastMovies) {
        this.lastMovies = lastMovies;
    }

    public MovieManager() {
        this.lastMovies = 5;
    }

    // Добавление нового фильма.
    public void addNewMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        this.movies = tmp;
    }

    // Вывод всех фильмов в порядке добавления.
    public String[] findAll() {
        return movies;
    }

    // Вывод максимальный лимит штук последних добавленных фильмов в обратном от добавления порядке.
    public String[] findLimit() {
        int resultLength;
        if (movies.length < lastMovies) {
            resultLength = movies.length;
        } else {
            resultLength = lastMovies;
        }
        String[] limit = new String[resultLength];
        for (int i = 0; i < limit.length; i++) {
            limit[i] = movies[movies.length - 1 - i];
        }
        return limit;
    }

}
