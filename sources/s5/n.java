package s5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class n extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f39149a;

    public n(int i8) {
        this.f39149a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3292y.i(outRect, "outRect");
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(parent, "parent");
        AbstractC3292y.i(state, "state");
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        int i8 = this.f39149a;
        outRect.left = i8;
        outRect.right = i8;
        outRect.bottom = i8;
        if (childLayoutPosition > 0) {
            outRect.top = 0;
        } else {
            outRect.top = i8;
        }
    }
}
