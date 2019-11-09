package HivemindsBackend.CourseProperties;

import java.time.LocalDate;

import HivemindsBackend.EduStructure.Course;

public class Exercise extends Course {
	private int nr;
	private boolean inCal;
	private boolean inTw;
	private boolean isAvailable;
	private String topic;
	private String lectureTopic;
	private LocalDate dueDate;

	public Exercise(String uniName, String facultyName, boolean isBachelor, String programName, String courseName,

			String topic, String lectureTopic, LocalDate dueDate) {
		super(uniName, facultyName, isBachelor, programName, courseName);
		this.topic = topic;
		this.lectureTopic = lectureTopic;
		this.dueDate = dueDate;
	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}

	public boolean isInCal() {
		return inCal;
	}

	public void setInCal(boolean inCal) {
		this.inCal = inCal;
	}

	public boolean isInTw() {
		return inTw;
	}

	public void setInTw(boolean inTw) {
		this.inTw = inTw;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getLectureTopic() {
		return lectureTopic;
	}

	public void setLectureTopic(String lectureTopic) {
		this.lectureTopic = lectureTopic;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

}
