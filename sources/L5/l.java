package l5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class l extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f34739a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f34740b = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(l lVar, View view, boolean z8) {
        AbstractC3292y.f(view);
        lVar.c(view, z8);
    }

    private final void c(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = this.f34739a;
        } else {
            i8 = this.f34740b;
        }
        view.setBackgroundColor(i8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object object) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(object, "object");
        ((p5.f) viewHolder).a((j5.b) object);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_manage_apps_item, parent, false);
        this.f34740b = ContextCompat.getColor(parent.getContext(), R.color.main_blue);
        this.f34739a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        inflate.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l5.k
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                l.b(l.this, view, z8);
            }
        });
        AbstractC3292y.f(inflate);
        c(inflate, false);
        return new p5.f(inflate);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
    }
}
