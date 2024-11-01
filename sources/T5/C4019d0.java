package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1978b;
import c5.C2041f;
import com.uptodown.R;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;

/* renamed from: t5.d0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4019d0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1978b f39875a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f39876b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f39877c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f39878d;

    /* renamed from: e, reason: collision with root package name */
    private final TextView f39879e;

    /* renamed from: f, reason: collision with root package name */
    private final TextView f39880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4019d0(View itemView, InterfaceC1978b interfaceC1978b, Context context) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        this.f39875a = interfaceC1978b;
        this.f39876b = context;
        View findViewById = itemView.findViewById(R.id.iv_icon_positive);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39877c = (ImageView) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_name_app_positive);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f39878d = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_version_app_positive);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        TextView textView2 = (TextView) findViewById3;
        this.f39879e = textView2;
        View findViewById4 = itemView.findViewById(R.id.tv_count_positives);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView3 = (TextView) findViewById4;
        this.f39880f = textView3;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: t5.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4019d0.b(C4019d0.this, view);
            }
        });
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.v());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4019d0 c4019d0, View view) {
        int bindingAdapterPosition;
        if (c4019d0.f39875a != null && (bindingAdapterPosition = c4019d0.getBindingAdapterPosition()) != -1) {
            c4019d0.f39875a.a(bindingAdapterPosition);
        }
    }

    public final void c(C2041f c2041f) {
        if (c2041f != null) {
            this.f39877c.setImageDrawable(C3770C.f37260a.j(this.f39876b, c2041f.Q(), R.drawable.vector_uptodown_logo_bag_disabled));
            this.f39878d.setText(c2041f.z());
            this.f39879e.setText(c2041f.h0());
            if (c2041f.U() != null) {
                kotlin.jvm.internal.Y y8 = kotlin.jvm.internal.Y.f34578a;
                String string = this.f39876b.getString(R.string.x_positives);
                AbstractC3292y.h(string, "getString(...)");
                c5.F U8 = c2041f.U();
                AbstractC3292y.f(U8);
                String format = String.format(string, Arrays.copyOf(new Object[]{String.valueOf(U8.b())}, 1));
                AbstractC3292y.h(format, "format(...)");
                this.f39880f.setText(format);
            }
        }
    }
}
