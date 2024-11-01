package s5;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.activities.preferences.SettingsPreferences;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class r extends RecyclerView.ItemDecoration {

    /* renamed from: a, reason: collision with root package name */
    private final int f39156a;

    public r(int i8) {
        this.f39156a = i8;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        AbstractC3292y.i(outRect, "outRect");
        AbstractC3292y.i(view, "view");
        AbstractC3292y.i(parent, "parent");
        AbstractC3292y.i(state, "state");
        SettingsPreferences.a aVar = SettingsPreferences.f30529b;
        Context context = view.getContext();
        AbstractC3292y.h(context, "getContext(...)");
        if (AbstractC3292y.d(aVar.p(context), "ar")) {
            outRect.right = this.f39156a;
            outRect.left = 0;
            if (parent.getChildLayoutPosition(view) == state.getItemCount() - 1) {
                outRect.left = this.f39156a;
                return;
            }
            return;
        }
        outRect.left = this.f39156a;
        outRect.right = 0;
        if (parent.getChildLayoutPosition(view) == state.getItemCount() - 1) {
            outRect.right = this.f39156a;
        }
    }
}
