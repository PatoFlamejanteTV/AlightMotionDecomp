package androidx.datastore.core;

import Q5.I;
import U5.d;
import V5.b;

/* loaded from: classes3.dex */
public final class StorageConnectionKt {
    public static final <T> Object readData(StorageConnection<T> storageConnection, d dVar) {
        return storageConnection.readScope(new StorageConnectionKt$readData$2(null), dVar);
    }

    public static final <T> Object writeData(StorageConnection<T> storageConnection, T t8, d dVar) {
        Object writeScope = storageConnection.writeScope(new StorageConnectionKt$writeData$2(t8, null), dVar);
        if (writeScope == b.e()) {
            return writeScope;
        }
        return I.f8786a;
    }
}
