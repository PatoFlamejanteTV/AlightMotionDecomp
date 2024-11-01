package androidx.compose.material.pullrefresh;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.material.pullrefresh.PullRefreshNestedScrollConnection", f = "PullRefresh.kt", l = {117}, m = "onPreFling-QWom1Mo")
/* loaded from: classes.dex */
public final class PullRefreshNestedScrollConnection$onPreFling$1 extends d {
    float F$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PullRefreshNestedScrollConnection this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRefreshNestedScrollConnection$onPreFling$1(PullRefreshNestedScrollConnection pullRefreshNestedScrollConnection, U5.d dVar) {
        super(dVar);
        this.this$0 = pullRefreshNestedScrollConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo434onPreFlingQWom1Mo(0L, this);
    }
}
