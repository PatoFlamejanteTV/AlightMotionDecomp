package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.mbsignalcommon.mraid.a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, String> f21797a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ArrayList<String> f21798b = new ArrayList<>();

    public static com.mbridge.msdk.mbsignalcommon.windvane.a a(WindVaneWebView windVaneWebView, String str) {
        Set<String> unmodifiableSet;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(CampaignEx.JSON_KEY_MRAID)) {
            return null;
        }
        com.mbridge.msdk.mbsignalcommon.windvane.a aVar = new com.mbridge.msdk.mbsignalcommon.windvane.a();
        aVar.f21834d = x.a("n+ztLkxpVTzBLkxgHN==");
        aVar.f21835e = parse.getHost();
        int i8 = 0;
        if (f21798b.size() == 0) {
            for (Method method : b.class.getDeclaredMethods()) {
                f21798b.add(method.getName());
            }
        }
        if (!f21798b.contains(aVar.f21835e) && windVaneWebView != null) {
            String campaignId = windVaneWebView.getCampaignId();
            String str2 = aVar.f21835e;
            if (!TextUtils.isEmpty(campaignId)) {
                if (f21797a.containsKey(campaignId)) {
                    String str3 = f21797a.get(campaignId);
                    if (!TextUtils.isEmpty(str2) && !str3.contains(str2)) {
                        if (str3.length() > 0) {
                            str3 = str3.concat(",");
                        }
                        f21797a.put(campaignId, str3.concat(str2));
                    }
                } else {
                    f21797a.put(campaignId, str2);
                }
            }
            a.C0412a.f21796a.a(windVaneWebView, aVar.f21835e);
            a.C0412a.f21796a.a(windVaneWebView, aVar.f21835e, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i8);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i8);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i8, indexOf2)));
                i8 = indexOf + 1;
            } while (i8 < encodedQuery.length());
            unmodifiableSet = DesugarCollections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str4 : unmodifiableSet) {
                jSONObject.put(str4, parse.getQueryParameter(str4));
            }
            aVar.f21836f = jSONObject.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return aVar;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f21797a.remove(str);
    }

    public static String a(String str) {
        if (f21797a.containsKey(str)) {
            return f21797a.get(str);
        }
        return null;
    }
}
