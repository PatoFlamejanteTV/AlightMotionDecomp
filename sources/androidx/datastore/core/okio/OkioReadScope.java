package androidx.datastore.core.okio;

import U5.d;
import U6.AbstractC1455k;
import U6.Q;
import androidx.datastore.core.ReadScope;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class OkioReadScope<T> implements ReadScope<T> {
    private final AtomicBoolean closed;
    private final AbstractC1455k fileSystem;
    private final Q path;
    private final OkioSerializer<T> serializer;

    public OkioReadScope(AbstractC1455k fileSystem, Q path, OkioSerializer<T> serializer) {
        AbstractC3292y.i(fileSystem, "fileSystem");
        AbstractC3292y.i(path, "path");
        AbstractC3292y.i(serializer, "serializer");
        this.fileSystem = fileSystem;
        this.path = path;
        this.serializer = serializer;
        this.closed = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[Catch: FileNotFoundException -> 0x0086, TRY_ENTER, TryCatch #4 {FileNotFoundException -> 0x0086, blocks: (B:15:0x0082, B:18:0x008a, B:44:0x0042), top: B:43:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008a A[Catch: FileNotFoundException -> 0x0086, TRY_LEAVE, TryCatch #4 {FileNotFoundException -> 0x0086, blocks: (B:15:0x0082, B:18:0x008a, B:44:0x0042), top: B:43:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope<T> r6, U5.d r7) {
        /*
            boolean r0 = r7 instanceof androidx.datastore.core.okio.OkioReadScope$readData$1
            if (r0 == 0) goto L13
            r0 = r7
            androidx.datastore.core.okio.OkioReadScope$readData$1 r0 = (androidx.datastore.core.okio.OkioReadScope$readData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.okio.OkioReadScope$readData$1 r0 = new androidx.datastore.core.okio.OkioReadScope$readData$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r6 = r0.L$1
            java.io.Closeable r6 = (java.io.Closeable) r6
            java.lang.Object r0 = r0.L$0
            androidx.datastore.core.okio.OkioReadScope r0 = (androidx.datastore.core.okio.OkioReadScope) r0
            Q5.t.b(r7)     // Catch: java.lang.Throwable -> L32
            goto L61
        L32:
            r7 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3c:
            Q5.t.b(r7)
            r6.checkClose()
            U6.k r7 = r6.fileSystem     // Catch: java.io.FileNotFoundException -> L86
            U6.Q r2 = r6.path     // Catch: java.io.FileNotFoundException -> L86
            U6.Z r7 = r7.l(r2)     // Catch: java.io.FileNotFoundException -> L86
            U6.g r7 = U6.L.d(r7)     // Catch: java.io.FileNotFoundException -> L86
            androidx.datastore.core.okio.OkioSerializer<T> r2 = r6.serializer     // Catch: java.lang.Throwable -> L6a
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L6a
            r0.L$1 = r7     // Catch: java.lang.Throwable -> L6a
            r0.label = r3     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r0 = r2.readFrom(r7, r0)     // Catch: java.lang.Throwable -> L6a
            if (r0 != r1) goto L5d
            return r1
        L5d:
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L61:
            if (r6 == 0) goto L68
            r6.close()     // Catch: java.lang.Throwable -> L67
            goto L68
        L67:
            r4 = move-exception
        L68:
            r6 = r0
            goto L80
        L6a:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L6f:
            if (r6 == 0) goto L7c
            r6.close()     // Catch: java.lang.Throwable -> L75
            goto L7c
        L75:
            r6 = move-exception
            Q5.AbstractC1410e.a(r7, r6)     // Catch: java.io.FileNotFoundException -> L7a
            goto L7c
        L7a:
            r6 = move-exception
            goto L8b
        L7c:
            r6 = r0
            r5 = r4
            r4 = r7
            r7 = r5
        L80:
            if (r4 != 0) goto L8a
            kotlin.jvm.internal.AbstractC3292y.f(r7)     // Catch: java.io.FileNotFoundException -> L86
            goto L9b
        L86:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto L8b
        L8a:
            throw r4     // Catch: java.io.FileNotFoundException -> L86
        L8b:
            U6.k r7 = r0.fileSystem
            U6.Q r1 = r0.path
            boolean r7 = r7.g(r1)
            if (r7 != 0) goto L9c
            androidx.datastore.core.okio.OkioSerializer<T> r6 = r0.serializer
            java.lang.Object r7 = r6.getDefaultValue()
        L9b:
            return r7
        L9c:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.okio.OkioReadScope.readData$suspendImpl(androidx.datastore.core.okio.OkioReadScope, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void checkClose() {
        if (!this.closed.get()) {
        } else {
            throw new IllegalStateException("This scope has already been closed.".toString());
        }
    }

    @Override // androidx.datastore.core.Closeable
    public void close() {
        this.closed.set(true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final AbstractC1455k getFileSystem() {
        return this.fileSystem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Q getPath() {
        return this.path;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final OkioSerializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(d dVar) {
        return readData$suspendImpl(this, dVar);
    }
}
