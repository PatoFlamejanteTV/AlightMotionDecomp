package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.newreward.function.common.MBridgeCommon;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;

/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AtomicInteger f21001a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private ExecutorService f21002b;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private static m f21015a = new m();
    }

    public static m a() {
        return b.f21015a;
    }

    private m() {
        this.f21002b = new ThreadPoolExecutor(5, 10, 5L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.mbridge.msdk.foundation.same.net.m.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                newThread.setName("SocketThreadPool");
                return newThread;
            }
        }, new ThreadPoolExecutor.DiscardPolicy());
    }

    public final String a(byte[] bArr) throws IOException {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
        byte[] bArr2 = new byte[1024];
        while (true) {
            int read = gZIPInputStream.read(bArr2, 0, 1024);
            if (read > 0) {
                byteArrayOutputStream.write(bArr2, 0, read);
            } else {
                gZIPInputStream.close();
                byteArrayInputStream.close();
                byteArrayOutputStream.flush();
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toString();
            }
        }
    }

    public final void a(String str, int i8, String str2, boolean z8, e eVar) {
        final a aVar = new a(str, i8, str2, z8, eVar);
        this.f21002b.execute(new Runnable() { // from class: com.mbridge.msdk.foundation.same.net.m.2
            @Override // java.lang.Runnable
            public final void run() {
                aVar.a();
            }
        });
    }

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: b, reason: collision with root package name */
        private ByteBuffer f21007b;

        /* renamed from: c, reason: collision with root package name */
        private String f21008c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f21009d;

        /* renamed from: e, reason: collision with root package name */
        private e f21010e;

        /* renamed from: f, reason: collision with root package name */
        private OutputStream f21011f;

        /* renamed from: g, reason: collision with root package name */
        private int f21012g;

        /* renamed from: h, reason: collision with root package name */
        private Socket f21013h;

        /* renamed from: i, reason: collision with root package name */
        private String f21014i;

        a(String str, int i8, String str2, boolean z8, e eVar) {
            this.f21008c = str;
            this.f21012g = i8;
            this.f21014i = str2;
            this.f21009d = z8;
            this.f21010e = eVar;
        }

        /* JADX WARN: Finally extract failed */
        /* JADX WARN: Removed duplicated region for block: B:102:0x0154  */
        /* JADX WARN: Removed duplicated region for block: B:103:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:104:0x00c2 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:3:0x0005, B:5:0x0025, B:9:0x003a, B:11:0x0088, B:12:0x009a, B:14:0x00b0, B:15:0x0105, B:20:0x0155, B:23:0x018f, B:26:0x019d, B:41:0x01bd, B:53:0x01e5, B:66:0x0206, B:68:0x020a, B:79:0x0217, B:87:0x0297, B:98:0x0281, B:101:0x0294, B:104:0x00c2, B:106:0x00c6, B:109:0x00ef, B:110:0x00d0, B:111:0x00e9, B:112:0x008e, B:115:0x0097, B:82:0x0236, B:83:0x0245, B:85:0x024b, B:86:0x0252, B:95:0x023f), top: B:2:0x0005, outer: #0, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:112:0x008e A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:3:0x0005, B:5:0x0025, B:9:0x003a, B:11:0x0088, B:12:0x009a, B:14:0x00b0, B:15:0x0105, B:20:0x0155, B:23:0x018f, B:26:0x019d, B:41:0x01bd, B:53:0x01e5, B:66:0x0206, B:68:0x020a, B:79:0x0217, B:87:0x0297, B:98:0x0281, B:101:0x0294, B:104:0x00c2, B:106:0x00c6, B:109:0x00ef, B:110:0x00d0, B:111:0x00e9, B:112:0x008e, B:115:0x0097, B:82:0x0236, B:83:0x0245, B:85:0x024b, B:86:0x0252, B:95:0x023f), top: B:2:0x0005, outer: #0, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0088 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:3:0x0005, B:5:0x0025, B:9:0x003a, B:11:0x0088, B:12:0x009a, B:14:0x00b0, B:15:0x0105, B:20:0x0155, B:23:0x018f, B:26:0x019d, B:41:0x01bd, B:53:0x01e5, B:66:0x0206, B:68:0x020a, B:79:0x0217, B:87:0x0297, B:98:0x0281, B:101:0x0294, B:104:0x00c2, B:106:0x00c6, B:109:0x00ef, B:110:0x00d0, B:111:0x00e9, B:112:0x008e, B:115:0x0097, B:82:0x0236, B:83:0x0245, B:85:0x024b, B:86:0x0252, B:95:0x023f), top: B:2:0x0005, outer: #0, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x00b0 A[Catch: all -> 0x0036, TryCatch #3 {all -> 0x0036, blocks: (B:3:0x0005, B:5:0x0025, B:9:0x003a, B:11:0x0088, B:12:0x009a, B:14:0x00b0, B:15:0x0105, B:20:0x0155, B:23:0x018f, B:26:0x019d, B:41:0x01bd, B:53:0x01e5, B:66:0x0206, B:68:0x020a, B:79:0x0217, B:87:0x0297, B:98:0x0281, B:101:0x0294, B:104:0x00c2, B:106:0x00c6, B:109:0x00ef, B:110:0x00d0, B:111:0x00e9, B:112:0x008e, B:115:0x0097, B:82:0x0236, B:83:0x0245, B:85:0x024b, B:86:0x0252, B:95:0x023f), top: B:2:0x0005, outer: #0, inners: #6 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x014d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0152  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x01a1  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01b9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void a() {
            /*
                Method dump skipped, instructions count: 757
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.net.m.a.a():void");
        }

        private void a(String str) {
            if (this.f21010e != null) {
                if (TextUtils.isEmpty(str)) {
                    str = "Unknown exception";
                }
                this.f21010e.onError(new com.mbridge.msdk.foundation.same.net.b.a(13, new com.mbridge.msdk.foundation.same.net.f.c(MBridgeCommon.CampaignState.STATE_LOAD_FAILED_RESOURCE_DOWNLOAD_ERROR, str.getBytes(), null)));
            }
        }
    }
}
