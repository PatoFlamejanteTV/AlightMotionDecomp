package s5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class t extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f39159a;

    public t(Context context) {
        AbstractC3292y.i(context, "context");
        this.f39159a = context.getResources().getDimensionPixelSize(R.dimen.margin_m);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3292y.i(outRect, "outRect");
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(parent, "parent");
        AbstractC3292y.i(state, "state");
        if (parent.getChildAdapterPosition(view) == 0) {
            int i8 = this.f39159a;
            outRect.left = i8;
            outRect.right = i8;
            return;
        }
        outRect.right = this.f39159a;
    }
}
