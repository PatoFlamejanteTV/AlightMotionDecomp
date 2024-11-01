package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import androidx.arch.core.executor.ArchTaskExecutor;
import j$.time.Duration;
import kotlin.jvm.internal.AbstractC3292y;
import q6.AbstractC3823h;
import q6.InterfaceC3813L;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class FlowLiveDataConversions {
    public static final <T> InterfaceC3821f asFlow(LiveData<T> liveData) {
        AbstractC3292y.i(liveData, "<this>");
        return AbstractC3823h.n(AbstractC3823h.e(new FlowLiveDataConversions$asFlow$1(liveData, null)));
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC3821f interfaceC3821f) {
        AbstractC3292y.i(interfaceC3821f, "<this>");
        return asLiveData$default(interfaceC3821f, (U5.g) null, 0L, 3, (Object) null);
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC3821f interfaceC3821f, U5.g gVar, long j8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            gVar = U5.h.f10149a;
        }
        if ((i8 & 2) != 0) {
            j8 = 5000;
        }
        return asLiveData(interfaceC3821f, gVar, j8);
    }

    public static final <T> LiveData<T> asLiveData(InterfaceC3821f interfaceC3821f, U5.g context) {
        AbstractC3292y.i(interfaceC3821f, "<this>");
        AbstractC3292y.i(context, "context");
        return asLiveData$default(interfaceC3821f, context, 0L, 2, (Object) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> LiveData<T> asLiveData(InterfaceC3821f interfaceC3821f, U5.g context, long j8) {
        AbstractC3292y.i(interfaceC3821f, "<this>");
        AbstractC3292y.i(context, "context");
        ComputableLiveData$_liveData$1 computableLiveData$_liveData$1 = (LiveData<T>) CoroutineLiveDataKt.liveData(context, j8, new FlowLiveDataConversions$asLiveData$1(interfaceC3821f, null));
        if (interfaceC3821f instanceof InterfaceC3813L) {
            if (ArchTaskExecutor.getInstance().isMainThread()) {
                computableLiveData$_liveData$1.setValue(((InterfaceC3813L) interfaceC3821f).getValue());
            } else {
                computableLiveData$_liveData$1.postValue(((InterfaceC3813L) interfaceC3821f).getValue());
            }
        }
        return computableLiveData$_liveData$1;
    }

    public static /* synthetic */ LiveData asLiveData$default(InterfaceC3821f interfaceC3821f, Duration duration, U5.g gVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            gVar = U5.h.f10149a;
        }
        return asLiveData(interfaceC3821f, duration, gVar);
    }

    @RequiresApi(26)
    public static final <T> LiveData<T> asLiveData(InterfaceC3821f interfaceC3821f, Duration timeout, U5.g context) {
        AbstractC3292y.i(interfaceC3821f, "<this>");
        AbstractC3292y.i(timeout, "timeout");
        AbstractC3292y.i(context, "context");
        return asLiveData(interfaceC3821f, context, Api26Impl.INSTANCE.toMillis(timeout));
    }
}
