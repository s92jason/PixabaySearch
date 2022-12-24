// Generated by Dagger (https://dagger.dev).
package com.jasonchen.gogolooksearch.utils;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPrefUtil_Factory implements Factory<SharedPrefUtil> {
  private final Provider<Context> contextProvider;

  public SharedPrefUtil_Factory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public SharedPrefUtil get() {
    return newInstance(contextProvider.get());
  }

  public static SharedPrefUtil_Factory create(Provider<Context> contextProvider) {
    return new SharedPrefUtil_Factory(contextProvider);
  }

  public static SharedPrefUtil newInstance(Context context) {
    return new SharedPrefUtil(context);
  }
}