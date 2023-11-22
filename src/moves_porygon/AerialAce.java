package moves_porygon;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class AerialAce extends PhysicalMove {
	
	public AerialAce(double pow, double acc) {
		super(Type.FLYING, pow, acc);
		
	}
	
	@Override
	protected String describe() {
		return "применяет AerialAce";
	}

}
