package com.mbridge.msdk.out.reveue;

import com.mbridge.msdk.foundation.tools.ai;
import java.net.URLEncoder;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class MBridgeRevenueParamsEntity {
    public static final String ATTRIBUTION_PLATFORM_ADBRIX = "Adbrix";
    public static final String ATTRIBUTION_PLATFORM_ADJUST = "Adjust";
    public static final String ATTRIBUTION_PLATFORM_AIRVRIDGE = "Airbridge";
    public static final String ATTRIBUTION_PLATFORM_APPSFLYER = "AppsFlyer";
    public static final String ATTRIBUTION_PLATFORM_APP_METRICA = "AppMetrica";
    public static final String ATTRIBUTION_PLATFORM_APSALAR = "Apsalar";
    public static final String ATTRIBUTION_PLATFORM_BRANCH = "Branch";
    public static final String ATTRIBUTION_PLATFORM_DATA_EYE = "DataEye";
    public static final String ATTRIBUTION_PLATFORM_FOX = "Fox";
    public static final String ATTRIBUTION_PLATFORM_JUST_TRACK = "JustTrack";
    public static final String ATTRIBUTION_PLATFORM_KOCHAVA = "Kochava";
    public static final String ATTRIBUTION_PLATFORM_MY_TRACKER = "MyTracker";
    public static final String ATTRIBUTION_PLATFORM_REYUN = "Reyun";
    public static final String ATTRIBUTION_PLATFORM_SINGULAR = "Singular";
    public static final String ATTRIBUTION_PLATFORM_SOLAR_ENGINE = "SolarEngine";
    public static final String ATTRIBUTION_PLATFORM_TALKING_DATA = "TalkingData";
    public static final String ATTRIBUTION_PLATFORM_TENJIN = "Tenjin";
    public static final String ATTRIBUTION_PLATFORM_UMENG = "Umeng";
    private JSONObject eventInfoJsonObject = new JSONObject();
    private String mediationName;
    private String mmpName;
    private String mmpUserId;
    private String traceId;

    /* loaded from: classes4.dex */
    public @interface AttributionPlatform {
    }

    public MBridgeRevenueParamsEntity(String str, String str2) {
        setMmpName(str);
        setMmpUserId(str2);
        setTraceId(ai.d());
    }

    public String getMediationName() {
        return this.mediationName;
    }

    protected String getMmpName() {
        return this.mmpName;
    }

    protected String getMmpUserId() {
        return this.mmpUserId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getReportData() {
        try {
            return "event_info=" + URLEncoder.encode(this.eventInfoJsonObject.toString(), "utf-8");
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    protected String getTraceId() {
        return this.traceId;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setAdType(String str) {
        try {
            this.eventInfoJsonObject.put("mediation_ad_type", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setBidType(Boolean bool) {
        try {
            this.eventInfoJsonObject.put("bid_type", bool);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setCurrency(String str) {
        try {
            this.eventInfoJsonObject.put("currency", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setDspInfo(String str, String str2) {
        try {
            this.eventInfoJsonObject.put("dsp_name", str);
            this.eventInfoJsonObject.put("dsp_id", str2);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    protected void setEventTime(String str) {
        try {
            this.eventInfoJsonObject.put("event_time", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setExtData(JSONObject jSONObject) {
        try {
            this.eventInfoJsonObject.put("extra_data", jSONObject);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMediationName(String str) {
        try {
            this.mediationName = str;
            this.eventInfoJsonObject.put("mediation_name", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setMediationUnitId(String str) {
        try {
            this.eventInfoJsonObject.put("mediation_unit_id", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    protected void setMmpName(String str) {
        this.mmpName = str;
        try {
            this.eventInfoJsonObject.put("mmp_name", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    protected void setMmpUserId(String str) {
        this.mmpUserId = str;
        try {
            this.eventInfoJsonObject.put("mmp_user_id", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setNetworkInfo(JSONObject jSONObject) {
        String jSONObject2;
        try {
            JSONObject jSONObject3 = this.eventInfoJsonObject;
            if (jSONObject == null) {
                jSONObject2 = "{}";
            } else {
                jSONObject2 = jSONObject.toString();
            }
            jSONObject3.put("network_unit_info", jSONObject2);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setNetworkName(String str) {
        try {
            this.eventInfoJsonObject.put("network_name", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setPrecision(String str) {
        try {
            this.eventInfoJsonObject.put("precision", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setRevenue(String str) {
        try {
            this.eventInfoJsonObject.put("revenue", str);
            setEventTime((System.currentTimeMillis() / 1000) + "");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setSourceData(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mediation_source_data", str);
            jSONObject.put("adNetwork_source_data", str2);
            this.eventInfoJsonObject.put("all_info", jSONObject);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    protected void setTraceId(String str) {
        this.traceId = str;
        try {
            this.eventInfoJsonObject.put("trace_id", str);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }
}
