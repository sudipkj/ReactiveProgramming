package org.example;

import org.example.utils.Util;
import reactor.core.publisher.Mono;

import java.util.concurrent.Callable;

public class Lec06MonoFromCallbale {

    public static void main(String[] args) {

        Callable<String> callable = () -> "This callbale is returning some string";
        Mono<String> callableMono = Mono.fromCallable(callable);

        callableMono.subscribe(Util.onNext(),
                Util.onError(),
                Util.onComplete());
    }

}
