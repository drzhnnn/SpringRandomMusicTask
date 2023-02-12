package ru.druzhinin.projectone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;


public class MusicPlayer {
    private Music music1;
    private Music music2;

    private Random random = new Random();

    public MusicPlayer(Music music1, Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(MusicGenre musicGenre) {
        switch (musicGenre) {
            case ROCK:
                System.out.println(music1.getSongList().get(random.nextInt(3)));
                break;
            case METAL:
                System.out.println(music2.getSongList().get(random.nextInt(3)));
                break;
        }
    }
}
