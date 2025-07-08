package com.monocept.model;

public class Video implements Playable {

	private int resolution;
	private String title;

	public Video(String title, int resolution) {
		this.resolution = resolution;
		this.title = title;
	}

	@Override
	public void play() {
		System.out.println("Video is Playing. Resolution is: " + resolution + " Title is: " + title);
	}

	@Override
	public void pause() {
		System.out.println("Video is Paused. Resolution is: " + resolution + " Title is: " + title);
	}

	@Override
	public void stop() {
		System.out.println("Video is Stopped. Resolution is: " + resolution + " Title is: " + title);
	}

}
