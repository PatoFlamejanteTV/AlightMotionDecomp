package p5;

import android.view.View;
import android.widget.ImageView;
import androidx.leanback.widget.Presenter;
import c5.C2043h;
import com.squareup.picasso.s;
import com.uptodown.R;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i extends Presenter.ViewHolder {

    /* renamed from: a, reason: collision with root package name */
    private final ImageView f36360a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(View view) {
        super(view);
        AbstractC3292y.i(view, "view");
        View findViewById = view.findViewById(R.id.iv_feature_program_day);
        AbstractC3292y.h(findViewById, "findViewById(...)");
        this.f36360a = (ImageView) findViewById;
    }

    public final void a(C2043h appInfo) {
        AbstractC3292y.i(appInfo, "appInfo");
        s.h().l(appInfo.c0()).i(this.f36360a);
    }
}
