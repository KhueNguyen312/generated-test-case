import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.all_domain.common.inputUserAndCardDetails
import truetest.all_domain.common.interactWithDynamicObjectMultipleTimes
import truetest.all_domain.common.selectSiteAndFormTypeMultipleTimes
import truetest.all_domain.common.selectSiteAndFormTypeMultipleTimes_2
import truetest.all_domain.common.selectSiteAndInteractWithDynamicObject
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

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 4-Click on link comboBox.png')

"Step 5: Click on link navCombobox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_navCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 5-Click on link navCombobox.png')

"Step 6: Click on link navCombobox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_navCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 6-Click on link navCombobox.png')

"Step 7: Click on link navCombobox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_navCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 7-Click on link navCombobox.png')

"Step 8: Click on item formManagement (removeLoadedForms)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/item_formManagement"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/item_formManagement', ['item_formManagement_LiNthOfType_2': item_formManagement_LiNthOfType_2, 'item_formManagement_TextSmLiNthChild_1': item_formManagement_TextSmLiNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 8-Click on item formManagement removeLoadedForms.png')

"Step 9: Click on link navCombobox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_navCombobox'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 9-Click on link navCombobox.png')

"Step 10: Select site and form type multiple times"

selectSiteAndFormTypeMultipleTimes_2.execute(select_formTypeSelection, select_formTypeSelection_1, select_siteSelection, select_siteSelection_1, select_siteSelection_2)

"Step 11: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_1, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 11-Select option with input value from select formTypeSelection.png')

"Step 12: Select site and form type multiple times"

selectSiteAndFormTypeMultipleTimes_2.execute(select_formTypeSelection_2, select_formTypeSelection_1_1, select_siteSelection_1, select_siteSelection_1_1, select_siteSelection_2_1)

"Step 13: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_1_2, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 13-Select option with input value from select formTypeSelection.png')

"Step 14: Click on div comboboxExample"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 14-Click on div comboboxExample.png')

"Step 15: Click on div comboboxExample"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 15-Click on div comboboxExample.png')

"Step 16: Select site and form type multiple times"

selectSiteAndFormTypeMultipleTimes_2.execute(select_formTypeSelection_3, select_formTypeSelection_1_3, select_siteSelection_2, select_siteSelection_1_2, select_siteSelection_2_2)

"Step 17: Click on div comboboxExample"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 17-Click on div comboboxExample.png')

"Step 18: Click on div contactInformationForm"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_contactInformationForm'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 18-Click on div contactInformationForm.png')

"Step 19: Click on div dynamicObject (dynamicObject)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder, 'div_dynamicObject_type': div_dynamicObject_type]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 19-Click on div dynamicObject dynamicObject.png')

"Step 20: Enter input value in div dynamicObject (dynamicObject)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_1, 'div_dynamicObject_type': div_dynamicObject_type_1]), div_dynamicObject)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 20-Enter input value in div dynamicObject dynamicObject.png')

"Step 21: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 21-Click on div object.png')

"Step 22: Interact with dynamic object multiple times"

interactWithDynamicObjectMultipleTimes.execute(div_dynamicObject_1, div_dynamicObject_1, div_dynamicObject_inputPlaceholder_2, div_dynamicObject_inputPlaceholder_1, div_dynamicObject_inputPlaceholder_2, div_dynamicObject_inputPlaceholder_3, div_dynamicObject_inputPlaceholder_4, div_dynamicObject_type_2, div_dynamicObject_type_1, div_dynamicObject_type_2, div_dynamicObject_type_3, div_dynamicObject_type_4)

"Step 23: Enter input value in div dynamicObject (dynamicObject9)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_3, 'div_dynamicObject_type': div_dynamicObject_type_3]), div_dynamicObject_1_1)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 23-Enter input value in div dynamicObject dynamicObject9.png')

"Step 24: Click on div comboboxContainer (object2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_comboboxContainer"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_comboboxContainer', ['div_comboboxContainer_DivNthChild_1': div_comboboxContainer_DivNthChild_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 24-Click on div comboboxContainer object2.png')

"Step 25: Input user and card details in the form"

