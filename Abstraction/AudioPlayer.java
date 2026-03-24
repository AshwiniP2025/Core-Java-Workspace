package Abstraction;

public class AudioPlayer implements MediaPlayable {

	@Override
	public void play() {
		System.out.println(" Audio is now playing ");
		
	}

	@Override
	public void pause() {
		System.out.println(" Audio is paused ");
		
	}

	@Override
	public void stop() {
		System.out.println(" Audio is playback stopped ");
		
	}

}
