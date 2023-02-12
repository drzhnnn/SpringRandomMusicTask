package ru.druzhinin.projectone;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class MetalMusic implements Music {

    private  List<String> metalList = null;

    public MetalMusic() {
        metalList = new ArrayList();
        metalList.add("Am I evil?");
        metalList.add("Nothing else matters");
        metalList.add("Seek and destroy");
    }

    @Override
    public List<String> getSongList() {
        return metalList;
    }
}
