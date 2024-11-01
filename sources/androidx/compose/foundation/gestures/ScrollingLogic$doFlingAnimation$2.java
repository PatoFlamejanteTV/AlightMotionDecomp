package androidx.compose.foundation.gestures;

import Q5.I;
import Q5.t;
import androidx.compose.ui.geometry.Offset;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.S;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", l = {500}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScrollingLogic$doFlingAnimation$2 extends l implements InterfaceC2072n {
    final /* synthetic */ long $available;
    final /* synthetic */ S $result;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2(ScrollingLogic scrollingLogic, S s8, long j8, U5.d dVar) {
        super(2, dVar);
        this.this$0 = scrollingLogic;
        this.$result = s8;
        this.$available = j8;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        ScrollingLogic$doFlingAnimation$2 scrollingLogic$doFlingAnimation$2 = new ScrollingLogic$doFlingAnimation$2(this.this$0, this.$result, this.$available, dVar);
        scrollingLogic$doFlingAnimation$2.L$0 = obj;
        return scrollingLogic$doFlingAnimation$2;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ScrollScope scrollScope, U5.d dVar) {
        return ((ScrollingLogic$doFlingAnimation$2) create(scrollScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ScrollingLogic scrollingLogic;
        S s8;
        ScrollingLogic scrollingLogic2;
        long j8;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                j8 = this.J$0;
                s8 = (S) this.L$2;
                scrollingLogic = (ScrollingLogic) this.L$1;
                scrollingLogic2 = (ScrollingLogic) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            final ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 scrollingLogic$doFlingAnimation$2$outerScopeScroll$1 = new ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(this.this$0, (ScrollScope) this.L$0);
            final ScrollingLogic scrollingLogic3 = this.this$0;
            ScrollScope scrollScope = new ScrollScope() { // from class: androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2$scope$1
                @Override // androidx.compose.foundation.gestures.ScrollScope
                public float scrollBy(float f8) {
                    ScrollingLogic scrollingLogic4 = ScrollingLogic.this;
                    return scrollingLogic4.m444toFloatk4lQ0M(((Offset) scrollingLogic$doFlingAnimation$2$outerScopeScroll$1.invoke(Offset.m2701boximpl(scrollingLogic4.m445toOffsettuRUvjQ(f8)))).m2722unboximpl());
                }
            };
            scrollingLogic = this.this$0;
            S s9 = this.$result;
            long j9 = this.$available;
            FlingBehavior flingBehavior = scrollingLogic.getFlingBehavior();
            long j10 = s9.f34572a;
            float reverseIfNeeded = scrollingLogic.reverseIfNeeded(scrollingLogic.m443toFloatTH1AsA0(j9));
            this.L$0 = scrollingLogic;
            this.L$1 = scrollingLogic;
            this.L$2 = s9;
            this.J$0 = j10;
            this.label = 1;
            obj = flingBehavior.performFling(scrollScope, reverseIfNeeded, this);
            if (obj == e8) {
                return e8;
            }
            s8 = s9;
            scrollingLogic2 = scrollingLogic;
            j8 = j10;
        }
        s8.f34572a = scrollingLogic.m446updateQWom1Mo(j8, scrollingLogic2.reverseIfNeeded(((Number) obj).floatValue()));
        return I.f8786a;
    }
}
