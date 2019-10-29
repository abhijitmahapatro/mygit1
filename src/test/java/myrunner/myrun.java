package myrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\Desktop\\java project\\eclipse_abhijit\\mycasestudycucumber\\casestudycucumbertestme\\casestudy2.feature"
,glue= {"stepdef"},tags= {"@login"}, plugin={"pretty","html:target/cucumberlogin_report"})
//@CucumberOptions(features="C:\\Users\\Training_h2a.06.17\\Desktop\\java project\\eclipse_abhijit\\mycasestudycucumber\\casestudycucumbertestme\\casestudy4.feature"
//,glue= {"stepdef"},tags= {"@invalidadd"}, plugin={"pretty","html:target/cucumber_report"})
public class myrun {

}
