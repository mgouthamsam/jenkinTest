$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFile/ForgetPassword.feature");
formatter.feature({
  "name": "To validate forgot password of Facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "    To validate forget password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@value3"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter Facebook through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef1.user_have_to_enter_Facebook_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click forget password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef1.user_have_to_click_forget_password()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[text()\u003d\u0027forgotten password?\u0027]\"}\n  (Session info: chrome\u003d100.0.4896.127)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027PTS304\u0027, ip: \u0027192.168.0.101\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_331\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 100.0.4896.127, chrome: {chromedriverVersion: 100.0.4896.60 (6a5d10861ce8..., userDataDir: C:\\Users\\INTEL\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:54352}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b538e433f5440d78f6be0538f6c4d67a\n*** Element info: {Using\u003dxpath, value\u003d//a[text()\u003d\u0027forgotten password?\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy18.click(Unknown Source)\r\n\tat org.stepdef.StepDef1.user_have_to_click_forget_password(StepDef1.java:26)\r\n\tat ✽.user have to click forget password(file:src/test/resources/FeatureFile/ForgetPassword.feature:9)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user have to enter phone number",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef1.user_have_to_enter_phone_number()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user have to click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef1.user_have_to_click_search_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFile/LoginFaceBook.feature");
formatter.feature({
  "name": "To validate login functionality of facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.user_have_to_enter_facebook_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate Login by using Credential pages",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@value1"
    }
  ]
});
formatter.step({
  "name": "User have to enter Valid email and Password",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Email",
        "course"
      ]
    },
    {
      "cells": [
        "Goutham",
        "0987654",
        "123@gmail.com",
        "etab"
      ]
    },
    {
      "cells": [
        "sam",
        "33698",
        "Sam@gmail.com",
        "otab"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_have_to_enter_Valid_email_and_Password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter credentialas page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_have_to_enter_credentialas_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Stepdef.user_have_to_enter_facebook_login_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "      To validate login by using credential pages",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@value2"
    }
  ]
});
formatter.step({
  "name": "User have to enter Invalid email and ivalid password",
  "rows": [
    {
      "cells": [
        "java",
        "selenium",
        "python",
        "cucumbur"
      ]
    },
    {
      "cells": [
        "sam",
        "goutham",
        "eema",
        "balaji"
      ]
    },
    {
      "cells": [
        "raji",
        "sandy",
        "vijay",
        "daya"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Stepdef.user_have_to_enter_Invalid_email_and_ivalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Stepdef.user_have_to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter credentialas page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdef.user_have_to_enter_credentialas_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});