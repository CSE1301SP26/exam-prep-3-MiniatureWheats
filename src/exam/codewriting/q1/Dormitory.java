package exam.codewriting.q1;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* We wish to create a Dormitory class. A dormitory has-a(n):

		name
		Mapping of room numbers (like 204H) to Students, For the
		purposes of this problem, you can assume that each room can only contain one student.
 */
public class Dormitory {
	// Instance variables (do not change)
	private String name;
	private HashMap<String, Student> rooms;

	// Write the constructor for the Dormitory class:
	// (For full credit the constructor should use only one parameter)
	public Dormitory(String name) {
		this.name = name;
		HashMap rooms = new HashMap<>();
	}

	// Now, write out the remaining methods:
	public String getName() {
		return name; // FIXME
	}

	/**
	 * Returns the amount of rooms that are currently occupied.
	 */
	public int getOccupiedRooms() {
		return rooms.size();// FIXME
	}

	/**
	 * Sets the given room number to be occupied by the given Student.
	 */
	public void addStudent(String roomNo, Student s) {
		rooms.put(roomNo, s);
	}

	/**
	 * Returns true if the given room contains a Student, false otherwise
	 */
	public boolean isOccupied(String roomNo) {
		return rooms.get(roomNo) != null;
	}

	/**
	 * Returns a list of student IDs for all students currently in the dorm.
	 * Recall that the Student class contains a getId() method which returns an int.
	 * 
	 * @return A List containing the student ID numbers of all students in this dorm
	 */
	public LinkedList<Integer> getStudentIds() {
		LinkedList studentList = new LinkedList<>();
		for (Student s : rooms.values()) {
			studentList.add(s.getId());
		}
		return studentList; // FIXME
	}

	public static void main(String[] args) {

		// Create an instance of the Dormitory class and store it in a variable called
		// dorm.
		Dormitory dorm = new Dormitory("#1");
		// Create an instance of Student and add it to the dorm. You can choose which
		// room to add it to.
		Student student1 = new Student(10347);
		dorm.addStudent("Room# 101", student1);
		// Write code to determine if a student with the id of 123456 is in your dorm
		// using the appropriate methods.
		LinkedList dormList = dorm.getStudentIds();

	}
}
