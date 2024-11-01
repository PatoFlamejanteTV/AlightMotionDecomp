package a8;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class f extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    public final View f14169a;

    /* renamed from: b, reason: collision with root package name */
    public final TextView f14170b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f14171c;

    /* renamed from: d, reason: collision with root package name */
    public final TextView f14172d;

    /* renamed from: e, reason: collision with root package name */
    public final TextView f14173e;

    /* renamed from: f, reason: collision with root package name */
    public final TextView f14174f;

    /* renamed from: g, reason: collision with root package name */
    public final TextView f14175g;

    /* renamed from: h, reason: collision with root package name */
    public final TextView f14176h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f14177i;

    /* renamed from: j, reason: collision with root package name */
    public final TextView f14178j;

    /* renamed from: k, reason: collision with root package name */
    public final TextView f14179k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View rootView) {
        super(rootView);
        AbstractC3292y.i(rootView, "rootView");
        View findViewById = rootView.findViewById(M1.b.f6039y);
        AbstractC3292y.h(findViewById, "rootView.findViewById(R.id.disclosure_divider)");
        this.f14169a = findViewById;
        View findViewById2 = rootView.findViewById(M1.b.f5932F0);
        AbstractC3292y.h(findViewById2, "rootView.findViewById(R.…isclosure_purposes_label)");
        this.f14170b = (TextView) findViewById2;
        View findViewById3 = rootView.findViewById(M1.b.f6042z0);
        AbstractC3292y.h(findViewById3, "rootView.findViewById(R.…_disclosure_domain_label)");
        this.f14171c = (TextView) findViewById3;
        View findViewById4 = rootView.findViewById(M1.b.f5924B0);
        AbstractC3292y.h(findViewById4, "rootView.findViewById(R.…disclosure_max_age_label)");
        this.f14172d = (TextView) findViewById4;
        View findViewById5 = rootView.findViewById(M1.b.f5936H0);
        AbstractC3292y.h(findViewById5, "rootView.findViewById(R.…tv_disclosure_type_label)");
        this.f14173e = (TextView) findViewById5;
        View findViewById6 = rootView.findViewById(M1.b.f5928D0);
        AbstractC3292y.h(findViewById6, "rootView.findViewById(R.…tv_disclosure_name_label)");
        this.f14174f = (TextView) findViewById6;
        View findViewById7 = rootView.findViewById(M1.b.f5930E0);
        AbstractC3292y.h(findViewById7, "rootView.findViewById(R.id.tv_disclosure_purposes)");
        this.f14175g = (TextView) findViewById7;
        View findViewById8 = rootView.findViewById(M1.b.f6040y0);
        AbstractC3292y.h(findViewById8, "rootView.findViewById(R.id.tv_disclosure_domain)");
        this.f14176h = (TextView) findViewById8;
        View findViewById9 = rootView.findViewById(M1.b.f5922A0);
        AbstractC3292y.h(findViewById9, "rootView.findViewById(R.id.tv_disclosure_max_age)");
        this.f14177i = (TextView) findViewById9;
        View findViewById10 = rootView.findViewById(M1.b.f5934G0);
        AbstractC3292y.h(findViewById10, "rootView.findViewById(R.id.tv_disclosure_type)");
        this.f14178j = (TextView) findViewById10;
        View findViewById11 = rootView.findViewById(M1.b.f5926C0);
        AbstractC3292y.h(findViewById11, "rootView.findViewById(R.id.tv_disclosure_name)");
        this.f14179k = (TextView) findViewById11;
    }
}
