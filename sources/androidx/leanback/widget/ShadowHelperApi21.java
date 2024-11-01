package androidx.leanback.widget;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class ShadowHelperApi21 {
    static final ViewOutlineProvider sOutlineProvider = new ViewOutlineProvider() { // from class: androidx.leanback.widget.ShadowHelperApi21.1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(1.0f);
        }
    };

    /* loaded from: classes3.dex */
    static class ShadowImpl {
        float mFocusedZ;
        float mNormalZ;
        View mShadowContainer;

        ShadowImpl() {
        }
    }

    private ShadowHelperApi21() {
    }

    public static Object addDynamicShadow(View view, float f8, float f9, int i8) {
        if (i8 > 0) {
            RoundedRectHelperApi21.setClipToRoundedOutline(view, true, i8);
        } else {
            view.setOutlineProvider(sOutlineProvider);
        }
        ShadowImpl shadowImpl = new ShadowImpl();
        shadowImpl.mShadowContainer = view;
        shadowImpl.mNormalZ = f8;
        shadowImpl.mFocusedZ = f9;
        view.setZ(f8);
        return shadowImpl;
    }

    public static void setShadowFocusLevel(Object obj, float f8) {
        ShadowImpl shadowImpl = (ShadowImpl) obj;
        View view = shadowImpl.mShadowContainer;
        float f9 = shadowImpl.mNormalZ;
        view.setZ(f9 + (f8 * (shadowImpl.mFocusedZ - f9)));
    }
}
