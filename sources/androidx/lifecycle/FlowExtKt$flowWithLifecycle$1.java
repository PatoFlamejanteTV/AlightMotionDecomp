package androidx.lifecycle;

import Q5.I;
import Q5.t;
import androidx.lifecycle.Lifecycle;
import c6.InterfaceC2072n;
import n6.M;
import p6.s;
import p6.v;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowExtKt$flowWithLifecycle$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ Lifecycle $lifecycle;
    final /* synthetic */ Lifecycle.State $minActiveState;
    final /* synthetic */ InterfaceC3821f $this_flowWithLifecycle;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
        final /* synthetic */ s $$this$callbackFlow;
        final /* synthetic */ InterfaceC3821f $this_flowWithLifecycle;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3821f interfaceC3821f, s sVar, U5.d dVar) {
            super(2, dVar);
            this.$this_flowWithLifecycle = interfaceC3821f;
            this.$$this$callbackFlow = sVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass1(this.$this_flowWithLifecycle, this.$$this$callbackFlow, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
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
                InterfaceC3821f interfaceC3821f = this.$this_flowWithLifecycle;
                final s sVar = this.$$this$callbackFlow;
                InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                    @Override // q6.InterfaceC3822g
                    public final Object emit(T t8, U5.d dVar) {
                        Object l8 = s.this.l(t8, dVar);
                        if (l8 == V5.b.e()) {
                            return l8;
                        }
                        return I.f8786a;
                    }
                };
                this.label = 1;
                if (interfaceC3821f.collect(interfaceC3822g, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtKt$flowWithLifecycle$1(Lifecycle lifecycle, Lifecycle.State state, InterfaceC3821f interfaceC3821f, U5.d dVar) {
        super(2, dVar);
        this.$lifecycle = lifecycle;
        this.$minActiveState = state;
        this.$this_flowWithLifecycle = interfaceC3821f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        FlowExtKt$flowWithLifecycle$1 flowExtKt$flowWithLifecycle$1 = new FlowExtKt$flowWithLifecycle$1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, dVar);
        flowExtKt$flowWithLifecycle$1.L$0 = obj;
        return flowExtKt$flowWithLifecycle$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 == 1) {
                sVar = (s) this.L$0;
                t.b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            t.b(obj);
            s sVar2 = (s) this.L$0;
            Lifecycle lifecycle = this.$lifecycle;
            Lifecycle.State state = this.$minActiveState;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_flowWithLifecycle, sVar2, null);
            this.L$0 = sVar2;
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, anonymousClass1, this) == e8) {
                return e8;
            }
            sVar = sVar2;
        }
        v.a.a(sVar, null, 1, null);
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(s sVar, U5.d dVar) {
        return ((FlowExtKt$flowWithLifecycle$1) create(sVar, dVar)).invokeSuspend(I.f8786a);
    }
}
