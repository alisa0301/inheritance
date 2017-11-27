package com.company;

@Description(value = "В мире животных")
public class Cat extends Animal implements Speaking {

    Sort sort;

    //Перегрузка -> методы с одним названием, но разной сигнатурой
    public void seatOnHands() {
        System.out.println("Не хочу!");
    }

    public void seatOnHands(int force) {
        if (force > super.getWeight()) {
            System.out.println("Кисонька сидит на ручках");
        } else {
            seatOnHands();
        }
    }

    @Override
    public void sleep() {
        System.out.println("Кисонька мягкая пушистая спит");
    }

    @Override
    public void speak() {
        System.out.println("Мяу!");
    }

    @Override
    public void roar() {
        if (this.sort == Sort.MANUL) { //Использование enum
            System.out.println("Погладь кота!\n" +
                    "Это же " + sort.getName());
        } else {
            System.out.println("РРРРР");
        }
    }

    public Sort getSort() {
        return sort;
    }

    public void setSort(Sort sort) {
        this.sort = sort;
    }

    public Cat(int weight) {
        setWeight(weight);
    }
}
