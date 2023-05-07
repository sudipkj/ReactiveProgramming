package org.example;

import org.example.utils.Util;
import reactor.core.publisher.Mono;

public class Lec05MonoFromSupplier {

    public static void main(String[] args) {

        Mono<String> mono = Mono.fromSupplier(()->getName());

        mono.subscribe(Util.onNext(), Util.onError(), Util.onComplete());

    }

    public static String getName() {
        System.out.println("Generating name....");
        return Util.FAKER.name().firstName();
    }
}
