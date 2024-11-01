package t5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: t5.v0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4054v0 extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final b5.t f40024a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f40025b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f40026c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4054v0(View itemView, String text, b5.t tVar) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(text, "text");
        this.f40024a = tVar;
        View findViewById = itemView.findViewById(R.id.tv_system_apps_title);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.f40025b = textView;
        this.f40026c = (ImageView) itemView.findViewById(R.id.iv_title_info);
        textView.setTypeface(J4.j.f4395g.u());
        textView.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(C4054v0 c4054v0, View view) {
        c4054v0.f40024a.a();
    }

    public final void b(boolean z8) {
        if (z8) {
            this.f40025b.setVisibility(0);
        } else {
            this.f40025b.setVisibility(8);
        }
        if (this.f40024a != null) {
            ImageView imageView = this.f40026c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f40026c;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: t5.u0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        C4054v0.c(C4054v0.this, view);
                    }
                });
                return;
            }
            return;
        }
        ImageView imageView3 = this.f40026c;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }
}
