package com.mbridge.msdk.click;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    private static volatile AtomicInteger f19403a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.c.g f19404b;

    /* renamed from: c, reason: collision with root package name */
    private String f19405c;

    /* renamed from: d, reason: collision with root package name */
    private int f19406d = 9377;

    public l() {
        com.mbridge.msdk.c.g b9 = com.mbridge.msdk.c.h.a().b(com.mbridge.msdk.foundation.controller.c.m().k());
        this.f19404b = b9;
        if (b9 == null) {
            com.mbridge.msdk.c.h.a();
            this.f19404b = com.mbridge.msdk.c.i.a();
        }
    }

    private JSONObject b(String str, CampaignEx campaignEx, boolean z8, boolean z9) {
        JSONObject jSONObject = new JSONObject();
        try {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                String host = parse.getHost();
                String path = parse.getPath();
                String encodedQuery = parse.getEncodedQuery();
                this.f19405c = host;
                jSONObject.put("uri", "https://" + host + path);
                jSONObject.put(DataSchemeDataSource.SCHEME_DATA, encodedQuery);
            }
        } catch (Throwable th) {
            ad.b("SocketSpider", th.getMessage());
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (!z8 && !z9) {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            if (campaignEx != null) {
                if (z8 && campaignEx.getcUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
                }
                if (z9 && campaignEx.getImpUA() == 1) {
                    jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
                }
            } else {
                jSONObject2.put(Command.HTTP_HEADER_USER_AGENT, z.g());
            }
            jSONObject2.put("Accept-Encoding", "gzip");
            if (this.f19404b.aI() && !TextUtils.isEmpty(str)) {
                jSONObject2.put("referer", str);
            }
            jSONObject.put("header", jSONObject2);
        } catch (Throwable th2) {
            ad.b("SocketSpider", th2.getMessage());
        }
        return jSONObject;
    }

    public final com.mbridge.msdk.click.entity.a a(String str, CampaignEx campaignEx, boolean z8, boolean z9) {
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        aVar.f19366g = str;
        if (TextUtils.isEmpty(str)) {
            aVar.f19367h = "request url can not null.";
            return aVar;
        }
        String replace = str.replace(" ", "%20");
        JSONObject b9 = b(replace, campaignEx, z8, z9);
        if (b9.length() == 0) {
            aVar.f19367h = "request content generation failed.";
            return aVar;
        }
        if (TextUtils.isEmpty(b9.optString("uri"))) {
            aVar.f19367h = "request url parse error.";
            return aVar;
        }
        if (campaignEx != null) {
            int trackingTcpPort = campaignEx.getTrackingTcpPort();
            if (trackingTcpPort == 0) {
                trackingTcpPort = 9377;
            }
            this.f19406d = trackingTcpPort;
        }
        if (TextUtils.isEmpty(this.f19405c)) {
            aVar.f19367h = "request url parse error.";
            return aVar;
        }
        return a(replace, b9.toString());
    }

    private com.mbridge.msdk.click.entity.a a(String str, String str2) {
        OutputStream outputStream;
        Socket socket;
        int length;
        InputStream inputStream;
        int i8;
        boolean z8;
        boolean z9;
        byte[] bArr;
        String str3;
        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
        Socket socket2 = null;
        byte[] byteArray = null;
        try {
            try {
                socket = new Socket(this.f19405c, this.f19406d);
                try {
                    socket.setSoTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
                    outputStream = socket.getOutputStream();
                } catch (Throwable th) {
                    th = th;
                    outputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
            }
        } catch (Exception e8) {
            ad.b("SocketSpider", e8.getMessage());
        }
        try {
            ByteBuffer wrap = ByteBuffer.wrap(new byte[8]);
            ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
            wrap.order(byteOrder);
            wrap.put((byte) 2);
            wrap.put((byte) 3);
            wrap.putShort((short) f19403a.getAndIncrement());
            if (TextUtils.isEmpty(str2)) {
                wrap.putInt(0);
                outputStream.write(wrap.array());
                length = 0;
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    gZIPOutputStream.write(str2.getBytes());
                    gZIPOutputStream.close();
                    byteArray = byteArrayOutputStream.toByteArray();
                }
                length = byteArray.length;
                wrap.putInt(length);
                outputStream.write(wrap.array());
                outputStream.write(byteArray);
            }
            outputStream.flush();
            ad.a("SocketSpider", "Socket Request : header : " + Arrays.toString(wrap.array()) + " length : " + length);
            inputStream = socket.getInputStream();
            byte[] bArr2 = new byte[8];
            inputStream.read(bArr2, 0, 8);
            ByteBuffer wrap2 = ByteBuffer.wrap(bArr2);
            wrap2.order(byteOrder);
            i8 = wrap2.getInt(4);
            byte b9 = bArr2[1];
            z8 = b9 == 3;
            z9 = b9 == 2;
            ad.b("SocketSpider", "Socket Response : header : " + Arrays.toString(bArr2) + " length : " + i8 + " isGzip : " + z8);
            bArr = new byte[i8];
            new DataInputStream(socket.getInputStream()).readFully(bArr);
            if (!z8 && i8 > 2 && ((bArr[0] << 8) | (bArr[1] & 255)) == 8075) {
                z8 = true;
            }
        } catch (Throwable th3) {
            th = th3;
            socket2 = socket;
            try {
                ad.a("SocketSpider", "Socket exception: " + th.getMessage());
                aVar.f19367h = th.getMessage();
                if (socket2 != null) {
                    socket2.close();
                    if (outputStream != null) {
                        outputStream.close();
                    }
                }
                return aVar;
            } finally {
            }
        }
        if (z9 && i8 == 0) {
            aVar.f19365f = 200;
            aVar.f19366g = str;
            aVar.f19364e = 0;
            try {
                socket.close();
                outputStream.close();
            } catch (Exception e9) {
                ad.b("SocketSpider", e9.getMessage());
            }
            return aVar;
        }
        if (i8 < 1) {
            aVar.f19365f = 200;
            aVar.f19366g = str;
            aVar.f19364e = 0;
            try {
                socket.close();
                outputStream.close();
            } catch (Exception e10) {
                ad.b("SocketSpider", e10.getMessage());
            }
            return aVar;
        }
        try {
            if (z8) {
                str3 = a(bArr);
            } else {
                str3 = new String(bArr);
            }
            if (!TextUtils.isEmpty(str3)) {
                aVar.f19365f = 200;
                aVar.f19366g = str;
                aVar.f19364e = 0;
                try {
                    JSONObject optJSONObject = new JSONObject(str3).optJSONObject(DataSchemeDataSource.SCHEME_DATA);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("location");
                        if (!TextUtils.isEmpty(optString)) {
                            aVar.f19365f = 302;
                            aVar.f19360a = optString;
                        }
                    }
                } catch (Throwable th4) {
                    ad.b("SocketSpider", th4.getMessage());
                }
                try {
                    socket.close();
                    outputStream.close();
                } catch (Exception e11) {
                    ad.b("SocketSpider", e11.getMessage());
                }
                return aVar;
            }
        } catch (Throwable th5) {
            ad.b("SocketSpider", th5.getMessage());
            aVar.f19367h = th5.getMessage();
        }
        inputStream.close();
        socket.close();
        outputStream.close();
        return aVar;
    }

    private String a(byte[] bArr) throws IOException {
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
}
