import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.all_domain.common.selectSiteAndFormTypes
import truetest.all_domain.custom.TrueTestScripts

def reportLocation = RunConfiguration.getReportFolder()

'Initialize test session: Open browser and set view port'

@com.kms.katalon.core.annotation.SetUp
def setup() {
	WebUI.openBrowser('')
	WebUI.setViewPortSize(1920, 1080)	
}

"Step 1: Navigate to https://vnexpress.net/"

TrueTestScripts.navigate("/")

"Step 2: Login into Application"

TrueTestScripts.login()

"Step 3: Navigate to /combobox.html"

TrueTestScripts.navigate("combobox")

"Step 4: Click on link comboBox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_comboBox'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 4-Click on link comboBox.png')

"Step 5: Click on link navCombobox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_navCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 5-Click on link navCombobox.png')

"Step 6: Click on link navCombobox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_navCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 6-Click on link navCombobox.png')

"Step 7: Click on link navCombobox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_navCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 7-Click on link navCombobox.png')

"Step 8: Click on item removeLoadedForms"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/item_removeLoadedForms'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 8-Click on item removeLoadedForms.png')

"Step 9: Click on link navCombobox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_navCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 9-Click on link navCombobox.png')

"Step 10: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 10-Select option with input value from select siteSelection.png')

"Step 11: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 11-Select option with input value from select formTypeSelection.png')

"Step 12: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_1, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 12-Select option with input value from select siteSelection.png')

"Step 13: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_1, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 13-Select option with input value from select formTypeSelection.png')

"Step 14: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_2, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 14-Select option with input value from select siteSelection.png')

"Step 15: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_2, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 15-Select option with input value from select formTypeSelection.png')

"Step 16: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 16-Select option with input value from select siteSelection.png')

"Step 17: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 17-Select option with input value from select formTypeSelection.png')

"Step 18: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_4, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 18-Select option with input value from select siteSelection.png')

"Step 19: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_4, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 19-Select option with input value from select formTypeSelection.png')

"Step 20: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_5, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 20-Select option with input value from select siteSelection.png')

"Step 21: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_5, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 21-Select option with input value from select formTypeSelection.png')

"Step 22: Click on div comboboxExample"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 22-Click on div comboboxExample.png')

"Step 23: Click on div comboboxExample"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 23-Click on div comboboxExample.png')

"Step 24: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_6, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 24-Select option with input value from select siteSelection.png')

"Step 25: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_6, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 25-Select option with input value from select formTypeSelection.png')

"Step 26: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_7, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 26-Select option with input value from select siteSelection.png')

"Step 27: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_7, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 27-Select option with input value from select formTypeSelection.png')

"Step 28: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_8, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 28-Select option with input value from select siteSelection.png')

"Step 29: Click on div comboboxExample"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 29-Click on div comboboxExample.png')

"Step 30: Click on div contactInformationForm"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_contactInformationForm'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 30-Click on div contactInformationForm.png')

"Step 31: Click on input userDetails (phone)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 31-Click on input userDetails phone.png')

"Step 32: Enter input value in input userDetails (phone)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_1, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_1, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_1]), input_userDetails)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 32-Enter input value in input userDetails phone.png')

"Step 33: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 33-Click on div object.png')

"Step 34: Click on input userDetails (address)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_2, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_2, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_2]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 34-Click on input userDetails address.png')

"Step 35: Enter input value in input userDetails (address2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_3, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_3, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_3]), input_userDetails_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 35-Enter input value in input userDetails address2.png')

"Step 36: Click on input userDetails (city)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_4, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_4, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_4]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 36-Click on input userDetails city.png')

"Step 37: Enter input value in input userDetails (city)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_5, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_5, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_5]), input_userDetails_2)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 37-Enter input value in input userDetails city.png')

"Step 38: Click on input userDetails (postalCode)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_6, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_6, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_6]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 38-Click on input userDetails postalCode.png')

"Step 39: Enter input value in input userDetails (postalCode)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_7, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_7, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_7]), input_userDetails_3)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 39-Enter input value in input userDetails postalCode.png')

"Step 40: Click on div comboboxContainer (object2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_comboboxContainer"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_comboboxContainer', ['div_comboboxContainer_divNthChild': div_comboboxContainer_divNthChild]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 40-Click on div comboboxContainer object2.png')

