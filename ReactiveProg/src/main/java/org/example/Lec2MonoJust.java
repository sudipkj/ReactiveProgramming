package org.example;

import reactor.core.publisher.Mono;
import reactor.core.publisher.SynchronousSink;

public class Lec2MonoJust {

    public static void main(String[] args) {

        // This is our publisher
        Mono<Integer> mono = Mono.just(1);

        System.out.println(mono);

        //In reactive programming nothing happens if we do not subscribe

        mono.subscribe( i -> {
            System.out.println(i);
        });


    }
}
