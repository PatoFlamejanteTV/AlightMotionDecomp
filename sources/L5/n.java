package l5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import java.io.File;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class n extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f34747a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f34748b = -1;

    private final void a(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = this.f34747a;
        } else {
            i8 = this.f34748b;
        }
        view.setBackgroundColor(i8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(item, "item");
        ((p5.g) viewHolder).a((File) item, viewHolder.view.getContext());
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_download_item, parent, false);
        this.f34748b = ContextCompat.getColor(parent.getContext(), R.color.tv_default_background);
        this.f34747a = ContextCompat.getColor(parent.getContext(), R.color.tv_selected_background);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        AbstractC3292y.f(inflate);
        a(inflate, false);
        return new p5.g(inflate);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
    }
}
