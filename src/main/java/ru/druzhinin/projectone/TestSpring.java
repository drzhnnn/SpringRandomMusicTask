package ru.druzhinin.projectone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayerBean", MusicPlayer.class);
        musicPlayer.playMusic(MusicGenre.ROCK);
        musicPlayer.playMusic(MusicGenre.METAL);

        context.close();
    }
}
