package org.bizhunt.simple.web.pages;

import org.apache.wicket.markup.head.IHeaderResponse;
import org.apache.wicket.markup.html.WebPage;

import com.giffing.wicket.spring.boot.context.scan.WicketHomePage;

@WicketHomePage
public class HomePage extends WebPage {
	private static final long serialVersionUID = -3900297384685561512L;

	public HomePage() {
	}

	@Override
	public void renderHead(IHeaderResponse response) {
		super.renderHead(response);
	}
}
