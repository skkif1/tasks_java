package HelloImpl.HelloProviderImpl;


import HelloInterfaces.HelloProvider;


public class LitteralProvider implements HelloProvider {

    public String provideHello() {
        return "Hello Litteral";
    }
}
