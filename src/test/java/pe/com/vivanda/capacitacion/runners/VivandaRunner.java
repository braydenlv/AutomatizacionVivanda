package pe.com.vivanda.capacitacion.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src\\test\\resources\\pe\\com\\vivanda\\capacitacion\\resources\\buy_product.feature",
			glue="pe.com.vivanda.capacitacion.stepdefinitions",
			snippets=SnippetType.CAMELCASE)
public class VivandaRunner {

}