"Step 41: Click on input userDetails (cardholderName)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_8, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_8, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_8]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 41-Click on input userDetails cardholderName.png')

"Step 42: Enter input value in input userDetails (cardholderName)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_9, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_9, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_9]), input_userDetails_4)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 42-Enter input value in input userDetails cardholderName.png')

"Step 43: Click on input userDetails (cardNumber)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_10, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_10, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_10]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 43-Click on input userDetails cardNumber.png')

"Step 44: Enter input value in input userDetails (cardNumber)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_11, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_11, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_11]), input_userDetails_5)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 44-Enter input value in input userDetails cardNumber.png')

"Step 45: Click on input securityDetails (dynamicObject)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails', ['input_securityDetails_inputNthOfType': input_securityDetails_inputNthOfType, 'input_securityDetails_inputPlaceholder': input_securityDetails_inputPlaceholder]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 45-Click on input securityDetails dynamicObject.png')

"Step 46: Enter input value in input securityDetails (dynamicObject)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails', ['input_securityDetails_inputNthOfType': input_securityDetails_inputNthOfType_1, 'input_securityDetails_inputPlaceholder': input_securityDetails_inputPlaceholder_1]), input_securityDetails)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 46-Enter input value in input securityDetails dynamicObject.png')

"Step 47: Select option with input value from select themeLanguageOptions (languageSelection2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/select_themeLanguageOptions"
TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/select_themeLanguageOptions', ['select_themeLanguageOptions_nth': select_themeLanguageOptions_nth, 'select_themeLanguageOptions_selectNthOfType': select_themeLanguageOptions_selectNthOfType]), select_themeLanguageOptions, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 47-Select option with input value from select themeLanguageOptions languageSelection2.png')

"Step 48: Select option with input value from select themeLanguageOptions (theme2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/select_themeLanguageOptions"
TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/select_themeLanguageOptions', ['select_themeLanguageOptions_nth': select_themeLanguageOptions_nth_1, 'select_themeLanguageOptions_selectNthOfType': select_themeLanguageOptions_selectNthOfType_1]), select_themeLanguageOptions_1, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 48-Select option with input value from select themeLanguageOptions theme2.png')

"Step 49: Click on label notificationSettings (enableNotifications)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings', ['label_notificationSettings_class': label_notificationSettings_class, 'label_notificationSettings_internalText': label_notificationSettings_internalText]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 49-Click on label notificationSettings enableNotifications.png')

"Step 50: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_8, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 50-Select option with input value from select formTypeSelection.png')

"Step 51: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_9, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 51-Select option with input value from select siteSelection.png')

"Step 52: Click on input userDetails (phone)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_12, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_12, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_12]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 52-Click on input userDetails phone.png')

"Step 53: Enter input value in input userDetails (phone)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_13, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_13, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_13]), input_userDetails_6)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 53-Enter input value in input userDetails phone.png')

"Step 54: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 54-Click on div object.png')

"Step 55: Click on input userDetails (address)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_14, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_14, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_14]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 55-Click on input userDetails address.png')

"Step 56: Enter input value in input userDetails (address)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_15, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_15, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_15]), input_userDetails_7)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 56-Enter input value in input userDetails address.png')

"Step 57: Click on input userDetails (city)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_16, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_16, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_16]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 57-Click on input userDetails city.png')

"Step 58: Enter input value in input userDetails (city)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_17, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_17, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_17]), input_userDetails_8)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 58-Enter input value in input userDetails city.png')

"Step 59: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 59-Click on div object.png')

"Step 60: Click on input userDetails (postalCode)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_18, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_18, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_18]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 60-Click on input userDetails postalCode.png')

"Step 61: Enter input value in input userDetails (postalCode)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_19, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_19, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_19]), input_userDetails_9)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 61-Enter input value in input userDetails postalCode.png')

"Step 62: Click on input userDetails (password)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_20, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_20, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_20]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 62-Click on input userDetails password.png')

"Step 63: Enter input value in input userDetails (password)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_21, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_21, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_21]), input_userDetails_10)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 63-Enter input value in input userDetails password.png')

