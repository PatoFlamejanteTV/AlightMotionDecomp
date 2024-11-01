package com.mbridge.msdk.foundation.same.net.stack;

import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.same.net.i;
import com.mbridge.msdk.foundation.tools.ad;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public final class a implements b {

    /* renamed from: a, reason: collision with root package name */
    private BlockingQueue<com.mbridge.msdk.foundation.same.net.a.b> f21020a = new ArrayBlockingQueue(2, true);

    /* renamed from: b, reason: collision with root package name */
    private CronetEngine f21021b;

    public a() {
        ad.b("CronetStack", "Cronet stack init.");
        this.f21021b = com.mbridge.msdk.foundation.same.net.a.a.a().c();
    }

    private String a(i<?> iVar) {
        switch (iVar.l()) {
            case 0:
                return ShareTarget.METHOD_GET;
            case 1:
                return ShareTarget.METHOD_POST;
            case 2:
                return "PUT";
            case 3:
                return "DELETE";
            case 4:
                return "HEAD";
            case 5:
                return "OPTIONS";
            case 6:
                return "TRACE";
            case 7:
                return "PATCH";
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // com.mbridge.msdk.foundation.same.net.stack.b
    public final com.mbridge.msdk.foundation.same.net.f.b performRequest(i<?> iVar) throws IOException {
        int i8;
        TimeUnit timeUnit;
        com.mbridge.msdk.foundation.same.net.a.b poll;
        ad.b("CronetStack", "CronetStack request start : " + iVar.s() + " " + a(iVar));
        int p8 = iVar.p();
        int m8 = iVar.m();
        if (p8 == 0) {
            p8 = 30000;
        }
        if (m8 == 0) {
            m8 = 30000;
        }
        ad.b("CronetStack", "Cronet writeTimeout : " + p8 + " readTimeout : " + m8);
        UrlRequest.Builder newUrlRequestBuilder = this.f21021b.newUrlRequestBuilder(iVar.s(), new com.mbridge.msdk.foundation.same.net.a.c(this.f21020a), com.mbridge.msdk.foundation.same.net.a.a.a().b());
        int b9 = iVar.b();
        if (b9 != 1) {
            i8 = 4;
            if (b9 != 3 && b9 != 4) {
                i8 = 3;
            }
        } else {
            i8 = 2;
        }
        UrlRequest.Builder allowDirectExecutor = newUrlRequestBuilder.setPriority(i8).setHttpMethod(a(iVar)).allowDirectExecutor();
        if (iVar.k() != null) {
            for (Map.Entry<String, String> entry : iVar.k().entrySet()) {
                allowDirectExecutor.addHeader(entry.getKey(), entry.getValue());
            }
        }
        if (iVar.h() != null) {
            allowDirectExecutor.setUploadDataProvider(UploadDataProviders.create(iVar.h()), com.mbridge.msdk.foundation.same.net.a.a.a().b());
        }
        UrlRequest build = allowDirectExecutor.build();
        build.start();
        com.mbridge.msdk.foundation.same.net.f.b bVar = null;
        try {
            BlockingQueue<com.mbridge.msdk.foundation.same.net.a.b> blockingQueue = this.f21020a;
            long j8 = p8;
            timeUnit = TimeUnit.MILLISECONDS;
            poll = blockingQueue.poll(j8, timeUnit);
        } catch (InterruptedException e8) {
            e8.printStackTrace();
            Thread.currentThread().interrupt();
        }
        if (poll != null) {
            if (poll.c() == 0) {
                poll = this.f21020a.poll(m8, timeUnit);
            }
            if (poll.c() == 1) {
                bVar = poll.b();
            }
            if (poll.c() == 2) {
                throw new IOException(poll.a());
            }
            if (bVar != null) {
                ad.b("CronetStack", "HttpResponse : " + bVar.c() + " content : " + bVar.a().toString());
                return bVar;
            }
            a(build, iVar);
            this.f21020a.clear();
            ad.b("CronetStack", "response cancel because response timeout");
            throw new IOException("Response timeout.");
        }
        a(build, iVar);
        this.f21020a.clear();
        ad.b("CronetStack", "Request cancel because request timeout");
        throw new IOException("request timeout.");
    }

    private void a(UrlRequest urlRequest, i<?> iVar) {
        if (urlRequest != null) {
            urlRequest.cancel();
        }
        if (iVar != null) {
            iVar.a();
        }
    }
}
