package pe.com.vivanda.capacitacion.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.vivanda.com.pe/")
public class VivandaHomePage extends PageObject {
	public static final Target SEARCH_BOX=Target.the("Search box").locatedBy("//input[@class='input-text js-input-search']");
}