package com.company;

public class Main {

    public static void main(String[] args) {
        Animal firstAnimal = new Cat(5);
        firstAnimal.setName("Марси");

        Animal secondAnimal = new Worm();
        secondAnimal.setName("Кирилл");

        //Создали массив из животных - хотя сами они относятся к разным классам
        // Для каждого вызвали метод sleep - и был выполнен разный код
        Animal[] animals = {firstAnimal, secondAnimal};
        for(Animal animal: animals) {
            animal.sleep();
        }

        //Скастили(привели) первое животное к типу Кошка
        //т к мы то знаем, что там точно кошка.
        Cat cat = ((Cat)firstAnimal);
        cat.seatOnHands();
        cat.seatOnHands(6);
    }
}
