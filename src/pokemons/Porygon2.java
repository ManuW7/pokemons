package pokemons;

import moves_porygon.AerialAce;
import moves_porygon2.DefenseCurl;
import moves_tyrogue.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Porygon2 extends Porygon {
	
	public Porygon2(String name, int level) {
		super(name, level);
		
		super.setType(Type.NORMAL);
		super.setStats(85, 80, 90, 105, 95, 60);
		
		DoubleTeam doubleteam = new DoubleTeam(0, 100);
		AerialAce aerialace = new AerialAce(60, Double.POSITIVE_INFINITY);
		DefenseCurl defensecurl = new DefenseCurl(0, 100);
		
		super.setMove(aerialace, doubleteam, defensecurl);
		
	}

}
