package androidx.room;

import R5.AbstractC1435t;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3274f;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public abstract class EntityInsertionAdapter<T> extends SharedSQLiteStatement {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EntityInsertionAdapter(RoomDatabase database) {
        super(database);
        AbstractC3292y.i(database, "database");
    }

    protected abstract void bind(SupportSQLiteStatement supportSQLiteStatement, T t8);

    public final void insert(T t8) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t8);
            acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long insertAndReturnId(T t8) {
        SupportSQLiteStatement acquire = acquire();
        try {
            bind(acquire, t8);
            return acquire.executeInsert();
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(Collection<? extends T> entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.size()];
            int i8 = 0;
            for (T t8 : entities) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    AbstractC1435t.w();
                }
                bind(acquire, t8);
                jArr[i8] = acquire.executeInsert();
                i8 = i9;
            }
            release(acquire);
            return jArr;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final Long[] insertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator<? extends T> it = entities.iterator();
        try {
            int size = entities.size();
            Long[] lArr = new Long[size];
            for (int i8 = 0; i8 < size; i8++) {
                bind(acquire, it.next());
                lArr[i8] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(T[] entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            List c8 = AbstractC1435t.c();
            for (T t8 : entities) {
                bind(acquire, t8);
                c8.add(Long.valueOf(acquire.executeInsert()));
            }
            List<Long> a9 = AbstractC1435t.a(c8);
            release(acquire);
            return a9;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(T[] entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            for (T t8 : entities) {
                bind(acquire, t8);
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }

    public final long[] insertAndReturnIdsArray(T[] entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            long[] jArr = new long[entities.length];
            int length = entities.length;
            int i8 = 0;
            int i9 = 0;
            while (i8 < length) {
                int i10 = i9 + 1;
                bind(acquire, entities[i8]);
                jArr[i9] = acquire.executeInsert();
                i8++;
                i9 = i10;
            }
            return jArr;
        } finally {
            release(acquire);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Long[] insertAndReturnIdsArrayBox(T[] entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        Iterator a9 = AbstractC3274f.a(entities);
        try {
            int length = entities.length;
            Long[] lArr = new Long[length];
            for (int i8 = 0; i8 < length; i8++) {
                bind(acquire, a9.next());
                lArr[i8] = Long.valueOf(acquire.executeInsert());
            }
            return lArr;
        } finally {
            release(acquire);
        }
    }

    public final List<Long> insertAndReturnIdsList(Collection<? extends T> entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            List c8 = AbstractC1435t.c();
            Iterator<T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                c8.add(Long.valueOf(acquire.executeInsert()));
            }
            List<Long> a9 = AbstractC1435t.a(c8);
            release(acquire);
            return a9;
        } catch (Throwable th) {
            release(acquire);
            throw th;
        }
    }

    public final void insert(Iterable<? extends T> entities) {
        AbstractC3292y.i(entities, "entities");
        SupportSQLiteStatement acquire = acquire();
        try {
            Iterator<? extends T> it = entities.iterator();
            while (it.hasNext()) {
                bind(acquire, it.next());
                acquire.executeInsert();
            }
        } finally {
            release(acquire);
        }
    }
}
