package com.mbridge.msdk.foundation.same.g;

import android.webkit.DownloadListener;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class a implements DownloadListener {

    /* renamed from: a, reason: collision with root package name */
    private String f20812a;

    /* renamed from: b, reason: collision with root package name */
    private CampaignEx f20813b;

    public a(CampaignEx campaignEx) {
        this.f20813b = campaignEx;
    }

    public final void a(String str) {
        this.f20812a = str;
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j8) {
    }

    public a() {
    }
}
