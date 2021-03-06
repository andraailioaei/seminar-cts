package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animals;
	public Zoo(Zookeeper zookeeper, List<Animal> animals) {
		super();
		this.zookeeper = zookeeper;
		this.animals = animals;
	}
	
	public Zoo() {
		this.zookeeper = new Zookeeper("Mihai");
		this.animals = new ArrayList<>();
	}
	
	public void addAnimal(Animal a) {
		this.animals.add(a);
	}
	
	public void feedAnimals() {
		for(Animal a : this.animals) {
			zookeeper.feed(a);
		}
	}
}
