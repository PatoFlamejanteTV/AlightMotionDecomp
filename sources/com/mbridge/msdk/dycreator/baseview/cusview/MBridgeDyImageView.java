package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.ad;

/* loaded from: classes4.dex */
public class MBridgeDyImageView extends ImageView {
    public MBridgeDyImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            ad.b("MBridgeDyImageView", th.getMessage());
        }
    }

    public MBridgeDyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeDyImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
