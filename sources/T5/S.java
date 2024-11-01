package t5;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class S extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final b5.t f39780a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f39781b;

    /* renamed from: c, reason: collision with root package name */
    private final ImageView f39782c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(View itemView, String text, b5.t tVar) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        AbstractC3292y.i(text, "text");
        this.f39780a = tVar;
        View findViewById = itemView.findViewById(R.id.tv_myappsupdates_title);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        TextView textView = (TextView) findViewById;
        this.f39781b = textView;
        this.f39782c = (ImageView) itemView.findViewById(R.id.iv_myappsupdates_info);
        textView.setTypeface(J4.j.f4395g.u());
        textView.setText(text);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(S s8, View view) {
        s8.f39780a.a();
    }

    public final void b(boolean z8) {
        if (z8) {
            this.f39781b.setVisibility(0);
        } else {
            this.f39781b.setVisibility(8);
        }
        if (this.f39780a != null) {
            ImageView imageView = this.f39782c;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
            ImageView imageView2 = this.f39782c;
            if (imageView2 != null) {
                imageView2.setOnClickListener(new View.OnClickListener() { // from class: t5.Q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        S.c(S.this, view);
                    }
                });
                return;
            }
            return;
        }
        ImageView imageView3 = this.f39782c;
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }
}
