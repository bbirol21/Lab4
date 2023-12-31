package media;

/* From Oracle's Java Documentation:
 * An enum type is a special data type that enables for a variable to be a set of predefined constants. 
 * The variable must be equal to one of the values that have been predefined for it. 
 * Common examples include compass directions (values of NORTH, SOUTH, EAST, and WEST) and the days of the week.
 * Because they are constants, the names of an enum type's fields are in uppercase letters.
 * In the Java programming language, you define an enum type by using the enum keyword. For example, you would specify a days-of-the-week enum type as:
 * 	public enum Day {
 * 	SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
 * 	HURSDAY, FRIDAY, SATURDAY 
 * 	} 
 */

public enum Genre {
	DRAMA, FANTASY, ACTION, HORROR, COMEDY, ROMANCE, SCIFI;
}