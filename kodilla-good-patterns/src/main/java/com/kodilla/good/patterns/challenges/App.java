package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
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

        final String movies = movieMap.entrySet()
                .stream()
                .flatMap(entrry -> entrry.getValue().stream())
                .collect(Collectors.joining(" ! "));
        System.out.println(movies);

        final String abbreviation = movieMap.entrySet()
                .stream()
                .flatMap(n -> {
                    List<String> list = new ArrayList<>();
                    list.add(n.getKey());
                    list.addAll(n.getValue());
                    return list.stream();
                })
                .collect(Collectors.joining(" ! "));
        System.out.println(abbreviation);
    }
}
