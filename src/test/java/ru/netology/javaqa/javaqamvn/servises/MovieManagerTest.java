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

}
