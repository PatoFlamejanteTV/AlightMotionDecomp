package androidx.core.view;

import android.graphics.Rect;
import android.view.Gravity;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public final class GravityCompat {
    public static final int END = 8388613;
    public static final int RELATIVE_HORIZONTAL_GRAVITY_MASK = 8388615;
    public static final int RELATIVE_LAYOUT_DIRECTION = 8388608;
    public static final int START = 8388611;

    private GravityCompat() {
    }

    public static void apply(int i8, int i9, int i10, @NonNull Rect rect, @NonNull Rect rect2, int i11) {
        Gravity.apply(i8, i9, i10, rect, rect2, i11);
    }

    public static void applyDisplay(int i8, @NonNull Rect rect, @NonNull Rect rect2, int i9) {
        Gravity.applyDisplay(i8, rect, rect2, i9);
    }

    public static int getAbsoluteGravity(int i8, int i9) {
        return Gravity.getAbsoluteGravity(i8, i9);
    }

    public static void apply(int i8, int i9, int i10, @NonNull Rect rect, int i11, int i12, @NonNull Rect rect2, int i13) {
        Gravity.apply(i8, i9, i10, rect, i11, i12, rect2, i13);
    }
}
