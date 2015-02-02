package com.studentenrol

import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Course)
class CourseSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test toString"() { 
when:"A course has title, code and department"

def course=new Course(title: 'Web Systems Desgin',
		     
	             code:'WSD101',
		     department:'Computing')
then: "the to String method will merge them."
course.to.String()=='Web Systems Desgin, WSD101, Computing'

		

    }
}
