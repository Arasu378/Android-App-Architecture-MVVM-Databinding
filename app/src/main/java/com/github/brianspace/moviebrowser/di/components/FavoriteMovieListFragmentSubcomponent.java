/*
 * Copyright (C) 2018, Brian He
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.brianspace.moviebrowser.di.components;

import com.github.brianspace.moviebrowser.ui.fragment.FavoriteMovieListFragment;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Dagger subcomponent for the FavoriteMovieListFragment.
 */
@Subcomponent
public interface FavoriteMovieListFragmentSubcomponent extends AndroidInjector<FavoriteMovieListFragment> {
    @SuppressWarnings({"PMD.AbstractClassWithoutAnyMethod", "PMD.CommentRequired"})
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<FavoriteMovieListFragment> {}
}