package org.example;

import org.example.utils.Util;
import reactor.core.publisher.Mono;

public class Lec04MonoEmptyOrError {
    public static void main(String[] args) {

        userRepository(3)
                .subscribe(Util.onNext(),
                        Util.onError(),
                        Util.onComplete());
    }

    private static Mono<String> userRepository(int i) {
        if (i == 1) {
            return Mono.just(Util.FAKER.name().firstName());
        } else if (i == 2) {
            return Mono.empty();
        } else {
            return Mono.error(new IllegalArgumentException("Id Not present in DB"));
        }
    }

}
