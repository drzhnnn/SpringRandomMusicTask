package ru.druzhinin.projectone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Создание бинов и внедрение зависимостей вручную. Аннотации @Component, @Autowired и т.д. удалены.
@Configuration
@ComponentScan("ru.druzhinin.projectone")
public class SpringConfig {

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }
    @Bean
    public MetalMusic metalMusic() {
        return new MetalMusic();
    }

    @Bean
    public List<Music> genreList() {
        List<Music> genreList = new ArrayList<>();
        genreList.add(rockMusic());
        genreList.add(metalMusic());
        return genreList;
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(genreList());
    }

}
