package moves_porygon_z;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Psybeam extends SpecialMove {
	public Psybeam(double pow, double acc) {
		super(Type.PSYCHIC, pow, acc);
		
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		Effect.confuse(p);
	}
	
	@Override
	protected String describe() {
		return "применяет Psybeam";
	}
	
	

}
