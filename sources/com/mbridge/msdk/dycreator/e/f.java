package com.mbridge.msdk.dycreator.e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* loaded from: classes4.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f19924a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.dycreator.a.b f19925b;

    private f(Context context) {
        this.f19925b = null;
        com.mbridge.msdk.dycreator.a.b a9 = com.mbridge.msdk.dycreator.a.b.a();
        this.f19925b = a9;
        a9.a(context, "");
    }

    public static f a(Context context) {
        if (f19924a == null) {
            synchronized (f.class) {
                try {
                    if (f19924a == null) {
                        f19924a = new f(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f19924a;
    }

    public final View a(String str) {
        if (new File(str).exists()) {
            return this.f19925b.f(str);
        }
        return null;
    }

    public final View a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
