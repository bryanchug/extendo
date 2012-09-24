package extendo

import spock.lang.Specification

class StringAsTypeExtensionsSpec extends Specification {

	def 'Test date String as Date'(){
        expect:
        name.size() == length

        where:
        name     | length
        "Spock"  | 5
        "Kirk"   | 4
        "Scotty" | 6
	}

}
