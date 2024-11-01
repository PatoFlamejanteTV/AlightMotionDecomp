package com.mbridge.msdk.foundation.d;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.c.g;
import com.mbridge.msdk.c.h;
import com.mbridge.msdk.c.i;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.d.a.a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.k;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f20401a = -2;

    /* renamed from: b, reason: collision with root package name */
    public static int f20402b = -2;

    /* renamed from: c, reason: collision with root package name */
    public static volatile boolean f20403c = false;

    /* renamed from: d, reason: collision with root package name */
    private final RelativeLayout.LayoutParams f20404d;

    /* renamed from: e, reason: collision with root package name */
    private final ConcurrentHashMap<String, com.mbridge.msdk.foundation.d.a.a> f20405e;

    /* renamed from: f, reason: collision with root package name */
    private g f20406f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f20407a = new b();
    }

    public static b a() {
        return a.f20407a;
    }

    private com.mbridge.msdk.foundation.d.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (this.f20405e.containsKey(str)) {
            return this.f20405e.get(str);
        }
        return null;
    }

    public final boolean b() {
        g b9 = h.a().b(c.m().k());
        this.f20406f = b9;
        if (b9 != null) {
            return false;
        }
        h.a();
        this.f20406f = i.a();
        return false;
    }

    public final void c(String str) {
        try {
            com.mbridge.msdk.foundation.d.a.a d8 = d(str);
            if (d8 != null) {
                d8.a();
            }
            this.f20405e.remove(str);
            f20403c = false;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    private b() {
        this.f20404d = new RelativeLayout.LayoutParams(f20402b, f20401a);
        this.f20405e = new ConcurrentHashMap<>();
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.mbridge.msdk.foundation.d.a aVar) {
        if (b()) {
            com.mbridge.msdk.foundation.d.a.a a9 = a(str);
            if (aVar != null) {
                a9.a(new a.C0398a(str, aVar));
            }
            FeedBackButton d8 = a9.d();
            if (d8 != null) {
                if (layoutParams == null) {
                    int a10 = ai.a(c.m().c(), 10.0f);
                    this.f20404d.setMargins(a10, a10, a10, a10);
                    layoutParams = this.f20404d;
                }
                ViewGroup viewGroup2 = (ViewGroup) d8.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(d8);
                }
                Activity a11 = a(context);
                if (a11 != null && viewGroup == null) {
                    viewGroup = (ViewGroup) a11.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(d8);
                    viewGroup.addView(d8, layoutParams);
                }
            }
        }
    }

    public final FeedBackButton b(String str) {
        return a(str).d();
    }

    public final void b(String str, int i8) {
        a(str).b(i8);
    }

    public final com.mbridge.msdk.foundation.d.a.a a(String str) {
        com.mbridge.msdk.foundation.d.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = c.m().k();
        }
        if (!this.f20405e.containsKey(str)) {
            aVar = new com.mbridge.msdk.foundation.d.a.a(str);
            this.f20405e.put(str, aVar);
        } else {
            aVar = this.f20405e.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.mbridge.msdk.foundation.d.a.a aVar2 = new com.mbridge.msdk.foundation.d.a.a(str);
        this.f20405e.put(str, aVar2);
        return aVar2;
    }

    public final Activity a(Context context) {
        Activity activity;
        Context e8 = c.m().e();
        Activity activity2 = null;
        try {
            Activity activity3 = e8 instanceof Activity ? (Activity) e8 : null;
            try {
                if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                    activity3 = (Activity) context;
                }
                WeakReference<Activity> a9 = c.m().a();
                if (a9 != null && (activity = a9.get()) != null && !activity.isFinishing() && !activity.isDestroyed()) {
                    activity3 = activity;
                }
                if (activity3 == null || activity3.isFinishing()) {
                    return null;
                }
                if (activity3.isDestroyed()) {
                    return null;
                }
                return activity3;
            } catch (Exception e9) {
                e = e9;
                activity2 = activity3;
                e.printStackTrace();
                return activity2;
            }
        } catch (Exception e10) {
            e = e10;
        }
    }

    public final void a(String str, int i8, ViewGroup viewGroup) {
        com.mbridge.msdk.foundation.d.a.a a9 = a(str);
        if (a9.d() != null) {
            a9.c(i8);
            if (i8 == 0) {
                a(str, c.m().c(), viewGroup, (ViewGroup.LayoutParams) null, (com.mbridge.msdk.foundation.d.a) null);
            }
        }
    }

    public final void a(String str, int i8, int i9, int i10, float f8, float f9, float f10, String str2, String str3, float f11, JSONArray jSONArray) {
        com.mbridge.msdk.foundation.d.a.a a9 = a(str);
        Context c8 = c.m().c();
        a9.a(ai.a(c8, f8), ai.a(c8, f9), ai.a(c8, i8), ai.a(c8, i9), ai.a(c8, i10), f10, str2, str3, f11, jSONArray);
    }

    public final void a(String str, int i8, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a a9 = a(str);
        a9.a(new a.C0398a(str, aVar));
        if (i8 == 1) {
            a9.b();
        } else {
            a9.e();
        }
    }

    public final void a(String str, int i8, int i9, String str2, String str3) {
        com.mbridge.msdk.foundation.d.a.a d8 = d(str + "_1");
        if (d8 == null) {
            d8 = d(str + "_2");
            if (d8 == null) {
                d8 = d(str + "_3");
                if (d8 == null) {
                    d8 = d(str + "_4");
                    if (d8 == null) {
                        d8 = a(str);
                    }
                }
            }
            d8.b(0);
        }
        if (d8 != null) {
            CampaignEx c8 = d8.c();
            k.a(c8, c8 != null ? c8.getCampaignUnitId() : "", d8.g(), d8.f(), !TextUtils.isEmpty(str2) ? str2 : "", i8, c8 != null ? c8.getAdType() : 0, i9, str3);
        }
    }

    public final void a(String str, CampaignEx campaignEx) {
        a(str).a(campaignEx);
    }

    public final void a(String str, String str2) {
        a(str).a(str2);
    }

    public final void a(String str, FeedBackButton feedBackButton) {
        a(str).a(feedBackButton);
    }

    public final void a(String str, com.mbridge.msdk.foundation.d.a aVar) {
        com.mbridge.msdk.foundation.d.a.a a9 = a(str);
        if (aVar != null) {
            a9.a(new a.C0398a(str, aVar));
        }
    }

    public final void a(String str, int i8) {
        a(str).a(i8);
    }

    public final boolean a(String str, Context context, MBFeedBackDialog mBFeedBackDialog) {
        if (mBFeedBackDialog == null) {
            ad.c("", "mbAlertDialog  is null");
            return false;
        }
        return a(context, mBFeedBackDialog);
    }

    private boolean a(Context context, MBFeedBackDialog mBFeedBackDialog) {
        Activity a9 = a(context);
        if (a9 == null || mBFeedBackDialog == null || a9.isDestroyed()) {
            return false;
        }
        try {
            if (mBFeedBackDialog.isShowing() || a9.isFinishing()) {
                return false;
            }
            mBFeedBackDialog.show();
            return true;
        } catch (Exception e8) {
            e8.printStackTrace();
            return false;
        }
    }
}
