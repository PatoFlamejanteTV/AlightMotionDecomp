package androidx.datastore.core;

import U5.d;

/* loaded from: classes3.dex */
public interface DataMigration<T> {
    Object cleanUp(d dVar);

    Object migrate(T t8, d dVar);

    Object shouldMigrate(T t8, d dVar);
}
