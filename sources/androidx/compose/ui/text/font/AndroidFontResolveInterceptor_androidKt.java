package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;

/* loaded from: classes.dex */
public final class AndroidFontResolveInterceptor_androidKt {
    public static final AndroidFontResolveInterceptor AndroidFontResolveInterceptor(Context context) {
        int i8;
        if (Build.VERSION.SDK_INT >= 31) {
            i8 = context.getResources().getConfiguration().fontWeightAdjustment;
        } else {
            i8 = 0;
        }
        return new AndroidFontResolveInterceptor(i8);
    }
}
