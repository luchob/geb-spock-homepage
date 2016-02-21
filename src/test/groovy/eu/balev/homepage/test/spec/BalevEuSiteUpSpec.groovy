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
		titleSpan.text() == 'software engineer'
		regionSpan.text() == 'Sofia'
		countrySpan.text() == 'Bulgaria'
	}

	def "browse the site"() {

		given: "When at the home page"
		to BalevEuHomePage

		when: "Click the work link"
		navBar.workLink.link.click()

		then: "Verify that the work page opens"
		at BalevEuWorkPage

		when: "Click the contacts (me@internet) link"
		navBar.contactLink.link.click()

		then: "Verify tat the contacts page opens"
		at BalevEuContactPage

		when: "Click the about link"
		navBar.aboutLink.link.click()

		then: "Verify tat the about page opens"
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