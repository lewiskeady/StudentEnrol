import com.studentenrol.*
class BootStrap {

    def init = { servletContext ->
	     def course1= new Course(title: 'Interactive Media with Animation',
				  department:'Computing',
				  description:'''Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpora vulputate ei.''',
					     leader:'Joe Jojo',
					     code:'IMA101',
					     startDate: new Date('19/01/2015'),
				             endDate: new Date('19/01/2020')).save()
def course2= new Course(title: 'Animation',
				  department:'Computing',
				  description:'''Lorem ipsum dolor sit amet,.''',
					     leader:'lewis Jojo',
					     code:'IMA202',
					     startDate: new Date('19/01/2015'),
				             endDate: new Date('19/01/2020')).save()

def course3= new Course(title: 'Web',
				  department:'Computing',
				  description:'''Lorem ipsum ,.''',
					     leader:'Jack Jojo',
					     code:'IMA505',
					     startDate: new Date('19/01/2015'),
				             endDate: new Date('19/01/2020')).save()

	    
    }
    def destroy = {
    }
}
