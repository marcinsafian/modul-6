package com.kodilla.good.patterns.challenges;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = movieStore.getMovies();

        movieMap.entrySet()
                .stream()
                .forEach(entry -> System.out.println(entry.getKey()+ " "+entry.getValue().stream().collect(Collectors.joining(" ! "))));

    }
}
