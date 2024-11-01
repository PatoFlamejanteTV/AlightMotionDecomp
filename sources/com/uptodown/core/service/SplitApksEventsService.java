package com.uptodown.core.service;

import J4.j;
import P4.d;
import S4.h;
import S4.r;
import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import com.uptodown.core.activities.ConfirmationIntentWrapperActivity;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.InterfaceC3487x;

/* loaded from: classes5.dex */
public final class SplitApksEventsService extends Service {

    /* renamed from: a, reason: collision with root package name */
    public static final a f30991a = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final String a(Context c8, String packageName) {
            AbstractC3292y.i(c8, "c");
            AbstractC3292y.i(packageName, "packageName");
            try {
                PackageManager pm = c8.getPackageManager();
                AbstractC3292y.h(pm, "pm");
                return pm.getApplicationLabel(r.a(pm, packageName, 0)).toString();
            } catch (Exception unused) {
                return null;
            }
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0071, code lost:            if (r7 != null) goto L24;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.String a(int r7, android.content.Intent r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 0
            java.lang.String r2 = "android.content.pm.extra.STATUS_MESSAGE"
            r3 = 0
            switch(r7) {
                case 1: goto L82;
                case 2: goto L5a;
                case 3: goto L53;
                case 4: goto L2c;
                case 5: goto L24;
                case 6: goto L1c;
                case 7: goto L14;
                default: goto L8;
            }
        L8:
            int r7 = J4.h.f4332J
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r3 = r8.getStringExtra(r2)
            goto La8
        L14:
            int r7 = J4.h.f4338P
            java.lang.String r7 = r6.getString(r7)
            goto La8
        L1c:
            int r7 = J4.h.f4340R
            java.lang.String r7 = r6.getString(r7)
            goto La8
        L24:
            int r7 = J4.h.f4337O
            java.lang.String r7 = r6.getString(r7)
            goto La8
        L2c:
            int r7 = J4.h.f4339Q
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r4 = r8.getStringExtra(r2)
            if (r4 == 0) goto L4e
            int r5 = r4.length()
            if (r5 != 0) goto L3f
            goto L4e
        L3f:
            java.lang.String r5 = "INSTALL_FAILED_VERSION_DOWNGRADE"
            boolean r0 = l6.n.B(r4, r5, r1, r0, r3)
            if (r0 == 0) goto L4e
            int r8 = J4.h.f4390w
            java.lang.String r3 = r6.getString(r8)
            goto La8
        L4e:
            java.lang.String r3 = r8.getStringExtra(r2)
            goto La8
        L53:
            int r7 = J4.h.f4378o0
            java.lang.String r7 = r6.getString(r7)
            goto La8
        L5a:
            java.lang.String r7 = "android.content.pm.extra.OTHER_PACKAGE_NAME"
            java.lang.String r7 = r8.getStringExtra(r7)
            if (r7 == 0) goto L74
            com.uptodown.core.service.SplitApksEventsService$a r8 = com.uptodown.core.service.SplitApksEventsService.f30991a
            android.content.Context r0 = r6.getApplicationContext()
            java.lang.String r2 = "applicationContext"
            kotlin.jvm.internal.AbstractC3292y.h(r0, r2)
            java.lang.String r7 = r8.a(r0, r7)
            if (r7 == 0) goto L74
            goto L76
        L74:
            java.lang.String r7 = "device"
        L76:
            int r8 = J4.h.f4336N
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r1] = r7
            java.lang.String r7 = r6.getString(r8, r0)
            goto La8
        L82:
            int r7 = J4.h.f4335M
            java.lang.String r7 = r6.getString(r7)
            java.lang.String r4 = r8.getStringExtra(r2)
            if (r4 == 0) goto La4
            int r5 = r4.length()
            if (r5 != 0) goto L95
            goto La4
        L95:
            java.lang.String r5 = "-3001"
            boolean r0 = l6.n.B(r4, r5, r1, r0, r3)
            if (r0 == 0) goto La4
            int r8 = J4.h.f4357e
            java.lang.String r3 = r6.getString(r8)
            goto La8
        La4:
            java.lang.String r3 = r8.getStringExtra(r2)
        La8:
            if (r3 == 0) goto Lbe
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            java.lang.String r7 = ": "
            r8.append(r7)
            r8.append(r3)
            java.lang.String r7 = r8.toString()
        Lbe:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.uptodown.core.service.SplitApksEventsService.a(int, android.content.Intent):java.lang.String");
    }

