package I5;

import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class i extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3785a;

    public i(f fVar) {
        this.f3785a = fVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        AbstractC3292y.i(view, "view");
        FragmentActivity activity = this.f3785a.getActivity();
        if (activity != null) {
            activity.getSupportFragmentManager().beginTransaction().add(new x5.i(), x5.i.f41101F).add(new G5.h(), G5.h.f3083r).commit();
        }
    }
}
