package androidx.room.util;

import Q5.I;
import R5.AbstractC1435t;
import a6.AbstractC1677b;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteCompat;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class DBUtil {
    public static final CancellationSignal createCancellationSignal() {
        return SupportSQLiteCompat.Api16Impl.createCancellationSignal();
    }

    public static final void dropFtsSyncTriggers(SupportSQLiteDatabase db) {
        AbstractC3292y.i(db, "db");
        List c8 = AbstractC1435t.c();
        Cursor query = db.query("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (query.moveToNext()) {
            try {
                c8.add(query.getString(0));
            } finally {
            }
        }
        I i8 = I.f8786a;
        AbstractC1677b.a(query, null);
        for (String triggerName : AbstractC1435t.a(c8)) {
            AbstractC3292y.h(triggerName, "triggerName");
            if (n.B(triggerName, "room_fts_content_sync_", false, 2, null)) {
                db.execSQL("DROP TRIGGER IF EXISTS " + triggerName);
            }
        }
    }

    public static final void foreignKeyCheck(SupportSQLiteDatabase db, String tableName) {
        AbstractC3292y.i(db, "db");
        AbstractC3292y.i(tableName, "tableName");
        Cursor query = db.query("PRAGMA foreign_key_check(`" + tableName + "`)");
        try {
            if (query.getCount() <= 0) {
                I i8 = I.f8786a;
                AbstractC1677b.a(query, null);
                return;
            }
            throw new SQLiteConstraintException(processForeignKeyCheckFailure(query));
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1677b.a(query, th);
                throw th2;
            }
        }
    }

    private static final String processForeignKeyCheckFailure(Cursor cursor) {
        StringBuilder sb = new StringBuilder();
        int count = cursor.getCount();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor.moveToNext()) {
            if (cursor.isFirst()) {
                sb.append("Foreign key violation(s) detected in '");
                sb.append(cursor.getString(0));
                sb.append("'.\n");
            }
            String constraintIndex = cursor.getString(3);
            if (!linkedHashMap.containsKey(constraintIndex)) {
                AbstractC3292y.h(constraintIndex, "constraintIndex");
                String string = cursor.getString(2);
                AbstractC3292y.h(string, "cursor.getString(2)");
                linkedHashMap.put(constraintIndex, string);
            }
        }
        sb.append("Number of different violations discovered: ");
        sb.append(linkedHashMap.keySet().size());
        sb.append("\n");
        sb.append("Number of rows in violation: ");
        sb.append(count);
        sb.append("\n");
        sb.append("Violation(s) detected in the following constraint(s):\n");
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            sb.append("\tParent Table = ");
            sb.append(str2);
            sb.append(", Foreign Key Constraint Index = ");
            sb.append(str);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public static final Cursor query(RoomDatabase db, SupportSQLiteQuery sqLiteQuery, boolean z8) {
        AbstractC3292y.i(db, "db");
        AbstractC3292y.i(sqLiteQuery, "sqLiteQuery");
        return query(db, sqLiteQuery, z8, null);
    }

    public static final int readVersion(File databaseFile) throws IOException {
        AbstractC3292y.i(databaseFile, "databaseFile");
        FileChannel channel = new FileInputStream(databaseFile).getChannel();
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i8 = allocate.getInt();
                AbstractC1677b.a(channel, null);
                return i8;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC1677b.a(channel, th);
                throw th2;
            }
        }
    }

    public static final Cursor query(RoomDatabase db, SupportSQLiteQuery sqLiteQuery, boolean z8, CancellationSignal cancellationSignal) {
        AbstractC3292y.i(db, "db");
        AbstractC3292y.i(sqLiteQuery, "sqLiteQuery");
        Cursor query = db.query(sqLiteQuery, cancellationSignal);
        if (!z8 || !(query instanceof AbstractWindowedCursor)) {
            return query;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) query;
        int count = abstractWindowedCursor.getCount();
        return (Build.VERSION.SDK_INT < 23 || (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) ? CursorUtil.copyAndClose(query) : query;
    }
}
