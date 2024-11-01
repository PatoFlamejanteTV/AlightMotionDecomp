package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import c6.InterfaceC2072n;
import j$.time.Duration;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.C3445b0;

/* loaded from: classes3.dex */
public final class CoroutineLiveDataKt {
    public static final long DEFAULT_TIMEOUT = 5000;

    public static final <T> Object addDisposableSource(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.c().G(), new CoroutineLiveDataKt$addDisposableSource$2(mediatorLiveData, liveData, null), dVar);
    }

    public static final <T> LiveData<T> liveData(U5.g context, InterfaceC2072n block) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(block, "block");
        return liveData$default(context, 0L, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(U5.g gVar, long j8, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = U5.h.f10149a;
        }
        if ((i8 & 2) != 0) {
            j8 = 5000;
        }
        return liveData(gVar, j8, interfaceC2072n);
    }

    public static final <T> LiveData<T> liveData(InterfaceC2072n block) {
        AbstractC3292y.i(block, "block");
        return liveData$default((U5.g) null, 0L, block, 3, (Object) null);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, InterfaceC2072n block) {
        AbstractC3292y.i(timeout, "timeout");
        AbstractC3292y.i(block, "block");
        return liveData$default(timeout, (U5.g) null, block, 2, (Object) null);
    }

    public static /* synthetic */ LiveData liveData$default(Duration duration, U5.g gVar, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            gVar = U5.h.f10149a;
        }
        return liveData(duration, gVar, interfaceC2072n);
    }

    public static final <T> LiveData<T> liveData(U5.g context, long j8, InterfaceC2072n block) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(block, "block");
        return new CoroutineLiveData(context, j8, block);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> liveData(Duration timeout, U5.g context, InterfaceC2072n block) {
        AbstractC3292y.i(timeout, "timeout");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(block, "block");
        return new CoroutineLiveData(context, Api26Impl.INSTANCE.toMillis(timeout), block);
    }
}
