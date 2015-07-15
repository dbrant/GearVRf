/* Copyright 2015 Samsung Electronics Co., LTD
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

package org.gearvrf.gvrexposeapisample;

import org.gearvrf.GVRActivity;
import org.gearvrf.utility.VrAppSettings;

import android.os.Bundle;
import android.view.MotionEvent;

public class SampleActivity extends GVRActivity {

    SampleCubeScript script = new SampleCubeScript();

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setScript(script, "gvr_note4.xml");
    }


    @Override
    protected void onInitAppSettings(VrAppSettings appSettings){
        appSettings.getEyeBufferParms().setMultiSamples(1);
    }
}
