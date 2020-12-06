package maps;

import core.Element;
import enums.ByValue;

public class Register_automation {
	
	public Element h2Titulo = new Element(ByValue.cssSelector, "h2");
	public Element inpFirstName = new Element(ByValue.cssSelector, "input[ng-model='FirstName']");
	public Element inpLastName = new Element(ByValue.cssSelector, "input[ng-model='LastName']");
	public Element inpAdress = new Element(ByValue.cssSelector, "input[ng-model='Adress']");
	public Element inpEmail = new Element(ByValue.cssSelector, "input[type='Email']");
	public Element inpPhone = new Element(ByValue.cssSelector, "input[type='tel']");
	public Element divLanguages = new Element(ByValue.id, "msdd");
	public Element liLanguages  = new Element(ByValue.cssSelector, "li.ng-scope");


}
