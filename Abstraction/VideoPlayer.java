package Abstraction;

public  class VideoPlayer implements MediaPlayable {

	@Override
	public void play() {
		System.out.println(" video is now playing ");
		
	}

	@Override
	public void pause() {
		System.out.println(" video is paused ");
		
	}

	@Override
	public void stop() {
		System.out.println(" video is playback stopped ");

	}

}
