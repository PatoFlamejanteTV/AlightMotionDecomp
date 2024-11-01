package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import c5.C2041f;
import c5.C2043h;
import com.uptodown.R;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;

/* renamed from: t5.A, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4008A extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39621a;

    /* renamed from: b, reason: collision with root package name */
    private final ImageView f39622b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f39623c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f39624d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4008A(View itemView, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        this.f39621a = context;
        View findViewById = itemView.findViewById(R.id.iv_logo_app);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39622b = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_app_name);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f39623c = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_app_version);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        TextView textView2 = (TextView) findViewById3;
        this.f39624d = textView2;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.v());
    }

    public final void a(C2041f c2041f) {
        if (c2041f != null) {
            this.f39622b.setImageDrawable(C3770C.f37260a.i(this.f39621a, c2041f.Q()));
            this.f39623c.setText(c2041f.z());
            this.f39624d.setText(c2041f.h0());
        }
    }

    public final void b(C2043h c2043h) {
        if (c2043h != null) {
            String k02 = c2043h.k0();
            if (k02 != null && k02.length() != 0) {
                com.squareup.picasso.s.h().l(c2043h.k0()).n(UptodownApp.f29249C.f0(this.f39621a)).i(this.f39622b);
            } else {
                this.f39622b.setImageDrawable(ContextCompat.getDrawable(this.f39621a, R.drawable.vector_app_icon_placeholder));
            }
            this.f39623c.setText(c2043h.q0());
            this.f39624d.setText(c2043h.Z0());
        }
    }
}
