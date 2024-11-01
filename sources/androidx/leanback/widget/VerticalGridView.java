package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public class VerticalGridView extends BaseGridView {
    public VerticalGridView(Context context) {
        this(context, null);
    }

    protected void initAttributes(Context context, AttributeSet attributeSet) {
        initBaseGridViewAttributes(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.lbVerticalGridView);
        setColumnWidth(obtainStyledAttributes);
        setNumColumns(obtainStyledAttributes.getInt(R.styleable.lbVerticalGridView_numberOfColumns, 1));
        obtainStyledAttributes.recycle();
    }

    void setColumnWidth(TypedArray typedArray) {
        int i8 = R.styleable.lbVerticalGridView_columnWidth;
        if (typedArray.peekValue(i8) != null) {
            setColumnWidth(typedArray.getLayoutDimension(i8, 0));
        }
    }

    public void setNumColumns(int i8) {
        this.mLayoutManager.setNumRows(i8);
        requestLayout();
    }

    public VerticalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VerticalGridView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mLayoutManager.setOrientation(1);
        initAttributes(context, attributeSet);
    }

    public void setColumnWidth(int i8) {
        this.mLayoutManager.setRowHeight(i8);
        requestLayout();
    }
}
