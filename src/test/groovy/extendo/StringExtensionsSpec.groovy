package extendo

import spock.lang.Specification

class StringExtensionsSpec extends Specification {

	def 'Test date String as Date'(){
        expect:
        dateString.toDate() == new Date( dateString )

        where:
        dateString << [
            "Jan 1, 1990",
            "Feb 20, 2012",
            "November 21, 1988",
            "October 2, 1989"
        ]
	}

}
