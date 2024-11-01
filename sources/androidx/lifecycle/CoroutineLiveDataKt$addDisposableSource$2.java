package androidx.lifecycle;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;
import n6.M;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2", f = "CoroutineLiveData.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CoroutineLiveDataKt$addDisposableSource$2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ LiveData<T> $source;
    final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends AbstractC3293z implements Function1 {
        final /* synthetic */ MediatorLiveData<T> $this_addDisposableSource;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(MediatorLiveData<T> mediatorLiveData) {
            super(1);
            this.$this_addDisposableSource = mediatorLiveData;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m5432invoke((AnonymousClass1) obj);
            return I.f8786a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m5432invoke(T t8) {
            this.$this_addDisposableSource.setValue(t8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData<T> mediatorLiveData, LiveData<T> liveData, U5.d dVar) {
        super(2, dVar);
        this.$this_addDisposableSource = mediatorLiveData;
        this.$source = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        return new CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        V5.b.e();
        if (this.label == 0) {
            t.b(obj);
            MediatorLiveData<T> mediatorLiveData = this.$this_addDisposableSource;
            mediatorLiveData.addSource(this.$source, new CoroutineLiveDataKt$sam$androidx_lifecycle_Observer$0(new AnonymousClass1(mediatorLiveData)));
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(M m8, U5.d dVar) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(m8, dVar)).invokeSuspend(I.f8786a);
    }
}
