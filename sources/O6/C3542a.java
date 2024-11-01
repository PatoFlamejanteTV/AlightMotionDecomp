package o6;

import android.os.Looper;
import java.util.List;
import n6.J0;
import s6.t;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3542a implements t {
    @Override // s6.t
    public String a() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }

    @Override // s6.t
    public J0 b(List list) {
        Looper mainLooper = Looper.getMainLooper();
        if (mainLooper != null) {
            return new C3545d(AbstractC3547f.a(mainLooper, true), null, 2, null);
        }
        throw new IllegalStateException("The main looper is not available");
    }

    @Override // s6.t
    public int c() {
        return 1073741823;
    }
}
