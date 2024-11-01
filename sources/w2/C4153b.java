package w2;

import Q5.s;
import Q5.t;
import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: w2.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4153b {

    /* renamed from: b, reason: collision with root package name */
    private static final a f40679b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Context f40680a;

    /* renamed from: w2.b$a */
    /* loaded from: classes4.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w2.b$b, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static final class C0914b extends CustomTabsServiceConnection {
        @Override // androidx.browser.customtabs.CustomTabsServiceConnection
        public void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
            AbstractC3292y.i(componentName, "componentName");
            AbstractC3292y.i(customTabsClient, "customTabsClient");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName name) {
            AbstractC3292y.i(name, "name");
        }
    }

    public C4153b(Context context) {
        AbstractC3292y.i(context, "context");
        this.f40680a = context;
    }

    private final boolean b() {
        Object b9;
        try {
            s.a aVar = s.f8810b;
            b9 = s.b(Boolean.valueOf(CustomTabsClient.bindCustomTabsService(this.f40680a, "com.android.chrome", new C0914b())));
        } catch (Throwable th) {
            s.a aVar2 = s.f8810b;
            b9 = s.b(t.a(th));
        }
        Boolean bool = Boolean.FALSE;
        if (s.g(b9)) {
            b9 = bool;
        }
        return ((Boolean) b9).booleanValue();
    }

    public final EnumC4152a a() {
        if (b()) {
            return EnumC4152a.f40675a;
        }
        return EnumC4152a.f40676b;
    }
}
