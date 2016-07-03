package module2.oop2_7.inheritance.workers;

public class QA extends Worker {

	private final String KIND;

	public QA(final String NAME, final long ID, String KIND) {
		super(NAME, ID);
		this.KIND = KIND;
	}

	@Override
	public String toString() {
		return super.toString() + " QA [KIND=" + KIND + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((KIND == null) ? 0 : KIND.hashCode());
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
		QA other = (QA) obj;
		if (KIND == null) {
			if (other.KIND != null)
				return false;
		} else if (!KIND.equals(other.KIND))
			return false;
		return true;
	}

	@Override
	public void eat() {
		System.out.println(getClass().getSimpleName() + " likes pepsi!");
		
	}

}
