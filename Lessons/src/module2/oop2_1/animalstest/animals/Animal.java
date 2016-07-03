package module2.oop2_1.animalstest.animals;

public class Animal {

	// fields
	private String nick;
	private int age;
	private String kind;

	// constructors
	public Animal() {
	}

	public Animal(String nick) {
		this.nick = nick;
	}

	public Animal(String nick, int age) {
		this(nick);
		this.age = age;
	}

	public Animal(String nick, int age, String kind) {
		this(nick, age);
		this.kind = kind;
	}

	// getters/setters
	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	// methods

	public void view() {
		System.out.println(String.format("Nick: %s%nAge: %d%nKind: %s%n",
				getNick(), getAge(), getKind()));
	}

}
