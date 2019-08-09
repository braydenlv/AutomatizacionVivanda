package pe.com.vivanda.capacitacion.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaShippingCartPage;

public class Quantity implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(VivandaShippingCartPage.QUANTITY).viewedBy(actor).asString();//capture the text in the tag
	}

	public static Quantity bought() {
		return new Quantity();
	}

}
