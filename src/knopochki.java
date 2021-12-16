package com.company;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class knopochki {


    JLabel labelWelcome = new JLabel("Пятнашки");    //Надпись пятнашки на главном окне

    JLabel labelWictory = new JLabel("Ты победил!");  // надпись вылазит, после того, как произошли условия победы


    ArrayList<JButton> arrayListForButtons = new ArrayList<>();
    Font fontForButtons = new Font("", Font.BOLD, 40);     //fontForButtons - переменная отвечающая за шрифты кнопок
    Font fontForLabelWelcome = new Font("", Font.BOLD, 50);  //fontForLabelWelcome - перменная для шрифта на кнопке "Пятнашки"
    Font fontForLabelWictory = new Font("", Font.BOLD, 35);     //fontForLabelWictory - переменная для "Победы"
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");  //Jbutton - функкция создает плитку сразу со шрифтом
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");   // плитки от 1 до 15
    JButton button5 = new JButton("5");
    JButton button6 = new JButton("6");
    JButton button7 = new JButton("7");
    JButton button8 = new JButton("8");
    JButton button9 = new JButton("9");
    JButton button10 = new JButton("10");
    JButton button11 = new JButton("11");
    JButton button12 = new JButton("12");
    JButton button13 = new JButton("13");
    JButton button14 = new JButton("14");
    JButton button15 = new JButton("15");

    JFrame mainFrame = new JFrame("Пятнашки");     //MainFrame - главное окно игры (расположение на главном окне надписи "Пятнашки"

    JButton buttonStart = new JButton("Играть");       //buttonStart - Кнопка начала игры
    JButton buttonExit = new JButton("Выйти из игры");     //buttonExit - Кнопка Выйти из игры на первом экране
    JButton buttonGameExit = new JButton("Выйти из игры"); //buttonGameExit - Кнопка выхода из игры на втором экране( в самой игре)
    JButton buttonBreakButtons = new JButton("Перемешать"); //buttonBreakButtons - кнопка
    boolean isTrueGame = false;                                  //isTrueGame - переменная условия победы игры

    int xEmpty = 300;
    int yEmpty = 300;


}
