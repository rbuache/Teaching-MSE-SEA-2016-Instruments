package ch.heigvd.res.lab00;

public class Trumpet implements IInstrument {

	public String play() {
		return new String("pouet");
	}

	public int getSoundVolume() {
		return 100;
	}

	public String getColor() {
		return new String ("golden");
	}
}
