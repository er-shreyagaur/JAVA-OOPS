package abstract_class;

class Labrador extends Dog {
	@Override
	public void sound() {
		System.out.println("Labrador is barking");
	}

	@Override
	public void breedInfo() {
		System.out.println("Labrador are friendly and energetic");
	}

}
