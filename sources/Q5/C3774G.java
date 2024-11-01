package q5;

import android.content.Context;
import c5.T;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: q5.G, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3774G {

    /* renamed from: a, reason: collision with root package name */
    public static final a f37268a = new a(null);

    /* renamed from: q5.G$a */
    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    private final void c(MBridgeSDK mBridgeSDK, Context context) {
        mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap("288115", "7e5347690cfae30d311f1b31465c33f6"), context, new b());
    }

    public final void a(Context context, boolean z8) {
        AbstractC3292y.i(context, "context");
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        AbstractC3292y.h(mBridgeSDK, "getMBridgeSDK(...)");
        mBridgeSDK.setConsentStatus(context, z8 ? 1 : 0);
    }

    public final void b(boolean z8) {
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        AbstractC3292y.h(mBridgeSDK, "getMBridgeSDK(...)");
        mBridgeSDK.setDoNotTrackStatus(z8);
    }

    public final void d(Context context) {
        AbstractC3292y.i(context, "context");
        T e8 = T.f15689k.e(context);
        if (e8 == null || !e8.y()) {
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            AbstractC3292y.h(mBridgeSDK, "getMBridgeSDK(...)");
            c(mBridgeSDK, context);
        }
    }

    /* renamed from: q5.G$b */
    /* loaded from: classes5.dex */
    public static final class b implements SDKInitStatusListener {
        b() {
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitFail(String errorMsg) {
            AbstractC3292y.i(errorMsg, "errorMsg");
        }

        @Override // com.mbridge.msdk.out.SDKInitStatusListener
        public void onInitSuccess() {
        }
    }
}
