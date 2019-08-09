package pe.com.vivanda.capacitacion.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivandaHeinekenPage extends PageObject {
	public static final Target MORE_QUANTIY_BUTTON=Target.the("More quantity").located(By.xpath("//div[@class='more-product more-qty-detail txt-green']"));
	public static final Target ADD_SHIPPING_CART_BUTTON = Target.the("Add to shipping cart").located(By.xpath("//a[@class='buy-button buy-button-ref']"));
	public static final Target SHIPPING_CART_BUTTON = Target.the("Add to shipping cart").located(By.xpath("//i[@class='minicart__btn__icon-i']"));
}
