package androidx.compose.ui.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TextLayoutCache {
    public static final int $stable = 8;
    private final LruCache<CacheTextLayoutInput, TextLayoutResult> lruCache;

    public TextLayoutCache() {
        this(0, 1, null);
    }

    public final TextLayoutResult get(TextLayoutInput textLayoutInput) {
        TextLayoutResult textLayoutResult = this.lruCache.get(new CacheTextLayoutInput(textLayoutInput));
        if (textLayoutResult == null || textLayoutResult.getMultiParagraph().getIntrinsics().getHasStaleResolvedFonts()) {
            return null;
        }
        return textLayoutResult;
    }

    public final TextLayoutResult put(TextLayoutInput textLayoutInput, TextLayoutResult textLayoutResult) {
        return this.lruCache.put(new CacheTextLayoutInput(textLayoutInput), textLayoutResult);
    }

    public final TextLayoutResult remove(TextLayoutInput textLayoutInput) {
        return this.lruCache.remove(new CacheTextLayoutInput(textLayoutInput));
    }

    public TextLayoutCache(int i8) {
        this.lruCache = new LruCache<>(i8);
    }

    public /* synthetic */ TextLayoutCache(int i8, int i9, AbstractC3284p abstractC3284p) {
        this((i9 & 1) != 0 ? TextMeasurerKt.DefaultCacheSize : i8);
    }
}
