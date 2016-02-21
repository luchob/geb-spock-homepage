package eu.balev.homepage.test.modules;

import geb.Module;

public class NavigationLink extends Module {

	def linkId

	static content = {
		link { $("a", id: linkId) }
	}
}