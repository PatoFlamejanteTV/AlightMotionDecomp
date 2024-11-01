package s5;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: s5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3972f extends PagerSnapHelper {
    private final boolean a(LinearLayoutManager linearLayoutManager) {
        if (linearLayoutManager.findFirstCompletelyVisibleItemPosition() != 0 && linearLayoutManager.findLastCompletelyVisibleItemPosition() != linearLayoutManager.getItemCount() - 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
    public View findSnapView(RecyclerView.LayoutManager layoutManager) {
        if ((layoutManager instanceof LinearLayoutManager) && !a((LinearLayoutManager) layoutManager)) {
            return null;
        }
        return super.findSnapView(layoutManager);
    }
}