    private final void b(String str) {
        Intent intent = new Intent("com.uptodown.core.custom_action_installation_status");
        intent.putExtra("com.uptodown.core.installation_status", 2);
        intent.putExtra("com.uptodown.core.error", str);
        sendBroadcast(intent);
    }

    private final void c(int i8, String str) {
        Intent intent = new Intent("com.uptodown.core.custom_action_installation_status");
        intent.putExtra("com.uptodown.core.installation_status", i8);
        if (str != null) {
            intent.putExtra("com.uptodown.core.packagename", str);
        }
        sendBroadcast(intent);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        AbstractC3292y.i(intent, "intent");
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i8, int i9) {
        Parcelable parcelableExtra;
        Object parcelableExtra2;
        String str;
        AbstractC3292y.i(intent, "intent");
        int intExtra = intent.getIntExtra("android.content.pm.extra.STATUS", -999);
        d dVar = new d(intExtra);
        d.a aVar = d.f8093c;
        j.a aVar2 = j.f4395g;
        if (!aVar.a(aVar2.k(), dVar)) {
            aVar2.B(dVar);
            if (intExtra != -1) {
                if (intExtra != 0) {
                    if (intExtra != 3) {
                        P4.a h8 = aVar2.h();
                        aVar2.e();
                        Bundle bundle = new Bundle();
                        bundle.putInt("piStatus", intExtra);
                        Long l8 = null;
                        if (h8 != null) {
                            str = h8.b();
                        } else {
                            str = null;
                        }
                        if (str != null) {
                            bundle.putString("packagename", h8.b());
                        }
                        if (h8 != null) {
                            l8 = Long.valueOf(h8.c());
                        }
                        if (l8 != null && h8.c() > 0) {
                            bundle.putLong("size", h8.c());
                        }
                        Application application = getApplication();
                        AbstractC3292y.g(application, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                        ((j) application).L().send(227, bundle);
                        b(a(intExtra, intent));
                        InterfaceC3487x a9 = h.f9444d.a();
                        if (a9 != null) {
                            a9.v(Boolean.FALSE);
                        }
                    } else {
                        aVar2.e();
                        Bundle bundle2 = new Bundle();
                        bundle2.putInt("piStatus", intExtra);
                        Application application2 = getApplication();
                        AbstractC3292y.g(application2, "null cannot be cast to non-null type com.uptodown.core.UptodownCoreApplication");
                        ((j) application2).L().send(223, bundle2);
                        b(a(intExtra, intent));
                        InterfaceC3487x a10 = h.f9444d.a();
                        if (a10 != null) {
                            a10.v(Boolean.FALSE);
                        }
                    }
                } else {
                    aVar2.e();
                    c(0, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
                    InterfaceC3487x a11 = h.f9444d.a();
                    if (a11 != null) {
                        a11.v(Boolean.TRUE);
                    }
                }
            } else {
                c(1, intent.getStringExtra("android.content.pm.extra.PACKAGE_NAME"));
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelableExtra2 = intent.getParcelableExtra("android.intent.extra.INTENT", Intent.class);
                    parcelableExtra = (Parcelable) parcelableExtra2;
                } else {
                    parcelableExtra = intent.getParcelableExtra("android.intent.extra.INTENT");
                }
                Intent intent2 = new Intent(this, (Class<?>) ConfirmationIntentWrapperActivity.class);
                intent2.putExtra("com.uptodown.sapk.confirmation_intent", (Intent) parcelableExtra);
                intent2.addFlags(268435456);
                startActivity(intent2);
            }
        }
        stopSelf();
        return 2;
    }
}
