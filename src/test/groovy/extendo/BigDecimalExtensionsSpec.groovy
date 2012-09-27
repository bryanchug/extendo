package extendo;

import spock.lang.Specification
import java.math.RoundingMode

class BigDecimalExtensionsSpec extends Specification {

    def "Test roundOff() (Scale = 0, RoundingMode.HALF_UP as default)"() {
        expect:
        decimal.roundOff() == roundedOff

        where:
        decimal                  | roundedOff
        new BigDecimal("120.21") | new BigDecimal("120")
        new BigDecimal("120.24") | new BigDecimal("120")
        new BigDecimal("121.95") | new BigDecimal("122")
        new BigDecimal("120.7")  | new BigDecimal("121")
    }

    def "Test roundOff() (RoundingMode.HALF_UP as default)"() {
        expect:
        decimal.roundOff(1) == roundedOff

        where:
        decimal                    | roundedOff
        new BigDecimal("120.21")   | new BigDecimal("120.2")
        new BigDecimal("120.24")   | new BigDecimal("120.2")
        new BigDecimal("120.25")   | new BigDecimal("120.3")
        new BigDecimal("120.2599") | new BigDecimal("120.3")
    }

    def "Test roundOff() for other RoundingModes"() {
        expect:
        actual == expected

        where:
        actual                                                     | expected
        new BigDecimal("120.21").roundOff(0, RoundingMode.CEILING) | new BigDecimal("121")
        new BigDecimal("120.29").roundOff(1, RoundingMode.FLOOR)   | new BigDecimal("120.2")
    }


}
