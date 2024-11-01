package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

@RequiresApi(26)
/* loaded from: classes.dex */
final class AndroidResourceFontLoaderHelper {
    public static final AndroidResourceFontLoaderHelper INSTANCE = new AndroidResourceFontLoaderHelper();

    private AndroidResourceFontLoaderHelper() {
    }

    @DoNotInline
    @RequiresApi(26)
    public final Typeface create(Context context, int i8) {
        Typeface font;
        font = context.getResources().getFont(i8);
        return font;
    }
}
