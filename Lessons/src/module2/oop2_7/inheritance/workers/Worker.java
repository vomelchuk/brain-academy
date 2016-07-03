package module2.oop2_7.inheritance.workers;

import module2.oop2_7.inheritance.move.Eater;

public abstract class Worker implements Eater{

	private final String NAME;
	private final long ID;

	protected Worker(final String NAME, final long ID) {
		this.NAME = NAME;
		this.ID = ID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ID ^ (ID >>> 32));
		result = prime * result + ((NAME == null) ? 0 : NAME.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Worker other = (Worker) obj;
		if (ID != other.ID)
			return false;
		if (NAME == null) {
			if (other.NAME != null)
				return false;
		} else if (!NAME.equals(other.NAME))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Worker: [NAME=" + NAME + ", ID=" + ID + "]";
	}

}
