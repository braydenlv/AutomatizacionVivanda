package pe.com.vivanda.capacitacion.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaDeliveryOptions;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaHeinekenPage;

public class SelectDelivery implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(VivandaDeliveryOptions.SCHEDULED),//click on the option pick up in store
				Click.on(VivandaDeliveryOptions.MIRAFLORES_OPTION),//Select the distric
				Click.on(VivandaDeliveryOptions.CONTINUE_BUTTON),//click on the button to continue
				Click.on(VivandaDeliveryOptions.UNDERSTOOD_BUTTON),//click on the button to continue
				Click.on(VivandaHeinekenPage.SHIPPING_CART_BUTTON));//click on the Shipping cart button
	}

	public static SelectDelivery storePickup() {
		return Tasks.instrumented(SelectDelivery.class);
	}

}
