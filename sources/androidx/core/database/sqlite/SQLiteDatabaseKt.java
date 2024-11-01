package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3290w;

/* loaded from: classes.dex */
public final class SQLiteDatabaseKt {
    public static final <T> T transaction(SQLiteDatabase sQLiteDatabase, boolean z8, Function1 function1) {
        if (z8) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            T t8 = (T) function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return t8;
        } finally {
            AbstractC3290w.b(1);
            sQLiteDatabase.endTransaction();
            AbstractC3290w.a(1);
        }
    }

    public static /* synthetic */ Object transaction$default(SQLiteDatabase sQLiteDatabase, boolean z8, Function1 function1, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if (z8) {
            sQLiteDatabase.beginTransaction();
        } else {
            sQLiteDatabase.beginTransactionNonExclusive();
        }
        try {
            Object invoke = function1.invoke(sQLiteDatabase);
            sQLiteDatabase.setTransactionSuccessful();
            return invoke;
        } finally {
            AbstractC3290w.b(1);
            sQLiteDatabase.endTransaction();
            AbstractC3290w.a(1);
        }
    }
}
