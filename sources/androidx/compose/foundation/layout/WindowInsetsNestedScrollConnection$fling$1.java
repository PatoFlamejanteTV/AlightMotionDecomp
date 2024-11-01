package androidx.compose.foundation.layout;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.layout.WindowInsetsNestedScrollConnection", f = "WindowInsetsConnection.android.kt", l = {320, 346, 371}, m = "fling-huYlsQE")
/* loaded from: classes.dex */
public final class WindowInsetsNestedScrollConnection$fling$1 extends kotlin.coroutines.jvm.internal.d {
    float F$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WindowInsetsNestedScrollConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInsetsNestedScrollConnection$fling$1(WindowInsetsNestedScrollConnection windowInsetsNestedScrollConnection, U5.d dVar) {
        super(dVar);
        this.this$0 = windowInsetsNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object m652flinghuYlsQE;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        m652flinghuYlsQE = this.this$0.m652flinghuYlsQE(0L, 0.0f, false, this);
        return m652flinghuYlsQE;
    }
}
