package pokemons;

import moves_porygon.AerialAce;
import moves_porygon2.DefenseCurl;
import moves_porygon_z.Psybeam;
import moves_tyrogue.DoubleTeam;
import ru.ifmo.se.pokemon.Type;

public class Porygon_Z extends Porygon2 {
	
	public Porygon_Z (String name, int level) {
		
		super(name, level);
		super.setType(Type.NORMAL);
		super.setStats(85, 80, 70, 135, 75, 90);
		
		DoubleTeam doubleteam = new DoubleTeam(0, 100);
		AerialAce aerialace = new AerialAce(60, Double.POSITIVE_INFINITY);
		DefenseCurl defensecurl = new DefenseCurl(0, 100);
		Psybeam psybeam = new Psybeam(65, 100);
		
		super.setMove(aerialace, doubleteam, defensecurl, psybeam);
		
	}

}
