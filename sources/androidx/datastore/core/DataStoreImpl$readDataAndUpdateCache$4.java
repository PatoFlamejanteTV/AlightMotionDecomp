package androidx.datastore.core;

import Q5.I;
import Q5.t;
import Q5.x;
import U5.d;
import V5.b;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4", f = "DataStoreImpl.kt", l = {314, TypedValues.AttributesType.TYPE_EASING}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$readDataAndUpdateCache$4 extends l implements InterfaceC2072n {
    final /* synthetic */ int $cachedVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(DataStoreImpl<T> dataStoreImpl, int i8, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
        this.$cachedVersion = i8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(this.this$0, this.$cachedVersion, dVar);
        dataStoreImpl$readDataAndUpdateCache$4.Z$0 = ((Boolean) obj).booleanValue();
        return dataStoreImpl$readDataAndUpdateCache$4;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Boolean) obj).booleanValue(), (d) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        int i8;
        boolean z8;
        State state;
        boolean z9;
        Object e8 = b.e();
        boolean z10 = this.label;
        try {
        } catch (Throwable th2) {
            if (z10 != 0) {
                InterProcessCoordinator coordinator = this.this$0.getCoordinator();
                this.L$0 = th2;
                this.Z$0 = z10;
                this.label = 2;
                Object version = coordinator.getVersion(this);
                if (version == e8) {
                    return e8;
                }
                z8 = z10;
                th = th2;
                obj = version;
            } else {
                boolean z11 = z10;
                th = th2;
                i8 = this.$cachedVersion;
                z8 = z11;
            }
        }
        if (z10 != 0) {
            if (z10 != 1) {
                if (z10 == 2) {
                    z8 = this.Z$0;
                    th = (Throwable) this.L$0;
                    t.b(obj);
                    i8 = ((Number) obj).intValue();
                    ReadException readException = new ReadException(th, i8);
                    z9 = z8;
                    state = readException;
                    return x.a(state, kotlin.coroutines.jvm.internal.b.a(z9));
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            boolean z12 = this.Z$0;
            t.b(obj);
            z10 = z12;
        } else {
            t.b(obj);
            boolean z13 = this.Z$0;
            DataStoreImpl<T> dataStoreImpl = this.this$0;
            this.Z$0 = z13;
            this.label = 1;
            obj = dataStoreImpl.readDataOrHandleCorruption(z13, this);
            z10 = z13;
            if (obj == e8) {
                return e8;
            }
        }
        state = (State) obj;
        z9 = z10;
        return x.a(state, kotlin.coroutines.jvm.internal.b.a(z9));
    }

    public final Object invoke(boolean z8, d dVar) {
        return ((DataStoreImpl$readDataAndUpdateCache$4) create(Boolean.valueOf(z8), dVar)).invokeSuspend(I.f8786a);
    }
}
