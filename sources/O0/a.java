package O0;

import K0.g;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final String f6926a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f6927b;

    /* renamed from: c, reason: collision with root package name */
    private final Map f6928c = new HashMap();

    public a(String str, Map map) {
        this.f6926a = str;
        this.f6927b = map;
    }

    private String a(Map map) {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        if (entry.getValue() == null) {
            str = "";
        } else {
            str = URLEncoder.encode((String) entry.getValue(), C.UTF8_NAME);
        }
        sb.append(str);
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            if (entry2.getValue() == null) {
                str2 = "";
            } else {
                str2 = URLEncoder.encode((String) entry2.getValue(), C.UTF8_NAME);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    private String b(String str, Map map) {
        String a9 = a(map);
        if (a9.isEmpty()) {
            return str;
        }
        if (str.contains("?")) {
            if (!str.endsWith("&")) {
                a9 = "&" + a9;
            }
            return str + a9;
        }
        return str + "?" + a9;
    }

    private String e(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C.UTF8_NAME));
        char[] cArr = new char[8192];
        StringBuilder sb = new StringBuilder();
        while (true) {
            int read = bufferedReader.read(cArr);
            if (read != -1) {
                sb.append(cArr, 0, read);
            } else {
                return sb.toString();
            }
        }
    }

    public c c() {
        HttpsURLConnection httpsURLConnection;
        g.d();
        InputStream inputStream = null;
        String e8 = null;
        inputStream = null;
        try {
            String b9 = b(this.f6926a, this.f6927b);
            G0.g.f().i("GET Request URL: " + b9);
            httpsURLConnection = (HttpsURLConnection) new URL(b9).openConnection();
            try {
                httpsURLConnection.setReadTimeout(10000);
                httpsURLConnection.setConnectTimeout(10000);
                httpsURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
                for (Map.Entry entry : this.f6928c.entrySet()) {
                    httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                httpsURLConnection.connect();
                int responseCode = httpsURLConnection.getResponseCode();
                InputStream inputStream2 = httpsURLConnection.getInputStream();
                if (inputStream2 != null) {
                    try {
                        e8 = e(inputStream2);
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStream2;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        throw th;
                    }
                }
                if (inputStream2 != null) {
                    inputStream2.close();
                }
                httpsURLConnection.disconnect();
                return new c(responseCode, e8);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            httpsURLConnection = null;
        }
    }

    public a d(String str, String str2) {
        this.f6928c.put(str, str2);
        return this;
    }
}
