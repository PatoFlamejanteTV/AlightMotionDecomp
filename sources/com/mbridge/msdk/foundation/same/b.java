package com.mbridge.msdk.foundation.same;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.af;

/* loaded from: classes4.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f20698a;

    /* renamed from: b, reason: collision with root package name */
    private Boolean f20699b = null;

    /* renamed from: c, reason: collision with root package name */
    private Boolean f20700c = null;

    private b() {
    }

    public static b a() {
        if (f20698a == null) {
            synchronized (b.class) {
                try {
                    if (f20698a == null) {
                        f20698a = new b();
                    }
                } finally {
                }
            }
        }
        return f20698a;
    }

    public final Boolean b() {
        return this.f20699b;
    }

    public final Boolean c() {
        return this.f20700c;
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.equals("new_bridge_reward_video")) {
            boolean a9 = af.a().a("new_bridge_reward_video", false, false);
            this.f20699b = Boolean.valueOf(a9);
            return a9;
        }
        if (!str.equals("new_bridge_new_interstitial_video")) {
            return false;
        }
        boolean a10 = af.a().a("new_bridge_new_interstitial_video", false, false);
        this.f20700c = Boolean.valueOf(a10);
        return a10;
    }
}
