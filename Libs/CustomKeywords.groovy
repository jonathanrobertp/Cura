
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String



def static "DBKeyword.CheckIsEmpty"(
    	String connection	) {
    (new DBKeyword()).CheckIsEmpty(
        	connection)
}


def static "Cura.ForLoginCura"() {
    (new Cura()).ForLoginCura()
}


def static "Cura.CreateAppointment"(
    	String HealthCareCenter	
     , 	String DateAppointment	
     , 	String Comment	) {
    (new Cura()).CreateAppointment(
        	HealthCareCenter
         , 	DateAppointment
         , 	Comment)
}
