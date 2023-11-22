package pokemons;

import moves_tyrogue.DoubleTeam;
import moves_tyrogue.LowSweep;
import moves_tyrogue.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Tyrogue extends Pokemon{
	
	public Tyrogue(String name, int level) {
		super(name, level);
		
		super.setType(Type.FIGHTING);
		super.setStats(35, 35, 35, 35, 35, 35);
		
		Rest rest = new Rest(0, 100);
		LowSweep lowsweep = new LowSweep(65, 100);
		DoubleTeam doubleteam = new DoubleTeam(0, 100);
		
		super.setMove(rest, lowsweep, doubleteam);
		
	}

}
