package com.mbridge.msdk.foundation.same.net.a;

import java.io.ByteArrayOutputStream;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.net.UrlRequest;

/* loaded from: classes4.dex */
public final class c extends UrlRequest.Callback {

    /* renamed from: a, reason: collision with root package name */
    BlockingQueue<b> f20827a;

    /* renamed from: b, reason: collision with root package name */
    ByteArrayOutputStream f20828b = null;

    /* renamed from: c, reason: collision with root package name */
    com.mbridge.msdk.foundation.same.net.f.b f20829c = null;

    /* renamed from: d, reason: collision with root package name */
    WritableByteChannel f20830d = null;

    /* renamed from: e, reason: collision with root package name */
    AtomicBoolean f20831e = new AtomicBoolean(false);

    public c(BlockingQueue<b> blockingQueue) {
        this.f20827a = blockingQueue;
    }
}
