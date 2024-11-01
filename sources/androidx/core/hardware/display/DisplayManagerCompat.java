package androidx.core.hardware.display;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class DisplayManagerCompat {
    public static final String DISPLAY_CATEGORY_PRESENTATION = "android.hardware.display.category.PRESENTATION";
    private final Context mContext;

    private DisplayManagerCompat(Context context) {
        this.mContext = context;
    }

    @NonNull
    public static DisplayManagerCompat getInstance(@NonNull Context context) {
        return new DisplayManagerCompat(context);
    }

    @Nullable
    public Display getDisplay(int i8) {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplay(i8);
    }

    @NonNull
    public Display[] getDisplays() {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }

    @NonNull
    public Display[] getDisplays(@Nullable String str) {
        return ((DisplayManager) this.mContext.getSystemService("display")).getDisplays();
    }
}
