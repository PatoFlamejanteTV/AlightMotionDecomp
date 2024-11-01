package s5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class p extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f39151a;

    public p(int i8) {
        this.f39151a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3292y.i(outRect, "outRect");
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(parent, "parent");
        AbstractC3292y.i(state, "state");
        int childLayoutPosition = parent.getChildLayoutPosition(view);
        if (childLayoutPosition == 1) {
            outRect.top = this.f39151a / 2;
        } else if (childLayoutPosition > 1) {
            outRect.top = this.f39151a;
        }
    }
}
