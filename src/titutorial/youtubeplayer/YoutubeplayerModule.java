/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package titutorial.youtubeplayer;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.TiApplication;
import org.appcelerator.kroll.common.Log;

import com.keyes.youtube.OpenYouTubePlayerActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

@Kroll.module(name = "Youtubeplayer", id = "titutorial.youtubeplayer")
public class YoutubeplayerModule extends KrollModule {

	// Standard Debugging variables
	private static final String TAG = "YoutubeplayerModule";

	// You can define constants with @Kroll.constant, for example:
	// @Kroll.constant public static final String EXTERNAL_NAME = value;

	public YoutubeplayerModule() {
		super();
	}

	@Kroll.onAppCreate
	public static void onAppCreate(TiApplication app) {
		Log.d(TAG, "inside onAppCreate");
		// put module init code that needs to run when the application is
		// created
	}

	// Methods
	@Kroll.method
	public void playVideo(String videoId) {
		if (videoId == null || videoId.length() == 0) {
			return;
		}

		Activity activity = TiApplication.getAppRootOrCurrentActivity();
		Intent videoIntent = new Intent(null, Uri.parse("ytv://"
				+ videoId.toString()), activity,
				OpenYouTubePlayerActivity.class);
		activity.startActivity(videoIntent);
	}

}
