package com.mbridge.msdk.e.a.a;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.e.a.p;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes4.dex */
public final class g extends com.mbridge.msdk.e.a.a.a {

    /* renamed from: a, reason: collision with root package name */
    private final b f20001a;

    /* renamed from: b, reason: collision with root package name */
    private final SSLSocketFactory f20002b;

    /* loaded from: classes4.dex */
    static class a extends FilterInputStream {

        /* renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f20003a;

        a(HttpURLConnection httpURLConnection) {
            super(g.b(httpURLConnection));
            this.f20003a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            this.f20003a.disconnect();
        }
    }

    /* loaded from: classes4.dex */
    public interface b extends k {
    }

    public g() {
        this(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private g(b bVar) {
        this(bVar, null);
    }

    @Override // com.mbridge.msdk.e.a.a.a
    public final f a(p<?> pVar, Map<String, String> map) throws IOException {
        String i8;
        SSLSocketFactory sSLSocketFactory;
        if (pVar.g() == 0) {
            i8 = pVar.i();
            if (TextUtils.isEmpty(i8)) {
                i8 = "";
            } else {
                byte[] o8 = pVar.o();
                if (o8 != null && o8.length != 0) {
                    i8 = i8.endsWith("?") ? i8 + new String(o8) : i8 + "?" + new String(o8);
                }
            }
        } else {
            i8 = pVar.i();
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(map);
        hashMap.putAll(pVar.d());
        b bVar = this.f20001a;
        if (bVar != null) {
            String a9 = bVar.a(i8);
            if (a9 == null) {
                throw new IOException("URL blocked by rewriter: " + i8);
            }
            i8 = a9;
        }
        URL url = new URL(i8);
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        int s8 = pVar.s();
        httpURLConnection.setConnectTimeout(s8);
        httpURLConnection.setReadTimeout(s8);
        boolean z8 = false;
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f20002b) != null) {
            ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(sSLSocketFactory);
        }
        try {
            for (String str : hashMap.keySet()) {
                httpURLConnection.setRequestProperty(str, (String) hashMap.get(str));
            }
            switch (pVar.g()) {
                case 0:
                    httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                    break;
                case 1:
                    httpURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
                    a(httpURLConnection, pVar);
                    break;
                case 2:
                    httpURLConnection.setRequestMethod("PUT");
                    a(httpURLConnection, pVar);
                    break;
                case 3:
                    httpURLConnection.setRequestMethod("DELETE");
                    break;
                case 4:
                    httpURLConnection.setRequestMethod("HEAD");
                    break;
                case 5:
                    httpURLConnection.setRequestMethod("OPTIONS");
                    break;
                case 6:
                    httpURLConnection.setRequestMethod("TRACE");
                    break;
                case 7:
                    httpURLConnection.setRequestMethod("PATCH");
                    a(httpURLConnection, pVar);
                    break;
                default:
                    throw new IllegalStateException("Unknown method type.");
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != -1) {
                if (pVar.g() != 4 && ((100 > responseCode || responseCode >= 200) && responseCode != 204 && responseCode != 304)) {
                    try {
                        return new f(responseCode, a(httpURLConnection.getHeaderFields()), httpURLConnection.getContentLength(), new a(httpURLConnection));
                    } catch (Throwable th) {
                        th = th;
                        z8 = true;
                        if (!z8) {
                            httpURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                f fVar = new f(responseCode, a(httpURLConnection.getHeaderFields()));
                httpURLConnection.disconnect();
                return fVar;
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private g(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f20001a = bVar;
        this.f20002b = sSLSocketFactory;
    }

    private static List<com.mbridge.msdk.e.a.i> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new com.mbridge.msdk.e.a.i(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    private void a(HttpURLConnection httpURLConnection, p<?> pVar) throws IOException {
        byte[] o8 = pVar.o();
        if (o8 != null) {
            a(httpURLConnection, pVar, o8);
        }
    }

    private void a(HttpURLConnection httpURLConnection, p<?> pVar, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", pVar.n());
        }
        int length = bArr.length;
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }
}
