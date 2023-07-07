package foo;

public class MusicPlayer implements Soundable{
	@Override
	public void play() {
		System.out.println("Play Of MusicPlayer");	
		System.out.println("Volume="+volume);
	}

	@Override
	public void pause() {
		System.out.println("Pause Of MusicPlayer");		
	}

	@Override
	public void stop() {
		System.out.println("Stop Of MusicPlayer");		
	}
	public void recordMusic() {
		System.out.println("Record Music....");
	}
}
