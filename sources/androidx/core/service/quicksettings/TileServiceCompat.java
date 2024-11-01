package androidx.core.service.quicksettings;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.service.quicksettings.TileService;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* loaded from: classes3.dex */
public class TileServiceCompat {
    private static TileServiceWrapper sTileServiceWrapper;

    @RequiresApi(24)
    /* loaded from: classes3.dex */
    private static class Api24Impl {
        private Api24Impl() {
        }

        @DoNotInline
        static void startActivityAndCollapse(TileService tileService, Intent intent) {
            tileService.startActivityAndCollapse(intent);
        }
    }

    @RequiresApi(34)
    /* loaded from: classes3.dex */
    private static class Api34Impl {
        private Api34Impl() {
        }

        @DoNotInline
        static void startActivityAndCollapse(TileService tileService, PendingIntent pendingIntent) {
            tileService.startActivityAndCollapse(pendingIntent);
        }
    }

    /* loaded from: classes3.dex */
    interface TileServiceWrapper {
        void startActivityAndCollapse(PendingIntent pendingIntent);

        void startActivityAndCollapse(Intent intent);
    }

    private TileServiceCompat() {
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void clearTileServiceWrapper() {
        sTileServiceWrapper = null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static void setTileServiceWrapper(@NonNull TileServiceWrapper tileServiceWrapper) {
        sTileServiceWrapper = tileServiceWrapper;
    }

    public static void startActivityAndCollapse(@NonNull TileService tileService, @NonNull PendingIntentActivityWrapper pendingIntentActivityWrapper) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 34) {
            TileServiceWrapper tileServiceWrapper = sTileServiceWrapper;
            if (tileServiceWrapper != null) {
                tileServiceWrapper.startActivityAndCollapse(pendingIntentActivityWrapper.getPendingIntent());
                return;
            } else {
                Api34Impl.startActivityAndCollapse(tileService, pendingIntentActivityWrapper.getPendingIntent());
                return;
            }
        }
        if (i8 >= 24) {
            TileServiceWrapper tileServiceWrapper2 = sTileServiceWrapper;
            if (tileServiceWrapper2 != null) {
                tileServiceWrapper2.startActivityAndCollapse(pendingIntentActivityWrapper.getIntent());
            } else {
                Api24Impl.startActivityAndCollapse(tileService, pendingIntentActivityWrapper.getIntent());
            }
        }
    }
}
