public class MovieManager {
    private MovieManager[] movie = new MovieManager[0];
    private String name;
    int lastMovies;
    private String newMovie;

    public MovieManager(String name, int lastMovies) {
        this.name = name;
        this.lastMovies = lastMovies;
    }

    public MovieManager() {
        this.name = name;
        this.lastMovies = lastMovies;
    }

    // Добавление нового фильма.
    public void addNewMovie(MovieManager movie) {
        MovieManager[] tmp = new MovieManager[movie.length + 1];
        for (int i = 0; i < movie.length + 1; i++) {
            tmp[i] = movie[i];
        }
        tmp[tmp.length - 1] = movie;
    }

    // Вывод всех фильмов в порядке добавления (findAll).
    public MovieManager[] getKino() {

    }

    // Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке (findLast).


}
