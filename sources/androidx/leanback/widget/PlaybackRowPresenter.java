package androidx.leanback.widget;

import android.view.View;
import androidx.leanback.widget.RowPresenter;

/* loaded from: classes3.dex */
public abstract class PlaybackRowPresenter extends RowPresenter {

    /* loaded from: classes3.dex */
    public static class ViewHolder extends RowPresenter.ViewHolder {
        public ViewHolder(View view) {
            super(view);
        }
    }

    public void onReappear(RowPresenter.ViewHolder viewHolder) {
    }
}
