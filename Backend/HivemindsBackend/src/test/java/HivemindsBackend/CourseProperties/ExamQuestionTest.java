package HivemindsBackend.CourseProperties;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Test;

public class ExamQuestionTest {

	@Test
	public void test() {
		 int questionNr = 2;
		 String questionTopic = "test question topic";
		 String correspondingLectureTopic = "test lecture topic";
		 LocalDate questionDueDate = LocalDate.parse("2019-04-23");
		 boolean isAllocated = false;
		 String allocatedHash ="abc";
		 boolean hasSolutionsWritten = false;
		 String language = "Eng";
		 
		 ExamQuestion examQuestion = new ExamQuestion(questionNr, questionTopic, questionDueDate, allocatedHash,
					hasSolutionsWritten, language);
		 
		 assertEquals(questionTopic,examQuestion.getQuestionTopic());
		 assertEquals(questionDueDate ,examQuestion.getQuestionDueDate());
	}

}
