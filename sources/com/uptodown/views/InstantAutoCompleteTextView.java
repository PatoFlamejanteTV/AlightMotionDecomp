package com.uptodown.views;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class InstantAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstantAutoCompleteTextView(Context arg0, AttributeSet attributeSet) {
        super(arg0, attributeSet);
        AbstractC3292y.i(arg0, "arg0");
    }

    @Override // android.widget.AutoCompleteTextView
    public boolean enoughToFilter() {
        return true;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        if (z8 && getAdapter() != null) {
            performFiltering(getText(), 0);
        }
    }
}
