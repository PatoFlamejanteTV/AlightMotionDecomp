package q5;

import android.content.Context;
import com.uptodown.UptodownApp;
import kotlin.jvm.internal.AbstractC3292y;
import m0.AbstractC3344a;

/* renamed from: q5.z, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3801z {
    public final void a(Context context) {
        AbstractC3292y.i(context, "context");
        UptodownApp.a aVar = UptodownApp.f29249C;
        if (!aVar.x()) {
            aVar.B0(true);
            try {
                AbstractC3344a.a(context);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }
}
