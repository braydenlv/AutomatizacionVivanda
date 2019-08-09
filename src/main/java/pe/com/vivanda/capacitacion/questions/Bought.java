package pe.com.vivanda.capacitacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaShippingCartPage;

public class Bought implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(VivandaShippingCartPage.TEXT).viewedBy(actor).asString();//capture the text in the tag
	}

	public static Bought theProduct() {
		return new Bought();
	}

}
