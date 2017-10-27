package com.dagger2.comanddev.dagger2tuto;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

@Scope
@Retention(RetentionPolicy.CLASS)
public @interface GithubApplicationScope {
}
