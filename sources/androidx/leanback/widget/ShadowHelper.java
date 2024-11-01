package androidx.leanback.widget;

import android.view.View;

/* loaded from: classes3.dex */
final class ShadowHelper {
    private ShadowHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object addDynamicShadow(View view, float f8, float f9, int i8) {
        return ShadowHelperApi21.addDynamicShadow(view, f8, f9, i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setShadowFocusLevel(Object obj, float f8) {
        ShadowHelperApi21.setShadowFocusLevel(obj, f8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean supportsDynamicShadow() {
        return true;
    }
}
