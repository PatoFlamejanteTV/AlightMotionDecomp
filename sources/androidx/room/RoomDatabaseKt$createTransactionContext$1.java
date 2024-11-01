package androidx.room;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabaseExt.kt", l = {100}, m = "createTransactionContext")
/* loaded from: classes3.dex */
public final class RoomDatabaseKt$createTransactionContext$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RoomDatabaseKt$createTransactionContext$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object createTransactionContext;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        createTransactionContext = RoomDatabaseKt.createTransactionContext(null, this);
        return createTransactionContext;
    }
}