inputUserAndCardDetails.execute(input_cardDetails_FlexInputNthOfType_1, input_cardDetails_InputPlaceholder_1, input_userDetails, input_userDetails_1, input_userDetails_Class_1, input_userDetails_Class_1_1, input_userDetails_Class_1_2, input_userDetails_Class_1_3, input_userDetails_InputNthOfType_2, input_userDetails_InputNthOfType_2_1, input_userDetails_InputNthOfType_2_2, input_userDetails_InputNthOfType_2_3, input_userDetails_InputPlaceholder_1, input_userDetails_InputPlaceholder_1_1, input_userDetails_InputPlaceholder_1_2, input_userDetails_InputPlaceholder_1_3)

"Step 26: Enter input value in input cardDetails (expirationDate)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails', ['input_cardDetails_FlexInputNthOfType_1': input_cardDetails_FlexInputNthOfType_1_1, 'input_cardDetails_InputPlaceholder_1': input_cardDetails_InputPlaceholder_1_1]), input_cardDetails)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 26-Enter input value in input cardDetails expirationDate.png')

"Step 27: Select option with input value from select languageThemeOptions (languageSelection4)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/select_languageThemeOptions"
TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/select_languageThemeOptions', ['select_languageThemeOptions_SelectNthOfType_1': select_languageThemeOptions_SelectNthOfType_1, 'select_languageThemeOptions_SelectNth_1': select_languageThemeOptions_SelectNth_1]), select_languageThemeOptions, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 27-Select option with input value from select languageThemeOptions languageSelection4.png')

"Step 28: Select option with input value from select languageThemeOptions (theme4)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/select_languageThemeOptions"
TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/select_languageThemeOptions', ['select_languageThemeOptions_SelectNthOfType_1': select_languageThemeOptions_SelectNthOfType_1_1, 'select_languageThemeOptions_SelectNth_1': select_languageThemeOptions_SelectNth_1_1]), select_languageThemeOptions_1, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 28-Select option with input value from select languageThemeOptions theme4.png')

"Step 29: Click on label notificationSettings (enableNotifications)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings', ['label_notificationSettings_Class_1': label_notificationSettings_Class_1, 'label_notificationSettings_LabelInternalText_1': label_notificationSettings_LabelInternalText_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 29-Click on label notificationSettings enableNotifications.png')

"Step 30: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_2, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 30-Select option with input value from select formTypeSelection.png')

"Step 31: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 31-Select option with input value from select siteSelection.png')

"Step 32: Click on div dynamicObject (dynamicObject)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_4, 'div_dynamicObject_type': div_dynamicObject_type_4]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 32-Click on div dynamicObject dynamicObject.png')

"Step 33: Enter input value in div dynamicObject (dynamicObject)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_5, 'div_dynamicObject_type': div_dynamicObject_type_5]), div_dynamicObject_2)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 33-Enter input value in div dynamicObject dynamicObject.png')

"Step 34: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 34-Click on div object.png')

"Step 35: Click on input userDetails (address)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_1, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_1, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 35-Click on input userDetails address.png')

"Step 36: Enter input value in input userDetails (address)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_2, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_2, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_2]), input_userDetails_1)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 36-Enter input value in input userDetails address.png')

"Step 37: Click on input userDetails (city)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_3, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_3, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_3]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 37-Click on input userDetails city.png')

"Step 38: Enter input value in input userDetails (city)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_4, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_4, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_4]), input_userDetails_1_1)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 38-Enter input value in input userDetails city.png')

"Step 39: Click on div object"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 39-Click on div object.png')

"Step 40: Interact with dynamic object multiple times"

interactWithDynamicObjectMultipleTimes.execute(div_dynamicObject_2, div_dynamicObject_1_2, div_dynamicObject_inputPlaceholder_6, div_dynamicObject_inputPlaceholder_1_1, div_dynamicObject_inputPlaceholder_2_1, div_dynamicObject_inputPlaceholder_3_1, div_dynamicObject_inputPlaceholder_4_1, div_dynamicObject_type_6, div_dynamicObject_type_1_1, div_dynamicObject_type_2_1, div_dynamicObject_type_3_1, div_dynamicObject_type_4_1)

"Step 41: Click on div comboboxExample"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 41-Click on div comboboxExample.png')

"Step 42: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_1_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 42-Select option with input value from select siteSelection.png')

