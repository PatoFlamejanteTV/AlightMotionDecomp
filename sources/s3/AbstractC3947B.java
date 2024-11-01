package s3;

import android.content.Context;
import b4.C1971b;
import b4.InterfaceC1970a;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: s3.B, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC3947B {

    /* renamed from: a, reason: collision with root package name */
    public static final a f38929a = new a(null);

    /* renamed from: s3.B$a */
    /* loaded from: classes4.dex */
    public static final class a {
        private a() {
        }

        public final c4.p a() {
            return new c4.p();
        }

        public final InterfaceC1970a b(Context context, boolean z8, U5.g workContext) {
            AbstractC3292y.i(context, "context");
            AbstractC3292y.i(workContext, "workContext");
            return new C1971b(context, z8, workContext);
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }
}
