package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes.dex */
final class AndroidFontResourceLoaderHelper {
    public static final AndroidFontResourceLoaderHelper INSTANCE = new AndroidFontResourceLoaderHelper();

    private AndroidFontResourceLoaderHelper() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final Typeface create(Context context, int i8) {
        Typeface font;
        font = context.getResources().getFont(i8);
        return font;
    }
}
