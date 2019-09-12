package seven.facade.myday;

public abstract class AllDayFactory {
	
	protected ThingsFactory thingsFactory;
	protected String name;
	
	public AllDayFactory (ThingsFactory thingsFactory,String name) {
		this.name = name;
		this.thingsFactory=thingsFactory;
	}

	public MyAllDay getMyAllDay() {
		System.out.println("God created a people");
		MyAllDay day = createMyAllDay();
		day.setName(name);
		return day;
	}
	
	protected abstract MyAllDay createMyAllDay();

}
