package androidx.compose.ui.text.font;

import android.content.Context;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import java.io.File;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class AndroidFileFont extends AndroidPreloadedFont {
    public static final int $stable = 0;
    private final String cacheKey;
    private final File file;

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i8, FontVariation.Settings settings, AbstractC3284p abstractC3284p) {
        this(file, fontWeight, i8, settings);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public android.graphics.Typeface doLoad$ui_text_release(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return TypefaceBuilderCompat.INSTANCE.createFromFile(this.file, context, getVariationSettings());
        }
        return android.graphics.Typeface.createFromFile(this.file);
    }

    @Override // androidx.compose.ui.text.font.AndroidPreloadedFont
    public String getCacheKey() {
        return this.cacheKey;
    }

    public final File getFile() {
        return this.file;
    }

    public String toString() {
        return "Font(file=" + this.file + ", weight=" + getWeight() + ", style=" + ((Object) FontStyle.m4781toStringimpl(mo4735getStyle_LCdwA())) + ')';
    }

    public /* synthetic */ AndroidFileFont(File file, FontWeight fontWeight, int i8, FontVariation.Settings settings, int i9, AbstractC3284p abstractC3284p) {
        this(file, (i9 & 2) != 0 ? FontWeight.Companion.getNormal() : fontWeight, (i9 & 4) != 0 ? FontStyle.Companion.m4786getNormal_LCdwA() : i8, settings, null);
    }

    private AndroidFileFont(File file, FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        super(fontWeight, i8, settings, null);
        this.file = file;
        setTypeface$ui_text_release(doLoad$ui_text_release(null));
    }
}
