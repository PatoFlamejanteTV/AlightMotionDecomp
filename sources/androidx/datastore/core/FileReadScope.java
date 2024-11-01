package androidx.datastore.core;

import U5.d;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public class FileReadScope<T> implements ReadScope<T> {
    private final java.util.concurrent.atomic.AtomicBoolean closed;
    private final File file;
    private final Serializer<T> serializer;

    public FileReadScope(File file, Serializer<T> serializer) {
        AbstractC3292y.i(file, "file");
        AbstractC3292y.i(serializer, "serializer");
        this.file = file;
        this.serializer = serializer;
        this.closed = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(6:5|6|7|(1:(1:(5:11|12|13|14|15)(2:25|26))(3:27|28|29))(6:40|41|42|43|44|(1:46)(1:47))|30|31))|67|6|7|(0)(0)|30|31|(3:(1:36)|(1:21)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x006f, code lost:            r7 = r2;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [androidx.datastore.core.FileReadScope] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ <T> java.lang.Object readData$suspendImpl(androidx.datastore.core.FileReadScope<T> r7, U5.d r8) {
        /*
            boolean r0 = r8 instanceof androidx.datastore.core.FileReadScope$readData$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.datastore.core.FileReadScope$readData$1 r0 = (androidx.datastore.core.FileReadScope$readData$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.datastore.core.FileReadScope$readData$1 r0 = new androidx.datastore.core.FileReadScope$readData$1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = V5.b.e()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4b
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r7 = r0.L$0
            java.io.Closeable r7 = (java.io.Closeable) r7
            Q5.t.b(r8)     // Catch: java.lang.Throwable -> L32
            goto L9f
        L32:
            r8 = move-exception
            goto La7
        L35:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3d:
            java.lang.Object r7 = r0.L$1
            java.io.Closeable r7 = (java.io.Closeable) r7
            java.lang.Object r2 = r0.L$0
            androidx.datastore.core.FileReadScope r2 = (androidx.datastore.core.FileReadScope) r2
            Q5.t.b(r8)     // Catch: java.lang.Throwable -> L49
            goto L6b
        L49:
            r8 = move-exception
            goto L77
        L4b:
            Q5.t.b(r8)
            r7.checkNotClosed()
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L7d
            java.io.File r2 = r7.file     // Catch: java.io.FileNotFoundException -> L7d
            r8.<init>(r2)     // Catch: java.io.FileNotFoundException -> L7d
            androidx.datastore.core.Serializer<T> r2 = r7.serializer     // Catch: java.lang.Throwable -> L72
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L72
            r0.L$1 = r8     // Catch: java.lang.Throwable -> L72
            r0.label = r4     // Catch: java.lang.Throwable -> L72
            java.lang.Object r2 = r2.readFrom(r8, r0)     // Catch: java.lang.Throwable -> L72
            if (r2 != r1) goto L67
            return r1
        L67:
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L6b:
            a6.AbstractC1677b.a(r7, r5)     // Catch: java.io.FileNotFoundException -> L6f
            return r8
        L6f:
            r7 = r2
            goto L7e
        L72:
            r2 = move-exception
            r6 = r2
            r2 = r7
            r7 = r8
            r8 = r6
        L77:
            throw r8     // Catch: java.lang.Throwable -> L78
        L78:
            r4 = move-exception
            a6.AbstractC1677b.a(r7, r8)     // Catch: java.io.FileNotFoundException -> L6f
            throw r4     // Catch: java.io.FileNotFoundException -> L6f
        L7d:
        L7e:
            java.io.File r8 = r7.file
            boolean r8 = r8.exists()
            if (r8 == 0) goto Lad
            java.io.FileInputStream r8 = new java.io.FileInputStream
            java.io.File r2 = r7.file
            r8.<init>(r2)
            androidx.datastore.core.Serializer<T> r7 = r7.serializer     // Catch: java.lang.Throwable -> La3
            r0.L$0 = r8     // Catch: java.lang.Throwable -> La3
            r0.L$1 = r5     // Catch: java.lang.Throwable -> La3
            r0.label = r3     // Catch: java.lang.Throwable -> La3
            java.lang.Object r7 = r7.readFrom(r8, r0)     // Catch: java.lang.Throwable -> La3
            if (r7 != r1) goto L9c
            return r1
        L9c:
            r6 = r8
            r8 = r7
            r7 = r6
        L9f:
            a6.AbstractC1677b.a(r7, r5)
            return r8
        La3:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        La7:
            throw r8     // Catch: java.lang.Throwable -> La8
        La8:
            r0 = move-exception
            a6.AbstractC1677b.a(r7, r8)
            throw r0
        Lad:
            androidx.datastore.core.Serializer<T> r7 = r7.serializer
            java.lang.Object r7 = r7.getDefaultValue()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.FileReadScope.readData$suspendImpl(androidx.datastore.core.FileReadScope, U5.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void checkNotClosed() {
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
    public final File getFile() {
        return this.file;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final Serializer<T> getSerializer() {
        return this.serializer;
    }

    @Override // androidx.datastore.core.ReadScope
    public Object readData(d dVar) {
        return readData$suspendImpl(this, dVar);
    }
}