"Step 43: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 43-Select option with input value from select formTypeSelection.png')

"Step 44: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_4, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 44-Select option with input value from select formTypeSelection.png')

"Step 45: Click on link dragAndDrop -> Navigate to page '/drag-drop'"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/link_dragAndDrop'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 45-Click on link dragAndDrop - Navigate to page drag-drop.png')

"Step 46: Click on link dynamicElements -> Navigate to page '/dynamic-elements'"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_drag_drop/link_dynamicElements'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 46-Click on link dynamicElements - Navigate to page dynamic-elements.png')

"Step 47: Click on link fileUpload -> Navigate to page '/file-upload'"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_dynamic_elements/link_fileUpload'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 47-Click on link fileUpload - Navigate to page file-upload.png')

"Step 48: Click on link vinothQademo"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_file_upload/link_vinothQademo'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 48-Click on link vinothQademo.png')

"Step 49: Click on link listCard"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_file_upload/link_listCard'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 49-Click on link listCard.png')

"Step 50: Click on link comboBox"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_file_upload/link_comboBox'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 50-Click on link comboBox.png')

"Step 51: Select site and form type then interact with dynamic object"

selectSiteAndInteractWithDynamicObject.execute(div_dynamicObject_3, div_dynamicObject_inputPlaceholder_7, div_dynamicObject_inputPlaceholder_1_2, div_dynamicObject_inputPlaceholder_2_2, div_dynamicObject_type_7, div_dynamicObject_type_1_2, div_dynamicObject_type_2_2, select_formTypeSelection_4, select_siteSelection_4)

"Step 52: Click on label notificationSettings (enableTwoFactorAuth)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings', ['label_notificationSettings_Class_1': label_notificationSettings_Class_1_1, 'label_notificationSettings_LabelInternalText_1': label_notificationSettings_LabelInternalText_1_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 52-Click on label notificationSettings enableTwoFactorAuth.png')

"Step 53: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_5, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 53-Select option with input value from select formTypeSelection.png')

"Step 54: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_2_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 54-Select option with input value from select siteSelection.png')

"Step 55: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 55-Select option with input value from select siteSelection.png')

"Step 56: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_4, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 56-Select option with input value from select siteSelection.png')

"Step 57: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_6, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 57-Select option with input value from select formTypeSelection.png')

"Step 58: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_7, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 58-Select option with input value from select formTypeSelection.png')

"Step 59: Click on input userDetails (firstName2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_5, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_5, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_5]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 59-Click on input userDetails firstName2.png')

"Step 60: Click on div object3"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 60-Click on div object3.png')

"Step 61: Click on input userDetails (lastName)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_6, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_6, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_6]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 61-Click on input userDetails lastName.png')

"Step 62: Click on input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_7, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_7, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_7]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 62-Click on input userDetails email.png')

"Step 63: Click on textarea bio"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 63-Click on textarea bio.png')

"Step 64: Click on div nativeComboboxExample2"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 64-Click on div nativeComboboxExample2.png')

"Step 65: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_5, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 65-Select option with input value from select siteSelection.png')

"Step 66: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_8, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 66-Select option with input value from select formTypeSelection.png')

"Step 67: Select site and form type multiple times"

selectSiteAndFormTypeMultipleTimes.execute(select_formTypeSelection_5, select_formTypeSelection_1_4, select_formTypeSelection_2_1, select_formTypeSelection_3_1, select_siteSelection_5)

"Step 68: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_9, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 68-Select option with input value from select formTypeSelection.png')

"Step 69: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_10, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 69-Select option with input value from select formTypeSelection.png')

"Step 70: Click on div nativeComboboxExample3"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxExample'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 70-Click on div nativeComboboxExample3.png')

"Step 71: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_11, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 71-Select option with input value from select formTypeSelection.png')

"Step 72: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_12, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 72-Select option with input value from select formTypeSelection.png')

"Step 73: Click on input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_8, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_8, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_8]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 73-Click on input userDetails email.png')

"Step 74: Enter input value in input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_9, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_9, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_9]), input_userDetails_2)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 74-Enter input value in input userDetails email.png')

"Step 75: Click on input userDetails (phone)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_10, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_10, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_10]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 75-Click on input userDetails phone.png')

