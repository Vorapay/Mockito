package ru.netology.javaqa.javaqamvn.servises;

public class FilmManager {
    public String[] film = new String[];
    public int limit;

    private FilmManager(int limit) {
        this.limit = limit;
    }

    private FilmManager() {
        limit = 5;
    }

    // Добавление нового фильма
    public void add(String newFilm) {

        String[] tmp = new String[film.length + 1];
        for (int i =0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = newFilm;
        film = tmp;
    }

    // Вывод всех фильмов в порядке добавления


    // Вывод максимального лимита штук последних добавленных фильмов в обратном от добавления порядке


}
