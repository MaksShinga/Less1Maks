package HW8;

public class XPathAndElseLocators {
    WebElement masterBtn = driver.findElement(By.className("btn css-truncate"));
    WebElement goToFileBtn = driver.findElement(By.className("btn ml-2 d-none d-md-block"));
    WebElement addFile = driver.findElement(By.className("btn ml-2"));
    WebElement codeBtn = driver.findElement(By.className("Button--primary Button--medium Button flex-1 d-inline-flex"));
    WebElement pinBtn = driver.findElement(By.xpath("//*[@class=\"btn-sm btn\"][@type=\"submit\"]"));
    WebElement unwatchBtn = driver.findElement(By.xpath("//*[@class=\"btn-sm btn\"][@role]"));
    WebElement protectThisBranch = driver.findElement(By.className("btn mr-3 ml-lg-3"));
    WebElement addReadme = driver.findElement(By.className("btn btn-sm btn-primary flash-action"));
    WebElement repName = driver.findElement(By.className("mr-2 flex-self-stretch d-none d-md-block"));
    WebElement starBtn = driver.findElement(By.className("js-toggler-target rounded-left-2 btn-sm btn BtnGroup-item"));


    WebElement searchField = driver.findElement(By.xpath("//*[@aria-label=\"Search workflows\"]\n"));
    WebElement viewAll = driver.findElement(By.xpath("//parent::a[contains(@href, \"deployment\")]//div[text()=\"View all\"]"));
    WebElement configureBtn = driver.findElement(By.xpath("//a[@class=\"btn d-none d-lg-inline-block\"][contains(@href, \"ci%2Fandroid\")]"));
    WebElement gettingStarted = driver.findElement(By.xpath("//h3[text()=\"Getting started and core concepts\"]"));
    WebElement termsBtn = driver.findElement(By.xpath("//parent::li//a[text()=\"Terms\"]"));
    //*[@aria-label="Search workflows"]
    //parent::a[contains(@href, "deployment")]//div[text()="View all"]
    //a[@class="btn d-none d-lg-inline-block"][contains(@href, "ci%2Fandroid")]
    //h3[text()="Getting started and core concepts"]
    //parent::li//a[text()="Terms"]
}
