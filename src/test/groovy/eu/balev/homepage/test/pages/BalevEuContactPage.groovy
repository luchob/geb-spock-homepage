package eu.balev.homepage.test.pages

import geb.Page;
import eu.balev.homepage.test.modules.NavigationBar;

class BalevEuContactPage extends Page {

	static url = '/contact.html';
	
	static at = {  title == 'Lachezar Balev - Contact' }

	static content = {
		
		//navigation
		navBar { module NavigationBar }
	}
}