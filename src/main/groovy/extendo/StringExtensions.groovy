package extendo

import org.apache.commons.lang3.text.WordUtils

class StringExtensions {

    static Date toDate( String self ){
        new Date( self )
    }

    /* Case Extensions */
    static Boolean isUpperCase( String self ){
        self.toUpperCase() == self
    }

    static Boolean isLowerCase( String self ){
        self.toLowerCase() == self
    }

    static Boolean isMixedCase( String self ){
        !isLowerCase( self ) && !isUpperCase( self )
    }

    static String toTitleCase( String self ){
        WordUtils.capitalizeFully( self )
    }
		
}
