package org.example;

import reactor.core.publisher.Mono;

public class Lec2MonoJust {

    public static void main(String[] args) {

        // This is our publisher
        Mono<Integer> mono = Mono.just(1);

        System.out.println(mono);

        //In reactive programming nothing happens if we do not subscribe

        mono.subscribe(System.out::println);
    }
}
