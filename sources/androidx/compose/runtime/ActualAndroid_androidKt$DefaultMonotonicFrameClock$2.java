package androidx.compose.runtime;

import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes.dex */
final class ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 extends AbstractC3293z implements Function0 {
    public static final ActualAndroid_androidKt$DefaultMonotonicFrameClock$2 INSTANCE = new ActualAndroid_androidKt$DefaultMonotonicFrameClock$2();

    ActualAndroid_androidKt$DefaultMonotonicFrameClock$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final MonotonicFrameClock invoke() {
        return Looper.getMainLooper() != null ? DefaultChoreographerFrameClock.INSTANCE : SdkStubsFallbackFrameClock.INSTANCE;
    }
}
