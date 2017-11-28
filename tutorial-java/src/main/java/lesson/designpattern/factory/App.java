package lesson.designpattern.factory;

public class App {

	public static void main(String [] args) {
		WeaponFactory factory = WeaponFactory.factory(builder -> {
			builder.add(WeaponType.SWORD, Sword::new);
			builder.add(WeaponType.AXE, Axe::new);
			builder.add(WeaponType.BOW, Bow::new);
			builder.add(WeaponType.SPEAR, Spear::new);
			
		});
	}
}
