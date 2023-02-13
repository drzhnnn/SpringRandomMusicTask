package ru.druzhinin.projectone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private List<Music> genreList;

    private Random random = new Random();

    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public void playMusic() {
        Music randomGenre = genreList.get(random.nextInt(2));
        String randomSong = randomGenre.getSongList().get(random.nextInt(3));
        System.out.println("Playing: " + randomSong);
    }
}
