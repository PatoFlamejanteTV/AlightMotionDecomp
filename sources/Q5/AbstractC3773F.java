package q5;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import kotlin.jvm.internal.AbstractC3284p;
import q5.AbstractC3773F;

/* renamed from: q5.F, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3773F {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37267a = new a(null);

    /* renamed from: q5.F$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c() {
            Process.killProcess(Process.myPid());
        }

        public final void b() {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: q5.E
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC3773F.a.c();
                }
            }, 1000L);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
