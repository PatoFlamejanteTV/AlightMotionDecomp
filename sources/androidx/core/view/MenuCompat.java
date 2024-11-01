package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.core.internal.view.SupportMenu;

/* loaded from: classes3.dex */
public final class MenuCompat {

    @RequiresApi(28)
    /* loaded from: classes3.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static void setGroupDividerEnabled(Menu menu, boolean z8) {
            menu.setGroupDividerEnabled(z8);
        }
    }

    private MenuCompat() {
    }

    public static void setGroupDividerEnabled(@NonNull Menu menu, boolean z8) {
        if (menu instanceof SupportMenu) {
            ((SupportMenu) menu).setGroupDividerEnabled(z8);
        } else if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.setGroupDividerEnabled(menu, z8);
        }
    }

    @Deprecated
    public static void setShowAsAction(MenuItem menuItem, int i8) {
        menuItem.setShowAsAction(i8);
    }
}
