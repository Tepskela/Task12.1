package ru.netology.qajava;

public class ManagerMovie {
    private String[] movies = new String[0];
    private int limit;

    public ManagerMovie() {
        this.limit = 5;
    }

    public ManagerMovie(int limit) {
        this.limit = limit;
    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int limitValue;
        if (movies.length < limit) {
            limitValue = movies.length;
        } else {
            limitValue = limit;
        }
        String[] tmp = new String[limitValue];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
    }

}


