package ch.heigvd.res.lab00;


public class Flute implements IInstrument {

	public String play() {
		return new String("pouet");
	}

	public int getSoundVolume() {
		return 10;
	}
	
	public String getColor() {
		return new String ("white");
	}
}
