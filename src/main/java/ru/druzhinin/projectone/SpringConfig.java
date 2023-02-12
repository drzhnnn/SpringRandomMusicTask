package ru.druzhinin.projectone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Создание бинов и внедрение зависимостей вручную. Аннотации @Component, @Autowired и т.д. удалены.
@Configuration
@ComponentScan("ru.druzhinin.projectone")
public class SpringConfig {
    @Bean
    public MetalMusic metalMusic() {
        return new MetalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(metalMusic(), rockMusic());
    }
}
