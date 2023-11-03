package org.example;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Fork fork1=new Fork("Вилка 1");
        Fork fork2=new Fork("Вилка 2");
        Fork fork3=new Fork("Вилка 3");
        Fork fork4=new Fork("Вилка 4");
        Fork fork5=new Fork("Вилка 5");
        Filosof filosof1=new Filosof("Философ 1",fork1,fork2);
        Filosof filosof2=new Filosof("Философ 2",fork2,fork3);
        Filosof filosof3=new Filosof("Философ 3",fork3,fork4);
        Filosof filosof4=new Filosof("Философ 4",fork4,fork5);
        Filosof filosof5=new Filosof("Философ 5",fork5,fork1);
        filosof1.start();
        filosof2.start();
        filosof3.start();
        filosof4.start();
        filosof5.start();
    }
}