package t5;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.w, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4055w extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private ImageView f40027a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f40028b;

    /* renamed from: c, reason: collision with root package name */
    private ProgressBar f40029c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4055w(View itemView) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.iv_icon_fqi);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f40027a = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_counter_fqi);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f40028b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.pb_fqi);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f40029c = (ProgressBar) findViewById3;
        this.f40028b.setTypeface(J4.j.f4395g.u());
    }

    public final ImageView a() {
        return this.f40027a;
    }

    public final ProgressBar b() {
        return this.f40029c;
    }

    public final TextView c() {
        return this.f40028b;
    }
}
