package lesson.room.service;

import lesson.room.model.Human;

public class HumanService {

    public Human createHuman() {
        Human human = new Human();
        human.setName("Anna");
        return human;
    }
}
