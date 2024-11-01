package androidx.lifecycle;

import Q5.I;
import Q5.t;
import c6.InterfaceC2072n;
import n6.M;
import p6.s;

@kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1", f = "FlowLiveData.kt", l = {107, 112, 113, 115}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class FlowLiveDataConversions$asFlow$1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
    final /* synthetic */ LiveData<T> $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(LiveData<T> liveData, Observer<T> observer, U5.d dVar) {
            super(2, dVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass1(this.$this_asFlow, this.$observer, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass1) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(LiveData<T> liveData, Observer<T> observer, U5.d dVar) {
            super(2, dVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass2(this.$this_asFlow, this.$observer, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$this_asFlow.observeForever(this.$observer);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass2) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3", f = "FlowLiveData.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass3 extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {
        final /* synthetic */ Observer<T> $observer;
        final /* synthetic */ LiveData<T> $this_asFlow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(LiveData<T> liveData, Observer<T> observer, U5.d dVar) {
            super(2, dVar);
            this.$this_asFlow = liveData;
            this.$observer = observer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new AnonymousClass3(this.$this_asFlow, this.$observer, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.label == 0) {
                t.b(obj);
                this.$this_asFlow.removeObserver(this.$observer);
                return I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((AnonymousClass3) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asFlow$1(LiveData<T> liveData, U5.d dVar) {
        super(2, dVar);
        this.$this_asFlow = liveData;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final U5.d create(Object obj, U5.d dVar) {
        FlowLiveDataConversions$asFlow$1 flowLiveDataConversions$asFlow$1 = new FlowLiveDataConversions$asFlow$1(this.$this_asFlow, dVar);
        flowLiveDataConversions$asFlow$1.L$0 = obj;
        return flowLiveDataConversions$asFlow$1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.Observer] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r9.label
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r1 == 0) goto L40
            if (r1 == r5) goto L38
            if (r1 == r4) goto L30
            if (r1 == r3) goto L26
            if (r1 == r2) goto L1d
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            java.lang.Object r0 = r9.L$0
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            Q5.t.b(r10)
            goto Lb2
        L26:
            java.lang.Object r1 = r9.L$0
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            Q5.t.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L8b
        L2e:
            r10 = move-exception
            goto L91
        L30:
            java.lang.Object r1 = r9.L$0
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            Q5.t.b(r10)     // Catch: java.lang.Throwable -> L2e
            goto L80
        L38:
            java.lang.Object r1 = r9.L$0
            androidx.lifecycle.Observer r1 = (androidx.lifecycle.Observer) r1
            Q5.t.b(r10)
            goto L66
        L40:
            Q5.t.b(r10)
            java.lang.Object r10 = r9.L$0
            p6.s r10 = (p6.s) r10
            androidx.lifecycle.e r1 = new androidx.lifecycle.e
            r1.<init>()
            n6.J0 r10 = n6.C3445b0.c()
            n6.J0 r10 = r10.G()
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1 r7 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$1
            androidx.lifecycle.LiveData<T> r8 = r9.$this_asFlow
            r7.<init>(r8, r1, r6)
            r9.L$0 = r1
            r9.label = r5
            java.lang.Object r10 = n6.AbstractC3458i.g(r10, r7, r9)
            if (r10 != r0) goto L66
            return r0
        L66:
            n6.J0 r10 = n6.C3445b0.c()     // Catch: java.lang.Throwable -> L2e
            n6.J0 r10 = r10.G()     // Catch: java.lang.Throwable -> L2e
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2 r5 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$2     // Catch: java.lang.Throwable -> L2e
            androidx.lifecycle.LiveData<T> r7 = r9.$this_asFlow     // Catch: java.lang.Throwable -> L2e
            r5.<init>(r7, r1, r6)     // Catch: java.lang.Throwable -> L2e
            r9.L$0 = r1     // Catch: java.lang.Throwable -> L2e
            r9.label = r4     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = n6.AbstractC3458i.g(r10, r5, r9)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r0) goto L80
            return r0
        L80:
            r9.L$0 = r1     // Catch: java.lang.Throwable -> L2e
            r9.label = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = n6.X.a(r9)     // Catch: java.lang.Throwable -> L2e
            if (r10 != r0) goto L8b
            return r0
        L8b:
            Q5.h r10 = new Q5.h     // Catch: java.lang.Throwable -> L2e
            r10.<init>()     // Catch: java.lang.Throwable -> L2e
            throw r10     // Catch: java.lang.Throwable -> L2e
        L91:
            n6.J0 r3 = n6.C3445b0.c()
            n6.J0 r3 = r3.G()
            n6.L0 r4 = n6.L0.f35665a
            U5.g r3 = r3.plus(r4)
            androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3 r4 = new androidx.lifecycle.FlowLiveDataConversions$asFlow$1$3
            androidx.lifecycle.LiveData<T> r5 = r9.$this_asFlow
            r4.<init>(r5, r1, r6)
            r9.L$0 = r10
            r9.label = r2
            java.lang.Object r1 = n6.AbstractC3458i.g(r3, r4, r9)
            if (r1 != r0) goto Lb1
            return r0
        Lb1:
            r0 = r10
        Lb2:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.FlowLiveDataConversions$asFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(s sVar, U5.d dVar) {
        return ((FlowLiveDataConversions$asFlow$1) create(sVar, dVar)).invokeSuspend(I.f8786a);
    }
}
