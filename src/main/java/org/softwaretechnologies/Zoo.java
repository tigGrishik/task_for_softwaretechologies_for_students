package org.softwaretechnologies;

import org.softwaretechnologies.animals.Animal;
import org.softwaretechnologies.animals.AnimalType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Zoo {
    private final List<Animal> animalList = new ArrayList<>();
    public void addAnimal(Animal animal) {

        animalList.add(animal);
    }

    /**
     * Метод должен возвращать список звуков животных.
     * Звуки животных должны быть отсортированы по имени житного. Пример
     * Животные:
     *
     * Корова: Яша
     * Кошка: Дуся
     * Собака: Жучка
     * Корова: Абракадабра
     * Собака: Шарик
     * Кошка: Мурзик
     * Собака: Бобик
     *
     * Возвращаемый список звуков: moo, woof, meow, woof, meow, woof, moo
     *
     * @return Звуки животных, в алфавитном порядке имени животного.
     */
    public List<String> soundAllAnimalsSortByName() {
        animalList.sort(Comparator.comparing(Animal :: getName));
        List<String> sounds = new ArrayList<>();
        for (Animal animal: animalList) sounds.add(animal.sound());

        return sounds;
    }


}
