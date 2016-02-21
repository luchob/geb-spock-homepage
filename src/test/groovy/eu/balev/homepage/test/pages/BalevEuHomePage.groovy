package eu.balev.homepage.test.pages

import geb.Page;
import eu.balev.homepage.test.modules.NavigationBar;

class BalevEuHomePage extends Page {

	static at = {  title == 'Lachezar Balev - Home Page' }

	static content = {
		//rich snippets
		nameSpan { $("span[itemprop='name']") }
		titleSpan { $("span[itemprop='title']") }
		regionSpan { $("span[itemprop='region']") }
		countrySpan { $("span[itemprop='country-name']") }
		
		//navigation
		navBar { module NavigationBar }
	}
}