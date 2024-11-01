package t5;

import J4.j;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4053v extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private TextView f40020a;

    /* renamed from: b, reason: collision with root package name */
    private TextView f40021b;

    /* renamed from: c, reason: collision with root package name */
    private ImageView f40022c;

    /* renamed from: d, reason: collision with root package name */
    private TextView f40023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4053v(View itemView) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.tv_name_app_fn);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f40020a = (TextView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_desc_app_fn);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f40021b = (TextView) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.iv_logo_app_fn);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f40022c = (ImageView) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_install_fn);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f40023d = (TextView) findViewById4;
        TextView textView = this.f40020a;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        this.f40021b.setTypeface(aVar.v());
        this.f40023d.setTypeface(aVar.u());
    }

    public final ImageView a() {
        return this.f40022c;
    }

    public final TextView b() {
        return this.f40021b;
    }

    public final TextView c() {
        return this.f40023d;
    }

    public final TextView d() {
        return this.f40020a;
    }
}
