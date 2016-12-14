package eu.balev.homepage.test.spec

import eu.balev.homepage.test.pages.BalevEuHomePage;
import eu.balev.homepage.test.pages.BalevEuWorkPage;
import eu.balev.homepage.test.pages.BalevEuAboutPage;
import eu.balev.homepage.test.pages.BalevEuContactPage;
import eu.balev.homepage.test.util.BrokenLinkAssert

import geb.spock.GebReportingSpec;

class BalevEuSiteUpSpec extends GebReportingSpec {

	def "check home page contents"() {

		when:
		to BalevEuHomePage

		then:
		nameSpan.text() == 'Lachezar Balev'
		titleSpan.text() == 'Software engineer'
		regionSpan.text() == 'Sofia'
		countrySpan.text() == 'Bulgaria'
	}
	
	def "browse the site"() {
		
		given:
			to BalevEuHomePage
			
		when: "Click the nav bars"
			//work
			def selector = navBar.workLink.getActiveLinkSelector();
			navBar.workLink.link.click()
			waitFor {$(selector);}
			at BalevEuWorkPage
			
			//contact
			selector = navBar.contactLink.getActiveLinkSelector();
			navBar.contactLink.link.click()
			waitFor {$(selector);}
			at BalevEuContactPage
			
			//about
			selector = navBar.aboutLink.getActiveLinkSelector();
			navBar.aboutLink.link.click()
			waitFor {$(selector);}
			
		then: 
			"the last page opened"
			at BalevEuAboutPage
	}

	def "check for dead education links"() {
		def allLinks = []
		def linkChecker = new BrokenLinkAssert();

		given: "When at work page"
		to BalevEuWorkPage

		eduLinks.each {
			allLinks.add(it.attr('href'))
		}

		expect:
			linkChecker.assertLinks(allLinks);
	}
}