import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.all_domain.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to /search with params (gs lcrp, ie, oq, q, rlz, sourceid)"

TrueTestScripts.navigate("/search", ["gs_lcrp": search_gs_lcrp, "ie": search_ie, "oq": search_oq, "q": search_q, "rlz": search_rlz, "sourceid": search_sourceid])

"Step 2: Click on span googleMaps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_search/span_googleMaps'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 2-Click on span googleMaps.png')

"Step 3: Click on span googleMaps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_search/span_googleMaps'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 3-Click on span googleMaps.png')

"Step 4: Click on span googleMaps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_search/span_googleMaps'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 4-Click on span googleMaps.png')

"Step 5: Click on span googleMaps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_search/span_googleMaps'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 5-Click on span googleMaps.png')

"Step 6: Click on link googleMaps"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_search/link_googleMaps'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 6-Click on link googleMaps.png')

"Step 7: Click on span searchResult"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_search/span_searchResult'))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 7-Click on span searchResult.png')

"Step 8: Click on link pagination (pageNavigation)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination', ['link_pagination_internalLabel': link_pagination_internalLabel]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 8-Click on link pagination pageNavigation.png')

"Step 9: Click on link pagination (page3)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination', ['link_pagination_internalLabel': link_pagination_internalLabel_1]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 9-Click on link pagination page3.png')

"Step 10: Click on link pagination (pageNavigation2)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination', ['link_pagination_internalLabel': link_pagination_internalLabel_2]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 10-Click on link pagination pageNavigation2.png')

"Step 11: Click on link pagination (page5)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination', ['link_pagination_internalLabel': link_pagination_internalLabel_3]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 11-Click on link pagination page5.png')

"Step 12: Click on link pagination (page6)"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/search?/?(?:#.*)?(?:\\?.*)?$', true)

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_search/link_pagination', ['link_pagination_internalLabel': link_pagination_internalLabel_4]))

// WebUI.takeScreenshot(reportLocation + '/TC1/Step 12-Click on link pagination page6.png')

"Step 13: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC1-Navigate and Verify Search Results on Google Maps_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}