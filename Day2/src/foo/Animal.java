package foo;

public abstract class Animal {
	abstract void eat();
	public Animal() {
		System.out.println("Animal Cons...");
	}
}
class Dog extends Animal {
	
	public void bark() {
		System.out.println("Dog Bark...");
	}

	@Override
	void eat() {
		System.out.println("Dog Eat");		
	}
}
class Cat extends Animal {
	
	public void meow() {
		System.out.println("Cat Meow...");
	}

	@Override
	void eat() {
		System.out.println("Cat Eat..");
	}
}

class TestAnimal {
	public static void main(String[] args) {
		Animal obj[]= { new Dog(), new Cat()};
		
		for(Animal a:obj) {
			a.eat();
			if(a instanceof Dog)
				((Dog)a).bark();
			else if(a instanceof Cat)
				((Cat)a).meow();
		}
	}
}