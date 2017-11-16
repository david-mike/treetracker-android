package com.qalliance.treetracker.TreeTracker;

import android.app.Application;

import timber.log.Timber;

public class TreeTrackerApplication extends Application {
	  @Override
	  public void onCreate() {
	    // The following line triggers the initialization of ACRA
	    super.onCreate();

	    if (BuildConfig.DEBUG) {
			  Timber.plant(new Timber.DebugTree());
		  }
	  }

}
