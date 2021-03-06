package edu.iis.mto.bdd.trains.cucumber;

import cucumber.api.PendingException;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"}, glue = "edu.iis.mto.bdd.trains.cucumber.steps",
        features = {"classpath:edu.iis.mto.bdd.trains.cucumber"})
public class AcceptanceTestsSuite {


    @Zakładając("^chcę się dostać z \"([^\"]*)\" do \"([^\"]*)\"$")
    public void chcę_się_dostać_z_do(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Zakładając("^następny pociąg odjeżdża o (\\d+):(\\d+) na linii \"([^\"]*)\"$")
    public void następny_pociąg_odjeżdża_o_na_linii(int arg1, int arg2, String arg3) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void zapytam_o_godzinę_przyjazdu() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (\\d+):(\\d+)$")
    public void powinienem_uzyskać_następujący_szacowany_czas_przyjazdu(int arg1, int arg2) {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


}
