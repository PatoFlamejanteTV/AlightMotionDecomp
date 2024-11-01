package com.mbridge.msdk.newreward.function.d.c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public final class t extends r {
    /* JADX INFO: Access modifiers changed from: protected */
    public t(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar, b bVar2) {
        super(bVar, aVar, bVar2);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.newreward.function.d.c.p
    public final /* bridge */ /* synthetic */ void a(int i8, x xVar) {
        super.a(i8, xVar);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    public final /* bridge */ /* synthetic */ com.mbridge.msdk.newreward.function.d.a.a b() {
        return super.b();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    public final /* bridge */ /* synthetic */ com.mbridge.msdk.newreward.function.d.a.b c() {
        return super.c();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    public final /* bridge */ /* synthetic */ a d() {
        return super.d();
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onCancelDownload(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        super.onCancelDownload(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadComplete(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        super.onDownloadComplete(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadError(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadError downloadError) {
        super.onDownloadError(downloadMessage, downloadError);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnDownloadStateListener
    public final /* bridge */ /* synthetic */ void onDownloadStart(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage) {
        super.onDownloadStart(downloadMessage);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.foundation.download.OnProgressStateListener
    public final /* bridge */ /* synthetic */ void onProgress(DownloadMessage<com.mbridge.msdk.newreward.function.d.a.b> downloadMessage, DownloadProgress downloadProgress) {
        super.onProgress(downloadMessage, downloadProgress);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r, com.mbridge.msdk.newreward.a.c.a.InterfaceC0414a
    public final /* bridge */ /* synthetic */ void a(String str, long j8) {
        super.a(str, j8);
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.r
    protected final String a() {
        CampaignEx g8;
        if (super.b() != null && super.b().g() != null && (g8 = super.b().g()) != null && !TextUtils.isEmpty(g8.getendcard_url())) {
            Context w8 = super.c().w();
            if (w8 == null) {
                w8 = com.mbridge.msdk.foundation.controller.c.m().c();
            }
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("template_");
                sb.append(com.mbridge.msdk.f.b.a() ? "cn" : "en");
                sb.append("_");
                sb.append(com.mbridge.msdk.foundation.tools.z.r(w8.getApplicationContext()));
                return sb.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }
}
