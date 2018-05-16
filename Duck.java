package multipleInterface.lab7.prob5;

public interface Duck {

	public default void display() {
           System.out.println("displaying...");
	}

	public default void swim() {
		System.out.println("swimming");
	}

	public default void quack() {
		QuackBehaviour q1 = null;
		switch (this.getClass().getSimpleName()) {
		case "MallardDuck":
			q1 = new Quack();
			break;
		case "RedheadDuck":
			q1 = new Quack();
			break;
		case "RubberDuck":
			q1 = new Quack();
			break;
		case "DecoyDuck":
			q1 = new Quack();
			break;
		}
		q1.quack();
	}

	public default void fly() {
		FlyBehaviour f1 = null;
		switch (this.getClass().getSimpleName()) {
		case "RubberDuck":
		case "DecoyDuck":
		case "MallardDuck":
			f1 = new FlyWithWings();
			break;
		case "RedheadDuck":
			f1 = new CannotFly();
			break;

		}
		f1.fly();
	}
}
