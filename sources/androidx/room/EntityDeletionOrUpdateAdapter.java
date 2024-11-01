package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityDeletionOrUpdateAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityDeletionOrUpdateAdapter(RoomDatabase database) {
        super(database);
        AbstractC3292y.i(database, "database");
    }

    protected abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t8);

    @Override // androidx.room.SharedSQLiteStatement
    protected abstract String createQuery();

    public final int handle(T t8) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t8);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(Iterable<? extends T> entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            int i8 = 0;
            while (it.hasNext()) {
                bind(acquire, it.next());
                i8 += acquire.executeUpdateDelete();
            }
            return i8;
        } finally {
            release(acquire);
        }
    }

    public final int handleMultiple(T[] entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            int i8 = 0;
            for (T t8 : entities) {
                bind(acquire, t8);
                i8 += acquire.executeUpdateDelete();
            }
            return i8;
        } finally {
            release(acquire);
        }
    }
}
