package com.monocept.model;

public class Audio extends Playable {

	private String title;

	public Audio(String title) {
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println("Audio is playing: " + title);
	}

	@Override
	public void pause() {
		System.out.println("Audio is Paused: " + title);
	}

	@Override
	public void stop() {
		System.out.println("Audio is Stopped: " + title);
	}

}
