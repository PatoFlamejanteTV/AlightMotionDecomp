package com.mbridge.msdk.out;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.f.b;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.db.f;
import com.mbridge.msdk.foundation.db.h;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ah;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.an;
import com.mbridge.msdk.mbnative.c.a;
import com.mbridge.msdk.out.NativeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBBidNativeHandler extends a implements BaseExtraInterfaceForHandler {
    private static final String TAG = MBBidNativeHandler.class.getName();
    public static final String TEMPLATE_ID = "id";
    public static final String TEMPLATE_NUM = "ad_num";
    private static String mUnitID;
    private com.mbridge.msdk.mbnative.d.a adListener;
    private com.mbridge.msdk.click.a clickControler;
    private Context context;
    private Map<String, Object> map;
    private com.mbridge.msdk.mbnative.f.a nativeProvider;
    private List<NativeListener.Template> templateList;
    private NativeListener.NativeTrackingListener trackingListener;

    /* loaded from: classes4.dex */
    public static class KeyWordInfo {
        String keyWordPN;
        String keyWorkVN;

        public KeyWordInfo(String str, String str2) {
            this.keyWordPN = str;
            this.keyWorkVN = str2;
        }

        public String getKeyWordPN() {
            return this.keyWordPN;
        }

        public String getKeyWorkVN() {
            return this.keyWorkVN;
        }

        public void setKeyWordPN(String str) {
            this.keyWordPN = str;
        }

        public void setKeyWorkVN(String str) {
            this.keyWorkVN = str;
        }
    }

    public MBBidNativeHandler(Context context) {
        this.adListener = new com.mbridge.msdk.mbnative.d.a();
        this.context = context;
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        Map<String, Object> map = this.map;
        if (map == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            return;
        }
        String str = (String) this.map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.mbnative.d.a aVar = this.adListener;
        if (aVar != null) {
            aVar.a(str);
        }
        String e8 = ai.e(str);
        if (TextUtils.isEmpty(e8)) {
            return;
        }
        ai.b(str, e8);
    }

    public static Map<String, Object> getNativeProperties(String str, String str2) {
        HashMap hashMap = new HashMap();
        mUnitID = str2;
        hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        String str3 = MBridgeConstans.PLACEMENT_ID;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put(str3, str);
        hashMap.put(MBridgeConstans.PLUGIN_NAME, new String[]{MBridgeConstans.PLUGIN_NATIVE});
        hashMap.put(MBridgeConstans.PROPERTIES_LAYOUT_TYPE, 0);
        return hashMap;
    }

    public static String getTemplateString(List<NativeListener.Template> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    for (NativeListener.Template template : list) {
                        stringBuffer.append("{\"id\":");
                        stringBuffer.append(template.getId() + ",");
                        stringBuffer.append("\"ad_num\":");
                        stringBuffer.append(template.getAdNum() + "},");
                    }
                    return "[{$native_info}]".replace("{$native_info}", stringBuffer.subSequence(0, stringBuffer.lastIndexOf(",")));
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    private void loadMB(String str) {
        com.mbridge.msdk.mbnative.d.a aVar;
        if (TextUtils.isEmpty(str) && (aVar = this.adListener) != null) {
            aVar.onAdLoadError("bidToken can not be null, bid first");
            return;
        }
        if (this.properties != null && this.properties.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            List<NativeListener.Template> list = this.templateList;
            if (list != null && list.size() > 0) {
                try {
                    this.properties.put(MBridgeConstans.NATIVE_INFO, buildTemplateString());
                } catch (Exception unused) {
                    ad.d("com.mbridge.msdk", "MBSDK set template error");
                }
            }
            try {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
                if (this.nativeProvider == null) {
                    com.mbridge.msdk.mbnative.f.a aVar2 = new com.mbridge.msdk.mbnative.f.a(this.adListener, this.trackingListener);
                    this.nativeProvider = aVar2;
                    aVar2.a(this.context, (Resources) null, this.properties);
                }
                this.nativeProvider.a(str);
                return;
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        ad.d(TAG, "no unit id.");
    }

    public void addTemplate(NativeListener.Template template) {
        if (template != null) {
            if (this.templateList == null) {
                this.templateList = new ArrayList();
            }
            this.templateList.add(template);
        }
    }

    public void bidLoad(String str) {
        if (this.properties != null && this.properties.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            loadMB(str);
        } else {
            ad.d(TAG, "no unit id.");
        }
    }

    public void bidRelease() {
        com.mbridge.msdk.mbnative.f.a aVar = this.nativeProvider;
        if (aVar != null) {
            aVar.d();
        }
        if (!b.a()) {
            c.m().b(mUnitID);
        }
    }

    public String buildTemplateString() {
        try {
            List<NativeListener.Template> list = this.templateList;
            if (list != null && list.size() > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                for (NativeListener.Template template : this.templateList) {
                    stringBuffer.append("{\"id\":");
                    stringBuffer.append(template.getId() + ",");
                    stringBuffer.append("\"ad_num\":");
                    stringBuffer.append(template.getAdNum() + "},");
                }
                return "[{$native_info}]".replace("{$native_info}", stringBuffer.subSequence(0, stringBuffer.lastIndexOf(",")));
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public void clearCacheByUnitid(String str) {
        try {
            if (an.a(str)) {
                return;
            }
            f.a(h.a(c.m().c())).c(str);
        } catch (Exception e8) {
            ad.a(TAG, e8.getMessage());
        }
    }

    public void clearVideoCache() {
        try {
            com.mbridge.msdk.mbnative.f.a aVar = this.nativeProvider;
            if (aVar != null) {
                aVar.c();
            }
        } catch (Exception e8) {
            ad.a(TAG, e8.getMessage());
        }
    }

    public com.mbridge.msdk.mbnative.d.a getAdListener() {
        return this.adListener;
    }

    public String getCreativeIdWithUnitId() {
        com.mbridge.msdk.mbnative.f.a aVar = this.nativeProvider;
        if (aVar != null) {
            return aVar.f();
        }
        return "";
    }

    public NativeListener.NativeTrackingListener getTrackingListener() {
        return this.trackingListener;
    }

    public void handleResult(Campaign campaign, String str) {
        String str2;
        if (this.clickControler == null) {
            Map<String, Object> map = this.map;
            if (map != null) {
                str2 = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            } else {
                str2 = null;
            }
            this.clickControler = new com.mbridge.msdk.click.a(this.context, str2);
        }
        this.clickControler.a(campaign, str);
    }

    public void registerView(View view, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new com.mbridge.msdk.mbnative.f.a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.a(this.context, (Resources) null, this.properties);
        }
        this.nativeProvider.a(view, campaign);
    }

    public void setAdListener(NativeListener.NativeAdListener nativeAdListener) {
        com.mbridge.msdk.mbnative.d.a aVar = new com.mbridge.msdk.mbnative.d.a(nativeAdListener);
        this.adListener = aVar;
        aVar.a(mUnitID);
        com.mbridge.msdk.mbnative.f.a aVar2 = this.nativeProvider;
        if (aVar2 != null) {
            aVar2.a(this.adListener);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        c.m().a(mUnitID, jSONObject);
    }

    public void setMustBrowser(boolean z8) {
        ah.f21240b = z8;
    }

    public void setTrackingListener(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.trackingListener = nativeTrackingListener;
        com.mbridge.msdk.mbnative.f.a aVar = this.nativeProvider;
        if (aVar != null) {
            aVar.a(nativeTrackingListener);
        }
    }

    public void unregisterView(View view, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new com.mbridge.msdk.mbnative.f.a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.a(this.context, (Resources) null, this.properties);
        }
        this.nativeProvider.b(view, campaign);
        if (b.a()) {
            return;
        }
        c.m().b(mUnitID);
    }

    public void registerView(View view, List<View> list, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new com.mbridge.msdk.mbnative.f.a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.a(this.context, (Resources) null, this.properties);
        }
        this.nativeProvider.a(view, list, campaign);
    }

    public void unregisterView(View view, List<View> list, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new com.mbridge.msdk.mbnative.f.a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.a(this.context, (Resources) null, this.properties);
        }
        this.nativeProvider.b(view, list, campaign);
        if (b.a()) {
            return;
        }
        c.m().b(mUnitID);
    }

    public MBBidNativeHandler(Map<String, Object> map, Context context) {
        super(map, context);
        this.adListener = new com.mbridge.msdk.mbnative.d.a();
        this.context = context;
        this.map = map;
        if (c.m().c() == null && context != null) {
            c.m().b(context);
        }
        if (map != null) {
            try {
                if (map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && map.get(MBridgeConstans.PROPERTIES_UNIT_ID) != null && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String) && map.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && map.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) != null && (map.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer) && map.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && map.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) != null) {
                    boolean z8 = map.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (map == null || !map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            return;
        }
        String str = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.mbridge.msdk.mbnative.d.a aVar = this.adListener;
        if (aVar != null) {
            aVar.a(str);
        }
        String e8 = ai.e(str);
        if (TextUtils.isEmpty(e8)) {
            return;
        }
        ai.b(str, e8);
    }
}