"Step 64: Click on input userDetails (password2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_22, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_22, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_22]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 64-Click on input userDetails password2.png')

"Step 65: Click on div comboboxExample"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 65-Click on div comboboxExample.png')

"Step 66: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_10, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 66-Select option with input value from select siteSelection.png')

"Step 67: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_9, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 67-Select option with input value from select formTypeSelection.png')

"Step 68: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_10, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 68-Select option with input value from select formTypeSelection.png')

"Step 69: Click on link dragAndDrop -> Navigate to page '/drag-drop'"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_dragAndDrop'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 69-Click on link dragAndDrop - Navigate to page drag-drop.png')

"Step 70: Click on link dynamicElements -> Navigate to page '/dynamic-elements'"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_drag_drop/link_dynamicElements'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 70-Click on link dynamicElements - Navigate to page dynamic-elements.png')

"Step 71: Click on link fileUpload -> Navigate to page '/file-upload'"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_dynamic_elements/link_fileUpload'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 71-Click on link fileUpload - Navigate to page file-upload.png')

"Step 72: Click on link vinothQademo"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_file_upload/link_vinothQademo'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 72-Click on link vinothQademo.png')

"Step 73: Click on link listCard"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_file_upload/link_listCard'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 73-Click on link listCard.png')

"Step 74: Click on link comboBox -> Navigate to page '/combobox'"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_file_upload/link_comboBox'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 74-Click on link comboBox - Navigate to page combobox.png')

"Step 75: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_11, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 75-Select option with input value from select siteSelection.png')

"Step 76: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_11, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 76-Select option with input value from select formTypeSelection.png')

"Step 77: Click on input userDetails (password3)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_23, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_23, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_23]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 77-Click on input userDetails password3.png')

"Step 78: Enter input value in input userDetails (password3)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_24, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_24, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_24]), input_userDetails_11)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 78-Enter input value in input userDetails password3.png')

"Step 79: Click on input userDetails (password4)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_25, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_25, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_25]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 79-Click on input userDetails password4.png')

"Step 80: Click on label notificationSettings (enableTwoFactorAuth)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings', ['label_notificationSettings_class': label_notificationSettings_class_1, 'label_notificationSettings_internalText': label_notificationSettings_internalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 80-Click on label notificationSettings enableTwoFactorAuth.png')

"Step 81: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_12, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 81-Select option with input value from select formTypeSelection.png')

"Step 82: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_12, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 82-Select option with input value from select siteSelection.png')

"Step 83: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_13, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 83-Select option with input value from select siteSelection.png')

"Step 84: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_14, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 84-Select option with input value from select siteSelection.png')

"Step 85: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_13, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 85-Select option with input value from select formTypeSelection.png')

"Step 86: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_14, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 86-Select option with input value from select formTypeSelection.png')

"Step 87: Click on input userDetails (firstName2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_26, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_26, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_26]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 87-Click on input userDetails firstName2.png')

"Step 88: Click on div object3"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 88-Click on div object3.png')

"Step 89: Click on input userDetails (lastName)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_27, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_27, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_27]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 89-Click on input userDetails lastName.png')

"Step 90: Click on input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_28, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_28, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_28]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 90-Click on input userDetails email.png')

"Step 91: Click on textarea bio"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 91-Click on textarea bio.png')

"Step 92: Click on div nativeComboboxExample2"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 92-Click on div nativeComboboxExample2.png')

"Step 93: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_15, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 93-Select option with input value from select siteSelection.png')

"Step 94: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_15, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 94-Select option with input value from select formTypeSelection.png')

"Step 95: Select site and form types for submission"

selectSiteAndFormTypes.execute(select_formTypeSelection_1, select_formTypeSelection_1_1, select_formTypeSelection_2_1, select_formTypeSelection_3_1, select_siteSelection_1)

"Step 96: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_16, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 96-Select option with input value from select formTypeSelection.png')

"Step 97: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_17, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 97-Select option with input value from select formTypeSelection.png')

"Step 98: Click on div nativeComboboxExample3"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 98-Click on div nativeComboboxExample3.png')

"Step 99: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_18, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 99-Select option with input value from select formTypeSelection.png')

"Step 100: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_19, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 100-Select option with input value from select formTypeSelection.png')

