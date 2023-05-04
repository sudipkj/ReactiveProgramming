package org.example;

import reactor.core.publisher.Mono;

public class Lec03MonoSubscribe {

    public static void main(String[] args) {
        Mono<String> mono = Mono.just("ball").map(e -> e.concat(" to you"));

        //There are many types of subscribe present for subsribe method
        mono.subscribe(item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("completed")
        );

        // Test mono for exceptions

        Mono<Integer> mono1 = Mono.just(5)
                .map(e -> e * 2)
                .map(e -> e / 0);

        mono1.subscribe(item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("OnComplete message")
        );
    }
}
