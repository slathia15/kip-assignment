package com.knoldus.questions.four;

import java.time.Duration;
import java.time.LocalDateTime;

public class MahatmaGandhi {

//Calculates time of a person life in seconds

    public static long findTime(LocalDateTime birthDate, LocalDateTime deathDate)
    {
        return Duration.between(birthDate, deathDate)
                .getSeconds();

    }

    public static void main(String[] args) {

        LocalDateTime birthDate = LocalDateTime.of(1869, 10, 2, 10, 20, 55);

        LocalDateTime deathDate = LocalDateTime.of(1948, 1, 31, 10, 20, 55);

        System.out.println(findTime(birthDate,deathDate));
    }
}