"Step 101: Click on input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_29, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_29, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_29]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 101-Click on input userDetails email.png')

"Step 102: Enter input value in input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_30, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_30, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_30]), input_userDetails_12)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 102-Enter input value in input userDetails email.png')

"Step 103: Click on input userDetails (phone2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_31, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_31, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_31]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 103-Click on input userDetails phone2.png')

"Step 104: Click on textarea bio"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 104-Click on textarea bio.png')

"Step 105: Enter input value in textarea bio"

WebUI.setText(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'), textarea_bio)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 105-Enter input value in textarea bio.png')

"Step 106: Click on input userDetails (phone2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_32, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_32, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_32]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 106-Click on input userDetails phone2.png')

"Step 107: Enter input value in input userDetails (phone2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_33, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_33, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_33]), input_userDetails_13)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 107-Enter input value in input userDetails phone2.png')

"Step 108: Click on input userDetails (address3)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_34, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_34, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_34]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 108-Click on input userDetails address3.png')

"Step 109: Enter input value in input userDetails (address3)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_35, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_35, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_35]), input_userDetails_14)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 109-Enter input value in input userDetails address3.png')

"Step 110: Click on div comboboxChild"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxChild'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 110-Click on div comboboxChild.png')

"Step 111: Click on input userDetails (city2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_36, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_36, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_36]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 111-Click on input userDetails city2.png')

"Step 112: Enter input value in input userDetails (city2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_37, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_37, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_37]), input_userDetails_15)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 112-Enter input value in input userDetails city2.png')

"Step 113: Click on input userDetails (postalCode2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_38, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_38, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_38]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 113-Click on input userDetails postalCode2.png')

"Step 114: Enter input value in input userDetails (postalCode2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_39, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_39, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_39]), input_userDetails_16)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 114-Enter input value in input userDetails postalCode2.png')

"Step 115: Click on div comboboxContainer (comboboxContainer)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_comboboxContainer"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_comboboxContainer', ['div_comboboxContainer_divNthChild': div_comboboxContainer_divNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 115-Click on div comboboxContainer comboboxContainer.png')

"Step 116: Click on header billingDetailsForm"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/header_billingDetailsForm'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 116-Click on header billingDetailsForm.png')

"Step 117: Click on input userDetails (cardNumber2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_40, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_40, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_40]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 117-Click on input userDetails cardNumber2.png')

"Step 118: Enter input value in input userDetails (cardNumber2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_41, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_41, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_41]), input_userDetails_17)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 118-Enter input value in input userDetails cardNumber2.png')

"Step 119: Click on input userDetails (cardholderName2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_42, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_42, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_42]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 119-Click on input userDetails cardholderName2.png')

"Step 120: Enter input value in input userDetails (cardholderName2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_43, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_43, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_43]), input_userDetails_18)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 120-Enter input value in input userDetails cardholderName2.png')

"Step 121: Click on input securityDetails (dynamicObject2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails', ['input_securityDetails_inputNthOfType': input_securityDetails_inputNthOfType_2, 'input_securityDetails_inputPlaceholder': input_securityDetails_inputPlaceholder_2]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 121-Click on input securityDetails dynamicObject2.png')

"Step 122: Enter input value in input securityDetails (dynamicObject2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails', ['input_securityDetails_inputNthOfType': input_securityDetails_inputNthOfType_3, 'input_securityDetails_inputPlaceholder': input_securityDetails_inputPlaceholder_3]), input_securityDetails_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 122-Enter input value in input securityDetails dynamicObject2.png')

"Step 123: Click on input securityDetails (cvv)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails', ['input_securityDetails_inputNthOfType': input_securityDetails_inputNthOfType_4, 'input_securityDetails_inputPlaceholder': input_securityDetails_inputPlaceholder_4]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 123-Click on input securityDetails cvv.png')

"Step 124: Enter input value in input securityDetails (cvv)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_securityDetails', ['input_securityDetails_inputNthOfType': input_securityDetails_inputNthOfType_5, 'input_securityDetails_inputPlaceholder': input_securityDetails_inputPlaceholder_5]), input_securityDetails_2)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 124-Enter input value in input securityDetails cvv.png')

