package eleven.proxy.reflectProxy.bean;

public class PersonBeanImpl implements PersonBean {
	private String name;
	private String gender;
	private String interests;
	private int rating;
	private int ratingCount = 0;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getInterests() {
		return interests;
	}

	public void setInterests(String interests) {
		this.interests = interests;
	}

	public int getHotOrNotRating() {
		if (ratingCount == 0)
			return 0;
		return (rating / ratingCount);
	}

	public void setHotOrNotRating(int rating) {
		this.rating = rating;
		ratingCount++;
	}

	@Override
	public String toString() {
		return "PersonBeanImpl [name=" + name + ", gender=" + gender + ", interests=" + interests + ", rating=" + rating
				+ ", ratingCount=" + ratingCount + "]";
	}
	
}
