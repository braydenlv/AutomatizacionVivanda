package pe.com.vivanda.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class VivandaResultsPage extends PageObject{
	public static final Target OPTION_BOTTLE = Target.the("Option bottle 6 unid").located(By.xpath("//div[@class='product-name g-table']//a[@href='https://www.vivanda.com.pe/cerveza-heineken-premium-paquete-6un-botella-330ml/p']"));
	
}
