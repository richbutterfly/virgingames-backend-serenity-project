package com.virgingames.cucmber.steps;

import com.virgingames.gameinfo.GameSteps;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.annotations.Steps;

import static org.hamcrest.CoreMatchers.equalTo;

public class GameStepsDefs {


    static ValidatableResponse response;

    @Steps
    GameSteps steps;

    @When("User sends a GET request to list all GBP data")
    public void userSendsAGETRequestToListAllGBPData() {
        response = steps.getAllGBPData();
        response.statusCode(200).log().all();
    }

    @Then("Verify Jackpot id is Roxor Progressives")
    public void verifyJackpotIdIsRoxorProgressives() {
        response.body("data.jackpotId", equalTo("Roxor Progressives"));
    }


    @When("User sends a GET request to list SEK currency")
    public void userSendsAGETRequestToListSEKCurrency() {
        response = steps.getAllSEKData();
        response.statusCode(200).log().all();
    }

    @Then("Verify user can get all SEK currency")
    public void verifyUserCanGetAllSEKCurrency() {
        response = steps.getAllSEKData();
        response.body("data.pots[0].currency", equalTo("SEK"));
    }

    @When("User sends a request to get all SEK data")
    public void userSendsARequestToGetAllSEKData() {
        response = steps.getAllSEKData();
        response.statusCode(200).log().all();
    }


    @Then("Verify name of {int}th Index is play-dond")
    public void verifyNameOfThIndexIsPlayDond(int number) {
        response.body("data.pots[7].name", equalTo("play-dond"));
    }


}