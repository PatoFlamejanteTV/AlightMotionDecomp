package androidx.datastore.core;

import Q5.InterfaceC1416k;
import Q5.l;
import U5.d;
import U5.g;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.b;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3290w;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import q6.InterfaceC3821f;
import w6.AbstractC4160c;
import w6.InterfaceC4158a;

/* loaded from: classes3.dex */
public final class MultiProcessCoordinator implements InterProcessCoordinator {
    public static final Companion Companion = new Companion(null);
    private static final String DEADLOCK_ERROR_MESSAGE = "Resource deadlock would occur";
    private static final long INITIAL_WAIT_MILLIS = 10;
    private static final long MAX_WAIT_MILLIS = ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
    private final String LOCK_ERROR_MESSAGE;
    private final String LOCK_SUFFIX;
    private final String VERSION_SUFFIX;
    private final g context;
    private final File file;
    private final InterfaceC4158a inMemoryMutex;
    private final InterfaceC1416k lazySharedCounter;
    private final InterfaceC1416k lockFile$delegate;
    private final InterfaceC3821f updateNotifications;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x007a -> B:10:0x007d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream r14, U5.d r15) {
            /*
                r13 = this;
                boolean r0 = r15 instanceof androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                if (r0 == 0) goto L13
                r0 = r15
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = (androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1 r0 = new androidx.datastore.core.MultiProcessCoordinator$Companion$getExclusiveFileLockWithRetryIfDeadlock$1
                r0.<init>(r13, r15)
            L18:
                java.lang.Object r15 = r0.result
                java.lang.Object r1 = V5.b.e()
                int r2 = r0.label
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 != r4) goto L30
                long r5 = r0.J$0
                java.lang.Object r14 = r0.L$0
                java.io.FileOutputStream r14 = (java.io.FileOutputStream) r14
                Q5.t.b(r15)
                goto L7d
            L30:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r15)
                throw r14
            L38:
                Q5.t.b(r15)
                long r5 = androidx.datastore.core.MultiProcessCoordinator.access$getINITIAL_WAIT_MILLIS$cp()
            L3f:
                long r7 = androidx.datastore.core.MultiProcessCoordinator.access$getMAX_WAIT_MILLIS$cp()
            */
            //  java.lang.String r15 = "lockFileStream.getChanne…LUE, /* shared= */ false)"
            /*
                int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r2 > 0) goto L82
                java.nio.channels.FileChannel r7 = r14.getChannel()     // Catch: java.io.IOException -> L5d
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r2 = r7.lock(r8, r10, r12)     // Catch: java.io.IOException -> L5d
                kotlin.jvm.internal.AbstractC3292y.h(r2, r15)     // Catch: java.io.IOException -> L5d
                return r2
            L5d:
                r15 = move-exception
                java.lang.String r2 = r15.getMessage()
                if (r2 == 0) goto L81
                java.lang.String r7 = androidx.datastore.core.MultiProcessCoordinator.access$getDEADLOCK_ERROR_MESSAGE$cp()
                r8 = 0
                r9 = 0
                boolean r2 = l6.n.G(r2, r7, r8, r3, r9)
                if (r2 != r4) goto L81
                r0.L$0 = r14
                r0.J$0 = r5
                r0.label = r4
                java.lang.Object r15 = n6.X.b(r5, r0)
                if (r15 != r1) goto L7d
                return r1
            L7d:
                long r7 = (long) r3
                long r5 = r5 * r7
                goto L3f
            L81:
                throw r15
            L82:
                java.nio.channels.FileChannel r7 = r14.getChannel()
                r10 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                r12 = 0
                r8 = 0
                java.nio.channels.FileLock r14 = r7.lock(r8, r10, r12)
                kotlin.jvm.internal.AbstractC3292y.h(r14, r15)
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.Companion.getExclusiveFileLockWithRetryIfDeadlock(java.io.FileOutputStream, U5.d):java.lang.Object");
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public MultiProcessCoordinator(g context, File file) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(file, "file");
        this.context = context;
        this.file = file;
        this.updateNotifications = MulticastFileObserver.Companion.observe(file);
        this.LOCK_SUFFIX = ".lock";
        this.VERSION_SUFFIX = ".version";
        this.LOCK_ERROR_MESSAGE = "fcntl failed: EAGAIN";
        this.inMemoryMutex = AbstractC4160c.b(false, 1, null);
        this.lockFile$delegate = l.b(new MultiProcessCoordinator$lockFile$2(this));
        this.lazySharedCounter = l.b(new MultiProcessCoordinator$lazySharedCounter$1(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createIfNotExists(File file) {
        createParentDirectories(file);
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    private final void createParentDirectories(File file) {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                throw new IOException("Unable to create parent directories of " + file);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File fileWithSuffix(String str) {
        return new File(this.file.getAbsolutePath() + str);
    }

    private final File getLockFile() {
        return (File) this.lockFile$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedCounter getSharedCounter() {
        return (SharedCounter) this.lazySharedCounter.getValue();
    }

    private final <T> Object withLazyCounter(InterfaceC2072n interfaceC2072n, d dVar) {
        if (this.lazySharedCounter.isInitialized()) {
            return interfaceC2072n.invoke(getSharedCounter(), dVar);
        }
        g gVar = this.context;
        MultiProcessCoordinator$withLazyCounter$2 multiProcessCoordinator$withLazyCounter$2 = new MultiProcessCoordinator$withLazyCounter$2(interfaceC2072n, this, null);
        AbstractC3290w.c(0);
        Object g8 = AbstractC3458i.g(gVar, multiProcessCoordinator$withLazyCounter$2, dVar);
        AbstractC3290w.c(1);
        return g8;
    }

    protected final File getFile() {
        return this.file;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public InterfaceC3821f getUpdateNotifications() {
        return this.updateNotifications;
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object getVersion(d dVar) {
        if (this.lazySharedCounter.isInitialized()) {
            return b.c(getSharedCounter().getValue());
        }
        return AbstractC3458i.g(this.context, new MultiProcessCoordinator$getVersion$$inlined$withLazyCounter$1(this, null), dVar);
    }

    @Override // androidx.datastore.core.InterProcessCoordinator
    public Object incrementAndGetVersion(d dVar) {
        if (this.lazySharedCounter.isInitialized()) {
            return b.c(getSharedCounter().incrementAndGetValue());
        }
        return AbstractC3458i.g(this.context, new MultiProcessCoordinator$incrementAndGetVersion$$inlined$withLazyCounter$1(this, null), dVar);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb A[Catch: all -> 0x00bf, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00bf, blocks: (B:16:0x00bb, B:30:0x00d9, B:31:0x00dc), top: B:7:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d9 A[Catch: all -> 0x00bf, TRY_ENTER, TryCatch #7 {all -> 0x00bf, blocks: (B:16:0x00bb, B:30:0x00d9, B:31:0x00dc), top: B:7:0x0024, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [w6.a] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, java.lang.Object] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object lock(kotlin.jvm.functions.Function1 r9, U5.d r10) {
        /*
            Method dump skipped, instructions count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.lock(kotlin.jvm.functions.Function1, U5.d):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e4 A[Catch: all -> 0x00e8, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00e8, blocks: (B:15:0x00e4, B:24:0x00fd, B:25:0x0100), top: B:7:0x0029, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd A[Catch: all -> 0x00e8, TRY_ENTER, TryCatch #6 {all -> 0x00e8, blocks: (B:15:0x00e4, B:24:0x00fd, B:25:0x0100), top: B:7:0x0029, outer: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r2v0, types: [c6.n] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.datastore.core.MultiProcessCoordinator$tryLock$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [w6.a] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.Closeable, int] */
    @Override // androidx.datastore.core.InterProcessCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public <T> java.lang.Object tryLock(c6.InterfaceC2072n r19, U5.d r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.MultiProcessCoordinator.tryLock(c6.n, U5.d):java.lang.Object");
    }
}
