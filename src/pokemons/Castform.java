package pokemons;

import moves_castform.Confide;
import moves_castform.OminousWind;
import moves_castform.Thunder;
import moves_castform.Thunderbolt;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Castform extends Pokemon {
	
	public Castform(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(70, 70, 70, 70, 70, 70);
		
		OminousWind ominouswind = new OminousWind(60, 100);
		Thunder thunder = new Thunder(110, 70);
		Confide confide = new Confide(0, 100);
		Thunderbolt thunderbolt = new Thunderbolt(90, 100);
		
		super.setMove(ominouswind, thunder, confide, thunderbolt);
		
	}

}
