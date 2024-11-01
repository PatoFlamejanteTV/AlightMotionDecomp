package t5;

import J4.j;
import android.content.Context;
import android.content.pm.PackageManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import b5.InterfaceC1973B;
import c5.C2041f;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.q0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4045q0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC1973B f39986a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f39987b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f39988c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f39989d;

    /* renamed from: e, reason: collision with root package name */
    private final ImageView f39990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4045q0(View itemView, InterfaceC1973B interfaceC1973B) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        this.f39986a = interfaceC1973B;
        View findViewById = itemView.findViewById(R.id.tv_name_rollback_item);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.f39987b = textView;
        View findViewById2 = itemView.findViewById(R.id.tv_version_rollback_item);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView2 = (TextView) findViewById2;
        this.f39988c = textView2;
        View findViewById3 = itemView.findViewById(R.id.tv_size_rollback_item);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        TextView textView3 = (TextView) findViewById3;
        this.f39989d = textView3;
        View findViewById4 = itemView.findViewById(R.id.iv_icon_rollback_item);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        this.f39990e = (ImageView) findViewById4;
        itemView.setOnClickListener(new View.OnClickListener() { // from class: t5.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4045q0.b(C4045q0.this, view);
            }
        });
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.u());
        textView2.setTypeface(aVar.v());
        textView3.setTypeface(aVar.u());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4045q0 c4045q0, View view) {
        int bindingAdapterPosition;
        if (c4045q0.f39986a != null && (bindingAdapterPosition = c4045q0.getBindingAdapterPosition()) != -1) {
            c4045q0.f39986a.a(bindingAdapterPosition);
        }
    }

    public final void c(C2041f item, Context context) {
        AbstractC3292y.i(item, "item");
        AbstractC3292y.i(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3292y.h(packageManager, "getPackageManager(...)");
            String Q8 = item.Q();
            AbstractC3292y.f(Q8);
            this.f39990e.setImageDrawable(S4.r.d(packageManager, Q8, 0).applicationInfo.loadIcon(context.getPackageManager()));
        } catch (Exception e8) {
            this.f39990e.setImageDrawable(ContextCompat.getDrawable(context, R.drawable.vector_uptodown_logo_bag_disabled));
            e8.printStackTrace();
        }
        this.f39987b.setText(item.z());
        this.f39988c.setText(item.h0());
        this.f39989d.setText(item.a0());
    }
}
