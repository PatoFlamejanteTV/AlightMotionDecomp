package androidx.datastore.core;

import Q5.InterfaceC1416k;
import Q5.l;
import R5.AbstractC1435t;
import U5.d;
import U5.g;
import androidx.datastore.core.Message;
import androidx.datastore.core.UpdatingDataContextElement;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import c6.InterfaceC2072n;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import m6.C3374a;
import n6.AbstractC3458i;
import n6.M;
import n6.N;
import n6.U0;
import q6.AbstractC3809H;
import q6.AbstractC3823h;
import q6.InterfaceC3802A;
import q6.InterfaceC3808G;
import q6.InterfaceC3821f;

/* loaded from: classes3.dex */
public final class DataStoreImpl<T> implements DataStore<T> {
    private static final String BUG_MESSAGE = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542";
    public static final Companion Companion = new Companion(null);
    private final InterfaceC1416k coordinator$delegate;
    private final CorruptionHandler<T> corruptionHandler;
    private final InterfaceC3821f data;
    private final DataStoreInMemoryCache<T> inMemoryCache;
    private final InterfaceC3821f internalDataFlow;
    private final DataStoreImpl<T>.InitDataStore readAndInit;
    private final M scope;
    private final Storage<T> storage;
    private final InterfaceC1416k storageConnectionDelegate;
    private final InterfaceC3802A updateCollection;
    private final SimpleActor<Message.Update<T>> writeActor;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class InitDataStore extends RunOnce {
        private List<? extends InterfaceC2072n> initTasks;
        final /* synthetic */ DataStoreImpl<T> this$0;

        public InitDataStore(DataStoreImpl dataStoreImpl, List<? extends InterfaceC2072n> initTasksList) {
            AbstractC3292y.i(initTasksList, "initTasksList");
            this.this$0 = dataStoreImpl;
            this.initTasks = AbstractC1435t.W0(initTasksList);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        @Override // androidx.datastore.core.RunOnce
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object doRun(U5.d r7) {
            /*
                r6 = this;
                boolean r0 = r7 instanceof androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                if (r0 == 0) goto L13
                r0 = r7
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = (androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1 r0 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$1
                r0.<init>(r6, r7)
            L18:
                java.lang.Object r7 = r0.result
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                Q5.t.b(r7)
                goto L6b
            L30:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L38:
                java.lang.Object r0 = r0.L$0
                androidx.datastore.core.DataStoreImpl$InitDataStore r0 = (androidx.datastore.core.DataStoreImpl.InitDataStore) r0
                Q5.t.b(r7)
                goto L7d
            L40:
                Q5.t.b(r7)
                java.util.List<? extends c6.n> r7 = r6.initTasks
                if (r7 == 0) goto L6e
                kotlin.jvm.internal.AbstractC3292y.f(r7)
                boolean r7 = r7.isEmpty()
                if (r7 == 0) goto L51
                goto L6e
            L51:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                androidx.datastore.core.InterProcessCoordinator r7 = androidx.datastore.core.DataStoreImpl.access$getCoordinator(r7)
                androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1 r2 = new androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1
                androidx.datastore.core.DataStoreImpl<T> r4 = r6.this$0
                r5 = 0
                r2.<init>(r4, r6, r5)
                r0.L$0 = r6
                r0.label = r3
                java.lang.Object r7 = r7.lock(r2, r0)
                if (r7 != r1) goto L6a
                return r1
            L6a:
                r0 = r6
            L6b:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
                goto L7f
            L6e:
                androidx.datastore.core.DataStoreImpl<T> r7 = r6.this$0
                r0.L$0 = r6
                r0.label = r4
                r2 = 0
                java.lang.Object r7 = androidx.datastore.core.DataStoreImpl.access$readDataOrHandleCorruption(r7, r2, r0)
                if (r7 != r1) goto L7c
                return r1
            L7c:
                r0 = r6
            L7d:
                androidx.datastore.core.Data r7 = (androidx.datastore.core.Data) r7
            L7f:
                androidx.datastore.core.DataStoreImpl<T> r0 = r0.this$0
                androidx.datastore.core.DataStoreInMemoryCache r0 = androidx.datastore.core.DataStoreImpl.access$getInMemoryCache$p(r0)
                r0.tryUpdate(r7)
                Q5.I r7 = Q5.I.f8786a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.InitDataStore.doRun(U5.d):java.lang.Object");
        }
    }

    public DataStoreImpl(Storage<T> storage, List<? extends InterfaceC2072n> initTasksList, CorruptionHandler<T> corruptionHandler, M scope) {
        AbstractC3292y.i(storage, "storage");
        AbstractC3292y.i(initTasksList, "initTasksList");
        AbstractC3292y.i(corruptionHandler, "corruptionHandler");
        AbstractC3292y.i(scope, "scope");
        this.storage = storage;
        this.corruptionHandler = corruptionHandler;
        this.scope = scope;
        InterfaceC3821f z8 = AbstractC3823h.z(new DataStoreImpl$updateCollection$1(this, null));
        InterfaceC3808G.a aVar = InterfaceC3808G.f37362a;
        C3374a.C0804a c0804a = C3374a.f35036b;
        this.updateCollection = AbstractC3823h.I(z8, scope, AbstractC3809H.a(aVar, c0804a.b(), c0804a.b()), 0);
        this.internalDataFlow = AbstractC3823h.z(new DataStoreImpl$internalDataFlow$1(this, null));
        this.data = AbstractC3823h.h(new DataStoreImpl$data$1(this, null));
        this.inMemoryCache = new DataStoreInMemoryCache<>();
        this.readAndInit = new InitDataStore(this, initTasksList);
        this.storageConnectionDelegate = l.b(new DataStoreImpl$storageConnectionDelegate$1(this));
        this.coordinator$delegate = l.b(new DataStoreImpl$coordinator$2(this));
        this.writeActor = new SimpleActor<>(scope, new DataStoreImpl$writeActor$1(this), DataStoreImpl$writeActor$2.INSTANCE, new DataStoreImpl$writeActor$3(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <R> Object doWithWriteFileLock(boolean z8, Function1 function1, d dVar) {
        if (z8) {
            return function1.invoke(dVar);
        }
        return getCoordinator().lock(new DataStoreImpl$doWithWriteFileLock$3(function1, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterProcessCoordinator getCoordinator() {
        return (InterProcessCoordinator) this.coordinator$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(5:(1:(1:(1:12)(2:19|20))(3:21|22|23))(1:28)|13|14|15|16)(4:29|30|31|(6:33|(1:35)|26|14|15|16)(3:36|(1:38)(1:54)|(2:40|(2:42|(1:44)(1:45))(2:46|47))(2:48|(2:50|51)(2:52|53))))|24|(1:27)|26|14|15|16))|59|6|7|(0)(0)|24|(0)|26|14|15|16|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0034, code lost:            r10 = th;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v7, types: [n6.x, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r9v21, types: [n6.x] */
    /* JADX WARN: Type inference failed for: r9v3, types: [n6.x] */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object handleUpdate(androidx.datastore.core.Message.Update<T> r9, U5.d r10) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.handleUpdate(androidx.datastore.core.Message$Update, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readAndInitOrPropagateAndThrowFailure(U5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = (androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 r0 = new androidx.datastore.core.DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            int r1 = r0.I$0
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.DataStoreImpl r0 = (androidx.datastore.core.DataStoreImpl) r0
            Q5.t.b(r6)     // Catch: java.lang.Throwable -> L32
            goto L6c
        L32:
            r6 = move-exception
            goto L73
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3c:
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.DataStoreImpl r2 = (androidx.datastore.core.DataStoreImpl) r2
            Q5.t.b(r6)
            goto L57
        L44:
            Q5.t.b(r6)
            androidx.datastore.core.InterProcessCoordinator r6 = r5.getCoordinator()
            r0.L$0 = r5
            r0.label = r4
            java.lang.Object r6 = r6.getVersion(r0)
            if (r6 != r1) goto L56
            return r1
        L56:
            r2 = r5
        L57:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            androidx.datastore.core.DataStoreImpl<T>$InitDataStore r4 = r2.readAndInit     // Catch: java.lang.Throwable -> L6f
            r0.L$0 = r2     // Catch: java.lang.Throwable -> L6f
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L6f
            r0.label = r3     // Catch: java.lang.Throwable -> L6f
            java.lang.Object r6 = r4.runIfNeeded(r0)     // Catch: java.lang.Throwable -> L6f
            if (r6 != r1) goto L6c
            return r1
        L6c:
            Q5.I r6 = Q5.I.f8786a
            return r6
        L6f:
            r0 = move-exception
            r1 = r6
            r6 = r0
            r0 = r2
        L73:
            androidx.datastore.core.DataStoreInMemoryCache<T> r0 = r0.inMemoryCache
            androidx.datastore.core.ReadException r2 = new androidx.datastore.core.ReadException
            r2.<init>(r6, r1)
            r0.tryUpdate(r2)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readAndInitOrPropagateAndThrowFailure(U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataAndUpdateCache(boolean r10, U5.d r11) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataAndUpdateCache(boolean, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readDataFromFileOrDefault(d dVar) {
        return StorageConnectionKt.readData(getStorageConnection$datastore_core_release(), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|85|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0067, code lost:            r12 = e;     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0068, code lost:            r7 = r2;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x014b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object readDataOrHandleCorruption(boolean r11, U5.d r12) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.readDataOrHandleCorruption(boolean, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object readState(boolean z8, d dVar) {
        return AbstractC3458i.g(this.scope.getCoroutineContext(), new DataStoreImpl$readState$2(this, z8, null), dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object transformAndWrite(InterfaceC2072n interfaceC2072n, g gVar, d dVar) {
        return getCoordinator().lock(new DataStoreImpl$transformAndWrite$2(this, gVar, interfaceC2072n, null), dVar);
    }

    @Override // androidx.datastore.core.DataStore
    public InterfaceC3821f getData() {
        return this.data;
    }

    public final StorageConnection<T> getStorageConnection$datastore_core_release() {
        return (StorageConnection) this.storageConnectionDelegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public Object updateData(InterfaceC2072n interfaceC2072n, d dVar) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) dVar.getContext().get(UpdatingDataContextElement.Companion.Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return AbstractC3458i.g(new UpdatingDataContextElement(updatingDataContextElement, this), new DataStoreImpl$updateData$2(this, interfaceC2072n, null), dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object writeData$datastore_core_release(T r12, boolean r13, U5.d r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof androidx.datastore.core.DataStoreImpl$writeData$1
            if (r0 == 0) goto L13
            r0 = r14
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = (androidx.datastore.core.DataStoreImpl$writeData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.DataStoreImpl$writeData$1 r0 = new androidx.datastore.core.DataStoreImpl$writeData$1
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r12 = r0.L$0
            kotlin.jvm.internal.Q r12 = (kotlin.jvm.internal.Q) r12
            Q5.t.b(r14)
            goto L58
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            Q5.t.b(r14)
            kotlin.jvm.internal.Q r14 = new kotlin.jvm.internal.Q
            r14.<init>()
            androidx.datastore.core.StorageConnection r2 = r11.getStorageConnection$datastore_core_release()
            androidx.datastore.core.DataStoreImpl$writeData$2 r10 = new androidx.datastore.core.DataStoreImpl$writeData$2
            r9 = 0
            r4 = r10
            r5 = r14
            r6 = r11
            r7 = r12
            r8 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.L$0 = r14
            r0.label = r3
            java.lang.Object r12 = r2.writeScope(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            r12 = r14
        L58:
            int r12 = r12.f34571a
            java.lang.Integer r12 = kotlin.coroutines.jvm.internal.b.c(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.DataStoreImpl.writeData$datastore_core_release(java.lang.Object, boolean, U5.d):java.lang.Object");
    }

    public /* synthetic */ DataStoreImpl(Storage storage, List list, CorruptionHandler corruptionHandler, M m8, int i8, AbstractC3284p abstractC3284p) {
        this(storage, (i8 & 2) != 0 ? AbstractC1435t.m() : list, (i8 & 4) != 0 ? new NoOpCorruptionHandler() : corruptionHandler, (i8 & 8) != 0 ? N.a(Actual_jvmKt.ioDispatcher().plus(U0.b(null, 1, null))) : m8);
    }
}
