package eheio.ma.restapi.configuration;

import eheio.ma.restapi.mapper.StudentMapper;
import fr.xebia.extras.selma.Selma;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationFactory {

    @Bean
    public StudentMapper studentMapper() {
        return Selma.builder(StudentMapper.class).build();
    }
}
