import Config.HelloConfig;
import HelloImpl.HelloProviderImpl.DbProvider;
import HelloImpl.HelloProviderImpl.FileProvider;
import HelloImpl.HelloProviderImpl.LitteralProvider;
import HelloImpl.HelloTranslatorImpl.ConsoleTranslator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloConfig.class);
        ConsoleTranslator translator = ctx.getBean(ConsoleTranslator.class);
        DbProvider provider = ctx.getBean(DbProvider.class);
        translator.setHelloProvider(provider);
        translator.onScreen();
    }

}
