package ru.netology.javaqa.javaqamvn.servises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test // еще не добавили ни одного фильма
    public void empty() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили один фильм
    public void addNewMovie() {
        MovieManager manager = new MovieManager();

        manager.addNewMovie("Блатшот");

        String[] expected = {"Блатшот"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили 6 фильмов и просмотрели последние 5, по умолчанию
    public void lastMoviesSixWithoutLimit() {
        MovieManager manager = new MovieManager();

        manager.addNewMovie("Вперед");
        manager.addNewMovie("Отель Белград");
        manager.addNewMovie("Джентельмены");
        manager.addNewMovie("Человек-Невидимка");
        manager.addNewMovie("Троли. Мировой тур");
        manager.addNewMovie("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек-Невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили 5 фильмов и просмотрели последние 5, по умолчанию
    public void lastMoviesFiveWithoutLimit() {
        MovieManager manager = new MovieManager();

        manager.addNewMovie("Отель Белград");
        manager.addNewMovie("Джентельмены");
        manager.addNewMovie("Человек-Невидимка");
        manager.addNewMovie("Троли. Мировой тур");
        manager.addNewMovie("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек-Невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили 4 фильмов и просмотрели последние 5, по умолчанию
    public void lastMoviesFourWithoutLimit() {
        MovieManager manager = new MovieManager();

        manager.addNewMovie("Джентельмены");
        manager.addNewMovie("Человек-Невидимка");
        manager.addNewMovie("Троли. Мировой тур");
        manager.addNewMovie("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек-Невидимка", "Джентельмены"};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили 1 фильм и просмотрели последние 5, по умолчанию
    public void lastMoviesOneWithoutLimit() {
        MovieManager manager = new MovieManager();

        manager.addNewMovie("Номер один");

        String[] expected = {"Номер один"};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили 7 фильмов и просмотрели последние 6, необходимые пользователю
    public void lastMoviesSevenWithLimit() {
        MovieManager manager = new MovieManager(6);

        manager.addNewMovie("Блатшот");
        manager.addNewMovie("Вперед");
        manager.addNewMovie("Отель Белград");
        manager.addNewMovie("Джентельмены");
        manager.addNewMovie("Человек-Невидимка");
        manager.addNewMovie("Троли. Мировой тур");
        manager.addNewMovie("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек-Невидимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили 6 фильмов и просмотрели последние 6, необходимые пользователю
    public void lastMoviesSixWithLimit() {
        MovieManager manager = new MovieManager(6);

        manager.addNewMovie("Вперед");
        manager.addNewMovie("Отель Белград");
        manager.addNewMovie("Джентельмены");
        manager.addNewMovie("Человек-Невидимка");
        manager.addNewMovie("Троли. Мировой тур");
        manager.addNewMovie("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек-Невидимка", "Джентельмены", "Отель Белград", "Вперед"};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили 5 фильмов и просмотрели последние 6, необходимые пользователю
    public void lastMoviesFiveWithLimit() {
        MovieManager manager = new MovieManager(6);

        manager.addNewMovie("Отель Белград");
        manager.addNewMovie("Джентельмены");
        manager.addNewMovie("Человек-Невидимка");
        manager.addNewMovie("Троли. Мировой тур");
        manager.addNewMovie("Номер один");

        String[] expected = {"Номер один", "Троли. Мировой тур", "Человек-Невидимка", "Джентельмены", "Отель Белград"};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // добавили 1 фильм и просмотрели последние 6, необходимые пользователю
    public void lastMoviesOneWithLimit() {
        MovieManager manager = new MovieManager();

        manager.addNewMovie("Номер один");

        String[] expected = {"Номер один"};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // не добавляли фильмы и просмотрели последние 6, необходимые пользователю
    public void lastMoviesWithLimitNoAddMovies() {
        MovieManager manager = new MovieManager(6);

        String[] expected = {};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test // не добавляли фильмы и просмотрели последние 5, по умолчанию
    public void lastMoviesWithOutLimitNoAddMovies() {
        MovieManager manager = new MovieManager();

        String[] expected = {};
        String[] actual = manager.findLimit();
        Assertions.assertArrayEquals(expected, actual);
    }

}
