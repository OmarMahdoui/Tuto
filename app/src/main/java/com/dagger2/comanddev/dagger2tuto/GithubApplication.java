package com.dagger2.comanddev.dagger2tuto;

import android.app.Activity;
import android.app.Application;

import com.dagger2.comanddev.dagger2tuto.network.GithubService;
import com.squareup.picasso.Picasso;

import timber.log.Timber;

public class GithubApplication extends Application {

    private GithubApplicationComponent component;

    public static GithubApplication get(Activity activity) {
        return (GithubApplication) activity.getApplication();
    }

    private GithubService githubService;

    private Picasso picasso;

    @Override
    public void onCreate() {
        super.onCreate();

        Timber.plant(new Timber.DebugTree());

        githubService = component.getGithubService();
        picasso = component.getPicasso();
    }

    public GithubApplicationComponent component() {
        return component;
    }
}