package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import n6.AbstractC3462k;
import n6.InterfaceC3488x0;
import n6.O;
import p6.s;
import q6.AbstractC3823h;
import q6.InterfaceC3821f;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$data$1", f = "DataStoreImpl.kt", l = {159}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$data$1 extends l implements InterfaceC2072n {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.core.DataStoreImpl$data$1$1", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        final /* synthetic */ InterfaceC3488x0 $updateCollector;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3488x0 interfaceC3488x0, d dVar) {
            super(2, dVar);
            this.$updateCollector = interfaceC3488x0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new AnonymousClass1(this.$updateCollector, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$updateCollector.start();
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(InterfaceC3822g interfaceC3822g, d dVar) {
            return ((AnonymousClass1) create(interfaceC3822g, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.core.DataStoreImpl$data$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$data$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC2073o {
        final /* synthetic */ InterfaceC3488x0 $updateCollector;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(InterfaceC3488x0 interfaceC3488x0, d dVar) {
            super(3, dVar);
            this.$updateCollector = interfaceC3488x0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                InterfaceC3488x0.a.a(this.$updateCollector, null, 1, null);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2073o
        public final Object invoke(InterfaceC3822g interfaceC3822g, Throwable th, d dVar) {
            return new AnonymousClass2(this.$updateCollector, dVar).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$data$1(DataStoreImpl<T> dataStoreImpl, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$data$1 dataStoreImpl$data$1 = new DataStoreImpl$data$1(this.this$0, dVar);
        dataStoreImpl$data$1.L$0 = obj;
        return dataStoreImpl$data$1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC3488x0 d8;
        InterfaceC3821f interfaceC3821f;
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
            final s sVar = (s) this.L$0;
            d8 = AbstractC3462k.d(sVar, null, O.LAZY, new DataStoreImpl$data$1$updateCollector$1(this.this$0, null), 1, null);
            interfaceC3821f = ((DataStoreImpl) this.this$0).internalDataFlow;
            InterfaceC3821f F8 = AbstractC3823h.F(AbstractC3823h.H(interfaceC3821f, new AnonymousClass1(d8, null)), new AnonymousClass2(d8, null));
            InterfaceC3822g interfaceC3822g = new InterfaceC3822g() { // from class: androidx.datastore.core.DataStoreImpl$data$1.3
                @Override // q6.InterfaceC3822g
                public final Object emit(T t8, d dVar) {
                    Object l8 = s.this.l(t8, dVar);
                    if (l8 == b.e()) {
                        return l8;
                    }
                    return I.f8786a;
                }
            };
            this.label = 1;
            if (F8.collect(interfaceC3822g, this) == e8) {
                return e8;
            }
        }
        return I.f8786a;
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(s sVar, d dVar) {
        return ((DataStoreImpl$data$1) create(sVar, dVar)).invokeSuspend(I.f8786a);
    }
}
