package ch14;

public class Main {
	public static void main(String[] args) {
		Person jjs = new Person();
		
		Dog d = new Dog();
		jjs.withWalk(d); // Pet p = d;
		
		Snake s = new Snake();
		jjs.withWalk(s);
		
		Kangaroo k = new Kangaroo();
		jjs.withWalk(k);
		
		
		// 불가능
		// Pet p = new Pet();
		// p.move();
		
		
	/*
	  	Person p = new Person();
		Dog d = new Dog();
		p.withWalkDog(d);
		
		Snake s = new Snake();
		p.withWalkSnake(s);
		
		Kangaroo k = new Kangaroo();
		p.withWalkKangaroo(k);
	*/

	}
}
	
