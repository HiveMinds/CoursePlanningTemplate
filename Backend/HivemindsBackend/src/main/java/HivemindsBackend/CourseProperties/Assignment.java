package HivemindsBackend.CourseProperties;

import java.time.LocalDate;

import HivemindsBackend.EduStructure.Course;

public class Assignment extends Course {
	String nr;
	boolean inCal;
	boolean inTw;
	String topic;
	Boolean available;
	LocalDate dueDate;
	String sourceOfDueDate;
	Double weight;
	String sourceOfWeight;

	public Assignment(String uniName, String facultyName, boolean isBachelor, String programName, String courseName,

			String topic, LocalDate dueDate, String sourceOfDueDate, Double weight, String sourceOfWeight) {
		super(uniName, facultyName, isBachelor, programName, courseName);
		this.topic = topic;
		this.dueDate = dueDate;
		this.sourceOfDueDate = sourceOfDueDate;
		this.weight = weight;
		this.sourceOfWeight = sourceOfWeight;
	}

	public String getNr() {
		return nr;
	}

	public void setNr(String nr) {
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

	public String getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Boolean getAvailable() {
		return available;
	}

	public void setAvailable(Boolean available) {
		this.available = available;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}

	public String getSourceOfDueDate() {
		return sourceOfDueDate;
	}

	public void setSourceOfDueDate(String sourceOfDueDate) {
		this.sourceOfDueDate = sourceOfDueDate;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getSourceOfWeight() {
		return sourceOfWeight;
	}

	public void setSourceOfWeight(String sourceOfWeight) {
		this.sourceOfWeight = sourceOfWeight;
	}
}
