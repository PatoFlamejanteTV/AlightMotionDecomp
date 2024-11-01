package android.support.v4.media;

import android.media.MediaMetadata;
import android.os.Parcel;

/* loaded from: classes.dex */
abstract class g {
    public static void a(Object obj, Parcel parcel, int i8) {
        ((MediaMetadata) obj).writeToParcel(parcel, i8);
    }
}
