package com.google.android.gms.internal.measurement;

import java.net.URL;
import java.net.URLConnection;

/* loaded from: classes3.dex */
final class C0 extends D0 {
    @Override // com.google.android.gms.internal.measurement.D0
    public final URLConnection b(URL url, String str) {
        return url.openConnection();
    }

    private C0() {
    }
}
