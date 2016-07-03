package module2.oop2_7.inheritance.workers;

public class Developer extends Worker {

	private final String PROFILE;

	public Developer(final String NAME, final long ID, String PROFILE) {
		super(NAME, ID);
		this.PROFILE = PROFILE;
	}

	@Override
	public String toString() {
		return super.toString() + " Developer [PROFILE=" + PROFILE + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((PROFILE == null) ? 0 : PROFILE.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Developer other = (Developer) obj;
		if (PROFILE == null) {
			if (other.PROFILE != null)
				return false;
		} else if (!PROFILE.equals(other.PROFILE))
			return false;
		return true;
	}

	@Override
	public void eat() {
		System.out.println(getClass().getSimpleName() + " likes cofee!");

	}
}
