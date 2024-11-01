package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.R;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class DrawChildContainer extends ViewGroup {
    public static final int $stable = 8;
    private boolean isDrawing;

    public DrawChildContainer(Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            AbstractC3292y.g(childAt, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            if (((ViewLayer) childAt).isInvalidated()) {
                this.isDrawing = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.isDrawing = false;
                }
            }
        }
    }

    public final void drawChild$ui_release(androidx.compose.ui.graphics.Canvas canvas, View view, long j8) {
        super.drawChild(AndroidCanvas_androidKt.getNativeCanvas(canvas), view, j8);
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.isDrawing) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        setMeasuredDimension(0, 0);
    }
}
