package pe.com.vivanda.capacitacion.stepdefinitions;

import org.openqa.selenium.WebDriver;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Managed;
import pe.com.vivanda.capacitacion.questions.Bought;
import pe.com.vivanda.capacitacion.questions.Quantity;
import pe.com.vivanda.capacitacion.task.AddToShippingCart;
import pe.com.vivanda.capacitacion.task.OpenPage;
import pe.com.vivanda.capacitacion.task.Pick;
import pe.com.vivanda.capacitacion.task.Search;
import pe.com.vivanda.capacitacion.task.SelectDelivery;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaHomePage;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaResultsPage;
import pe.com.vivanda.capacitacion.userinterfaces.VivandaShippingCartPage;

public class VivandaStepDefinitions {
	
	Actor brayden=Actor.named("brayden");
	PageObject homePage = new VivandaHomePage();
	//Target optionToPick = VivandaResultsPage.OPTION_BOTTLE;
	String option = "botella";
	
	@Managed (driver="chrome")
	WebDriver hisBrowser;
	
	@Before
	public void setUp() {
		brayden.can(BrowseTheWeb.with(hisBrowser));//the ability to navigate is assigned
		hisBrowser.manage().window().maximize();//The windows browser is maximized
		
	}
	
	
	@Given("^Brayden was on the page home$")
	public void braydenWasOnThePageHome() throws Exception {
	    brayden.wasAbleTo(OpenPage.on(homePage));//open the page "https://www.vivanda.com.pe/"
	}


	@When("^he searchs the word \"([^\"]*)\" and add to shopping cart$")
	public void heSearchsTheWordAndAddToShoppingCart(String word) throws Exception {
	    brayden.attemptsTo(Search.the(word), //Search the word "Heineken"
	    		Pick.the(VivandaResultsPage.OPTION_BOTTLE),//Select the option of Bottle
	    		AddToShippingCart.theProduct(),//Change the quantity, add to shipping cart and click to button to inspect the shipping cart
	    		SelectDelivery.storePickup());//Select the delivery method
	}

	@Then("^he can see the product there$")
	public void heCanSeeTheProductThere() throws Exception {
		brayden.should(seeThat(Bought.theProduct(),equalTo("Cerveza HEINEKEN Premium Paquete 6Un Botella 330Ml")),//purchased product verification
				seeThat(Quantity.bought(),equalTo("x2")));//purchased product verification
	}
}
