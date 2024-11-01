package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.core.content.res.ResourcesCompat;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidFontResourceLoader implements Font.ResourceLoader {
    public static final int $stable = 8;
    private final Context context;

    public AndroidFontResourceLoader(Context context) {
        this.context = context;
    }

    @Override // androidx.compose.ui.text.font.Font.ResourceLoader
    public Typeface load(Font font) {
        if (font instanceof ResourceFont) {
            if (Build.VERSION.SDK_INT >= 26) {
                return AndroidFontResourceLoaderHelper.INSTANCE.create(this.context, ((ResourceFont) font).getResId());
            }
            Typeface font2 = ResourcesCompat.getFont(this.context, ((ResourceFont) font).getResId());
            AbstractC3292y.f(font2);
            return font2;
        }
        throw new IllegalArgumentException("Unknown font type: " + font);
    }
}
