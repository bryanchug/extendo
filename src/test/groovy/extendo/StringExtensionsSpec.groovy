package extendo

import spock.lang.Specification

class StringExtensionsSpec extends Specification {

    def 'Test date String as Date'() {
        expect:
        dateString.toDate() == new Date(dateString)

        where:
        dateString << [
                "Jan 1, 1990",
                "Feb 20, 2012",
                "November 21, 1988",
                "October 2, 1989"
        ]
    }

    def "Test isUpperCase"() {
        expect:
        string.isUpperCase() == isUpperCase

        where:
        string        | isUpperCase
        "HELLO WORLD" | true
        "HELLO world" | false
        "hello WORLD" | false
        "hElLo WorLD" | false
        "hello world" | false
    }

    def "Test isLowerCase"() {
        expect:
        string.isLowerCase() == isLowerCase

        where:
        string        | isLowerCase
        "HELLO WORLD" | false
        "HELLO world" | false
        "hello WORLD" | false
        "hElLo WorLD" | false
        "hello world" | true
    }

    def "Test isMixedCase"() {
        expect:
        string.isMixedCase() == isMixedCase

        where:
        string        | isMixedCase
        "HELLO WORLD" | false
        "HELLO world" | true
        "hello WORLD" | true
        "hElLo WorLD" | true
        "hello world" | false
    }

    def "Test toTitleCase"() {
        expect:
        string.toTitleCase() == titleCase

        where:
        string                                  | titleCase
        "HELLO WORLD"                           | "Hello World"
        "a new hope"                            | "A New Hope"
        "the gods THEMSELVES"                   | "The Gods Themselves"
        "The lion, the witch, and the wardrobe" | "The Lion, The Witch, And The Wardrobe"
        "of MICE and MEN"                       | "Of Mice And Men"
    }

}
