package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ViewLayerContainer extends DrawChildContainer {
    public static final int $stable = 0;

    public ViewLayerContainer(Context context) {
        super(context);
    }

    @Override // androidx.compose.ui.platform.DrawChildContainer, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    protected final void dispatchGetDisplayList() {
    }
}
