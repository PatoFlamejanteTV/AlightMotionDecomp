package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.leanback.R;

/* loaded from: classes3.dex */
public final class ListRowView extends LinearLayout {
    private HorizontalGridView mGridView;

    public ListRowView(Context context) {
        this(context, null);
    }

    public HorizontalGridView getGridView() {
        return this.mGridView;
    }

    public ListRowView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ListRowView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        LayoutInflater.from(context).inflate(R.layout.lb_list_row, this);
        HorizontalGridView horizontalGridView = (HorizontalGridView) findViewById(R.id.row_content);
        this.mGridView = horizontalGridView;
        horizontalGridView.setHasFixedSize(false);
        setOrientation(1);
        setDescendantFocusability(262144);
    }
}
