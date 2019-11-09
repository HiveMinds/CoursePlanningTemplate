package HivemindsBackend.CourseProperties;

import java.util.ArrayList;

/**
 * Represents an ArrayList of exercises (difference with assignments is that
 * exercise is not graded but assginment is graded).
 * 
 * @author a
 *
 */
public class ExerciseCatalog {

	private ArrayList<Exercise> exerciseCatalog;
	public ExerciseCatalog() {
		
	}
	public ArrayList<Exercise> getExerciseCatalog() {
		return exerciseCatalog;
	}
	public void setExerciseCatalog(ArrayList<Exercise> exerciseCatalog) {
		this.exerciseCatalog = exerciseCatalog;
	}
	
}
