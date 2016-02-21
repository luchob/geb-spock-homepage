package eu.balev.homepage.test.pages

import geb.Page;
import eu.balev.homepage.test.modules.NavigationBar;

class BalevEuAboutPage extends Page {

	static url = '/about.html';
	
	static at = {  title == 'Lachezar Balev - About' }

	static content = {
		
		//navigation
		navBar { module NavigationBar }
	}
}