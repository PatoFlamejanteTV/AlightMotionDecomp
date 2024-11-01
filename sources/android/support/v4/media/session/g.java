package android.support.v4.media.session;

import android.media.session.PlaybackState;
import android.os.Bundle;

/* loaded from: classes.dex */
abstract class g {
    public static Bundle a(Object obj) {
        Bundle extras;
        extras = ((PlaybackState) obj).getExtras();
        return extras;
    }
}
