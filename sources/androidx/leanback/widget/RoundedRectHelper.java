package androidx.leanback.widget;

import android.view.View;
import androidx.leanback.R;

/* loaded from: classes3.dex */
final class RoundedRectHelper {
    private RoundedRectHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setClipToRoundedOutline(View view, boolean z8, int i8) {
        RoundedRectHelperApi21.setClipToRoundedOutline(view, z8, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean supportsRoundedCorner() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setClipToRoundedOutline(View view, boolean z8) {
        RoundedRectHelperApi21.setClipToRoundedOutline(view, z8, view.getResources().getDimensionPixelSize(R.dimen.lb_rounded_rect_corner_radius));
    }
}