"Step 76: Click on textarea bio"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 76-Click on textarea bio.png')

"Step 77: Enter input value in textarea bio"

WebUI.setText(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'), textarea_bio)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 77-Enter input value in textarea bio.png')

"Step 78: Click on input userDetails (phone)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_11, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_11, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_11]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 78-Click on input userDetails phone.png')

"Step 79: Enter input value in input userDetails (phone)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_12, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_12, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_12]), input_userDetails_3)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 79-Enter input value in input userDetails phone.png')

"Step 80: Click on input userDetails (address2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_13, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_13, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_13]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 80-Click on input userDetails address2.png')

"Step 81: Enter input value in input userDetails (address2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_14, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_14, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_14]), input_userDetails_4)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 81-Enter input value in input userDetails address2.png')

"Step 82: Click on div comboboxChild"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_comboboxChild'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 82-Click on div comboboxChild.png')

"Step 83: Click on input userDetails (city2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_15, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_15, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_15]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 83-Click on input userDetails city2.png')

"Step 84: Enter input value in input userDetails (city2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_16, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_16, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_16]), input_userDetails_5)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 84-Enter input value in input userDetails city2.png')

"Step 85: Click on input userDetails (postalCode)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_17, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_17, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_17]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 85-Click on input userDetails postalCode.png')

"Step 86: Enter input value in input userDetails (postalCode)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_18, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_18, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_18]), input_userDetails_6)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 86-Enter input value in input userDetails postalCode.png')

"Step 87: Click on div comboboxContainer (comboboxContainer)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_comboboxContainer"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_comboboxContainer', ['div_comboboxContainer_DivNthChild_1': div_comboboxContainer_DivNthChild_1_1]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 87-Click on div comboboxContainer comboboxContainer.png')

"Step 88: Click on header billingDetailsForm"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/header_billingDetailsForm'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 88-Click on header billingDetailsForm.png')

"Step 89: Input user and card details in the form"

inputUserAndCardDetails.execute(input_cardDetails_FlexInputNthOfType_1_2, input_cardDetails_InputPlaceholder_1_2, input_userDetails_2, input_userDetails_1_2, input_userDetails_Class_1_19, input_userDetails_Class_1_1_1, input_userDetails_Class_1_2_1, input_userDetails_Class_1_3_1, input_userDetails_InputNthOfType_2_19, input_userDetails_InputNthOfType_2_1_1, input_userDetails_InputNthOfType_2_2_1, input_userDetails_InputNthOfType_2_3_1, input_userDetails_InputPlaceholder_1_19, input_userDetails_InputPlaceholder_1_1_1, input_userDetails_InputPlaceholder_1_2_1, input_userDetails_InputPlaceholder_1_3_1)

"Step 90: Enter input value in input cardDetails (expirationDate2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails', ['input_cardDetails_FlexInputNthOfType_1': input_cardDetails_FlexInputNthOfType_1_3, 'input_cardDetails_InputPlaceholder_1': input_cardDetails_InputPlaceholder_1_3]), input_cardDetails_1)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 90-Enter input value in input cardDetails expirationDate2.png')

"Step 91: Click on input cardDetails (cvv)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails', ['input_cardDetails_FlexInputNthOfType_1': input_cardDetails_FlexInputNthOfType_1_4, 'input_cardDetails_InputPlaceholder_1': input_cardDetails_InputPlaceholder_1_4]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 91-Click on input cardDetails cvv.png')

"Step 92: Enter input value in input cardDetails (cvv)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails', ['input_cardDetails_FlexInputNthOfType_1': input_cardDetails_FlexInputNthOfType_1_5, 'input_cardDetails_InputPlaceholder_1': input_cardDetails_InputPlaceholder_1_5]), input_cardDetails_2)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 92-Enter input value in input cardDetails cvv.png')

"Step 93: Click on item selectSiteId"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/item_selectSiteId'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 93-Click on item selectSiteId.png')

"Step 94: Click on input userDetails (password)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_20, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_20, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_20]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 94-Click on input userDetails password.png')

"Step 95: Enter input value in input userDetails (password)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_21, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_21, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_21]), input_userDetails_7)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 95-Enter input value in input userDetails password.png')

