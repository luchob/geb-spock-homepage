package eu.balev.homepage.test.pages

import geb.Page;
import eu.balev.homepage.test.modules.NavigationBar;

class BalevEuWorkPage extends Page {

	static url = '/work.html';
	
	static at = {  title == 'Lachezar Balev - Work and CV' }

	static content = {
		
		//navigation
		navBar { module NavigationBar }
		
		//resources
		eduLinks { $('#tech-skills-books a')}
	}
}