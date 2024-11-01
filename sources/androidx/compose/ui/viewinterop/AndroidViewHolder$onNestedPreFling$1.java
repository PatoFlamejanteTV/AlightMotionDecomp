package androidx.compose.ui.viewinterop;

import Q5.I;
import Q5.t;
import U5.d;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;

@f(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {578}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class AndroidViewHolder$onNestedPreFling$1 extends l implements InterfaceC2072n {
    final /* synthetic */ long $toBeConsumed;
    int label;
    final /* synthetic */ AndroidViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidViewHolder$onNestedPreFling$1(AndroidViewHolder androidViewHolder, long j8, d dVar) {
        super(2, dVar);
        this.this$0 = androidViewHolder;
        this.$toBeConsumed = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new AndroidViewHolder$onNestedPreFling$1(this.this$0, this.$toBeConsumed, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        NestedScrollDispatcher nestedScrollDispatcher;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            nestedScrollDispatcher = this.this$0.dispatcher;
            long j8 = this.$toBeConsumed;
            this.label = 1;
            if (nestedScrollDispatcher.m3890dispatchPreFlingQWom1Mo(j8, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((AndroidViewHolder$onNestedPreFling$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
