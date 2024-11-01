package androidx.datastore.core;

import R5.AbstractC1435t;
import androidx.datastore.core.handlers.NoOpCorruptionHandler;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;
import n6.C3445b0;
import n6.M;
import n6.N;
import n6.U0;

/* loaded from: classes3.dex */
public final class MultiProcessDataStoreFactory {
    public static final MultiProcessDataStoreFactory INSTANCE = new MultiProcessDataStoreFactory();

    private MultiProcessDataStoreFactory() {
    }

    public static /* synthetic */ DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Storage storage, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, M m8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            replaceFileCorruptionHandler = null;
        }
        if ((i8 & 4) != 0) {
            list = AbstractC1435t.m();
        }
        if ((i8 & 8) != 0) {
            m8 = N.a(C3445b0.b().plus(U0.b(null, 1, null)));
        }
        return multiProcessDataStoreFactory.create(storage, replaceFileCorruptionHandler, list, m8);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, Function0 produceFile) {
        AbstractC3292y.i(serializer, "serializer");
        AbstractC3292y.i(migrations, "migrations");
        AbstractC3292y.i(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, migrations, null, produceFile, 8, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, Function0 produceFile) {
        AbstractC3292y.i(serializer, "serializer");
        AbstractC3292y.i(produceFile, "produceFile");
        return create$default(this, serializer, replaceFileCorruptionHandler, null, null, produceFile, 12, null);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, Function0 produceFile) {
        AbstractC3292y.i(serializer, "serializer");
        AbstractC3292y.i(produceFile, "produceFile");
        return create$default(this, serializer, null, null, null, produceFile, 14, null);
    }

    public static /* synthetic */ DataStore create$default(MultiProcessDataStoreFactory multiProcessDataStoreFactory, Serializer serializer, ReplaceFileCorruptionHandler replaceFileCorruptionHandler, List list, M m8, Function0 function0, int i8, Object obj) {
        ReplaceFileCorruptionHandler replaceFileCorruptionHandler2 = (i8 & 2) != 0 ? null : replaceFileCorruptionHandler;
        if ((i8 & 4) != 0) {
            list = AbstractC1435t.m();
        }
        List list2 = list;
        if ((i8 & 8) != 0) {
            m8 = N.a(C3445b0.b().plus(U0.b(null, 1, null)));
        }
        return multiProcessDataStoreFactory.create(serializer, replaceFileCorruptionHandler2, list2, m8, function0);
    }

    public final <T> DataStore<T> create(Storage<T> storage) {
        AbstractC3292y.i(storage, "storage");
        return create$default(this, storage, null, null, null, 14, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler) {
        AbstractC3292y.i(storage, "storage");
        return create$default(this, storage, replaceFileCorruptionHandler, null, null, 12, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations) {
        AbstractC3292y.i(storage, "storage");
        AbstractC3292y.i(migrations, "migrations");
        return create$default(this, storage, replaceFileCorruptionHandler, migrations, null, 8, null);
    }

    public final <T> DataStore<T> create(Storage<T> storage, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, M scope) {
        AbstractC3292y.i(storage, "storage");
        AbstractC3292y.i(migrations, "migrations");
        AbstractC3292y.i(scope, "scope");
        List e8 = AbstractC1435t.e(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(storage, e8, replaceFileCorruptionHandler, scope);
    }

    public final <T> DataStore<T> create(Serializer<T> serializer, ReplaceFileCorruptionHandler<T> replaceFileCorruptionHandler, List<? extends DataMigration<T>> migrations, M scope, Function0 produceFile) {
        AbstractC3292y.i(serializer, "serializer");
        AbstractC3292y.i(migrations, "migrations");
        AbstractC3292y.i(scope, "scope");
        AbstractC3292y.i(produceFile, "produceFile");
        FileStorage fileStorage = new FileStorage(serializer, new MultiProcessDataStoreFactory$create$1(scope), produceFile);
        List e8 = AbstractC1435t.e(DataMigrationInitializer.Companion.getInitializer(migrations));
        if (replaceFileCorruptionHandler == null) {
            replaceFileCorruptionHandler = (ReplaceFileCorruptionHandler<T>) new NoOpCorruptionHandler();
        }
        return new DataStoreImpl(fileStorage, e8, replaceFileCorruptionHandler, scope);
    }
}
