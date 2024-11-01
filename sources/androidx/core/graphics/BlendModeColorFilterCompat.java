package androidx.core.graphics;

import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.BlendModeUtils;

/* loaded from: classes3.dex */
public class BlendModeColorFilterCompat {

    @RequiresApi(29)
    /* loaded from: classes3.dex */
    static class Api29Impl {
        private Api29Impl() {
        }

        @DoNotInline
        static ColorFilter createBlendModeColorFilter(int i8, Object obj) {
            return new BlendModeColorFilter(i8, (BlendMode) obj);
        }
    }

    private BlendModeColorFilterCompat() {
    }

    @Nullable
    public static ColorFilter createBlendModeColorFilterCompat(int i8, @NonNull BlendModeCompat blendModeCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object obtainBlendModeFromCompat = BlendModeUtils.Api29Impl.obtainBlendModeFromCompat(blendModeCompat);
            if (obtainBlendModeFromCompat == null) {
                return null;
            }
            return Api29Impl.createBlendModeColorFilter(i8, obtainBlendModeFromCompat);
        }
        PorterDuff.Mode obtainPorterDuffFromCompat = BlendModeUtils.obtainPorterDuffFromCompat(blendModeCompat);
        if (obtainPorterDuffFromCompat == null) {
            return null;
        }
        return new PorterDuffColorFilter(i8, obtainPorterDuffFromCompat);
    }
}
