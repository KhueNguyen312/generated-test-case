package truetest.all_domain.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.all_domain.custom.TrueTestScripts

public class selectSiteAndInteractWithDynamicObject {
    
    private static def execute(String div_dynamicObject, String div_dynamicObject_inputPlaceholder, String div_dynamicObject_inputPlaceholder_1, String div_dynamicObject_inputPlaceholder_2, String div_dynamicObject_type, String div_dynamicObject_type_1, String div_dynamicObject_type_2, String select_formTypeSelection, String select_siteSelection) {
        
        "Step 1: Select option with input value from select siteSelection"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection, "label")
        
        "Step 2: Select option with input value from select formTypeSelection"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection, "label")
        
        "Step 3: Click on div dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder, 'div_dynamicObject_type': div_dynamicObject_type]))
        
        "Step 4: Enter input value in div dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
        WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_1, 'div_dynamicObject_type': div_dynamicObject_type_1]), div_dynamicObject)
        
        "Step 5: Click on div dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_2, 'div_dynamicObject_type': div_dynamicObject_type_2]))
    }
}

