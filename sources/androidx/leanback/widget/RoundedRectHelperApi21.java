package androidx.leanback.widget;

import android.graphics.Outline;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.RequiresApi;

@RequiresApi(21)
/* loaded from: classes3.dex */
class RoundedRectHelperApi21 {
    private static final int MAX_CACHED_PROVIDER = 32;
    private static SparseArray<ViewOutlineProvider> sRoundedRectProvider;

    /* loaded from: classes3.dex */
    static final class RoundedRectOutlineProvider extends ViewOutlineProvider {
        private int mRadius;

        RoundedRectOutlineProvider(int i8) {
            this.mRadius = i8;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.mRadius);
            outline.setAlpha(1.0f);
        }
    }

    private RoundedRectHelperApi21() {
    }

    public static void setClipToRoundedOutline(View view, boolean z8, int i8) {
        if (z8) {
            if (sRoundedRectProvider == null) {
                sRoundedRectProvider = new SparseArray<>();
            }
            ViewOutlineProvider viewOutlineProvider = sRoundedRectProvider.get(i8);
            if (viewOutlineProvider == null) {
                viewOutlineProvider = new RoundedRectOutlineProvider(i8);
                if (sRoundedRectProvider.size() < 32) {
                    sRoundedRectProvider.put(i8, viewOutlineProvider);
                }
            }
            view.setOutlineProvider(viewOutlineProvider);
        } else {
            view.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        }
        view.setClipToOutline(z8);
    }
}
