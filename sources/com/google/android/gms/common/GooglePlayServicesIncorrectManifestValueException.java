package com.google.android.gms.common;

import N.C1345h;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes3.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    public GooglePlayServicesIncorrectManifestValueException(int i8) {
        super(i8, "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected " + C1345h.f6365a + " but found " + i8 + ".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
    }
}
