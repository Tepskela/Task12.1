package ru.netology.qajava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerMovieTest {

    @Test
    public void testManyFilms() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");

        String[] expected = {"Film 1", "Film 2", "Film 3"};
        String[] acrual = manager.findAll();
        Assertions.assertArrayEquals(expected, acrual);
    }

    @Test
    public void testZeroFilms() {
        ManagerMovie manager = new ManagerMovie();
        String[] expected = {};
        String[] acrual = manager.findAll();
        Assertions.assertArrayEquals(expected, acrual);
    }

    @Test
    public void testOneFilms() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] acrual = manager.findAll();
        Assertions.assertArrayEquals(expected, acrual);
    }
// тест findLast----------------------------------------

    @Test
    public void findLastZeroFilms() {
        ManagerMovie manager = new ManagerMovie();

        String[] expected = {};
        String[] acrual = manager.findLast();
        Assertions.assertArrayEquals(expected, acrual);
    }

    @Test
    public void findLastOneStandartLimitFilms() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");

        String[] expected = {"Film 1"};
        String[] acrual = manager.findLast();
        Assertions.assertArrayEquals(expected, acrual);
    }

    @Test
    public void findLastFourStandartLimitFilms() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");


        String[] expected = {"Film 4", "Film 3", "Film 2", "Film 1"};
        String[] acrual = manager.findLast();
        Assertions.assertArrayEquals(expected, acrual);
    }

    @Test
    public void findLastFaveStandartLimitFilms() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");

        String[] expected = {"Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] acrual = manager.findLast();
        Assertions.assertArrayEquals(expected, acrual);
    }

    @Test
    public void findLastSihStandartLimitFilms() {
        ManagerMovie manager = new ManagerMovie();

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] acrual = manager.findLast();
        Assertions.assertArrayEquals(expected, acrual);
    }

    @Test
    public void findLastManyMoreSpecificLimitFilms() {
        ManagerMovie manager = new ManagerMovie(6);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");

        String[] expected = {"Film 7", "Film 6", "Film 5", "Film 4", "Film 3", "Film 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastEquallyMoreSpecificLimitFilms() {
        ManagerMovie manager = new ManagerMovie(6);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");

        String[] expected = {"Film 6", "Film 5", "Film 4", "Film 3", "Film 2", "Film 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastZeroSpecificLimitFilms() {
        ManagerMovie manager = new ManagerMovie(0);

        String[] expected = {};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOneSpecificLimitFilms() {
        ManagerMovie manager = new ManagerMovie(1);

        manager.addMovie("Film 1");
        manager.addMovie("Film 2");
        manager.addMovie("Film 3");
        manager.addMovie("Film 4");
        manager.addMovie("Film 5");
        manager.addMovie("Film 6");
        manager.addMovie("Film 7");

        String[] expected = {"Film 7"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}