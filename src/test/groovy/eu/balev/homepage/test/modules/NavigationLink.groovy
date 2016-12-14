package eu.balev.homepage.test.modules;

import geb.Module;

public class NavigationLink extends Module {

	String linkId

	static content = {
		link { $("a", id: linkId) }
	}
	
	public String getActiveLinkSelector()
	{
		return "li.active > #" + linkId
	}
}