package androidx.compose.ui.res;

import android.content.Context;
import androidx.annotation.GuardedBy;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.AndroidTypeface_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.LoadedFontFamily;
import androidx.compose.ui.text.font.SystemFontFamily;
import androidx.compose.ui.text.font.Typeface;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class FontResources_androidKt {
    private static final Object cacheLock = new Object();

    @GuardedBy("cacheLock")
    private static final Map<FontFamily, Typeface> syncLoadedTypefaces = new LinkedHashMap();

    @Composable
    @ReadOnlyComposable
    public static final Typeface fontResource(FontFamily fontFamily, Composer composer, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-190831095, i8, -1, "androidx.compose.ui.res.fontResource (FontResources.android.kt:53)");
        }
        Typeface fontResourceFromContext = fontResourceFromContext((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), fontFamily);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return fontResourceFromContext;
    }

    private static final Typeface fontResourceFromContext(Context context, FontFamily fontFamily) {
        Typeface typeface;
        if (!(fontFamily instanceof SystemFontFamily) && !(fontFamily instanceof LoadedFontFamily)) {
            return AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
        }
        synchronized (cacheLock) {
            try {
                Map<FontFamily, Typeface> map = syncLoadedTypefaces;
                Typeface typeface2 = map.get(fontFamily);
                if (typeface2 == null) {
                    typeface2 = AndroidTypeface_androidKt.Typeface$default(context, fontFamily, null, 4, null);
                    map.put(fontFamily, typeface2);
                }
                typeface = typeface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return typeface;
    }
}
