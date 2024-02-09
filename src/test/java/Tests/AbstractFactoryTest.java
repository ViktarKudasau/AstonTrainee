package Tests;

import org.testng.annotations.Test;
import pageObjects.AbstractFactoryObjects.AdultBirthdaySet;
import pageObjects.AbstractFactoryObjects.BirthdayFactory;
import pageObjects.AbstractFactoryObjects.KidsBirthdaySet;

public class AbstractFactoryTest {

    AdultBirthdaySet adultBirthdaySet = new AdultBirthdaySet();
    KidsBirthdaySet kidsBirthdaySet = new KidsBirthdaySet();

    @Test
    public void getBirthdaySet(){
        System.out.println(doParty(adultBirthdaySet));
        System.out.println(doParty(kidsBirthdaySet));
    }

    public static String doParty(BirthdayFactory birthdayFactory) {

        return birthdayFactory.getCard().getName() + ", " +
                birthdayFactory.getCake().getName() + " и " +
                birthdayFactory.getGift().getName() + ".";
    }
}
