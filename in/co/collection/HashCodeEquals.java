package in.co.collection;

public class HashCodeEquals {

	private String name;
	private int age;

	/*public int hashCode() {
		String key = name + age;
		return key.hashCode();
	}
*/
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (!(o instanceof HashCodeEquals)) {
			return false;
		}
		HashCodeEquals rhs = (HashCodeEquals) o;

		if (name.equals(rhs.name) && age == rhs.age) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println("10".equals("10"));
	}
}
