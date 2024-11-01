package androidx.compose.ui.text.font;

import Q5.I;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.platform.SynchronizedObject;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TypefaceRequestCache$runCached$currentTypefaceResult$1 extends AbstractC3293z implements Function1 {
    final /* synthetic */ TypefaceRequest $typefaceRequest;
    final /* synthetic */ TypefaceRequestCache this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TypefaceRequestCache$runCached$currentTypefaceResult$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest) {
        super(1);
        this.this$0 = typefaceRequestCache;
        this.$typefaceRequest = typefaceRequest;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((TypefaceResult) obj);
        return I.f8786a;
    }

    public final void invoke(TypefaceResult typefaceResult) {
        LruCache lruCache;
        LruCache lruCache2;
        SynchronizedObject lock$ui_text_release = this.this$0.getLock$ui_text_release();
        TypefaceRequestCache typefaceRequestCache = this.this$0;
        TypefaceRequest typefaceRequest = this.$typefaceRequest;
        synchronized (lock$ui_text_release) {
            try {
                if (typefaceResult.getCacheable()) {
                    lruCache2 = typefaceRequestCache.resultCache;
                    lruCache2.put(typefaceRequest, typefaceResult);
                } else {
                    lruCache = typefaceRequestCache.resultCache;
                    lruCache.remove(typefaceRequest);
                }
                I i8 = I.f8786a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
