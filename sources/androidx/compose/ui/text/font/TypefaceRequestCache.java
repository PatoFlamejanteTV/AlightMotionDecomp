package androidx.compose.ui.text.font;

import Q5.I;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.caches.LruCache;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.Synchronization_jvmKt;
import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.jvm.functions.Function1;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TypefaceRequestCache {
    public static final int $stable = 8;
    private final SynchronizedObject lock = Synchronization_jvmKt.createSynchronizedObject();
    private final LruCache<TypefaceRequest, TypefaceResult> resultCache = new LruCache<>(16);

    public final TypefaceResult get$ui_text_release(TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        synchronized (this.lock) {
            typefaceResult = this.resultCache.get(typefaceRequest);
        }
        return typefaceResult;
    }

    public final SynchronizedObject getLock$ui_text_release() {
        return this.lock;
    }

    public final int getSize$ui_text_release() {
        int size;
        synchronized (this.lock) {
            size = this.resultCache.size();
        }
        return size;
    }

    public final void preWarmCache(List<TypefaceRequest> list, Function1 function1) {
        TypefaceResult typefaceResult;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            TypefaceRequest typefaceRequest = list.get(i8);
            synchronized (this.lock) {
                typefaceResult = this.resultCache.get(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult typefaceResult2 = (TypefaceResult) function1.invoke(typefaceRequest);
                    if (typefaceResult2 instanceof TypefaceResult.Async) {
                        continue;
                    } else {
                        synchronized (this.lock) {
                            this.resultCache.put(typefaceRequest, typefaceResult2);
                        }
                    }
                } catch (Exception e8) {
                    throw new IllegalStateException("Could not load font", e8);
                }
            }
        }
    }

    public final State<Object> runCached(TypefaceRequest typefaceRequest, Function1 function1) {
        synchronized (this.lock) {
            TypefaceResult typefaceResult = this.resultCache.get(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
                this.resultCache.remove(typefaceRequest);
            }
            try {
                TypefaceResult typefaceResult2 = (TypefaceResult) function1.invoke(new TypefaceRequestCache$runCached$currentTypefaceResult$1(this, typefaceRequest));
                synchronized (this.lock) {
                    try {
                        if (this.resultCache.get(typefaceRequest) == null && typefaceResult2.getCacheable()) {
                            this.resultCache.put(typefaceRequest, typefaceResult2);
                        }
                        I i8 = I.f8786a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return typefaceResult2;
            } catch (Exception e8) {
                throw new IllegalStateException("Could not load font", e8);
            }
        }
    }
}
