package pe.com.vivanda.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class VivandaDeliveryOptions extends PageObject{
	public static final Target EXPRESS=Target.the("Option express").located(By.xpath("//button[@data-name='express'] "));
	public static final Target SCHEDULED=Target.the("Option scheduled").located(By.xpath("//button[@data-name='scheduled']"));
	public static final Target MIRAFLORES_OPTION=Target.the("Miraflores option").located(By.xpath("//option[contains(text(),'Miraflores')]"));
	public static final Target CONTINUE_BUTTON=Target.the("Continue button").located(By.xpath("//button[@class='SalesChannel__confirmButton SalesChannel__confirmButton--ubigeo SalesChannel_confirmButton--active']"));
	public static final Target UNDERSTOOD_BUTTON=Target.the("understood button").located(By.xpath("//button[@class='SalesChannel__confirmButton SalesChannel__confirmButton--savedPreferences SalesChannel_confirmButton--active']"));
}
