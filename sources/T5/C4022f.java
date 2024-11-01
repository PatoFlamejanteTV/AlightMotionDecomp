package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1978b;
import c5.C2041f;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;
import q5.C3791p;

/* renamed from: t5.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4022f extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1978b f39892a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f39893b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f39894c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f39895d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f39896e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f39897f;

    /* renamed from: g, reason: collision with root package name */
    private final RelativeLayout f39898g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4022f(View itemView, InterfaceC1978b interfaceC1978b, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        this.f39892a = interfaceC1978b;
        this.f39893b = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_installed_app_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39894c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_installed_app_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f39895d = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_version_installed_app_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        TextView textView2 = (TextView) findViewById3;
        this.f39896e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_excluded_installed_app_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView3 = (TextView) findViewById4;
        this.f39897f = textView3;
        View findViewById5 = itemView.findViewById(R.id.rl_installed_app_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById5;
        this.f39898g = relativeLayout;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.u());
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: t5.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4022f.b(C4022f.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4022f c4022f, View view) {
        int bindingAdapterPosition;
        if (c4022f.f39892a != null && (bindingAdapterPosition = c4022f.getBindingAdapterPosition()) != -1) {
            c4022f.f39892a.a(bindingAdapterPosition);
        }
    }

    private final void d(C2041f c2041f) {
        if (c2041f.h()) {
            this.itemView.setAlpha(0.3f);
        } else {
            this.itemView.setAlpha(1.0f);
        }
    }

    public final void c(C2041f c2041f) {
        String str;
        if (c2041f != null) {
            d(c2041f);
            C3791p a9 = C3791p.f37286s.a(this.f39893b);
            a9.a();
            String Q8 = c2041f.Q();
            AbstractC3292y.f(Q8);
            c5.Q s02 = a9.s0(Q8);
            a9.i();
            this.f39894c.setImageDrawable(C3770C.f37260a.j(this.f39893b, c2041f.Q(), R.drawable.vector_uptodown_logo_bag_disabled));
            this.f39895d.setText(c2041f.z());
            this.f39896e.setText(c2041f.h0());
            P4.a h8 = J4.j.f4395g.h();
            if (h8 != null) {
                str = h8.b();
            } else {
                str = null;
            }
            if (l6.n.s(str, c2041f.Q(), true)) {
                this.f39896e.setText(R.string.installing);
            }
            if (c2041f.i() == 1) {
                this.f39897f.setText(this.f39893b.getString(R.string.disabled_updates));
                this.f39897f.setVisibility(0);
            } else if (s02 != null && s02.h() == 1) {
                this.f39897f.setText(this.f39893b.getString(R.string.skipped_update));
                this.f39897f.setVisibility(0);
            } else {
                this.f39897f.setVisibility(8);
            }
        }
    }
}
