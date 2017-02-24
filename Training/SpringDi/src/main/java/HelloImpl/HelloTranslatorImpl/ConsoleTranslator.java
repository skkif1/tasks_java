package HelloImpl.HelloTranslatorImpl;

import HelloImpl.HelloProviderImpl.LitteralProvider;
import HelloInterfaces.HelloProvider;
import HelloInterfaces.HelloTranslator;


public class ConsoleTranslator implements HelloTranslator {

    private HelloProvider provider;

    public ConsoleTranslator() {

    }

    public void setHelloProvider(HelloProvider provider) {
        this.provider = provider;
    }

    public void onScreen() {
        System.out.println(provider.provideHello());
    }
}
