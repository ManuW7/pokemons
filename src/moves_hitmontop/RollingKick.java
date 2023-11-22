package moves_hitmontop;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class RollingKick extends PhysicalMove {
	
	public RollingKick(double pow, double acc) {
		super(Type.FIGHTING, pow, acc);
		
	}
	
	@Override
	protected void applyOppEffects(Pokemon p) {
		super.applyOppEffects(p);
		
		if (0.3 > Math.random()) {
			Effect.flinch(p);
			}
		
	}
	
	@Override
	protected String describe() {
		return "применяет RollingKick";
	}

}