"Step 96: Click on input userDetails (password2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_22, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_22, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_22]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 96-Click on input userDetails password2.png')

"Step 97: Enter input value in input userDetails (password2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_23, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_23, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_23]), input_userDetails_8)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 97-Enter input value in input userDetails password2.png')

"Step 98: Select option with input value from select languageThemeOptions (languageSelection2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/select_languageThemeOptions"
TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/select_languageThemeOptions', ['select_languageThemeOptions_SelectNthOfType_1': select_languageThemeOptions_SelectNthOfType_1_2, 'select_languageThemeOptions_SelectNth_1': select_languageThemeOptions_SelectNth_1_2]), select_languageThemeOptions_2, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 98-Select option with input value from select languageThemeOptions languageSelection2.png')

"Step 99: Select option with input value from select languageThemeOptions (theme2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/select_languageThemeOptions"
TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/select_languageThemeOptions', ['select_languageThemeOptions_SelectNthOfType_1': select_languageThemeOptions_SelectNthOfType_1_3, 'select_languageThemeOptions_SelectNth_1': select_languageThemeOptions_SelectNth_1_3]), select_languageThemeOptions_3, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 99-Select option with input value from select languageThemeOptions theme2.png')

"Step 100: Click on label notificationSettings (enableNotifications2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/label_notificationSettings', ['label_notificationSettings_Class_1': label_notificationSettings_Class_1_2, 'label_notificationSettings_LabelInternalText_1': label_notificationSettings_LabelInternalText_1_2]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 100-Click on label notificationSettings enableNotifications2.png')

"Step 101: Click on div userProfileForm"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_userProfileForm'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 101-Click on div userProfileForm.png')

"Step 102: Click on input userDetails (firstName2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_24, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_24, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_24]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 102-Click on input userDetails firstName2.png')

"Step 103: Enter input value in input userDetails (firstName2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_25, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_25, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_25]), input_userDetails_9)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 103-Enter input value in input userDetails firstName2.png')

"Step 104: Click on div object3"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_object3'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 104-Click on div object3.png')

"Step 105: Click on input userDetails (lastName)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_26, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_26, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_26]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 105-Click on input userDetails lastName.png')

"Step 106: Enter input value in input userDetails (lastName)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_27, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_27, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_27]), input_userDetails_10)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 106-Enter input value in input userDetails lastName.png')

"Step 107: Click on input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_28, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_28, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_28]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 107-Click on input userDetails email.png')

"Step 108: Enter input value in input userDetails (email)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_29, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_29, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_29]), input_userDetails_11)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 108-Enter input value in input userDetails email.png')

"Step 109: Click on textarea bio"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 109-Click on textarea bio.png')

"Step 110: Enter input value in textarea bio"

WebUI.setText(findTestObject('AI-Generated/all domain/Page_combobox/textarea_bio'), textarea_bio_1)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 110-Enter input value in textarea bio.png')

"Step 111: Click on input userDetails (address2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_30, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_30, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_30]))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 111-Click on input userDetails address2.png')

"Step 112: Enter input value in input userDetails (address2)"

// Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_31, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_31, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_31]), input_userDetails_12)

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 112-Enter input value in input userDetails address2.png')

"Step 113: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_13, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 113-Select option with input value from select formTypeSelection.png')

"Step 114: Click on div siteSelection"

WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Page_combobox/div_siteSelection'))

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 114-Click on div siteSelection.png')

"Step 115: Select option with input value from select siteSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_6, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 115-Select option with input value from select siteSelection.png')

"Step 116: Select option with input value from select formTypeSelection"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_14, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 116-Select option with input value from select formTypeSelection.png')

"Step 117: Select option with input value from select siteSelection -> Navigate to page ''"

TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection_7, "label")

// WebUI.takeScreenshot(reportLocation + '/TC6/Step 117-Select option with input value from select siteSelection - Navigate to page .png')

"Step 118: Take full page screenshot as checkpoint"

WebUI.takeFullPageScreenshotAsCheckpoint('TC6-Comprehensive User Interaction with Dynamic Objects and Forms_visual_checkpoint')

'Terminate test session: Close browser'

@com.kms.katalon.core.annotation.TearDown
def teardown() {
	WebUI.closeBrowser()
}