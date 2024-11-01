package androidx.room;

import R5.AbstractC1435t;
import android.database.sqlite.SQLiteConstraintException;
import androidx.annotation.RestrictTo;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class EntityUpsertionAdapter<T> {
    private final EntityInsertionAdapter<T> insertionAdapter;
    private final EntityDeletionOrUpdateAdapter<T> updateAdapter;

    public EntityUpsertionAdapter(EntityInsertionAdapter<T> insertionAdapter, EntityDeletionOrUpdateAdapter<T> updateAdapter) {
        AbstractC3292y.i(insertionAdapter, "insertionAdapter");
        AbstractC3292y.i(updateAdapter, "updateAdapter");
        this.insertionAdapter = insertionAdapter;
        this.updateAdapter = updateAdapter;
    }

    private final void checkUniquenessException(SQLiteConstraintException sQLiteConstraintException) {
        String message = sQLiteConstraintException.getMessage();
        if (message != null) {
            if (l6.n.E(message, "1555", true)) {
                return;
            } else {
                throw sQLiteConstraintException;
            }
        }
        throw sQLiteConstraintException;
    }

    public final void upsert(T t8) {
        try {
            this.insertionAdapter.insert((EntityInsertionAdapter<T>) t8);
        } catch (SQLiteConstraintException e8) {
            checkUniquenessException(e8);
            this.updateAdapter.handle(t8);
        }
    }

    public final long upsertAndReturnId(T t8) {
        try {
            return this.insertionAdapter.insertAndReturnId(t8);
        } catch (SQLiteConstraintException e8) {
            checkUniquenessException(e8);
            this.updateAdapter.handle(t8);
            return -1L;
        }
    }

    public final long[] upsertAndReturnIdsArray(T[] entities) {
        long j8;
        AbstractC3292y.i(entities, "entities");
        int length = entities.length;
        long[] jArr = new long[length];
        for (int i8 = 0; i8 < length; i8++) {
            try {
                j8 = this.insertionAdapter.insertAndReturnId(entities[i8]);
            } catch (SQLiteConstraintException e8) {
                checkUniquenessException(e8);
                this.updateAdapter.handle(entities[i8]);
                j8 = -1;
            }
            jArr[i8] = j8;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(T[] entities) {
        long j8;
        AbstractC3292y.i(entities, "entities");
        int length = entities.length;
        Long[] lArr = new Long[length];
        for (int i8 = 0; i8 < length; i8++) {
            try {
                j8 = this.insertionAdapter.insertAndReturnId(entities[i8]);
            } catch (SQLiteConstraintException e8) {
                checkUniquenessException(e8);
                this.updateAdapter.handle(entities[i8]);
                j8 = -1;
            }
            lArr[i8] = Long.valueOf(j8);
        }
        return lArr;
    }

    public final List<Long> upsertAndReturnIdsList(T[] entities) {
        AbstractC3292y.i(entities, "entities");
        List c8 = AbstractC1435t.c();
        for (T t8 : entities) {
            try {
                c8.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t8)));
            } catch (SQLiteConstraintException e8) {
                checkUniquenessException(e8);
                this.updateAdapter.handle(t8);
                c8.add(-1L);
            }
        }
        return AbstractC1435t.a(c8);
    }

    public final void upsert(T[] entities) {
        AbstractC3292y.i(entities, "entities");
        for (T t8 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t8);
            } catch (SQLiteConstraintException e8) {
                checkUniquenessException(e8);
                this.updateAdapter.handle(t8);
            }
        }
    }

    public final long[] upsertAndReturnIdsArray(Collection<? extends T> entities) {
        long j8;
        AbstractC3292y.i(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        long[] jArr = new long[size];
        for (int i8 = 0; i8 < size; i8++) {
            T next = it.next();
            try {
                j8 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e8) {
                checkUniquenessException(e8);
                this.updateAdapter.handle(next);
                j8 = -1;
            }
            jArr[i8] = j8;
        }
        return jArr;
    }

    public final Long[] upsertAndReturnIdsArrayBox(Collection<? extends T> entities) {
        long j8;
        AbstractC3292y.i(entities, "entities");
        Iterator<? extends T> it = entities.iterator();
        int size = entities.size();
        Long[] lArr = new Long[size];
        for (int i8 = 0; i8 < size; i8++) {
            T next = it.next();
            try {
                j8 = this.insertionAdapter.insertAndReturnId(next);
            } catch (SQLiteConstraintException e8) {
                checkUniquenessException(e8);
                this.updateAdapter.handle(next);
                j8 = -1;
            }
            lArr[i8] = Long.valueOf(j8);
        }
        return lArr;
    }

    public final void upsert(Iterable<? extends T> entities) {
        AbstractC3292y.i(entities, "entities");
        for (T t8 : entities) {
            try {
                this.insertionAdapter.insert((EntityInsertionAdapter<T>) t8);
            } catch (SQLiteConstraintException e8) {
                checkUniquenessException(e8);
                this.updateAdapter.handle(t8);
            }
        }
    }

    public final List<Long> upsertAndReturnIdsList(Collection<? extends T> entities) {
        AbstractC3292y.i(entities, "entities");
        List c8 = AbstractC1435t.c();
        for (T t8 : entities) {
            try {
                c8.add(Long.valueOf(this.insertionAdapter.insertAndReturnId(t8)));
            } catch (SQLiteConstraintException e8) {
                checkUniquenessException(e8);
                this.updateAdapter.handle(t8);
                c8.add(-1L);
            }
        }
        return AbstractC1435t.a(c8);
    }
}
