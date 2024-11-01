package androidx.compose.ui.text.font;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.FontVariation;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public abstract class AndroidFont implements Font {
    public static final int $stable = 0;
    private final int loadingStrategy;
    private final TypefaceLoader typefaceLoader;
    private final FontVariation.Settings variationSettings;

    /* loaded from: classes.dex */
    public interface TypefaceLoader {
        Object awaitLoad(Context context, AndroidFont androidFont, U5.d dVar);

        android.graphics.Typeface loadBlocking(Context context, AndroidFont androidFont);
    }

    public /* synthetic */ AndroidFont(int i8, TypefaceLoader typefaceLoader, FontVariation.Settings settings, AbstractC3284p abstractC3284p) {
        this(i8, typefaceLoader, settings);
    }

    @Override // androidx.compose.ui.text.font.Font
    /* renamed from: getLoadingStrategy-PKNRLFQ, reason: not valid java name */
    public final int mo4725getLoadingStrategyPKNRLFQ() {
        return this.loadingStrategy;
    }

    public final TypefaceLoader getTypefaceLoader() {
        return this.typefaceLoader;
    }

    public final FontVariation.Settings getVariationSettings() {
        return this.variationSettings;
    }

    public /* synthetic */ AndroidFont(int i8, TypefaceLoader typefaceLoader, AbstractC3284p abstractC3284p) {
        this(i8, typefaceLoader);
    }

    private AndroidFont(int i8, TypefaceLoader typefaceLoader, FontVariation.Settings settings) {
        this.loadingStrategy = i8;
        this.typefaceLoader = typefaceLoader;
        this.variationSettings = settings;
    }

    private AndroidFont(int i8, TypefaceLoader typefaceLoader) {
        this(i8, typefaceLoader, new FontVariation.Settings(new FontVariation.Setting[0]), null);
    }
}
