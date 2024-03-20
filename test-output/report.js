$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/Bottom_Navigation.feature");
formatter.feature({
  "name": "Verify bottom navigation functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use bottom navigation functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "botnav is visible and home icon selected",
  "keyword": "Then "
});
formatter.match({
  "location": "Bottom_Navigation.botnav_is_visible_and_home_icon_selected()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on bottom navigation buy car icon",
  "keyword": "And "
});
formatter.match({
  "location": "Bottom_Navigation.user_click_on_bottom_navigation_buy_car_icon()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on shortlists icon",
  "keyword": "And "
});
formatter.match({
  "location": "Bottom_Navigation.user_click_on_shortlists_icon()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@data-label\u003d\u0027header-spinny-logo\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [79baefa83ced08900092091a5589e3f8, findElement {using\u003dxpath, value\u003d//a[@data-label\u003d\u0027header-spinny-logo\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:53488}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:53488/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 79baefa83ced08900092091a5589e3f8\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.Bottom_Navigation.user_click_on_shortlists_icon(Bottom_Navigation.java:49)\r\n\tat ✽.user click on shortlists icon(file:src/test/resources/Feature/Bottom_Navigation.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user click on sell car icon",
  "keyword": "And "
});
formatter.match({
  "location": "Bottom_Navigation.user_click_on_sell_car_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on account icon",
  "keyword": "And "
});
formatter.match({
  "location": "Bottom_Navigation.user_click_on_account_icon()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Carfinderbanner.feature");
formatter.feature({
  "name": "Verify car finder functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "clicks on the car finder banner on homepage",
  "keyword": "When "
});
formatter.match({
  "location": "carfinderbanner.clicks_on_the_car_finder_banner_on_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects price range",
  "keyword": "And "
});
formatter.match({
  "location": "carfinderbanner.user_selects_price_range()"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementClickInterceptedException: element click intercepted: Element \u003cp\u003e...\u003c/p\u003e is not clickable at point (199, 218). Other element would receive the click: \u003cdiv role\u003d\"none\" class\u003d\"Ripple__container\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d121.0.6167.185)\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [440ab3b6a0d2b780073e1a23c5f0ae05, clickElement {id\u003dCA050626035C33C9B7472C3F10F1E615_element_34}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:53611}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:53611/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nElement: [[ChromeDriver: chrome on windows (440ab3b6a0d2b780073e1a23c5f0ae05)] -\u003e xpath: //div[@class\u003d\u0027CarFinderQuestionnaire__nameDescriptionWrap\u0027]//p[contains(text(), \u0027Below 4 Lakh\u0027)]]\nSession ID: 440ab3b6a0d2b780073e1a23c5f0ae05\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:224)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:77)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.carfinderbanner.user_selects_price_range(carfinderbanner.java:47)\r\n\tat ✽.user selects price range(file:src/test/resources/Feature/Carfinderbanner.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user selects lifestyle",
  "keyword": "And "
});
formatter.match({
  "location": "carfinderbanner.user_selects_lifestyle()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects fuel type preference",
  "keyword": "And "
});
formatter.match({
  "location": "carfinderbanner.user_selects_fuel_type_preference()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects transmission preference",
  "keyword": "And "
});
formatter.match({
  "location": "carfinderbanner.user_selects_transmission_preference()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user clicks on mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_clicks_on_mobile_number_field()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "enters mobile number and otp code",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enters_mobile_number_and_otp_code()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate carfinder plp",
  "keyword": "And "
});
formatter.match({
  "location": "carfinderbanner.validate_carfinder_plp()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageBuyButton_SellButton.feature");
formatter.feature({
  "name": "Verify Buy and Sell functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use sell button functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on sell button",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageBuyButton_SellButton.user_click_on_sell_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@data-label\u003d\u0027sell-car\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [c2fe7c2ac911b62b7ec0b006ca5cb059, findElement {using\u003dxpath, value\u003d//a[@data-label\u003d\u0027sell-car\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:53718}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:53718/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: c2fe7c2ac911b62b7ec0b006ca5cb059\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.HomepageBuyButton_SellButton.user_click_on_sell_button(HomepageBuyButton_SellButton.java:36)\r\n\tat ✽.user click on sell button(file:src/test/resources/Feature/HomepageBuyButton_SellButton.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "land on sell page",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageBuyButton_SellButton.land_on_sell_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded2.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use buy button functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on buy button",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageBuyButton_SellButton.user_click_on_buy_button()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@data-label\u003d\u0027buy-car\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [1d0924d85b6c04d22456676083b2993a, findElement {using\u003dxpath, value\u003d//a[@data-label\u003d\u0027buy-car\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:53819}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:53819/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 1d0924d85b6c04d22456676083b2993a\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.HomepageBuyButton_SellButton.user_click_on_buy_button(HomepageBuyButton_SellButton.java:55)\r\n\tat ✽.user click on buy button(file:src/test/resources/Feature/HomepageBuyButton_SellButton.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "land on product listing page",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageBuyButton_SellButton.land_on_product_listing_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded3.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageBuySellToggle_HubLocation.feature");
formatter.feature({
  "name": "Verify Buy Sell Toggle and Hub Location",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use buy sell toggle functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on buy toggle",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageBuySellToggle_HubLocation.user_click_on_buy_toggle()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on learn more button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageBuySellToggle_HubLocation.user_click_on_learn_more_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on browse car",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageBuySellToggle_HubLocation.click_on_browse_car()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@data-category\u003d\u0027home\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [25e33627e70b5f91c0f13a0c4a7b1eb7, findElement {using\u003dxpath, value\u003d//a[@data-category\u003d\u0027home\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:53925}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:53925/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 25e33627e70b5f91c0f13a0c4a7b1eb7\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.HomepageBuySellToggle_HubLocation.click_on_browse_car(HomepageBuySellToggle_HubLocation.java:57)\r\n\tat ✽.click on browse car(file:src/test/resources/Feature/HomepageBuySellToggle_HubLocation.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on sell toggle",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageBuySellToggle_HubLocation.click_on_sell_toggle()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on get price",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageBuySellToggle_HubLocation.click_on_get_price()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded4.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use hub location functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user scroll down to hub location",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageBuySellToggle_HubLocation.user_scroll_down_to_hub_location()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027ExploreHubs__hubsDetailWrapper ExploreHubs__addSpacing styles__forGASectionSeen\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [1696cfd1d750bcc14e7ed5caa02935be, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027ExploreHubs__hubsDetailWrapper ExploreHubs__addSpacing styles__forGASectionSeen\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54038}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:54038/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 1696cfd1d750bcc14e7ed5caa02935be\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat StepDefinition.HomepageBuySellToggle_HubLocation.user_scroll_down_to_hub_location(HomepageBuySellToggle_HubLocation.java:112)\r\n\tat ✽.user scroll down to hub location(file:src/test/resources/Feature/HomepageBuySellToggle_HubLocation.feature:17)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on view cars",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageBuySellToggle_HubLocation.click_on_view_cars()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click view all cars in delhi ncr",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageBuySellToggle_HubLocation.click_view_all_cars_in_delhi_ncr()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded5.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageDownloadAppBanner.feature");
formatter.feature({
  "name": "Verify Buy and Sell functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use download spinny app banner functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "scroll down to spinny app banner",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageDownloadAppBanner.scroll_down_to_spinnt_app_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageExploreMore.feature");
formatter.feature({
  "name": "Verify explore more functionality on homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use explore more functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user scroll down to explore more section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageExploreMore.user_scroll_down_to_explore_more_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on check eligibility",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageExploreMore.click_on_check_eligiblity()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027UsedCarLoan__contentContainer UsedCarLoan__mobileContainer styles__forGASectionSeen\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [44381868053b9eaf16970a04b70cc2f9, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027UsedCarLoan__contentContainer UsedCarLoan__mobileContainer styles__forGASectionSeen\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54231}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:54231/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 44381868053b9eaf16970a04b70cc2f9\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat StepDefinition.HomepageExploreMore.click_on_check_eligiblity(HomepageExploreMore.java:41)\r\n\tat ✽.click on check eligibility(file:src/test/resources/Feature/HomepageExploreMore.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on get exchange price",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageExploreMore.click_on_get_exchange_price()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on explore buyback",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageExploreMore.click_on_explore_buyback()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded6.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageExplorePopularBrands_HowSpinnyWorks.feature");
formatter.feature({
  "name": "Verify popular brands and how spinny works functionality on homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "Create an instance of android or ios driver before each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use explore popular brands section",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user scroll to explore popular brands section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageExplorePopularBrands_HowSpinnyWorks.user_scroll_to_explore_popular_brands_section()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027PopularBrands__container styles__forGASectionSeen PopularBrands__mobileView\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [47d4477fb3ed4f47f5e8838aa3b8b506, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027PopularBrands__container styles__forGASectionSeen PopularBrands__mobileView\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54334}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:54334/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 47d4477fb3ed4f47f5e8838aa3b8b506\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat StepDefinition.HomepageExplorePopularBrands_HowSpinnyWorks.user_scroll_to_explore_popular_brands_section(HomepageExplorePopularBrands_HowSpinnyWorks.java:42)\r\n\tat ✽.user scroll to explore popular brands section(file:src/test/resources/Feature/HomepageExplorePopularBrands_HowSpinnyWorks.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on maruti suzuki",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageExplorePopularBrands_HowSpinnyWorks.click_on_maruti_suzuki()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "redirect back to explore popular brands section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageExplorePopularBrands_HowSpinnyWorks.redirect_back_to_explore_popular_brands_section()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on view all brands",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageExplorePopularBrands_HowSpinnyWorks.click_on_view_all_brands()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on view all cars",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageExplorePopularBrands_HowSpinnyWorks.click_on_view_all_cars()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded7.png", null);
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "Create an instance of android or ios driver before each scenario",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to explore how spinny works section",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user scroll down to how spinny works section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageExplorePopularBrands_HowSpinnyWorks.user_scroll_down_to_how_spinny_works_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on watch how it works",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageExplorePopularBrands_HowSpinnyWorks.click_on_watch_how_it_works()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on learn more",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageExplorePopularBrands_HowSpinnyWorks.click_on_learn_more()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageFeaturedSpinnyCars.feature");
formatter.feature({
  "name": "Verify featured spinny cars functionality on homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use featured spinny cars functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "scroll down to featured spinny cars section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageFeaturedSpinnyCars.scroll_down_to_featured_spinny_cars_section()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@data-label\u003d\u0027popular_cars\u0027]\t\t\t\t\t\t\t\t\t\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [08290a6d91870db4e0571def07b7cf00, findElement {using\u003dxpath, value\u003d//div[@data-label\u003d\u0027popular_cars\u0027]\t\t\t\t\t\t\t\t\t}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54550}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:54550/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 08290a6d91870db4e0571def07b7cf00\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat StepDefinition.HomepageFeaturedSpinnyCars.scroll_down_to_featured_spinny_cars_section(HomepageFeaturedSpinnyCars.java:31)\r\n\tat ✽.scroll down to featured spinny cars section(file:src/test/resources/Feature/HomepageFeaturedSpinnyCars.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "clicked on car card under best buy for you tab",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageFeaturedSpinnyCars.click_on_car_card_under_best_buy_for_you_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on view all spinny cars under best buy for you tab",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageFeaturedSpinnyCars.click_on_view_all_spinny_cars_under_best_buy_for_you_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on newly added tab",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageFeaturedSpinnyCars.click_on_newly_addded_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "clicks on car card under newly added tab",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageFeaturedSpinnyCars.click_on_car_card_under_newly_added_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click view all cars under newly added tab",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageFeaturedSpinnyCars.click_view_all_cars_under_newly_added_tab()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded8.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageFloatingCallButton.feature");
formatter.feature({
  "name": "Verify floating call button functionality on plp",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use floating call button functionality on plp",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user land on plp",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageFloatingCallButton.user_land_on_plp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "scroll down the page",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageFloatingCallButton.scroll_down_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate floating call button is visible",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageFloatingCallButton.validate_floating_call_button_is_visible()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027BottomNavFilters__callChatWrap\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [ef8831ad42180afabb68a159b3f0509f, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027BottomNavFilters__callChatWrap\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54646}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:54646/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ef8831ad42180afabb68a159b3f0509f\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat StepDefinition.HomepageFloatingCallButton.validate_floating_call_button_is_visible(HomepageFloatingCallButton.java:43)\r\n\tat ✽.validate floating call button is visible(file:src/test/resources/Feature/HomepageFloatingCallButton.feature:11)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded9.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageInsightsThatDriveUs.feature");
formatter.feature({
  "name": "Verify insights that drive us functionality on homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to see insights that drive us functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "scroll down to insights that drive us",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageInsightsThatDriveUs.scroll_down_to_insights_that_drve_us()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is able to see insights that drive us section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageInsightsThatDriveUs.user_is_able_to_see_insights_that_drive_us_section()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageSpinnyBuzz.feature");
formatter.feature({
  "name": "Verify spinny buzz functionality on homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to see spinny buzz functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "scroll down spinny buzz section",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSpinnyBuzz.scroll_down_spinny_buzz_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user able to see spinny buzz",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSpinnyBuzz.user_able_to_see_spinny_buzz()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@class\u003d\u0027GoodPress__goodPressContainer GoodPress__centerView styles__forGASectionSeen GoodPress__border\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [3ea3b5bf569b075ad5cef7ced551430c, findElement {using\u003dxpath, value\u003d//div[@class\u003d\u0027GoodPress__goodPressContainer GoodPress__centerView styles__forGASectionSeen GoodPress__border\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54846}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:54846/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 3ea3b5bf569b075ad5cef7ced551430c\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat StepDefinition.HomepageSpinnyBuzz.user_able_to_see_spinny_buzz(HomepageSpinnyBuzz.java:36)\r\n\tat ✽.user able to see spinny buzz(file:src/test/resources/Feature/HomepageSpinnyBuzz.feature:10)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded10.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageSpinnyMaxBanner.feature");
formatter.feature({
  "name": "Verify spinny buzz functionality on homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to explore spinny max banner functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "scroll down to spinny max banner",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageSpinnyMaxBanner.scroll_down_to_spinny_max_banner()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on car card",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSpinnyMaxBanner.click_on_car_card()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on explore button",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSpinnyMaxBanner.click_on_explore_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on view more luxury cars",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageSpinnyMaxBanner.click_on_view_more_luxury_cars()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@data-label\u003d\u0027home_max_carousel\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [5220a06083b514ef3916d62153d521df, findElement {using\u003dxpath, value\u003d//a[@data-label\u003d\u0027home_max_carousel\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:54934}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:54934/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: 5220a06083b514ef3916d62153d521df\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.HomepageSpinnyMaxBanner.click_on_view_more_luxury_cars(HomepageSpinnyMaxBanner.java:88)\r\n\tat ✽.click on view more luxury cars(file:src/test/resources/Feature/HomepageSpinnyMaxBanner.feature:13)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded11.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/HomepageViewAllCars.feature");
formatter.feature({
  "name": "Verify see all cars",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able use see all cars functionality",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user click on view all cars",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageViewAllCars.user_click_on_view_all_cars()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//div[@data-label\u003d\u0027view-all-cars\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [ebcc4f320f1f3f6f2e4951cd411e0d5b, findElement {using\u003dxpath, value\u003d//div[@data-label\u003d\u0027view-all-cars\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:55083}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:55083/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: ebcc4f320f1f3f6f2e4951cd411e0d5b\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.HomepageViewAllCars.user_click_on_view_all_cars(HomepageViewAllCars.java:27)\r\n\tat ✽.user click on view all cars(file:src/test/resources/Feature/HomepageViewAllCars.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user select city selector on plp",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageViewAllCars.user_select_city_selector_on_plp()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select bangalore city",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageViewAllCars.user_select_bangalore_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on spinny logo",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageViewAllCars.user_click_on_spinny_logo()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on city selector on homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageViewAllCars.user_click_on_city_selector_on_homepage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user select ahmedabad city",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageViewAllCars.user_select_ahmedabad_city()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user click on view all cars again",
  "keyword": "And "
});
formatter.match({
  "location": "HomepageViewAllCars.user_click_on_view_all_cars_again()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded12.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Homepage_BodyType.feature");
formatter.feature({
  "name": "Verify body type functionality on homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Filter applied when user clicks on View all \u003cBody Type\u003e under Explore by body type section",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "scroll body type section",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_BodyType.scroll_body_type_section()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on View all hatchbacks",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_BodyType.click_on_View_all_hatchbacks()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@data-label\u003d\u0027view_all_hatchback\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [bba10a39f34b8d014e38624819f569ca, findElement {using\u003dxpath, value\u003d//a[@data-label\u003d\u0027view_all_hatchback\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:55178}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:55178/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: bba10a39f34b8d014e38624819f569ca\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.Homepage_BodyType.click_on_View_all_hatchbacks(Homepage_BodyType.java:46)\r\n\tat ✽.Click on View all hatchbacks(file:src/test/resources/Feature/Homepage_BodyType.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "Go back to the home page",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_BodyType.go_back_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on Sedan and View All Sedan",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_BodyType.Click_on_Sedan_and_View_All_Sedan()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Go back to the home page",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_BodyType.go_back_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on SUV and View All SUVs",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_BodyType.Click_on_SUV_and_View_All_SUVs()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Go back to the home page",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_BodyType.go_back_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Click on MUV and View All MUVs",
  "keyword": "Then "
});
formatter.match({
  "location": "Homepage_BodyType.Click_on_MUV_and_View_All_MUVs()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "Go back to the home page",
  "keyword": "And "
});
formatter.match({
  "location": "Homepage_BodyType.go_back_to_home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded13.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/LocationSelectorManual.feature");
formatter.feature({
  "name": "Verify location selector functionality on homepage",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to select the city and the PLP must get updated",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user selects Delhi NCR on Home page",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Delhi_NCR_on_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the city Delhi NCR on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Delhi_NCR_on_PLP()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@data-label\u003d\u0027buy-car\u0027]\"}\n  (Session info: chrome\u003d121.0.6167.185)\nFor documentation on this error, please visit: https://www.selenium.dev/documentation/webdriver/troubleshooting/errors#no-such-element-exception\nBuild info: version: \u00274.16.1\u0027, revision: \u00279b4c83354e\u0027\nSystem info: os.name: \u0027Windows 11\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.18\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [eefc9b13e3bc9e3383abba64433af075, findElement {using\u003dxpath, value\u003d//a[@data-label\u003d\u0027buy-car\u0027]}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 121.0.6167.185, chrome: {chromedriverVersion: 121.0.6167.184 (057a8ae7deb..., userDataDir: C:\\Users\\PANKAJ~1\\AppData\\L...}, fedcm:accounts: true, goog:chromeOptions: {debuggerAddress: localhost:55275}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: windows, proxy: Proxy(), se:cdp: ws://localhost:55275/devtoo..., se:cdpVersion: 121.0.6167.185, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:extension:minPinLength: true, webauthn:extension:prf: true, webauthn:virtualAuthenticators: true}\nSession ID: eefc9b13e3bc9e3383abba64433af075\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:52)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:191)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:200)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:175)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:523)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:165)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:59)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:360)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:354)\r\n\tat Utility.preMethods.click(preMethods.java:20)\r\n\tat StepDefinition.LocationSelectorManual.validate_the_city_Delhi_NCR_on_PLP(LocationSelectorManual.java:41)\r\n\tat ✽.validate the city Delhi NCR on PLP(file:src/test/resources/Feature/LocationSelectorManual.feature:16)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user selects Bangalore",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Bangalore()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Bangalore on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Bangalore_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Hyderabad",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Hyderabad()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Hyderabad on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Hyderabad_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Mumbai",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Mumbai()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Mumbai on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Mumbai_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Pune",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Pune()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Pune on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Pune_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Delhi on Home page",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Delhi_on_Home_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Delhi on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Delhi_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Gurgaon",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Gurgaon()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Gurgaon on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Gurgaon_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Noida",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Noida()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Noida on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Noida_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Ahmedabad",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Ahmedabad()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Ahmedabad on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Ahmedabad_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Chennai",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Chennai()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Chennai on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Chennai_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Kolkata",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Kolkata()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Kolkata on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Kolkata_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Lucknow",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Lucknow()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Lucknow on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Lucknow_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Jaipur",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Jaipur()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Jaipur on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Jaipur_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Chandigarh",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Chandigarh()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Chandigarh on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Chandigarh_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Coimbatore",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Coimbatore()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Coimbatore on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Coimbatore_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Ghaziabad",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Ghaziabad()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Ghaziabad on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Ghaziabad_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Indore",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Indore()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Indore on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Indore_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Kochi",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Kochi()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Kochi on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Kochi_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user selects Surat",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.user_selects_Surat()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "validate the city Surat on PLP",
  "keyword": "And "
});
formatter.match({
  "location": "LocationSelectorManual.validate_the_city_Surat_on_PLP()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded14.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/Login.feature");
formatter.feature({
  "name": "Verify login",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User selects login",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click on account tab",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.click_on_account_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on mobile number field",
  "keyword": "And "
});
formatter.match({
  "location": "Login.user_clicks_on_mobile_number_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters mobile number and otp code",
  "keyword": "And "
});
formatter.match({
  "location": "Login.enters_mobile_number_and_otp_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "logout button is visible",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.logout_button_is_visible()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/PLPSortFilter.feature");
formatter.feature({
  "name": "Verify sort filter functionality on plp",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "User land on spinny website and selects location",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user land on spinny website",
  "keyword": "Given "
});
formatter.match({
  "location": "BaseSteps.user_land_on_spinny_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for the application page to load completely",
  "keyword": "When "
});
formatter.match({
  "location": "BaseSteps.wait_for_the_page_to_load_completely()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects location",
  "keyword": "And "
});
formatter.match({
  "location": "BaseSteps.select_location()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to use sort filter functionality on plp",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user land on plp",
  "keyword": "Then "
});
formatter.match({
  "location": "HomepageFloatingCallButton.user_land_on_plp()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select sort filter",
  "keyword": "And "
});
formatter.match({
  "location": "PLPSortFilter.select_sort_filter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on price low to high",
  "keyword": "And "
});
formatter.match({
  "location": "PLPSortFilter.click_on_price_low_to_high()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on price high to low",
  "keyword": "And "
});
formatter.match({
  "location": "PLPSortFilter.click_on_price_high_to_low()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on km driven low to high",
  "keyword": "And "
});
formatter.match({
  "location": "PLPSortFilter.click_on_km_driven_low_to_high()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on year new to old",
  "keyword": "And "
});
formatter.match({
  "location": "PLPSortFilter.click_on_year_new_to_old()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on newest first",
  "keyword": "And "
});
formatter.match({
  "location": "PLPSortFilter.click_on_newest_first()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/Feature/utility.feature");
formatter.feature({
  "name": "Most commonly used steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Implementation of most commonly used steps",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Take Screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "utility.takeScreenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Wait for page to load",
  "keyword": "And "
});
formatter.match({
  "location": "utility.tempwait()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});