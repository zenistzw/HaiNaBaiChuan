/*
 * Copyright 2018 XuJiaji
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.xujiaji.hnbc.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import io.xujiaji.hnbc.app.App;

/**
 * Created by Dmytro Denysenko on 5/6/15.
 */
public class TextViewBoldNew extends TextView {
    public TextViewBoldNew(Context context) {
        this(context, null);
    }

    public TextViewBoldNew(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public TextViewBoldNew(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setTypeface(App.getExtraFont());
        getPaint().setFakeBoldText(true);
    }

}
