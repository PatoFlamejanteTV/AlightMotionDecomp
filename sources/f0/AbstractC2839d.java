package f0;

import android.os.Build;
import androidx.core.view.accessibility.AccessibilityEventCompat;

/* renamed from: f0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2839d {

    /* renamed from: a, reason: collision with root package name */
    public static final int f31816a;

    static {
        int i8;
        if (Build.VERSION.SDK_INT >= 23) {
            i8 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        } else {
            i8 = 0;
        }
        f31816a = i8;
    }
}
