package interestingLitoPrograms;
import java.util.Calendar;
import java.util.Date;

/**
 * For simple date time related manipulations, java.util.Date is sufficient.
 * However, complex manipulations such as incrementing, dividing various fields
 * of days, months, years, and time is difficult with the Date library. From
 * Head-First-Java, it is even mentioned that this library is deprecated. Here
 * are some demonstrations.
 * 
 * @author Stanlay Manlay
 * 
 */

public class UsefulCalendarMethods {
	


	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println(today.getTime());

		Calendar c = Calendar.getInstance();

		System.out.printf("Original: 		%tB %<td, %<tY  %<tH:%<tM:%<tS %<tp \n", c.getTime());
		c.add(c.MONTH, 1); //adding a month
		System.out.printf("Added a Month: 		%tB %<td, %<tY  %<tH:%<tM:%<tS %<tp \n",c.getTime());
		c.roll(c.MONTH, 5); //removing 5 months
		System.out.printf("Removed 5 Months:	%tB %<td, %<tY  %<tH:%<tM:%<tS %<tp \n",c.getTime());
		System.out.printf("Time in Milliseconds: 	%d\n\n",c.getTimeInMillis());
		c.set(2000, 0, 7, 15, 40, 123);
		System.out.printf("Modifying the date time completely: 	%tB %<td, %<tY  %<tH:%<tM:%<tS %<tp \n",c.getTime());
		
