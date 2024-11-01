package androidx.room;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "androidx.room.RoomDatabaseKt", f = "RoomDatabaseExt.kt", l = {51, 52}, m = "withTransaction")
/* loaded from: classes3.dex */
public final class RoomDatabaseKt$withTransaction$1<R> extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RoomDatabaseKt$withTransaction$1(U5.d dVar) {
        super(dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RoomDatabaseKt.withTransaction(null, null, this);
    }
}
