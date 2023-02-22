package com.dada.classesspringbootangular;

import com.dada.classesspringbootangular.repositories.ClassRepository;
import com.dada.classesspringbootangular.models.Class;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ClassesSpringBootAngularApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClassesSpringBootAngularApplication.class, args);
    }
    @Bean
    CommandLineRunner addClasses(ClassRepository classRepository) {
        return args -> {
            Class math = new Class();
            math.setTitle("Mathematics");
            math.setDescription("This class covers basic arithmetic and algebra.");
            classRepository.save(math);

            Class english = new Class();
            english.setTitle("English");
            english.setDescription("This class covers grammar, vocabulary, and writing.");
            classRepository.save(english);

            Class history = new Class();
            history.setTitle("History");
            history.setDescription("This class covers world history from ancient times to the present day.");
            classRepository.save(history);

            Class science = new Class();
            science.setTitle("Science");
            science.setDescription("This class covers biology, chemistry, and physics.");
            classRepository.save(science);

            Class art = new Class();
            art.setTitle("Art");
            art.setDescription("This class covers drawing, painting, and sculpture.");
            classRepository.save(art);

            Class music = new Class();
            music.setTitle("Music");
            music.setDescription("This class covers music theory, composition, and performance.");
            classRepository.save(music);

            Class literature = new Class();
            literature.setTitle("Literature");
            literature.setDescription("This class covers classic and contemporary works of fiction and poetry.");
            classRepository.save(literature);

            Class programming = new Class();
            programming.setTitle("Programming");
            programming.setDescription("This class covers software development with Java and Spring Boot.");
            classRepository.save(programming);

            Class language = new Class();
            language.setTitle("Language");
            language.setDescription("This class covers basic conversation skills in Spanish, French, or Mandarin.");
            classRepository.save(language);

            Class physical_education = new Class();
            physical_education.setTitle("Physical Education");
            physical_education.setDescription("This class covers fitness, sports, and healthy habits.");
            classRepository.save(physical_education);

        };
    }

}
