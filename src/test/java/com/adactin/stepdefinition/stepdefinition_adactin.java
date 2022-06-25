package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.runner.Addactin_Runner_Class;
import com.baseclass.Base_Class;
import com.sdp.Adactin_Manager;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepdefinition_adactin extends Base_Class {
	public static WebDriver driver = Addactin_Runner_Class.driver;
	public static Adactin_Manager adm = new Adactin_Manager(driver);
	
	
	@Given("^user Lauching the url of Adactin Webpage$")
	public void user_Lauching_the_url_of_Adactin_Webpage() throws Throwable {
	    gettingurl("https://adactinhotelapp.com/");
	}
	
	
	@When("^user enetering the username$")
	public void user_enetering_the_username() throws Throwable {
	    sendText(adm.getLp().getUsername(), "Sultan1238");
	}

	
	@When("^user entering the password$")
	public void user_entering_the_password() throws Throwable {
	    sendText(adm.getLp().getPassword(), "Pass@123");
	}

	
	@Then("^user clicking the login button to navigate to search hotel page$")
	public void user_clicking_the_login_button_to_navigate_to_search_hotel_page() throws Throwable {
		waitimplicit();
	    clickOnElement(adm.getLp().getLogin());
	}
	
	
	@When("^user entering location$")
	public void user_entering_location() throws Throwable {
		
		waitimplicit();
		select_dropdown(adm.getSh().getLocation(), "by visible text", "Brisbane");
	}

	@When("^user selecting hotel$")
	public void user_selecting_hotel() throws Throwable {
		waitimplicit();
		select_dropdown(adm.getSh().getHotel(), "by visible text", "Hotel Hervey");
	}

	@When("^user selecting room type$")
	public void user_selecting_room_type() throws Throwable {
		waitimplicit();
		select_dropdown(adm.getSh().getRooms(), "by visible text", "Deluxe");
	}

	@When("^user selecting no of rooms$")
	public void user_selecting_no_of_rooms() throws Throwable {
		waitimplicit();
		select_dropdown(adm.getSh().getNoofroom(), "by visible text", "4 - Four");
	}

	@When("^user check in date$")
	public void user_check_in_date() throws Throwable {
		waitimplicit();
		sendText(adm.getSh().getDatein(), "20/05/2020");
	}

	@When("^user check out date$")
	public void user_check_out_date() throws Throwable {
		waitimplicit();
		sendText(adm.getSh().getDateout(), "22/06/2021");
	}

	@When("^user selecting no of adults$")
	public void user_selecting_no_of_adults() throws Throwable {
		waitimplicit();
		select_dropdown(adm.getSh().getAddultcount(), "by visible text", "3 - Three");
	}
	
	@When("^user selecting no of childs$")
	public void user_selecting_no_of_childs() throws Throwable {
		waitimplicit();
		select_dropdown(adm.getSh().getChildcount(), "by visible text", "2 - Two");
	}

	@Then("^user clicking on the search button$")
	public void user_clicking_on_the_search_button() throws Throwable {
		waitimplicit();
		clickOnElement(adm.getSh().getSearch());
	}

	@When("^user confirming the selection$")
	public void user_confirming_the_selection() throws Throwable {
		waitimplicit();
		clickOnElement(adm.getSelhc().getSelhotel());
	}

	@Then("^user cclicking on continue button$")
	public void user_cclicking_on_continue_button() throws Throwable {
		waitimplicit();
		clickOnElement(adm.getSelhc().getContinuebtn());
	}

	@When("^user giving first name$")
	public void user_giving_first_name() throws Throwable {
		waitimplicit();
		sendText(adm.getFp().getFname(), "Mohammad");
	}

	@When("^user giving last name$")
	public void user_giving_last_name() throws Throwable {
		waitimplicit();
		sendText(adm.getFp().getLname(), "Sultan");
	}

	@When("^user giving address$")
	public void user_giving_address() throws Throwable {
		waitimplicit();
		sendText(adm.getFp().getAddressbox(), "Pattalam, Tambaram");
	}

	@When("^user giving card number$")
	public void user_giving_card_number() throws Throwable {
		waitimplicit();
		sendText(adm.getFp().getCardnum(), "1542758962531485");
	}

	@When("^user giving card type$")
	public void user_giving_card_type() throws Throwable {
		waitimplicit();
		select_dropdown(adm.getFp().getCardtype(), "by Visible text", "Master Card");
	}

	@When("^user giving card expiry mon$")
	public void user_giving_card_expiry_mon() throws Throwable {
		waitimplicit();
		select_dropdown(adm.getFp().getCardexpirymon(), "by Visible text", "March");
	}

	@When("^user giving card expiry yeaar$")
	public void user_giving_card_expiry_yeaar() throws Throwable {
		waitimplicit();
		select_dropdown(adm.getFp().getCardexpiryyear(), "by Visible text", "2013");
	}

	@When("^user giving card ccv number$")
	public void user_giving_card_ccv_number() throws Throwable {
		waitimplicit();
		sendText(adm.getFp().getCardccv(), "157");
	}

	@Then("^user booking hotel$")
	public void user_booking_hotel() throws Throwable {
		waitimplicit();
		clickOnElement(adm.getFp().getBooking());
	}
	
	
	
}
