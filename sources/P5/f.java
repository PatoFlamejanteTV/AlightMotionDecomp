package p5;

import J4.j;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.leanback.widget.Presenter;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class f extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f36347a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f36348b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(View view) {
        super(view);
        AbstractC3292y.i(view, "view");
        View findViewById = view.findViewById(R.id.iv_icon);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f36347a = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.tv_name);
        AbstractC3292y.h(findViewById2, "findViewById(...)");
        TextView textView = (TextView) findViewById2;
        this.f36348b = textView;
        textView.setTypeface(j.f4395g.v());
    }

    public final void a(j5.b tvManageAppsItem) {
        AbstractC3292y.i(tvManageAppsItem, "tvManageAppsItem");
        this.f36348b.setText(tvManageAppsItem.c());
        this.f36347a.setImageResource(tvManageAppsItem.a());
    }
}