		Date d = new Date(); //
		d.setMonth(2);  //<--? crossed out
		System.out.printf("%tB %<td, %<tY  %<tH:%<tM:%<tS %<tp \n",d.getTime());
		
	}

	/**
	 * 
	 * <p>The following table contains the suffix characters for Time Formatting</p>
	 * <table class="table table-bordered">
	 * <tbody>
	 * <tr>
	 * <th>Suffix</th>
	 * <th>Meaning</th>
	 * </tr>
	 * <tr>
	 * <td>H</td>
	 * <td>Format time as two-digit hour of the day for the 24-hour clock. The
	 * valid values are 00 to 23. 00 is used for midnight.</td>
	 * </tr>
	 * <tr>
	 * <td>I</td>
	 * <td>Format a two-digit hour of the day for the 12-hour clock. The valid
	 * values are 01 to 12.</td>
	 * </tr>
	 * <tr>
	 * <td>k</td>
	 * <td>Format time the same as the <code>H</code> suffix except that it does
	 * not add a leading zero to the output. Valid values are 0 to 23.</td>
	 * </tr>
	 * <tr>
	 * <td>l</td>
	 * <td>Format time the same as 'I' suffix except that it does not add a
	 * leading zero. Valid values are 1 to 12.</td>
	 * </tr>
	 * <tr>
	 * <td>M</td>
	 * <td>A two-digit minute within an hour. Valid values are 00 to 59.</td>
	 * </tr>
	 * <tr>
	 * <td>S</td>
	 * <td>A two-digit second. Valid values are 00 to 60.</td>
	 * </tr>
	 * <tr>
	 * <td>L</td>
	 * <td>A three-digit millisecond. Valid values are 000 to 999.</td>
	 * </tr>
	 * <tr>
	 * <td>N</td>
	 * <td>A nine-digit nanosecond. The valid values are 000000000 to 999999999.
	 * </td>
	 * </tr>
	 * <tr>
	 * <td>p</td>
	 * <td>Format a locale-specific morning or afternoon string in lowercase.
	 * For US locale, "am" or "pm". To get "AM" and "PM", use the uppercase
	 * variant 'T' as the conversion character.</td>
	 * </tr>
	 * <tr>
	 * <td>z</td>
	 * <td>Output the numeric time zone offset from GMT (e.g., +0530).</td>
	 * </tr>
	 * <tr>
	 * <td>Z</td>
	 * <td>Output a string abbreviation of the time zone (e.g., CST, EST, IST,
	 * etc).</td>
	 * </tr>
	 * <tr>
	 * <td>s</td>
	 * <td>Output seconds since January 1, 1970 midnight UTC.</td>
	 * </tr>
	 * <tr>
	 * <td>Q</td>
	 * <td>Output milliseconds since January 1, 1970 midnight UTC.</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * 
	 * <p>The following table list of suffix characters for Date Formatting</p>
	 * <table class="table table-bordered">
	 * <tbody>
	 * <tr>
	 * <th>Letter</th>
	 * <th>Meaning</th>
	 * </tr>
	 * <tr>
	 * <td>B</td>
	 * <td>Output locale-specific full name of the month, such as "January",
	 * "February", in US locale.</td>
	 * </tr>
	 * <tr>
	 * <td>b</td>
	 * <td>Output locale-specific abbreviated month name, such as "Jan", "Feb",
	 * in US locale.</td>
	 * </tr>
	 * <tr>
	 * <td>h</td>
	 * <td>Same as 'b'. Output locale-specific abbreviated month name, such as
	 * "Jan", "Feb", in US locale.</td>
	 * </tr>
	 * <tr>
	 * <td>A</td>
	 * <td>Output locale-specific full name for the day of the week, such as
	 * "Sunday", "Monday" for US locale.</td>
	 * </tr>
	 * <tr>
	 * <td>a</td>
	 * <td>Output locale-specific short name of the day of the week, such as
	 * "Sun", "Mon" for US locale.</td>
	 * </tr>
	 * <tr>
	 * <td>C</td>
	 * <td>Divide the four-digit year by 100 and formats the result as two
	 * digits. It adds a leading zero if the resulting number is one digit.
	 * Valid values are 00 to 99. For example, if the four-digit year is 2014,
	 * it will output 20.</td>
	 * </tr>
	 * <tr>
	 * <td>Y</td>
	 * <td>Output a four-digit year with leading zeros if the year contains less
	 * than four digits.</td>
	 * </tr>
	 * <tr>
	 * <td>y</td>
	 * <td>Output the last two digits of the year and adds leading zero if
	 * necessary. 2011 will output 11</td>
	 * </tr>
	 * <tr>
	 * <td>j</td>
	 * <td>A three-digit day of the year. Valid values are 000 to 366.</td>
	 * </tr>
	 * <tr>
	 * <td>m</td>
	 * <td>A two-digit month. Valid values are 01 to 13. The special value of 13
	 * is required to support lunar calendar.</td>
	 * </tr>
	 * <tr>
	 * <td>d</td>
	 * <td>A two-digit day of the month. Valid values are 01 to 31.</td>
	 * </tr>
	 * <tr>
	 * <td>e</td>
	 * <td>Day of the month. Valid values are 1 to 31.</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 * <p> The following table lists of Suffix Characters for Date/Time Formatting</p>
	 * <table class="table table-bordered">
	 * <tbody>
	 * <tr>
	 * <th>Format</th>
	 * <th>Description</th>
	 * </tr>
	 * <tr>
	 * <td>R</td>
	 * <td>Output time in 24-hour clock format as "hour:minute". It outputs the
	 * same as %tH:%tM. Examples: 11:23</td>
	 * </tr>
	 * <tr>
	 * <td>T</td>
	 * <td>Output time in 24-hour clock in "hour:minute:second" format. It
	 * outputs the same as "%tH:%tM:%tS". Examples 11:23:10</td>
	 * </tr>
	 * <tr>
	 * <td>r</td>
	 * <td>Output time in 12-hour clock format as
	 * "hour:minute:second morning/afternoon marker". It outputs the same as
	 * "%tI:%tM:%tS %Tp". Example, 09:23:45 AM</td>
	 * </tr>
	 * <tr>
	 * <td>D</td>
	 * <td>Output the date as "%tm/%td/%ty", such as "01/19/14"</td>
	 * </tr>
	 * <tr>
	 * <td>F</td>
	 * <td>Output the date as "%tY-%tm-%td", such as "2014-01-19".</td>
	 * </tr>
	 * <tr>
	 * <td>c</td>
	 * <td>Output the date and time as "%ta %tb %td %tT %tZ %tY", such as
	 * "Wed Jan 20 12:22:06 CST 2014".</td>
	 * </tr>
	 * </tbody>
	 * </table>
	 */
	void placeHolder(){
		
	}
	
}
