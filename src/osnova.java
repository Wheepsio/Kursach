package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class osnova extends knopochki {
    osnova() {                                                       //mainFrame - переменная главного окна
        mainFrame.setLayout(null);                                  // блок отвечающий за параметры главного окна
        mainFrame.setSize(415, 460);                 //размеры главного поля (ширина,высота) (415 450)
        mainFrame.setResizable(false);                             //не дает открывать окно на полный экран
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   ////это нужно для того чтобы при
        // закрытии окна закрывалась и программа,
        //иначе она останется висеть в процессах
        mainFrame.setLocationRelativeTo(null);                      //функция центрирования окна
        mainFrame.setVisible(true);                                 // сделать видимым
    }
    void mainosnova() {
        mainFrame.add(buttonStart);                                          //buttonStart - старт игры
        buttonStart.setBounds(100, 200, 200, 60);       // размеры кнопки старта и её положение на главном меню
        buttonStart.setFont(fontForButtons);                                // установка шрифта, SetBounds граница
        buttonStart.addActionListener(new StartGame());                     //addActionListener уведомляемый по некоторому событию объект

        mainFrame.add(buttonExit);                                            //менюшка про выйти из игры
        buttonExit.setBounds(25, 300, 350, 60);          // параметры которые отвечают за кнопку
        buttonExit.setFont(fontForButtons);                                  // выйти из игры   ( задаём шрифт)
        buttonExit.addActionListener(new Exit());

        mainFrame.add(labelWelcome);                                         //вывод на менюшке
        labelWelcome.setFont(fontForLabelWelcome);                           // надписи Пятнашки
        labelWelcome.setBounds(75, 25,350,70);          // параметры которые отвечают за
        mainFrame.repaint();                                                 // размеры надписи
    }  //repaint - это   максимально суженная область перерисовки компонента
    private void startGame() {
        mainFrame.add(buttonGameExit);
        buttonGameExit.setBounds(260, 402, 140,20);          //кнопка отвечающая за выход из игры
        buttonGameExit.addActionListener(new GameExit());
        mainFrame.add(buttonBreakButtons);
        buttonBreakButtons.setBounds(0, 402, 120,20);        //кнопка отвечающая за перемешивание
        buttonBreakButtons.addActionListener(new BreakButtons());
        arrayListForButtons.add(button1);                   // добавление на
        arrayListForButtons.add(button2);                   //игровое поле
        arrayListForButtons.add(button3);                   // плиток
        arrayListForButtons.add(button4);                  // от 1
        arrayListForButtons.add(button5);                   // до 15
        arrayListForButtons.add(button6);
        arrayListForButtons.add(button7);
        arrayListForButtons.add(button8);
        arrayListForButtons.add(button9);
        arrayListForButtons.add(button10);
        arrayListForButtons.add(button11);
        arrayListForButtons.add(button12);
        arrayListForButtons.add(button13);
        arrayListForButtons.add(button14);
        arrayListForButtons.add(button15);
        int storona1 = 0;                                                                       // переменные отвечающие
        int storona2 = 0;                                                                       // за плитки
        for (JButton button : arrayListForButtons) {                                            //отрисовка плитки
            button.setFont(fontForButtons);                                                     // шрифт для плитки
            mainFrame.add(button);
            button.setBounds(storona1, storona2, 100,100);                        //ширина высота Одной плитки
            storona1+= 100;
            if (storona1 == 400) {
                if (storona2 == 200) {
                    storona1 = 0;
                    storona2 = 300;
                } else if (storona2 == 100) {
                    storona1 = 0;
                    storona2 = 200;
                } else if (storona2 == 0) {
                    storona1 = 0;
                    storona2 = 100;
                }
            }
        }
        button1.addActionListener(new Move1());      //метод(функция) move занимается непосредственным перемещением плиток
        button2.addActionListener(new Move2());      // addActionListener уведомляемый по некоторому событию объект
        button3.addActionListener(new Move3());      //
        button4.addActionListener(new Move4());      // т.е после того, как задействуется определенная переменная
        button5.addActionListener(new Move5());
        button6.addActionListener(new Move6());      //конкретный кнопки button, то вследствие чего происходит другое событие
        button7.addActionListener(new Move7());      //Move, которое отвечает за перемещение плиток
        button8.addActionListener(new Move8());
        button9.addActionListener(new Move9());
        button10.addActionListener(new Move10());
        button11.addActionListener(new Move11());
        button12.addActionListener(new Move12());
        button13.addActionListener(new Move13());
        button14.addActionListener(new Move14());
        button15.addActionListener(new Move15());
        mainFrame.repaint();
    }

    private class StartGame implements ActionListener {        //как только стартует игра удаляются кнопки
        public void actionPerformed(ActionEvent e) {           // выхода и старта
            mainFrame.remove(buttonStart);                    // удаление кнопки с главного поля "Старт"
            mainFrame.remove(buttonExit);                     //удаление кнопки с главного поля "Выхода"
            mainFrame.remove(labelWelcome);                   //удаление надписи с главного поля "Пятнашки"
            startGame();
        }
    }
    private class Exit implements ActionListener {          // приватный класс который отвечает за выход на
        public void actionPerformed(ActionEvent e) {        //actionPerformed(ActionEvent e) обработчик события
            System.out.println("Ты вышел из пятнашек");     //т.е просто выполняет действие
            System.exit(0);
        }
    }                                                                //implements ключевое слово, предназначенное для реализации интерфейса
    private class GameExit implements ActionListener {               // выход из игры
        public void actionPerformed(ActionEvent e) {
            System.out.println("Ты вышел из пятнашек");              //сообщение которое будет выводиться
            System.exit(0);                                   //после выхода из игры
        }
    }
    private class BreakButtons implements ActionListener {      //кнопка перемешки
        public void actionPerformed(ActionEvent e) {            //приватный класс, который отвечает за перемешивание плиток на поле
            isTrueGame = true;                                  //переменная которая отвечает за "Победное положение в игре"
            int w = 0;                                          //w - просто счетчик
            while (w < 100) {
                int rand = (int) (Math.random() * 15);
                move(arrayListForButtons.get(rand));
                w++;
            }
        }
    }                                     //ниже представлены приватные классы с методом(функцией MOVE
    private class Move1 implements ActionListener { //программа принимает данные от пользователя,
        public void actionPerformed(ActionEvent e) { //строит игровое поле и затем вызывает функцию move
            move(button1);                           // и говорит какую плитку должен подвинуть
        }                                            //функция применяется к номеру на плитке
    }
    private class Move2 implements ActionListener {   // а не к её положению
        public void actionPerformed(ActionEvent e) {
            move(button2);
        }  //
    }
    private class Move3 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button3);
        }
    }
    private class Move4 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button4);
        }  //исходя из этого нам нужно найти положение
    }                                                                   //конкретной плитки в котором она находится в данный момент
    private class Move5 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button5);
        }
    }
    private class Move6 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button6);
        }
    }
    private class Move7 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button7);
        }
    }
    private class Move8 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button8);
        }
    }
    private class Move9 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button9);
        }
    }
    private class Move10 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button10);
        }
    }
    private class Move11 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button11);
        }
    }
    private class Move12 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button12);
        }
    }
    private class Move13 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button13);
        }
    }
    private class Move14 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button14);
        }
    }
    private class Move15 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            move(button15);
        }
    }
    private void move(JButton button) {
        if (xEmpty - 100 == button.getX() && yEmpty == button.getY()) {
            button.setBounds(button.getX() + 100, button.getY(), 100,100);        //которая отвечает за
            xEmpty -= 100;                                                                          //непосредственное передвижение
        } else if (xEmpty + 100 == button.getX() && yEmpty == button.getY()) {                      //самих плиток
            button.setBounds(button.getX() - 100, button.getY(), 100,100);
            xEmpty += 100;
        } else if (yEmpty - 100 == button.getY() && xEmpty == button.getX()) {
            button.setBounds(button.getX(), button.getY() + 100, 100,100);
            yEmpty -= 100;
        } else if (yEmpty + 100 == button.getY() && xEmpty == button.getX()) {
            button.setBounds(button.getX(), button.getY() - 100, 100,100);
            yEmpty += 100;
        }
        if      (button1.getX() == 0 && button1.getY() == 0 &&           //условие победы
                button2.getX() == 100 && button2.getY() == 0 &&          // правильное расположение координат
                button3.getX() == 200 && button3.getY() == 0 &&         //которое будет отвечать за
                button4.getX() == 300 && button4.getY() == 0 &&         //достижение победы
                button5.getX() == 0 && button5.getY() == 100 &&         //== простое равно
                button6.getX() == 100 && button6.getY() == 100 &&       //&& обыкновенное и
                button7.getX() == 200 && button7.getY() == 100 &&
                button8.getX() == 300 && button8.getY() == 100 &&
                button9.getX() == 0 && button9.getY() == 200 &&
                button10.getX() == 100 && button10.getY() == 200 &&
                button11.getX() == 200 && button11.getY() == 200 &&
                button12.getX() == 300 && button12.getY() == 200 &&
                button13.getX() == 0 && button13.getY() == 300 &&
                button14.getX() == 100 && button14.getY() == 300 &&
                button15.getX() == 200 && button15.getY() == 300 && isTrueGame) {      //isTrueGame победная игра
            for (JButton buttonF : arrayListForButtons) {
                mainFrame.remove(buttonF);
            }
            mainFrame.remove(buttonBreakButtons);           //удаление перемешки
            mainFrame.remove(buttonGameExit);                  //удаление выхода кнопка(1)
            mainFrame.add(buttonExit);                        //добавление кнопки выхода из приложение
            mainFrame.add(labelWictory);                        //вывод надписи победы
            labelWictory.setFont(fontForLabelWictory);
            labelWictory.setBounds(90, 80,350,70);       //расположение надписи  с победой
            mainFrame.repaint();
        }
    }
}
