package androidx.compose.runtime;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.M;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ U5.g $context;
    final /* synthetic */ InterfaceC3821f $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
        final /* synthetic */ ProduceStateScope<R> $$this$produceState;
        final /* synthetic */ InterfaceC3821f $this_collectAsState;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC3821f interfaceC3821f, ProduceStateScope<R> produceStateScope, U5.d dVar) {
            super(2, dVar);
            this.$this_collectAsState = interfaceC3821f;
            this.$$this$produceState = produceStateScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, dVar);
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
                InterfaceC3821f interfaceC3821f = this.$this_collectAsState;
                final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                    @Override // q6.InterfaceC3822g
                    public final Object emit(T t8, U5.d dVar) {
                        produceStateScope.setValue(t8);
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
            return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(U5.g gVar, InterfaceC3821f interfaceC3821f, U5.d dVar) {
        super(2, dVar);
        this.$context = gVar;
        this.$this_collectAsState = interfaceC3821f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, dVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(ProduceStateScope<R> produceStateScope, U5.d dVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(produceStateScope, dVar)).invokeSuspend(I.f8786a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object e8 = V5.b.e();
        int i8 = this.label;
        if (i8 != 0) {
            if (i8 != 1 && i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t.b(obj);
        } else {
            t.b(obj);
            final ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
            if (AbstractC3292y.d(this.$context, U5.h.f10149a)) {
                InterfaceC3821f interfaceC3821f = this.$this_collectAsState;
                InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1.1
                    @Override // q6.InterfaceC3822g
                    public final Object emit(T t8, U5.d dVar) {
                        produceStateScope.setValue(t8);
                        return I.f8786a;
                    }
                };
                this.label = 1;
                if (interfaceC3821f.collect(interfaceC3822g, this) == e8) {
                    return e8;
                }
            } else {
                U5.g gVar = this.$context;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$this_collectAsState, produceStateScope, null);
                this.label = 2;
                if (AbstractC3458i.g(gVar, anonymousClass2, this) == e8) {
                    return e8;
                }
            }
        }
        return I.f8786a;
    }
}
