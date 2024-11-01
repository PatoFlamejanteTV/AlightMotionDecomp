package l5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.Presenter;
import c5.C2043h;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class q extends Presenter {

    /* renamed from: a, reason: collision with root package name */
    private int f34752a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f34753b = -1;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(q qVar, View view, boolean z8) {
        AbstractC3292y.f(view);
        qVar.c(view, z8);
    }

    private final void c(View view, boolean z8) {
        int i8;
        if (z8) {
            i8 = this.f34752a;
        } else {
            i8 = this.f34753b;
        }
        view.setBackgroundColor(i8);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object object) {
        AbstractC3292y.i(viewHolder, "viewHolder");
        AbstractC3292y.i(object, "object");
        ((p5.i) viewHolder).a((C2043h) object);
    }

    @Override // androidx.leanback.widget.Presenter
    public Presenter.ViewHolder onCreateViewHolder(ViewGroup parent) {
        AbstractC3292y.i(parent, "parent");
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.tv_program_day, parent, false);
        this.f34753b = ContextCompat.getColor(parent.getContext(), R.color.main_blue);
        this.f34752a = ContextCompat.getColor(parent.getContext(), R.color.main_blue_pressed);
        inflate.setFocusable(true);
        inflate.setFocusableInTouchMode(true);
        inflate.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: l5.p
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z8) {
                q.b(q.this, view, z8);
            }
        });
        AbstractC3292y.f(inflate);
        c(inflate, false);
        return new p5.i(inflate);
    }

    @Override // androidx.leanback.widget.Presenter
    public void onUnbindViewHolder(Presenter.ViewHolder viewHolder) {
        AbstractC3292y.i(viewHolder, "viewHolder");
    }
}
