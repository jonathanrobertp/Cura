import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import com.sun.java.util.jar.pack.Instruction.Switch as Switch
import ch.qos.logback.core.joran.conditional.ElseAction as ElseAction
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.util.KeywordUtil

println(GlobalVariable.url)

//Login Cura
WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_CURA Healthcare Service/Button_Make Appointment'))

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Input_Username'), username)

WebUI.setText(findTestObject('Page_CURA Healthcare Service/Input_Password'), password)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Page_CURA Healthcare Service/button_Login'))

WebUI.takeScreenshot()

//Check Login Status

if (tc_type == 'negative') {
    if (WebUI.verifyElementVisible(findTestObject('Page_CURA Healthcare Service/Select_Healtcare Center'), FailureHandling.STOP_ON_FAILURE) == true) {
        println('Login Berhasil & Test Case Failed')
		KeywordUtil.markFailed("Test Case Failed")
		'Should not work'
		assert !true
    } else {
        println('Login Gagal & Test Case Passed')
    }
} else if (tc_type == 'positive') {
    if (WebUI.verifyElementVisible(findTestObject('Page_CURA Healthcare Service/Select_Healtcare Center'), FailureHandling.STOP_ON_FAILURE) == true) {
        println('Login Berhasil & Test Case Passed')
    } else {
        println('Login Gagal & Test Case Failed')
		KeywordUtil.markFailed("Test Case Failed")
		'Should not work'
		assert !true
    }
}

