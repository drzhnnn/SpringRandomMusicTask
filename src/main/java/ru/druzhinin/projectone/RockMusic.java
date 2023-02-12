package ru.druzhinin.projectone;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("rockMusicBean")
@Scope("singleton")
public class RockMusic implements Music {

    private List<String> rockList = new ArrayList<>();

    //Блок инициализации объекта.
    //Выполняется каждый раз, когда создаётся объект класса.
    {
        rockList.add("Rock you like a hurricane");
        rockList.add("Simple man");
        rockList.add("Hotel California");
    }

    @Override
    public List<String> getSongList() {
        return rockList;
    }
}
