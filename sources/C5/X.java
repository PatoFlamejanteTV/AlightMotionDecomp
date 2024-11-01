package c5;

import android.widget.RelativeLayout;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public final class X {

    /* renamed from: c, reason: collision with root package name */
    public static final a f15715c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private int f15716a;

    /* renamed from: b, reason: collision with root package name */
    public RelativeLayout f15717b;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public final int a() {
        return this.f15716a;
    }

    public final String b() {
        int i8 = this.f15716a;
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 != 3) {
                    if (i8 != 4) {
                        if (i8 != 5) {
                            return "null";
                        }
                        return "login";
                    }
                    return "permissions";
                }
                return "continue";
            }
            return "deeplink";
        }
        return "welcome";
    }

    public final RelativeLayout c() {
        RelativeLayout relativeLayout = this.f15717b;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        AbstractC3292y.y(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        return null;
    }

    public final void d(int i8) {
        this.f15716a = i8;
    }

    public final void e(RelativeLayout relativeLayout) {
        AbstractC3292y.i(relativeLayout, "<set-?>");
        this.f15717b = relativeLayout;
    }
}
