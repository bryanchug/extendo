package extendo

import spock.lang.Specification

class StringAsTypeExtensionsSpec extends Specification {

	def 'Test date String as Date'(){
        expect:
        "foo".foo == "bar"

        where:
        dateString << [
            "Jan 1, 1990",
            "Feb 20, 2012",
            "November 21, 1988",
            "October 2, 1989",
            "${new Date()}"
        ]
	}

}
