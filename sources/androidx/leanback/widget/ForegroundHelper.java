package androidx.leanback.widget;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

/* loaded from: classes3.dex */
final class ForegroundHelper {
    private ForegroundHelper() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Drawable getForeground(View view) {
        Drawable foreground;
        if (Build.VERSION.SDK_INT >= 23) {
            foreground = view.getForeground();
            return foreground;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setForeground(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setForeground(drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean supportsForeground() {
        if (Build.VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }
}
