package com.frameworkium.core.ui.driver.remotes;

import java.net.MalformedURLException;
import java.net.URL;

import static com.frameworkium.core.common.properties.Property.BROWSER_STACK;


public class BrowserStack {

    public static URL getURL() throws MalformedURLException {
        return new URL(String.format("http://%s:%s@hub.browserstack.com:80/wd/hub", System.getenv("BROWSER_STACK_USERNAME"),
                System.getenv("BROWSER_STACK_ACCESS_KEY")));
    }

    public static boolean isDesired() {
        return BROWSER_STACK.isSpecified() && Boolean.parseBoolean(BROWSER_STACK.getValue());
    }

    private static boolean environmentVariablesSet() {
        String username = System.getenv("BROWSER_STACK_USERNAME");
        String accessKey = System.getenv("BROWSER_STACK_ACCESS_KEY");
        return username != null && !username.isEmpty() && accessKey != null && !accessKey.isEmpty();
    }
}
