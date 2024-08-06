package cm.belrose

import spock.lang.Specification


class MathSpec extends Specification {

    def "adding two numbers"() {
        when:
        def result = 1 + 1

        then:
        result == 2
    }
}