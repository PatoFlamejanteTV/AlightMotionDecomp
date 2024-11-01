package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* loaded from: classes4.dex */
public class ObservableScrollView extends HorizontalScrollView {

    /* renamed from: a, reason: collision with root package name */
    private a f23490a;

    public ObservableScrollView(Context context) {
        super(context);
        this.f23490a = null;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i8) {
        super.fling(i8 / 4);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i8, int i9, int i10, int i11) {
        super.onScrollChanged(i8, i9, i10, i11);
        a aVar = this.f23490a;
        if (aVar != null) {
            aVar.a(this, i8, i9, i10, i11);
        }
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f23490a = null;
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23490a = null;
    }
}
