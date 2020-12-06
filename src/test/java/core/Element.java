package core;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import enums.ByValue;
import io.cucumber.messages.internal.com.google.gson.internal.LinkedTreeMap;

public class Element {

	private ByValue tipo;
	private String mapa;
	private LinkedTreeMap<ByValue, By> map = new LinkedTreeMap<>();

	public Element(ByValue tipo, String mapa) {
		this.tipo = tipo;
		this.mapa = mapa;
		setMap();
	}

	private void setMap() {
		map.put(ByValue.id, By.id(mapa));
		map.put(ByValue.name, By.name(mapa));
		map.put(ByValue.linkText, By.linkText(mapa));
		map.put(ByValue.className, By.className(mapa));
		map.put(ByValue.xpath, By.xpath(mapa));
		map.put(ByValue.cssSelector, By.cssSelector(mapa));
	}

	public WebElement createElement() {

		return Driver.driver.findElement(map.get(tipo));
	}

	public List<WebElement> createElements() {
		return Driver.driver.findElements(map.get(tipo));
	}

	public void sendKeys(CharSequence... value) {
		createElement().sendKeys(value);
	}

	public String getText() {
		return createElement().getText();
	}

	public void clear() {
		createElement().clear();
	}

	public void click() {
		createElement().click();
	}

	public boolean isDisplayes() {
		return createElement().isDisplayed();
	}

	public boolean isEnabled() {
		return createElement().isEnabled();
	}

	public boolean isSelected() {
		return createElement().isSelected();

	}
}
