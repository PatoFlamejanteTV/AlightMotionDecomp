package s5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class s extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f39157a;

    /* renamed from: b, reason: collision with root package name */
    private final int f39158b;

    public s(Context context, int i8) {
        AbstractC3292y.i(context, "context");
        this.f39157a = i8;
        this.f39158b = context.getResources().getDimensionPixelSize(R.dimen.margin_m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3292y.i(outRect, "outRect");
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(parent, "parent");
        AbstractC3292y.i(state, "state");
        if (parent.getChildAdapterPosition(view) == this.f39157a) {
            outRect.top = this.f39158b;
        }
    }
}
