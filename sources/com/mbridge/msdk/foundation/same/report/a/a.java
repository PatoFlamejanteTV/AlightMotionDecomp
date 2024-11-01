package com.mbridge.msdk.foundation.same.report.a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.h;
import com.mbridge.msdk.foundation.tools.z;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    protected Context f21044a;

    /* renamed from: b, reason: collision with root package name */
    protected h f21045b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.h f21046c;

    public a(h hVar) {
        Context context;
        this.f21046c = null;
        this.f21045b = hVar;
        Context c8 = c.m().c();
        this.f21044a = c8;
        this.f21046c = com.mbridge.msdk.foundation.db.h.a(c8);
        if (this.f21045b != null && (context = this.f21044a) != null) {
            int l8 = z.l(context);
            this.f21045b.d(l8);
            this.f21045b.c(z.a(this.f21044a, l8));
        }
    }

    public final void a() {
        if (this.f21045b != null) {
            l.a(this.f21046c).a(this.f21045b);
        }
    }

    public final void b(int i8) {
        h hVar = this.f21045b;
        if (hVar != null) {
            hVar.a(i8);
        }
    }

    public final void c(int i8) {
        h hVar = this.f21045b;
        if (hVar != null) {
            hVar.c(i8);
        }
    }

    public final void b(String str) {
        h hVar = this.f21045b;
        if (hVar != null) {
            hVar.b(str);
        }
    }

    public final void a(int i8) {
        h hVar = this.f21045b;
        if (hVar != null) {
            hVar.b(i8);
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f21045b.a(str);
    }
}
