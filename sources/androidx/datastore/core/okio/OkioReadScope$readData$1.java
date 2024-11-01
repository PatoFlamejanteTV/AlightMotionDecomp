package androidx.datastore.core.okio;

import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.okio.OkioReadScope", f = "OkioStorage.kt", l = {SubsamplingScaleImageView.ORIENTATION_180}, m = "readData$suspendImpl")
/* loaded from: classes3.dex */
public final class OkioReadScope$readData$1<T> extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OkioReadScope<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OkioReadScope$readData$1(OkioReadScope<T> okioReadScope, U5.d dVar) {
        super(dVar);
        this.this$0 = okioReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return OkioReadScope.readData$suspendImpl(this.this$0, this);
    }
}
