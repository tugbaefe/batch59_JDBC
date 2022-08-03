package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@db",
        dryRun = false

)

public class TestRunner {
    /*
    Bir framework'te bir tek Runner class'i yeterli olabilir
    Runner class'inda class body'sinde hic bir sey olmaz
    Runner class'imizi onemli yapan 2 adet annotation vardir
    @RunWith(Cucumber.class) notasyonu Runner class'ina calisma ozelligi katar
    Bu notasyon oldugu icin Cucumber framework'umuzde JUnit kullanmayi tercih ediyoruz

    feature : Runner dosyasinin feature dosyalarini nereden bulacagini tarif eder
    glue : step definitions dosyalarini nerede bulacagimizi gosterir
    tags : o an hangi tag'i calistirmak istiyorsak onu belli eder
    dryRun : Iki secenek var
    dryRun = true; yazdigimizda testimizi calistirmadan sadece eksik adimlari bize verir
    dryRun = false; yazdigimizda testimizi calistirir

     */


}





