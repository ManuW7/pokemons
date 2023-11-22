package moves_castform;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Thunderbolt extends SpecialMove {
	
	public Thunderbolt(double pow, double acc) {
		super(Type.ELECTRIC, pow, acc);
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		if (0.1 > Math.random()) {
			Effect.paralyze(p);
			}
		
	}
	
	@Override
	protected String describe() {
		return "применяет Thunderbolt";
	}

}
