package foo;

public class Mobile implements Soundable, IMyInterfece {

	@Override
	public void play() {
		System.out.println("Play Of Mobile");		
	}

	@Override
	public void pause() {
		System.out.println("Pause Of Mobile");		
	}

	@Override
	public void stop() {
		System.out.println("Stop Of Mobile");		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

}
