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

package com.github.brianspace.moviebrowser.repository.data;

import com.google.gson.annotations.SerializedName;

/**
 * Language.
 */
@SuppressWarnings("PMD.CommentRequired")
public class Language {
    @SerializedName("iso_639_1")
    private String shortName;
    private String name;

    /**
     * Get the short language name.
     * @see <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">List of ISO_639-1 codes</a>
     *
     * @return the language name in ISO 639-1 format.
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Get the language name.
     */
    public String getName() {
        return name;
    }
}
