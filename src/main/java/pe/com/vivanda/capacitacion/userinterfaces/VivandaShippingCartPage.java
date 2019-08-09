package pe.com.vivanda.capacitacion.userinterfaces;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivandaShippingCartPage extends PageObject {
	public static final Target TEXT = Target.the("Product image").located(By.xpath("//a[@href='/cerveza-heineken-premium-paquete-6un-botella-330ml/p']"));
	public static final Target QUANTITY = Target.the("Product quantity").located(By.xpath("//span[@class='vtexsc-skuQtt']"));

}
