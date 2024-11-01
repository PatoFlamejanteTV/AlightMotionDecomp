package androidx.leanback.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* loaded from: classes3.dex */
public class VideoSurfaceView extends SurfaceView {
    public VideoSurfaceView(Context context) {
        super(context);
    }

    @Override // android.view.View
    public void setTransitionVisibility(int i8) {
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoSurfaceView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
