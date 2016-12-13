/*
 * Copyright 2016 Stormpath, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stormpath.sdk.impl.resource;

/**
 * @since 1.2.0
 */
public class ParentAwareObjectProperty<T, P> extends Property<T> {

    private final Class<P> parentType;

    public ParentAwareObjectProperty(String name, Class<T> type, Class<P> parentType) {
        super(name, type);
        this.parentType = parentType;
    }

    public Class<P> getParentType() {
        return parentType;
    }
}