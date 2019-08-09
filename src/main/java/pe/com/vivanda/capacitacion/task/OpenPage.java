package pe.com.vivanda.capacitacion.task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task{

	private PageObject homePage;
	
	public OpenPage(PageObject homePage) {
		this.homePage=homePage;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(homePage));//open the home page of vivanda
	}

	public static OpenPage on(PageObject homePage) {
		return Tasks.instrumented(OpenPage.class, homePage);//receive the page to open
	}

}
