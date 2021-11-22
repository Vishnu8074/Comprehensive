package com.mindtree.uiStore;

import org.openqa.selenium.By;

public class ContactUsUI {
	public static By contact=By.xpath("//a[text()='Contact us']");
	public static By name=By.name("contact[name]");
	public static By email=By.name("contact[email]");
	public static By message=By.name("contact[body]");
	public static By send=By.xpath("//*[@id=\"contact_form\"]/button");
	

}
