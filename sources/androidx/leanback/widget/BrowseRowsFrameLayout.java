package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class BrowseRowsFrameLayout extends FrameLayout {
    public BrowseRowsFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + i11, marginLayoutParams.height));
    }

    public BrowseRowsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseRowsFrameLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
