package androidx.datastore.core;

import Q5.I;
import Q5.t;
import U5.d;
import V5.b;
import c6.InterfaceC2072n;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import q6.InterfaceC3822g;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.DataStoreImpl$internalDataFlow$1", f = "DataStoreImpl.kt", l = {123, 125, 132}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class DataStoreImpl$internalDataFlow$1 extends l implements InterfaceC2072n {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ DataStoreImpl<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.core.DataStoreImpl$internalDataFlow$1$1", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$internalDataFlow$1$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass1 extends l implements InterfaceC2072n {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass1(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(State<T> state, d dVar) {
            return ((AnonymousClass1) create(state, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            b.e();
            if (this.label == 0) {
                t.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(!(((State) this.L$0) instanceof Final));
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "androidx.datastore.core.DataStoreImpl$internalDataFlow$1$2", f = "DataStoreImpl.kt", l = {}, m = "invokeSuspend")
    /* renamed from: androidx.datastore.core.DataStoreImpl$internalDataFlow$1$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public static final class AnonymousClass2 extends l implements InterfaceC2072n {
        final /* synthetic */ State<T> $startState;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(State<T> state, d dVar) {
            super(2, dVar);
            this.$startState = state;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$startState, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(State<T> state, d dVar) {
            return ((AnonymousClass2) create(state, dVar)).invokeSuspend(I.f8786a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            boolean z8;
            b.e();
            if (this.label == 0) {
                t.b(obj);
                State state = (State) this.L$0;
                if ((state instanceof Data) && state.getVersion() <= this.$startState.getVersion()) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z8);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$internalDataFlow$1(DataStoreImpl<T> dataStoreImpl, d dVar) {
        super(2, dVar);
        this.this$0 = dataStoreImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d create(Object obj, d dVar) {
        DataStoreImpl$internalDataFlow$1 dataStoreImpl$internalDataFlow$1 = new DataStoreImpl$internalDataFlow$1(this.this$0, dVar);
        dataStoreImpl$internalDataFlow$1.L$0 = obj;
        return dataStoreImpl$internalDataFlow$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a6 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = V5.b.e()
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 == r4) goto L2a
            if (r1 == r3) goto L1e
            if (r1 != r2) goto L16
            Q5.t.b(r8)
            goto La7
        L16:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1e:
            java.lang.Object r1 = r7.L$1
            androidx.datastore.core.State r1 = (androidx.datastore.core.State) r1
            java.lang.Object r3 = r7.L$0
            q6.g r3 = (q6.InterfaceC3822g) r3
            Q5.t.b(r8)
            goto L66
        L2a:
            java.lang.Object r1 = r7.L$0
            q6.g r1 = (q6.InterfaceC3822g) r1
            Q5.t.b(r8)
            goto L4a
        L32:
            Q5.t.b(r8)
            java.lang.Object r8 = r7.L$0
            q6.g r8 = (q6.InterfaceC3822g) r8
            androidx.datastore.core.DataStoreImpl<T> r1 = r7.this$0
            r7.L$0 = r8
            r7.label = r4
            r4 = 0
            java.lang.Object r1 = androidx.datastore.core.DataStoreImpl.access$readState(r1, r4, r7)
            if (r1 != r0) goto L47
            return r0
        L47:
            r6 = r1
            r1 = r8
            r8 = r6
        L4a:
            androidx.datastore.core.State r8 = (androidx.datastore.core.State) r8
            boolean r4 = r8 instanceof androidx.datastore.core.Data
            if (r4 == 0) goto L69
            r4 = r8
            androidx.datastore.core.Data r4 = (androidx.datastore.core.Data) r4
            java.lang.Object r4 = r4.getValue()
            r7.L$0 = r1
            r7.L$1 = r8
            r7.label = r3
            java.lang.Object r3 = r1.emit(r4, r7)
            if (r3 != r0) goto L64
            return r0
        L64:
            r3 = r1
            r1 = r8
        L66:
            r8 = r1
            r1 = r3
            goto L78
        L69:
            boolean r3 = r8 instanceof androidx.datastore.core.UnInitialized
            if (r3 != 0) goto Lb1
            boolean r3 = r8 instanceof androidx.datastore.core.ReadException
            if (r3 != 0) goto Laa
            boolean r3 = r8 instanceof androidx.datastore.core.Final
            if (r3 == 0) goto L78
            Q5.I r8 = Q5.I.f8786a
            return r8
        L78:
            androidx.datastore.core.DataStoreImpl<T> r3 = r7.this$0
            androidx.datastore.core.DataStoreInMemoryCache r3 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r3)
            q6.f r3 = r3.getFlow()
            androidx.datastore.core.DataStoreImpl$internalDataFlow$1$1 r4 = new androidx.datastore.core.DataStoreImpl$internalDataFlow$1$1
            r5 = 0
            r4.<init>(r5)
            q6.f r3 = q6.AbstractC3823h.L(r3, r4)
            androidx.datastore.core.DataStoreImpl$internalDataFlow$1$2 r4 = new androidx.datastore.core.DataStoreImpl$internalDataFlow$1$2
            r4.<init>(r8, r5)
            q6.f r8 = q6.AbstractC3823h.r(r3, r4)
            androidx.datastore.core.DataStoreImpl$internalDataFlow$1$invokeSuspend$$inlined$map$1 r3 = new androidx.datastore.core.DataStoreImpl$internalDataFlow$1$invokeSuspend$$inlined$map$1
            r3.<init>()
            r7.L$0 = r5
            r7.L$1 = r5
            r7.label = r2
            java.lang.Object r8 = q6.AbstractC3823h.t(r1, r3, r7)
            if (r8 != r0) goto La7
            return r0
        La7:
            Q5.I r8 = Q5.I.f8786a
            return r8
        Laa:
            androidx.datastore.core.ReadException r8 = (androidx.datastore.core.ReadException) r8
            java.lang.Throwable r8 = r8.getReadException()
            throw r8
        Lb1:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl$internalDataFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // c6.InterfaceC2072n
    public final Object invoke(InterfaceC3822g interfaceC3822g, d dVar) {
        return ((DataStoreImpl$internalDataFlow$1) create(interfaceC3822g, dVar)).invokeSuspend(I.f8786a);
    }
}
