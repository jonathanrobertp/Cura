import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
//import com.katalon.plugin.keyword.connection.DBType as DBType
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class DBKeyword {
	@Keyword
	def CheckIsEmpty(String connection) {
			CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.createConnection'(connection)
//			actorData = CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection, 'SELECT * FROM customer')
			CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.closeConnection'(connection)
			return CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.isEmptyResult'(CustomKeywords.'com.katalon.plugin.keyword.connection.DatabaseKeywords.executeQuery'(connection, 'SELECT * FROM customer'))
//			CustomKeywords.'com.katalon.plugin.keyword.connection.ResultSetKeywords.exportToCSV'(actorData, 'C:\\Users\\095770\\Documents\\TestDB.csv')
			
			
	}
}
