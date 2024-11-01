package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class AndroidPreloadedFont extends AndroidFont {
    public static final int $stable = 0;
    private boolean didInitWithContext;
    private final int style;
    private android.graphics.Typeface typeface;
    private final FontWeight weight;

    public /* synthetic */ AndroidPreloadedFont(FontWeight fontWeight, int i8, FontVariation.Settings settings, AbstractC3284p abstractC3284p) {
        this(fontWeight, i8, settings);
    }

    public abstract android.graphics.Typeface doLoad$ui_text_release(Context context);

    public abstract String getCacheKey();

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getStyle-_-LCdwA, reason: not valid java name */
    public final int mo4735getStyle_LCdwA() {
        return this.style;
    }

    public final android.graphics.Typeface getTypeface$ui_text_release() {
        return this.typeface;
    }

    @Override // androidx.compose.ui.text.font.Font
    public final FontWeight getWeight() {
        return this.weight;
    }

    public final android.graphics.Typeface loadCached$ui_text_release(Context context) {
        if (!this.didInitWithContext && this.typeface == null) {
            this.typeface = doLoad$ui_text_release(context);
        }
        this.didInitWithContext = true;
        return this.typeface;
    }

    public final void setTypeface$ui_text_release(android.graphics.Typeface typeface) {
        this.typeface = typeface;
    }

    private AndroidPreloadedFont(FontWeight fontWeight, int i8, FontVariation.Settings settings) {
        super(FontLoadingStrategy.Companion.m4771getBlockingPKNRLFQ(), AndroidPreloadedFontTypefaceLoader.INSTANCE, settings, null);
        this.weight = fontWeight;
        this.style = i8;
    }
}
