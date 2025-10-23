package truetest.all_domain.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

public class interactWithDynamicObjectMultipleTimes {
    
    private static def execute(String div_dynamicObject, String div_dynamicObject_1, String div_dynamicObject_inputPlaceholder, String div_dynamicObject_inputPlaceholder_1, String div_dynamicObject_inputPlaceholder_2, String div_dynamicObject_inputPlaceholder_3, String div_dynamicObject_inputPlaceholder_4, String div_dynamicObject_type, String div_dynamicObject_type_1, String div_dynamicObject_type_2, String div_dynamicObject_type_3, String div_dynamicObject_type_4) {
        
        "Step 1: Click on div dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder, 'div_dynamicObject_type': div_dynamicObject_type]))
        
        "Step 2: Enter input value in div dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
        WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_1, 'div_dynamicObject_type': div_dynamicObject_type_1]), div_dynamicObject)
        
        "Step 3: Click on div dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_2, 'div_dynamicObject_type': div_dynamicObject_type_2]))
        
        "Step 4: Enter input value in div dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
        WebUI.setText(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_3, 'div_dynamicObject_type': div_dynamicObject_type_3]), div_dynamicObject_1)
        
        "Step 5: Click on div dynamicObject"
        
        // Bind values to the variables in the locators of "AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject"
        WebUI.enhancedClick(findTestObject('AI-Generated/all domain/Dynamic Objects/Page_combobox/div_dynamicObject', ['div_dynamicObject_inputPlaceholder': div_dynamicObject_inputPlaceholder_4, 'div_dynamicObject_type': div_dynamicObject_type_4]))
    }
}

