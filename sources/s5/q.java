package s5;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class q extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f39152a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39153b;

    /* renamed from: c, reason: collision with root package name */
    private final int f39154c;

    /* renamed from: d, reason: collision with root package name */
    private final int f39155d;

    public q(int i8, int i9, int i10, int i11) {
        this.f39152a = i8;
        this.f39153b = i9;
        this.f39154c = i10;
        this.f39155d = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3292y.i(outRect, "outRect");
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(parent, "parent");
        AbstractC3292y.i(state, "state");
        outRect.left = this.f39152a;
        outRect.right = this.f39153b;
        outRect.bottom = this.f39154c;
        outRect.top = this.f39155d;
        if (parent.getChildLayoutPosition(view) > 0) {
            outRect.top = 0;
        }
    }
}
