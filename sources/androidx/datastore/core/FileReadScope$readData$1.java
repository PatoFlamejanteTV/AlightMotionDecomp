package androidx.datastore.core;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "androidx.datastore.core.FileReadScope", f = "FileStorage.kt", l = {169, 178}, m = "readData$suspendImpl")
/* loaded from: classes3.dex */
public final class FileReadScope$readData$1<T> extends d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FileReadScope<T> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileReadScope$readData$1(FileReadScope<T> fileReadScope, U5.d dVar) {
        super(dVar);
        this.this$0 = fileReadScope;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FileReadScope.readData$suspendImpl(this.this$0, this);
    }
}
