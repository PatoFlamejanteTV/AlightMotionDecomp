package androidx.leanback.database;

import android.database.Cursor;

/* loaded from: classes3.dex */
public abstract class CursorMapper {
    private Cursor mCursor;

    protected abstract Object bind(Cursor cursor);

    protected abstract void bindColumns(Cursor cursor);

    public Object convert(Cursor cursor) {
        if (cursor != this.mCursor) {
            this.mCursor = cursor;
            bindColumns(cursor);
        }
        return bind(this.mCursor);
    }
}
