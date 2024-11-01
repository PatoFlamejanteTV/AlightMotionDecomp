package androidx.core.database;

import android.database.Cursor;

/* loaded from: classes.dex */
public final class CursorKt {
    public static final byte[] getBlobOrNull(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return cursor.getBlob(i8);
    }

    public static final Double getDoubleOrNull(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Double.valueOf(cursor.getDouble(i8));
    }

    public static final Float getFloatOrNull(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Float.valueOf(cursor.getFloat(i8));
    }

    public static final Integer getIntOrNull(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Integer.valueOf(cursor.getInt(i8));
    }

    public static final Long getLongOrNull(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Long.valueOf(cursor.getLong(i8));
    }

    public static final Short getShortOrNull(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return Short.valueOf(cursor.getShort(i8));
    }

    public static final String getStringOrNull(Cursor cursor, int i8) {
        if (cursor.isNull(i8)) {
            return null;
        }
        return cursor.getString(i8);
    }
}
