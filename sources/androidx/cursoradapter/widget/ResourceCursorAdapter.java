package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes3.dex */
public abstract class ResourceCursorAdapter extends CursorAdapter {
    private int mDropDownLayout;
    private LayoutInflater mInflater;
    private int mLayout;

    @Deprecated
    public ResourceCursorAdapter(Context context, int i8, Cursor cursor) {
        super(context, cursor);
        this.mDropDownLayout = i8;
        this.mLayout = i8;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newDropDownView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.mInflater.inflate(this.mDropDownLayout, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.CursorAdapter
    public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.mInflater.inflate(this.mLayout, viewGroup, false);
    }

    public void setDropDownViewResource(int i8) {
        this.mDropDownLayout = i8;
    }

    public void setViewResource(int i8) {
        this.mLayout = i8;
    }

    @Deprecated
    public ResourceCursorAdapter(Context context, int i8, Cursor cursor, boolean z8) {
        super(context, cursor, z8);
        this.mDropDownLayout = i8;
        this.mLayout = i8;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public ResourceCursorAdapter(Context context, int i8, Cursor cursor, int i9) {
        super(context, cursor, i9);
        this.mDropDownLayout = i8;
        this.mLayout = i8;
        this.mInflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}
