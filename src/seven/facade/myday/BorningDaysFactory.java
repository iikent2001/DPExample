package seven.facade.myday;

public class BorningDaysFactory extends AllDayFactory{
	
	public BorningDaysFactory(String name) {
		super(new BorningThingsFactory(),name);
	}

	@Override
	protected MyAllDay createMyAllDay() {
		return new MyAllDay(thingsFactory);
	}

}
