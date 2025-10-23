package truetest.all_domain.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class inputUserAndCardDetails {
    
    private static def execute(String input_cardDetails_FlexInputNthOfType_1, String input_cardDetails_InputPlaceholder_1, String input_userDetails, String input_userDetails_1, String input_userDetails_Class_1, String input_userDetails_Class_1_1, String input_userDetails_Class_1_2, String input_userDetails_Class_1_3, String input_userDetails_InputNthOfType_2, String input_userDetails_InputNthOfType_2_1, String input_userDetails_InputNthOfType_2_2, String input_userDetails_InputNthOfType_2_3, String input_userDetails_InputPlaceholder_1, String input_userDetails_InputPlaceholder_1_1, String input_userDetails_InputPlaceholder_1_2, String input_userDetails_InputPlaceholder_1_3) {
        
        "Step 1: Click on input userDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1]))
        
        "Step 2: Enter input value in input userDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
        WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_1, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_1, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_1]), input_userDetails)
        
        "Step 3: Click on input userDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_2, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_2, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_2]))
        
        "Step 4: Enter input value in input userDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails"
        WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_userDetails', ['input_userDetails_Class_1': input_userDetails_Class_1_3, 'input_userDetails_InputNthOfType_2': input_userDetails_InputNthOfType_2_3, 'input_userDetails_InputPlaceholder_1': input_userDetails_InputPlaceholder_1_3]), input_userDetails_1)
        
        "Step 5: Click on input cardDetails"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails"
        WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/input_cardDetails', ['input_cardDetails_FlexInputNthOfType_1': input_cardDetails_FlexInputNthOfType_1, 'input_cardDetails_InputPlaceholder_1': input_cardDetails_InputPlaceholder_1]))
    }
}

