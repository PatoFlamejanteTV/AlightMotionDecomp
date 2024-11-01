package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes.dex */
public final class CursorWindowCompat {

    @RequiresApi(28)
    /* loaded from: classes.dex */
    static class Api28Impl {
        private Api28Impl() {
        }

        @DoNotInline
        static CursorWindow createCursorWindow(String str, long j8) {
            return new CursorWindow(str, j8);
        }
    }

    private CursorWindowCompat() {
    }

    @NonNull
    public static CursorWindow create(@Nullable String str, long j8) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.createCursorWindow(str, j8);
        }
        return new CursorWindow(str);
    }
}
