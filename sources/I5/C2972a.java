package i5;

import android.content.Context;
import android.provider.Settings;
import android.util.Base64;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import g5.C2919a;
import g5.C2920b;
import h5.C2950a;
import h5.C2953d;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.C3338d;
import l6.n;

/* renamed from: i5.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2972a {

    /* renamed from: b, reason: collision with root package name */
    public static final C0769a f32755b = new C0769a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f32756a;

    /* renamed from: i5.a$a, reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0769a {
        public C0769a(AbstractC3284p abstractC3284p) {
        }
    }

    public C2972a(Context context) {
        AbstractC3292y.i(context, "context");
        this.f32756a = context;
    }

    public static String a(HashMap hashMap) {
        StringBuilder sb = new StringBuilder();
        boolean z8 = true;
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (z8) {
                z8 = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode(str, C.UTF8_NAME));
            sb.append("=");
            sb.append(URLEncoder.encode(str2, C.UTF8_NAME));
        }
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "result.toString()");
        return sb2;
    }

    public final C2953d b(String token) {
        BufferedReader bufferedReader;
        OutputStream outputStream;
        AbstractC3292y.i(token, "token");
        String str = "/eapi/sdk-installation/" + Settings.Secure.getString(this.f32756a.getContentResolver(), "android_id");
        HashMap hashMap = new HashMap();
        String jSONObject = new C2919a(this.f32756a, token).a(this.f32756a).toString();
        AbstractC3292y.h(jSONObject, "jsonObjectContext.toString()");
        hashMap.put("context", jSONObject);
        String jSONObject2 = new C2920b(this.f32756a).a().toString();
        AbstractC3292y.h(jSONObject2, "jsonObjectFile.toString()");
        hashMap.put("file", jSONObject2);
        StringBuilder sb = new StringBuilder();
        C2950a c2950a = C2950a.f32647a;
        sb.append(c2950a.b());
        sb.append(str);
        String sb2 = sb.toString();
        C2953d c2953d = new C2953d();
        try {
            if (n.s(ShareTarget.METHOD_POST, ShareTarget.METHOD_GET, true)) {
                sb2 = sb2 + '?' + a(hashMap);
            }
            URLConnection openConnection = new URL(sb2).openConnection();
            AbstractC3292y.g(openConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) openConnection;
            httpsURLConnection.setReadTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            httpsURLConnection.setConnectTimeout(DefaultLoadControl.DEFAULT_MIN_BUFFER_MS);
            httpsURLConnection.setRequestMethod(ShareTarget.METHOD_POST);
            httpsURLConnection.setDoInput(true);
            if (n.s(ShareTarget.METHOD_POST, ShareTarget.METHOD_POST, true)) {
                httpsURLConnection.setDoOutput(true);
            }
            if (n.G("https://secure.uptodown.com", "www.xxxyyyxxx.com", false, 2, null)) {
                Charset charset = C3338d.f34755b;
                byte[] bytes = "".getBytes(charset);
                AbstractC3292y.h(bytes, "getBytes(...)");
                byte[] encode = Base64.encode(bytes, 0);
                AbstractC3292y.h(encode, "encode(devValue.toByteArray(), Base64.DEFAULT)");
                httpsURLConnection.setRequestProperty("", new String(encode, charset));
            }
            httpsURLConnection.setRequestProperty("Identificador", "Uptodown_Android");
            httpsURLConnection.setRequestProperty("Identificador-Version", "600");
            httpsURLConnection.setRequestProperty("APIKEY", c2950a.a());
            if (n.s(ShareTarget.METHOD_POST, ShareTarget.METHOD_POST, true) && (outputStream = httpsURLConnection.getOutputStream()) != null) {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, C.UTF8_NAME));
                bufferedWriter.write(a(hashMap));
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
            }
            int responseCode = httpsURLConnection.getResponseCode();
            c2953d.e(responseCode);
            if (responseCode == 200) {
                bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));
            } else {
                bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getErrorStream()));
                c2953d.c(true);
            }
            StringBuilder sb3 = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb3.append(readLine);
            }
            c2953d.d(sb3.toString());
        } catch (Exception e8) {
            e8.printStackTrace();
            c2953d.c(true);
            c2953d.d(e8.getMessage());
        }
        return c2953d;
    }
}
