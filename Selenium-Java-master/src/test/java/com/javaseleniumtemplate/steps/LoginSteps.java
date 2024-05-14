package com.javaseleniumtemplate.steps;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import com.javaseleniumtemplate.pages.MainPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginSteps extends TestBase {
    //Objects
    LoginPage loginPage;
    MainPage mainPage;
    LoginFlows loginFlows;
    SoftAssert softAssert;

    @Test
    @Given("^que o usuário entre com dados corretos de (.*) e (.*)$")
    public void queOUsuárioEntreComDadosCorretosDe(String arg1, String arg2) throws Throwable {
        loginPage = new LoginPage();
        //Test
        loginFlows.signIn(arg1, arg2);

        //Assert
        Assert.assertEquals(arg1, mainPage.retornaUsernameDasInformacoesDeLogin());
    }
    @Then("^o usuário tera acesso ao MainPage$")
    public void oUsuarioTeraAcessoAoMainPage(String arg1){
        Assert.assertEquals(arg1, mainPage.retornaUsernameDasInformacoesDeLogin());

    }
    //Tests
    @Test
    public void loginSuccessfully(){

        //Objects instances
        loginPage = new LoginPage();
        mainPage = new MainPage();
        loginFlows = new LoginFlows();


        //Parameters
        String usuario = "Rodrigo_Roel";
        String senha = "S3l3nium";


        //Test
        loginFlows.signIn(usuario, senha);

        //Assert
        Assert.assertEquals(usuario, mainPage.retornaUsernameDasInformacoesDeLogin());

    }
}
