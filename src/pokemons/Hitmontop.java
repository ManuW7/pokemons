package pokemons;

import moves_hitmontop.RollingKick;
import moves_tyrogue.DoubleTeam;
import moves_tyrogue.LowSweep;
import moves_tyrogue.Rest;
import ru.ifmo.se.pokemon.Type;

public class Hitmontop extends Tyrogue{
	
	public Hitmontop(String name, int level) {
		super(name, level);
		
		super.setType(Type.FIGHTING);
		super.setStats(50, 95, 95, 35, 110, 70);
		
		Rest rest = new Rest(0, 100);
		LowSweep lowsweep = new LowSweep(65, 100);
		DoubleTeam doubleteam = new DoubleTeam(0, 100);
		RollingKick rollingkick = new RollingKick(60, 85);
		
		super.setMove(rest, lowsweep, doubleteam, rollingkick);	
		
	}
	
}