package extendo

import java.math.RoundingMode

class BigDecimalExtensions {

    static BigDecimal roundOff( BigDecimal self, Integer scale = 0, RoundingMode roundingMode = RoundingMode.HALF_UP ){
        self.setScale(scale, roundingMode)
    }

}
