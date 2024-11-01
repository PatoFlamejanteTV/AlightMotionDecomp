package androidx.work.impl.constraints;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import androidx.work.impl.model.WorkSpec;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.M;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class WorkConstraintsTrackerKt$listen$1 extends l implements InterfaceC2072n {
    final /* synthetic */ OnConstraintsStateChangedListener $listener;
    final /* synthetic */ WorkSpec $spec;
    final /* synthetic */ WorkConstraintsTracker $this_listen;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkConstraintsTrackerKt$listen$1(WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, OnConstraintsStateChangedListener onConstraintsStateChangedListener, d dVar) {
        super(2, dVar);
        this.$this_listen = workConstraintsTracker;
        this.$spec = workSpec;
        this.$listener = onConstraintsStateChangedListener;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        return new WorkConstraintsTrackerKt$listen$1(this.$this_listen, this.$spec, this.$listener, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            InterfaceC3821f track = this.$this_listen.track(this.$spec);
            final OnConstraintsStateChangedListener onConstraintsStateChangedListener = this.$listener;
            final WorkSpec workSpec = this.$spec;
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1.1
                @Override // q6.InterfaceC3822g
                public final Object emit(ConstraintsState constraintsState, d dVar) {
                    OnConstraintsStateChangedListener.this.onConstraintsStateChanged(workSpec, constraintsState);
                    return I.f8786a;
                }
            };
            this.label = 1;
            if (track.collect(interfaceC3822g, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, d dVar) {
        return ((WorkConstraintsTrackerKt$listen$1) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
