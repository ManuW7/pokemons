package pokemons;

import moves_porygon.AerialAce;
import moves_tyrogue.DoubleTeam;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Porygon extends Pokemon {
	
	public Porygon(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(65, 60, 70, 85, 75, 40);
		
		
		DoubleTeam doubleteam = new DoubleTeam(0, 100);
		AerialAce aerialace = new AerialAce(60, Double.POSITIVE_INFINITY);
		
		super.setMove(aerialace, doubleteam);
		
	}

}
