package androidx.leanback.widget;

import androidx.leanback.R;
import androidx.leanback.widget.Parallax;
import androidx.leanback.widget.RecyclerViewParallax;

/* loaded from: classes3.dex */
public class DetailsParallax extends RecyclerViewParallax {
    final Parallax.IntProperty mFrameBottom;
    final Parallax.IntProperty mFrameTop;

    public DetailsParallax() {
        RecyclerViewParallax.ChildPositionProperty adapterPosition = addProperty("overviewRowTop").adapterPosition(0);
        int i8 = R.id.details_frame;
        this.mFrameTop = adapterPosition.viewId(i8);
        this.mFrameBottom = addProperty("overviewRowBottom").adapterPosition(0).viewId(i8).fraction(1.0f);
    }

    public Parallax.IntProperty getOverviewRowBottom() {
        return this.mFrameBottom;
    }

    public Parallax.IntProperty getOverviewRowTop() {
        return this.mFrameTop;
    }
}
