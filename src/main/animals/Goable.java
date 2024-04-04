package main.animals;

import java.io.Serializable;

@FunctionalInterface

public interface Goable {
    //public static final double pi = 3.14;

    void go(); // abstrakt metod

    default double detRunSpeed(){
        return 10;
    } // все животные по умолчанию двигаются со скоростью 10
}
