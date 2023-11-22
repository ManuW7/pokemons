package moves_tyrogue;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class DoubleTeam extends StatusMove {
	
	public DoubleTeam(double pow, double acc) {
		super(Type.NORMAL, pow, acc);
		
	}
	
	@Override
	protected void applySelfEffects(Pokemon p) {
		super.applySelfEffects(p);
		
		Effect e = new Effect().stat(Stat.EVASION, 1);
		
		p.addEffect(e);
	}
	
	@Override
	protected String describe() {
		return "применяет Double Team";
	}

}
