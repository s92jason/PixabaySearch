package com.jasonchen.gogolooksearch.di.module;

import com.jasonchen.gogolooksearch.view.ui.main.SearchFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = FragmentModule_ContributesSearchFragment.SearchFragmentSubcomponent.class)
public abstract class FragmentModule_ContributesSearchFragment {
  private FragmentModule_ContributesSearchFragment() {}

  @Binds
  @IntoMap
  @ClassKey(SearchFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      SearchFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface SearchFragmentSubcomponent extends AndroidInjector<SearchFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<SearchFragment> {}
  }
}
