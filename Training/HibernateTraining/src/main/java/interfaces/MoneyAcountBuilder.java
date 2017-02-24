package interfaces;


import Entyti.Deposite;
import Entyti.MoneyAcount;
import Entyti.User;

public interface MoneyAcountBuilder {

    public int forThreeMontehProccent = 10;
    public int forSixMontehProccent = 20;
    public int forTenMontehProccent = 40;

    public MoneyAcount createAcount(User user);

    public Deposite createDeposite();


}
