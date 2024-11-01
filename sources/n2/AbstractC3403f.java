package n2;

import com.stripe.android.model.o;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC3284p;

/* renamed from: n2.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3403f {

    /* renamed from: a, reason: collision with root package name */
    public static final a f35323a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f35324b = 8;

    /* renamed from: c, reason: collision with root package name */
    private static final TimeUnit f35325c = TimeUnit.SECONDS;

    /* renamed from: d, reason: collision with root package name */
    private static final long f35326d = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: n2.f$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final AbstractC3403f a() {
            b();
            throw new IllegalStateException("Attempted to get instance of CustomerSession without initialization.".toString());
        }

        public final AbstractC3403f b() {
            AbstractC3403f.a();
            return null;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* renamed from: n2.f$b */
    /* loaded from: classes4.dex */
    public interface b {
    }

    public static final /* synthetic */ AbstractC3403f a() {
        return null;
    }

    public static /* synthetic */ void b(AbstractC3403f abstractC3403f, o.p pVar, Integer num, String str, String str2, Set set, b bVar, int i8, Object obj) {
        throw null;
    }
}
