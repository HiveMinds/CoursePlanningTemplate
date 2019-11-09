package HivemindsBackend.CourseProperties;

import java.time.LocalDate;

import HivemindsBackend.EduStructure.Course;

public class Lecture extends Course{
	private int period;
	private int semester;
	private int week;
	private int lectureNr;

	// required fields
	private LocalDate lectureDate;
	private String lectureTopic;

	public Lecture(String uniName, String facultyName, boolean isBachelor, String programName, String courseName,
			
			String lectureTopic, LocalDate lectureDate) {
		super(uniName, facultyName, isBachelor, programName, courseName);
		this.lectureTopic = lectureTopic;
		this.lectureDate = lectureDate;
	}

	public int getPeriod() {
		return period;
	}

	public void setPeriod(int period) {
		this.period = period;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getLectureNr() {
		return lectureNr;
	}

	public void setLectureNr(int lectureNr) {
		this.lectureNr = lectureNr;
	}

	public LocalDate getLectureDate() {
		return lectureDate;
	}

	public void setLectureDate(LocalDate lectureDate) {
		this.lectureDate = lectureDate;
	}

	public String getLectureTopic() {
		return lectureTopic;
	}

	public void setLectureTopic(String lectureTopic) {
		this.lectureTopic = lectureTopic;
	}

}
