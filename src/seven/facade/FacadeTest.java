package seven.facade;

import seven.facade.myday.BorningDaysFactory;
import seven.facade.myday.MyAllDay;

public class FacadeTest {
	public static void main(String...strings) {
		MyAllDay allDay = new BorningDaysFactory("borning man").getMyAllDay();
		System.out.println(allDay.getName());
		allDay.normalDay();
		allDay.holiday();
	}
}
