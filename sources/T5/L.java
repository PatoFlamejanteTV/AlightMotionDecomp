package t5;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class L extends RecyclerView.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final RelativeLayout f39726a;

    /* renamed from: b, reason: collision with root package name */
    private final RelativeLayout f39727b;

    /* renamed from: c, reason: collision with root package name */
    private final RelativeLayout f39728c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f39729d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(View itemView) {
        super(itemView);
        AbstractC3292y.i(itemView, "itemView");
        View findViewById = itemView.findViewById(R.id.rl_old_versions_footer);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f39726a = (RelativeLayout) findViewById;
        View findViewById2 = itemView.findViewById(R.id.rl_back_versions);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        this.f39727b = (RelativeLayout) findViewById2;
        View findViewById3 = itemView.findViewById(R.id.rl_forward_versions);
        AbstractC3292y.h(findViewById3, "findViewById(...)");
        this.f39728c = (RelativeLayout) findViewById3;
        View findViewById4 = itemView.findViewById(R.id.tv_current_page_versions);
        AbstractC3292y.h(findViewById4, "findViewById(...)");
        TextView textView = (TextView) findViewById4;
        this.f39729d = textView;
        textView.setTypeface(J4.j.f4395g.u());
    }

    public final RelativeLayout a() {
        return this.f39727b;
    }

    public final RelativeLayout b() {
        return this.f39728c;
    }

    public final RelativeLayout c() {
        return this.f39726a;
    }

    public final TextView d() {
        return this.f39729d;
    }
}
