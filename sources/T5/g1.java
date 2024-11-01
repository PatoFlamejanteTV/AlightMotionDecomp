package t5;

import J4.j;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;
import q5.C3770C;

/* loaded from: classes5.dex */
public final class g1 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final LinearLayout f39906a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f39907b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f39908c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(View itemView, Context context, final b5.K listener) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        View findViewById = itemView.findViewById(R.id.ll_no_tracking_container_updates);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39906a = (LinearLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.tv_no_tracking_msg_updates);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f39907b = textView;
        View findViewById3 = itemView.findViewById(R.id.tv_gdpr_set_up_updates);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        TextView textView2 = (TextView) findViewById3;
        this.f39908c = textView2;
        j.a aVar = J4.j.f4395g;
        textView.setTypeface(aVar.v());
        textView.setText(C3770C.f37260a.c(context.getString(R.string.gdpr_no_tracking_enabled)));
        textView2.setTypeface(aVar.u());
        textView2.setOnClickListener(new View.OnClickListener() { // from class: t5.f1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                g1.b(b5.K.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(b5.K k8, View view) {
        k8.a();
    }

    public final void c(boolean z8) {
        if (z8) {
            this.f39906a.setVisibility(0);
        } else {
            this.f39906a.setVisibility(8);
        }
    }
}
