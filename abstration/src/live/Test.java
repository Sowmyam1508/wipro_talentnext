package live;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Veena v = new Veena();
		v.play();
		Saxophone s = new Saxophone();
		s.play();
		Playable playVeena = new Veena();
		playVeena.play();
		Playable playSaxophone = new Saxophone();
		playSaxophone.play();
	}

}