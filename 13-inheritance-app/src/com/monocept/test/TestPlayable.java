package com.monocept.test;

import com.monocept.model.Audio;
import com.monocept.model.Playable;
import com.monocept.model.Video;

public class TestPlayable {
	public static void main(String[] args) {

		Playable audioPlayable = new Audio("Believer");

		audioPlayable.play();
		audioPlayable.pause();
		audioPlayable.stop();

		Playable videoPlayable = new Video("Pushpa", 720);

		videoPlayable.play();
		videoPlayable.pause();
		videoPlayable.stop();
	}
}
