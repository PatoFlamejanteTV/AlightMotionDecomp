package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b5.InterfaceC1978b;
import c5.C2041f;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;

/* renamed from: t5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4061z extends AbstractC4032k {

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC1978b f40041d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f40042e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f40043f;

    /* renamed from: g, reason: collision with root package name */
    private final TextView f40044g;

    /* renamed from: h, reason: collision with root package name */
    private final TextView f40045h;

    /* renamed from: i, reason: collision with root package name */
    private final TextView f40046i;

    /* renamed from: j, reason: collision with root package name */
    private final RelativeLayout f40047j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4061z(View itemView, InterfaceC1978b interfaceC1978b, Context context) {
        super(itemView, context);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        this.f40041d = interfaceC1978b;
        this.f40042e = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_free_up_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f40043f = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_free_up_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f40044g = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_size_free_up_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        TextView textView2 = (TextView) findViewById3;
        this.f40045h = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_action_free_up_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView3 = (TextView) findViewById4;
        this.f40046i = textView3;
        View findViewById5 = itemView.findViewById(R.id.rl_container_free_up_item);
        AbstractC3292y.h(findViewById5, "findViewById(...)");
        RelativeLayout relativeLayout = (RelativeLayout) findViewById5;
        this.f40047j = relativeLayout;
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: t5.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4061z.i(C4061z.this, view);
            }
        });
        textView3.setOnClickListener(new View.OnClickListener() { // from class: t5.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4061z.j(C4061z.this, view);
            }
        });
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView3.setTypeface(aVar.u());
        textView2.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(C4061z c4061z, View view) {
        int bindingAdapterPosition;
        if (c4061z.f40041d != null && (bindingAdapterPosition = c4061z.getBindingAdapterPosition()) != -1) {
            c4061z.f40041d.a(bindingAdapterPosition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(C4061z c4061z, View view) {
        InterfaceC1978b interfaceC1978b = c4061z.f40041d;
        if (interfaceC1978b != null) {
            interfaceC1978b.a(c4061z.getBindingAdapterPosition());
        }
    }

    public final void k(C2041f app) {
        AbstractC3292y.i(app, "app");
        this.f40044g.setText(app.z());
        this.f40045h.setText(app.a0());
        this.f40043f.setImageDrawable(C3770C.f37260a.j(this.f40042e, app.Q(), R.drawable.vector_uptodown_logo_bag_disabled));
    }
}
