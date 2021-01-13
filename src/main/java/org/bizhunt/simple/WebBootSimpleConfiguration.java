package org.bizhunt.simple;

import org.apache.wicket.protocol.http.WebApplication;
import org.bizhunt.simple.web.pages.HomePage;

import com.giffing.wicket.spring.boot.context.extensions.ApplicationInitExtension;
import com.giffing.wicket.spring.boot.context.extensions.WicketApplicationInitConfiguration;

import de.agilecoders.wicket.core.Bootstrap;
import de.agilecoders.wicket.core.settings.BootstrapSettings;

@ApplicationInitExtension
public class WebBootSimpleConfiguration implements WicketApplicationInitConfiguration {

	@Override
	public void init(WebApplication webApplication) {
		Bootstrap.install(webApplication);
		BootstrapSettings settings = new BootstrapSettings();
		Bootstrap.install(webApplication, settings);
		mountPageUrls(webApplication);
	}

	private void mountPageUrls(WebApplication webApplication) {
		webApplication.mountPage("/home", HomePage.class);
	}
}