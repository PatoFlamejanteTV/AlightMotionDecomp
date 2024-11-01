package androidx.activity;

import Q5.I;
import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.RequiresApi;
import q6.AbstractC3823h;
import q6.InterfaceC3822g;

/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    @RequiresApi(26)
    public static final Object trackPipAnimationHintView(final Activity activity, View view, U5.d dVar) {
        Object collect = AbstractC3823h.e(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).collect(new InterfaceC3822g() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$2
            @Override // q6.InterfaceC3822g
            public final Object emit(Rect rect, U5.d dVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return I.f8786a;
            }
        }, dVar);
        if (collect == V5.b.e()) {
            return collect;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }
}
