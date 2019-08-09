package pe.com.vivanda.capacitacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaHeinekenPage;

public class AddToShippingCart implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(VivandaHeinekenPage.MORE_QUANTIY_BUTTON),//Click to add other sixpack
					Click.on(VivandaHeinekenPage.ADD_SHIPPING_CART_BUTTON));//click to add the product to shipping cart
	}

	public static AddToShippingCart theProduct() {
		return Tasks.instrumented(AddToShippingCart.class);
	}

}
