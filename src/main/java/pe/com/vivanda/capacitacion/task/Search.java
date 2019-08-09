package pe.com.vivanda.capacitacion.task;

import org.openqa.selenium.Keys;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaHomePage;

public class Search implements Task {

	private String word;
	private Target searchBox=VivandaHomePage.SEARCH_BOX;
	
	public Search(String word) {
		this.word=word;
	}
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(word).into(searchBox).thenHit(Keys.ENTER));//Search the word and hit the Enter key
	}

	public static Search the(String word) {
		return Tasks.instrumented(Search.class, word);//recive the word to search
	}

}
