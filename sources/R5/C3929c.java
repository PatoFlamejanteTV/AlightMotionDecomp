package r5;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import c5.K;
import com.uptodown.activities.preferences.SettingsPreferences;
import d5.ResultReceiverC2761d;
import java.io.IOException;
import java.net.URL;
import kotlin.jvm.internal.AbstractC3292y;
import org.json.JSONObject;
import q5.C3775H;

/* renamed from: r5.c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3929c {
    public final K a(JSONObject jsonToZip, JSONObject jSONObject, ResultReceiverC2761d resultReceiverC2761d, Context context, String url) {
        Bundle bundle;
        String sb;
        String sb2;
        String d8;
        AbstractC3292y.i(jsonToZip, "jsonToZip");
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(url, "url");
        K k8 = new K();
        try {
            try {
                String valueOf = String.valueOf(System.currentTimeMillis());
                if (resultReceiverC2761d != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(NotificationCompat.CATEGORY_MESSAGE, "********INI SEND MULTIPART CALL********\nUrl: " + url);
                    resultReceiverC2761d.send(137, bundle2);
                }
                C3928b c3928b = new C3928b(resultReceiverC2761d);
                C3775H.a aVar = C3775H.f37269c;
                SettingsPreferences.a aVar2 = SettingsPreferences.f30529b;
                c3928b.j("lang", aVar.b(aVar2.p(context)));
                String jSONObject2 = jsonToZip.toString();
                AbstractC3292y.h(jSONObject2, "toString(...)");
                byte[] a9 = aVar.a(jSONObject2);
                c3928b.g("zipped", valueOf, a9);
                c3928b.i();
                c3928b.d(new URL(url), valueOf);
                c3928b.c("lang", aVar.b(aVar2.p(context)));
                c3928b.a("zipped", valueOf, a9, jSONObject);
                c3928b.e();
                k8 = c3928b.f(true);
                if (resultReceiverC2761d != null && k8.d() != null) {
                    try {
                        String d9 = k8.d();
                        AbstractC3292y.f(d9);
                        d8 = new JSONObject(d9).toString(2);
                    } catch (Exception unused) {
                        d8 = k8.d();
                    }
                    String str = "********RESPONSE MULTIPART CALL********\n" + d8;
                    Bundle bundle3 = new Bundle();
                    bundle3.putString(NotificationCompat.CATEGORY_MESSAGE, str);
                    resultReceiverC2761d.send(137, bundle3);
                }
            } catch (IOException e8) {
                e8.printStackTrace();
                if (resultReceiverC2761d != null) {
                    if (e8.getMessage() != null) {
                        sb2 = "********IOEXCEPTION MULTIPART CALL********\n" + e8.getMessage();
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append('\n');
                        sb3.append(e8);
                        sb2 = sb3.toString();
                    }
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(NotificationCompat.CATEGORY_MESSAGE, sb2);
                    resultReceiverC2761d.send(137, bundle4);
                }
                if (resultReceiverC2761d != null) {
                    bundle = new Bundle();
                }
            } catch (Exception e9) {
                e9.printStackTrace();
                if (resultReceiverC2761d != null) {
                    if (e9.getMessage() != null) {
                        sb = "********EXCEPTION MULTIPART CALL********\n" + e9.getMessage();
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append('\n');
                        sb4.append(e9);
                        sb = sb4.toString();
                    }
                    Bundle bundle5 = new Bundle();
                    bundle5.putString(NotificationCompat.CATEGORY_MESSAGE, sb);
                    resultReceiverC2761d.send(137, bundle5);
                }
                if (resultReceiverC2761d != null) {
                    bundle = new Bundle();
                }
            }
            if (resultReceiverC2761d != null) {
                bundle = new Bundle();
                bundle.putString(NotificationCompat.CATEGORY_MESSAGE, "********FIN SEND MULTIPART CALL********");
                resultReceiverC2761d.send(137, bundle);
            }
            return k8;
        } catch (Throwable th) {
            if (resultReceiverC2761d != null) {
                Bundle bundle6 = new Bundle();
                bundle6.putString(NotificationCompat.CATEGORY_MESSAGE, "********FIN SEND MULTIPART CALL********");
                resultReceiverC2761d.send(137, bundle6);
            }
            throw th;
        }
    }
}
