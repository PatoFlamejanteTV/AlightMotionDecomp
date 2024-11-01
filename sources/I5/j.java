package I5;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.text.style.ClickableSpan;
import android.view.View;
import com.inmobi.cmp.model.ChoiceError;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class j extends ClickableSpan {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f3786a;

    public j(f fVar) {
        this.f3786a = fVar;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        AbstractC3292y.i(view, "view");
        try {
            l lVar = this.f3786a.f3775h;
            l lVar2 = null;
            if (lVar == null) {
                AbstractC3292y.y("viewModel");
                lVar = null;
            }
            if (lVar.f3798h.f9864g.length() > 0) {
                f fVar = this.f3786a;
                Intent intent = new Intent("android.intent.action.VIEW");
                l lVar3 = this.f3786a.f3775h;
                if (lVar3 == null) {
                    AbstractC3292y.y("viewModel");
                } else {
                    lVar2 = lVar3;
                }
                intent.setData(Uri.parse(lVar2.f3798h.f9864g));
                fVar.startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            A5.b.a(A5.b.f238a, ChoiceError.INVALID_URL, null, null, null, null, 30);
        }
    }
}
