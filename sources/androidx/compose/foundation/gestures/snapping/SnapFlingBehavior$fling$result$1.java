package androidx.compose.foundation.gestures.snapping;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.compose.foundation.gestures.ScrollScope;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function1;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", l = {133, TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapFlingBehavior$fling$result$1 extends l implements InterfaceC2072n {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ Function1 $onRemainingScrollOffsetUpdate;
    final /* synthetic */ ScrollScope $this_fling;
    int label;
    final /* synthetic */ SnapFlingBehavior this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(float f8, SnapFlingBehavior snapFlingBehavior, ScrollScope scrollScope, Function1 function1, d dVar) {
        super(2, dVar);
        this.$initialVelocity = f8;
        this.this$0 = snapFlingBehavior;
        this.$this_fling = scrollScope;
        this.$onRemainingScrollOffsetUpdate = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new SnapFlingBehavior$fling$result$1(this.$initialVelocity, this.this$0, this.$this_fling, this.$onRemainingScrollOffsetUpdate, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        float f8;
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    t.b(obj);
                    return (AnimationResult) obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
            return (AnimationResult) obj;
        }
        t.b(obj);
        float abs = Math.abs(this.$initialVelocity);
        f8 = this.this$0.velocityThreshold;
        if (abs <= Math.abs(f8)) {
            SnapFlingBehavior snapFlingBehavior = this.this$0;
            ScrollScope scrollScope = this.$this_fling;
            float f9 = this.$initialVelocity;
            Function1 function1 = this.$onRemainingScrollOffsetUpdate;
            this.label = 1;
            obj = snapFlingBehavior.shortSnap(scrollScope, f9, function1, this);
            if (obj == e8) {
                return e8;
            }
            return (AnimationResult) obj;
        }
        SnapFlingBehavior snapFlingBehavior2 = this.this$0;
        ScrollScope scrollScope2 = this.$this_fling;
        float f10 = this.$initialVelocity;
        Function1 function12 = this.$onRemainingScrollOffsetUpdate;
        this.label = 2;
        obj = snapFlingBehavior2.longSnap(scrollScope2, f10, function12, this);
        if (obj == e8) {
            return e8;
        }
        return (AnimationResult) obj;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((SnapFlingBehavior$fling$result$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
