package androidx.leanback.widget;

import android.database.Cursor;
import android.util.LruCache;
import androidx.leanback.database.CursorMapper;

/* loaded from: classes3.dex */
public class CursorObjectAdapter extends ObjectAdapter {
    private static final int CACHE_SIZE = 100;
    private Cursor mCursor;
    private final LruCache<Integer, Object> mItemCache;
    private CursorMapper mMapper;

    public CursorObjectAdapter(PresenterSelector presenterSelector) {
        super(presenterSelector);
        this.mItemCache = new LruCache<>(100);
    }

    public void changeCursor(Cursor cursor) {
        Cursor cursor2 = this.mCursor;
        if (cursor == cursor2) {
            return;
        }
        if (cursor2 != null) {
            cursor2.close();
        }
        this.mCursor = cursor;
        this.mItemCache.trimToSize(0);
        onCursorChanged();
    }

    public void close() {
        Cursor cursor = this.mCursor;
        if (cursor != null) {
            cursor.close();
            this.mCursor = null;
        }
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public Object get(int i8) {
        Cursor cursor = this.mCursor;
        if (cursor == null) {
            return null;
        }
        if (cursor.moveToPosition(i8)) {
            Object obj = this.mItemCache.get(Integer.valueOf(i8));
            if (obj != null) {
                return obj;
            }
            Object convert = this.mMapper.convert(this.mCursor);
            this.mItemCache.put(Integer.valueOf(i8), convert);
            return convert;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final Cursor getCursor() {
        return this.mCursor;
    }

    public final CursorMapper getMapper() {
        return this.mMapper;
    }

    protected final void invalidateCache(int i8) {
        this.mItemCache.remove(Integer.valueOf(i8));
    }

    public boolean isClosed() {
        Cursor cursor = this.mCursor;
        if (cursor != null && !cursor.isClosed()) {
            return false;
        }
        return true;
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public boolean isImmediateNotifySupported() {
        return true;
    }

    protected void onCursorChanged() {
        notifyChanged();
    }

    protected void onMapperChanged() {
    }

    public final void setMapper(CursorMapper cursorMapper) {
        boolean z8;
        if (this.mMapper != cursorMapper) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mMapper = cursorMapper;
        if (z8) {
            onMapperChanged();
        }
    }

    @Override // androidx.leanback.widget.ObjectAdapter
    public int size() {
        Cursor cursor = this.mCursor;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    public Cursor swapCursor(Cursor cursor) {
        Cursor cursor2 = this.mCursor;
        if (cursor == cursor2) {
            return cursor2;
        }
        this.mCursor = cursor;
        this.mItemCache.trimToSize(0);
        onCursorChanged();
        return cursor2;
    }

    protected final void invalidateCache(int i8, int i9) {
        int i10 = i9 + i8;
        while (i8 < i10) {
            invalidateCache(i8);
            i8++;
        }
    }

    public CursorObjectAdapter(Presenter presenter) {
        super(presenter);
        this.mItemCache = new LruCache<>(100);
    }

    public CursorObjectAdapter() {
        this.mItemCache = new LruCache<>(100);
    }
}
