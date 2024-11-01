package androidx.compose.ui.platform;

import android.os.Looper;
import android.view.Choreographer;
import androidx.core.os.HandlerCompat;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3293z;
import n6.AbstractC3458i;
import n6.C3445b0;

/* loaded from: classes.dex */
final class AndroidUiDispatcher$Companion$Main$2 extends AbstractC3293z implements Function0 {
    public static final AndroidUiDispatcher$Companion$Main$2 INSTANCE = new AndroidUiDispatcher$Companion$Main$2();

    AndroidUiDispatcher$Companion$Main$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final U5.g invoke() {
        boolean isMainThread;
        isMainThread = AndroidUiDispatcher_androidKt.isMainThread();
        AndroidUiDispatcher androidUiDispatcher = new AndroidUiDispatcher(isMainThread ? Choreographer.getInstance() : (Choreographer) AbstractC3458i.e(C3445b0.c(), new AndroidUiDispatcher$Companion$Main$2$dispatcher$1(null)), HandlerCompat.createAsync(Looper.getMainLooper()), null);
        return androidUiDispatcher.plus(androidUiDispatcher.getFrameClock());
    }
}
