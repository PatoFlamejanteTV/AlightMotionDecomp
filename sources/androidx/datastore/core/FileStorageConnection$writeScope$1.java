package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.FileStorageConnection", f = "FileStorage.kt", l = {213, 118}, m = "writeScope")
/* loaded from: classes3.dex */
public final class FileStorageConnection$writeScope$1 extends d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileStorageConnection<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileStorageConnection$writeScope$1(FileStorageConnection<T> fileStorageConnection, U5.d dVar) {
        super(dVar);
        this.this$0 = fileStorageConnection;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.writeScope(null, this);
    }
}
