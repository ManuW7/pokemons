package lab2;

import pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Program {

	public static void main(String[] args) {
		
		Battle b = new Battle();
		Tyrogue tyrogue = new Tyrogue("Michael", 1);
		Hitmontop hitmontop = new Hitmontop("Kevin", 1);
		Castform castform = new Castform("Lebron", 1);
		Porygon porygon = new Porygon("Kobe", 1);
		Porygon2 porygon2 = new Porygon2("Steph", 1);
		Porygon_Z porygon_z = new Porygon_Z("Shaq", 1);
		
		b.addAlly(hitmontop);
		b.addAlly(porygon);
		b.addAlly(porygon_z);
		
		b.addFoe(castform);
		b.addFoe(tyrogue);
		b.addFoe(porygon2);
		
		b.go();

	}

}
