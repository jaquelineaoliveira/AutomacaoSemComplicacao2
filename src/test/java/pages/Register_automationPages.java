package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Element;
import enums.ByValue;
import maps.Register_automation;

public class Register_automationPages {
	Register_automation registerMap = new Register_automation(); 
	
	public void clickGender(String gender) {
		Element inpGender = new Element(ByValue.cssSelector, "input[value='"+gender+"']");
		inpGender.click();
	}
	
	public void clickHobbies(String hobby) {
		Element inpHobbies = new Element(ByValue.cssSelector, "input[value='"+hobby+"']" ); 
		inpHobbies.click();
	}
	
	public void selectLanguage(String language) {
		registerMap.divLanguages.click();
		List<WebElement> listLanguages = registerMap.liLanguages.createElements(); 
		
		for (WebElement liLanguage : listLanguages) {
			WebElement aLanguage =  liLanguage.findElement(By.cssSelector("a"));
			if(aLanguage.getText().equals(language)) {
				liLanguage.click();
				break;
			}
			
			
		}
	}

}
