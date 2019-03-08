package demo.service

import demo.domain.Order
import spock.lang.Specification
import spock.lang.Unroll

class EmailServiceSpec extends Specification {
    def "sending mail: Send Email"() {
        setup:
        EmailService emailservice = EmailService.getInstance();

        when:
        Order order = Mock(Order)
        emailservice.sendEmail(order);

        then:
        thrown(RuntimeException)
    }

    def "sending mail1: Send Email1"() {
        setup:
        EmailService emailservice = EmailService.getInstance();

        when:
        Order order = Mock(Order)
        Boolean result = emailservice.sendEmail(order,"abc");

        then:
        result
    }

}
