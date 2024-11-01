package androidx.compose.material3;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material3.AppBarKt", f = "AppBar.kt", l = {1577, 1593}, m = "settleAppBar")
/* loaded from: classes.dex */
public final class AppBarKt$settleAppBar$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AppBarKt$settleAppBar$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        obj2 = AppBarKt.settleAppBar(null, 0.0f, null, null, this);
        return obj2;
    }
}
