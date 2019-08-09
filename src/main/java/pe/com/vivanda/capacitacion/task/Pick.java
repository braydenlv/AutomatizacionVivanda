package pe.com.vivanda.capacitacion.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

public class Pick implements Task {

	private Target optionToPick;
	
	public Pick(Target optionToPick) {
		this.optionToPick=optionToPick;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(optionToPick));//Select the product to buy
		
	}

	public static Pick the(Target optionToPick) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(Pick.class, optionToPick);//receive the product to buy
	}

}