"Step 125: Click on item selectSiteId"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/item_selectSiteId'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 125-Click on item selectSiteId.png')

"Step 126: Click on input userDetails (password5)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_44, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_44, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_44]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 126-Click on input userDetails password5.png')

"Step 127: Enter input value in input userDetails (password5)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_45, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_45, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_45]), input_userDetails_19)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 127-Enter input value in input userDetails password5.png')

"Step 128: Click on input userDetails (password6)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_46, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_46, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_46]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 128-Click on input userDetails password6.png')

"Step 129: Enter input value in input userDetails (password6)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_47, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_47, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_47]), input_userDetails_20)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 129-Enter input value in input userDetails password6.png')

"Step 130: Select option with input value from select themeLanguageOptions (languageSelection3)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/select_themeLanguageOptions"
TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/select_themeLanguageOptions', ['select_themeLanguageOptions_nth': select_themeLanguageOptions_nth_2, 'select_themeLanguageOptions_selectNthOfType': select_themeLanguageOptions_selectNthOfType_2]), select_themeLanguageOptions_2, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 130-Select option with input value from select themeLanguageOptions languageSelection3.png')

"Step 131: Select option with input value from select themeLanguageOptions (theme3)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/select_themeLanguageOptions"
TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/select_themeLanguageOptions', ['select_themeLanguageOptions_nth': select_themeLanguageOptions_nth_3, 'select_themeLanguageOptions_selectNthOfType': select_themeLanguageOptions_selectNthOfType_3]), select_themeLanguageOptions_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 131-Select option with input value from select themeLanguageOptions theme3.png')

"Step 132: Click on label notificationSettings (enableNotifications2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings', ['label_notificationSettings_class': label_notificationSettings_class_2, 'label_notificationSettings_internalText': label_notificationSettings_internalText_2]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 132-Click on label notificationSettings enableNotifications2.png')

"Step 133: Click on div userProfileForm"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_userProfileForm'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 133-Click on div userProfileForm.png')

"Step 134: Click on input userDetails (firstName2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_48, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_48, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_48]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 134-Click on input userDetails firstName2.png')

"Step 135: Enter input value in input userDetails (firstName2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_49, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_49, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_49]), input_userDetails_21)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 135-Enter input value in input userDetails firstName2.png')

"Step 136: Click on div object3"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 136-Click on div object3.png')

"Step 137: Click on input userDetails (lastName)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_50, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_50, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_50]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 137-Click on input userDetails lastName.png')

"Step 138: Enter input value in input userDetails (lastName)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_51, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_51, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_51]), input_userDetails_22)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 138-Enter input value in input userDetails lastName.png')

"Step 139: Click on input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_52, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_52, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_52]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 139-Click on input userDetails email.png')

"Step 140: Enter input value in input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_53, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_53, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_53]), input_userDetails_23)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 140-Enter input value in input userDetails email.png')

"Step 141: Click on textarea bio"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 141-Click on textarea bio.png')

"Step 142: Enter input value in textarea bio"

WebUI.setText(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'), textarea_bio_1)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 142-Enter input value in textarea bio.png')

"Step 143: Click on input userDetails (address3)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_54, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_54, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_54]))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 143-Click on input userDetails address3.png')

"Step 144: Enter input value in input userDetails (address3)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_class': input_userDetails_class_55, 'input_userDetails_inputNthOfType': input_userDetails_inputNthOfType_55, 'input_userDetails_inputPlaceholder': input_userDetails_inputPlaceholder_55]), input_userDetails_24)

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 144-Enter input value in input userDetails address3.png')

"Step 145: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_20, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 145-Select option with input value from select formTypeSelection.png')

"Step 146: Click on div siteSelection"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_siteSelection'))

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 146-Click on div siteSelection.png')

"Step 147: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_16, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 147-Select option with input value from select siteSelection.png')

"Step 148: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_21, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 148-Select option with input value from select formTypeSelection.png')

"Step 149: Select option with input value from select siteSelection -> Navigate to page ''"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_17, "label")

// WebUI.takeScreenshot(reportLocation + '/TC2/Step 149-Select option with input value from select siteSelection - Navigate to page .png')

"Step 150: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC2-Test Comprehensive User Interaction with Combobox and Forms_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}