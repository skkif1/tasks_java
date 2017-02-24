package Config;

import HelloImpl.HelloProviderImpl.DbProvider;
import HelloImpl.HelloProviderImpl.FileProvider;
import HelloImpl.HelloProviderImpl.LitteralProvider;
import HelloImpl.HelloTranslatorImpl.ConsoleTranslator;
import HelloInterfaces.HelloProvider;
import HelloInterfaces.HelloTranslator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloConfig {

    @Bean
    public HelloProvider litteral() {
        return new LitteralProvider();
    }

    @Bean
    public HelloTranslator toConsole() {
        return new ConsoleTranslator();
    }

    @Bean
    public HelloProvider file() {
        return new FileProvider();
    }

    @Bean
    public HelloProvider db() {
        return new DbProvider();
    }
}
