package O;

import P.InterfaceC1379c;
import android.os.Looper;
import com.google.android.gms.common.api.internal.AbstractC2084b;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Set f6923a = Collections.newSetFromMap(new WeakHashMap());

    /* loaded from: classes3.dex */
    public interface a extends InterfaceC1379c {
    }

    /* loaded from: classes3.dex */
    public interface b extends P.h {
    }

    public static Set b() {
        Set set = f6923a;
        synchronized (set) {
        }
        return set;
    }

    public abstract AbstractC2084b a(AbstractC2084b abstractC2084b);

    public abstract Looper c();

    public boolean d(P.j jVar) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
