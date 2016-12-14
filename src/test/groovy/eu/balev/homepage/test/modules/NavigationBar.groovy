package eu.balev.homepage.test.modules;

import geb.Module;

public class NavigationBar extends Module {

    static content = {
        homeLink { module NavigationLink, linkId: "link_home" }
		workLink { module NavigationLink, linkId: "link_work" }
        contactLink { module NavigationLink, linkId: "link_contact" }
        aboutLink { module NavigationLink, linkId: "link_about" }
	}
}