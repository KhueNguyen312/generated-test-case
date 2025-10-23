package truetest.all_domain.common

import com.kms.katalon.core.testdata.TestData as TestData
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import truetest.all_domain.custom.TrueTestScripts

public class selectSiteAndFormTypes {
    
    private static def execute(String select_formTypeSelection, String select_formTypeSelection_1, String select_formTypeSelection_2, String select_formTypeSelection_3, String select_siteSelection) {
        
        "Step 1: Select option with input value from select siteSelection"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_siteSelection'), select_siteSelection, "label")
        
        "Step 2: Select option with input value from select formTypeSelection"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection, "label")
        
        "Step 3: Select option with input value from select formTypeSelection"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_1, "label")
        
        "Step 4: Select option with input value from select formTypeSelection"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_2, "label")
        
        "Step 5: Select option with input value from select formTypeSelection"
        
        TrueTestScripts.selectOption(findTestObject('AI-Generated/all domain/Page_combobox/select_formTypeSelection'), select_formTypeSelection_3, "label")
    }
}

