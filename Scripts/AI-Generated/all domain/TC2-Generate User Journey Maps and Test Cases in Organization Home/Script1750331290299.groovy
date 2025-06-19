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

"Step 1: Navigate to /organization/*/home"

TrueTestScripts.navigate("/organization/${organization_id}/home")

"Step 2: Click on link spSecondProject -> Navigate to page '/team/*/project/*'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/organization/.*/home?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_organization_home/link_spSecondProject'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 2-Click on link spSecondProject - Navigate to page teamproject.png')

"Step 3: Click on link trueTestMenu -> Navigate to page '/team/*/project/*/truetest/user-journeys'"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project/link_trueTestMenu'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 3-Click on link trueTestMenu - Navigate to page teamprojecttruetestuser-journeys.png')

"Step 4: Click on button notification"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/button_notification'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on button notification.png')

"Step 5: Click on div backdrop"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/div_backdrop'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on div backdrop.png')

"Step 6: Click on button generateNewUserJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/button_generateNewUserJourneyMap'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on button generateNewUserJourneyMap.png')

"Step 7: Click on button generateTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/button_generateTestCases'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on button generateTestCases.png')

"Step 8: Click on button generateUserJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/button_generateUserJourneyMap'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on button generateUserJourneyMap.png')

"Step 9: Click on div dataTrackingStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/div_dataTrackingStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on div dataTrackingStatus.png')

"Step 10: Click on div dataTrackingStatus"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/div_dataTrackingStatus'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Click on div dataTrackingStatus.png')

"Step 11: Click on p userJourneyDescription"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/p_userJourneyDescription'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Click on p userJourneyDescription.png')

"Step 12: Click on div userJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/div_userJourneyMap'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Click on div userJourneyMap.png')

"Step 13: Click on button close"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/button_close'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Click on button close.png')

"Step 14: Click on button generateNewUserJourneyMap"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/button_generateNewUserJourneyMap'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Click on button generateNewUserJourneyMap.png')

"Step 15: Click on input trackingEnvDropdown"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/input_trackingEnvDropdown'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Click on input trackingEnvDropdown.png')

"Step 16: Click on item allDomainOption"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/item_allDomainOption'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Click on item allDomainOption.png')

"Step 17: Click on button generateTestCases"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/button_generateTestCases'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Click on button generateTestCases.png')

"Step 18: Click on button gotIt"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/button_gotIt'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Click on button gotIt.png')

"Step 19: Click on div errorMessage -> Navigate to page ''"

// WebUI.verifyMatch(WebUI.getUrl(), GlobalVariable.application_domain + '/team/.*/project/.*/truetest/user-journeys?/?(?:#.*)?(?:\\?.*)?$', true)

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_team_project_truetest_user_journeys/div_errorMessage'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Click on div errorMessage - Navigate to page .png')

"Step 20: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Generate User Journey Maps and Test Cases in Organization Home_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}