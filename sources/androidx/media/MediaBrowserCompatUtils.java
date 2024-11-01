package androidx.media;

import android.os.Bundle;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class MediaBrowserCompatUtils {
    private MediaBrowserCompatUtils() {
    }

    public static boolean areSameOptions(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle == null) {
            if (bundle2.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        }
        if (bundle2 == null) {
            if (bundle.getInt("android.media.browse.extra.PAGE", -1) == -1 && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == -1) {
                return true;
            }
            return false;
        }
        if (bundle.getInt("android.media.browse.extra.PAGE", -1) == bundle2.getInt("android.media.browse.extra.PAGE", -1) && bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1) == bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1)) {
            return true;
        }
        return false;
    }

    public static boolean hasDuplicatedItems(Bundle bundle, Bundle bundle2) {
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        if (bundle == null) {
            i8 = -1;
        } else {
            i8 = bundle.getInt("android.media.browse.extra.PAGE", -1);
        }
        if (bundle2 == null) {
            i9 = -1;
        } else {
            i9 = bundle2.getInt("android.media.browse.extra.PAGE", -1);
        }
        if (bundle == null) {
            i10 = -1;
        } else {
            i10 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        if (bundle2 == null) {
            i11 = -1;
        } else {
            i11 = bundle2.getInt("android.media.browse.extra.PAGE_SIZE", -1);
        }
        int i15 = Integer.MAX_VALUE;
        if (i8 != -1 && i10 != -1) {
            i13 = i8 * i10;
            i12 = (i10 + i13) - 1;
        } else {
            i12 = Integer.MAX_VALUE;
            i13 = 0;
        }
        if (i9 != -1 && i11 != -1) {
            i14 = i9 * i11;
            i15 = (i11 + i14) - 1;
        } else {
            i14 = 0;
        }
        if (i12 < i14 || i15 < i13) {
            return false;
        }
        return true;
    }
}
