package androidx.core.widget;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public interface AutoSizeableTextView {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public static final boolean PLATFORM_SUPPORTS_AUTOSIZE;

    static {
        boolean z8;
        if (Build.VERSION.SDK_INT >= 27) {
            z8 = true;
        } else {
            z8 = false;
        }
        PLATFORM_SUPPORTS_AUTOSIZE = z8;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@NonNull int[] iArr, int i8) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i8);
}
