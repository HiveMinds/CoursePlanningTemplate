package HivemindsBackend.CourseProperties;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import HivemindsBackend.EduStructure.Bachelor;
import HivemindsBackend.EduStructure.Course;
import HivemindsBackend.EduStructure.Faculty;
import HivemindsBackend.EduStructure.Uni;

public class OldExamTest {

	@Test
	public void testInitializeOldExam() {
		String uniName = "Delft";
		String facultyName = "Aerospace Engingeering";
		boolean isBachelor = true;
		String programName = "Bachelor of Aerospace Engineering";
		String courseName = "Aerodynamics";

		// fill exam data
		String oldExamSource = "Brightspace";
		LocalDate oldExamDate = LocalDate.parse("2013-01-31");
		;
		int nrOfQuestions = 1;

		// fill exam question data
		int questionNr = 1;
		String questionTopic = "test question topic";
		String correspondingLectureTopic = "test lecture topic";
		LocalDate questionDueDate = LocalDate.parse("2019-04-23");
		boolean isAllocated = false;
		String allocatedHash = "abc";
		boolean hasSolutionsWritten = false;
		String language = "Eng";
		ArrayList<ExamQuestion> examQuestions = new ArrayList<ExamQuestion>();

		// create separate objects
		Uni uni = new Uni(uniName);
		Faculty faculty = new Faculty(uniName, facultyName);
		Bachelor bachelor = new Bachelor(uniName, facultyName, programName);
		Course course = new Course(uniName, facultyName, true, programName, courseName);

		ExamQuestion examQuestion = new ExamQuestion(uniName, facultyName, isBachelor, programName, courseName,
				oldExamSource, oldExamDate, nrOfQuestions, examQuestions, questionNr, questionTopic, questionDueDate,
				allocatedHash, hasSolutionsWritten, language);
		examQuestions.add(examQuestion);

		OldExam oldExam = new OldExam(uniName, facultyName, isBachelor, programName, courseName, oldExamSource,
				oldExamDate, nrOfQuestions, examQuestions);

		// integrate objects
		uni.getFacultyCatalog().add(faculty);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().add(bachelor);
		uni.getFacultyCatalog().get(0).getBachelorCatalog().get(0).getCourseCatalog().add(course);

		System.out.println(oldExam.getOldExamSource());

		assertEquals(uniName, oldExam.getUniName());
		assertEquals(questionTopic, oldExam.getOldExamQuestions().get(0).getQuestionTopic());
	}
}
