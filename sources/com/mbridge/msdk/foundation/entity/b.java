package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.x;
import com.mbridge.msdk.out.Frame;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b {
    public static final String JSON_KEY_ADS = "ads";
    public static final String JSON_KEY_AD_HTML = "cam_html";
    public static final String JSON_KEY_AD_TYPE = "ad_type";
    public static final String JSON_KEY_AD_ZIP = "cam_tpl_url";
    public static final String JSON_KEY_BANNER_HTML = "cam_html";
    public static final String JSON_KEY_BANNER_URL = "cam_tpl_url";
    public static final String JSON_KEY_CSP = "csp";
    public static final String JSON_KEY_DO = "do";
    public static final String JSON_KEY_ENCRYPT_PRICE = "encrypt_p";
    public static final String JSON_KEY_END_SCREEN_URL = "end_screen_url";
    public static final String JSON_KEY_FRAME_ADS = "frames";
    public static final String JSON_KEY_HTML_URL = "html_url";
    public static final String JSON_KEY_IA_EXT1 = "ia_all_ext1";
    public static final String JSON_KEY_IA_EXT2 = "ia_all_ext2";
    public static final String JSON_KEY_IA_ICON = "ia_icon";
    public static final String JSON_KEY_IA_ORI = "ia_ori";
    public static final String JSON_KEY_IA_RST = "ia_rst";
    public static final String JSON_KEY_IA_URL = "ia_url";
    public static final String JSON_KEY_JM_DO = "jm_do";
    public static final String JSON_KEY_MOF_TEMPLATE_URL = "mof_template_url";
    public static final String JSON_KEY_MOF_TPLID = "mof_tplid";
    public static final String JSON_KEY_NSCPT = "nscpt";
    public static final String JSON_KEY_ONLY_IMPRESSION_URL = "only_impression_url";
    public static final String JSON_KEY_PARENT_SESSION_ID = "parent_session_id";
    public static final String JSON_KEY_PV_URLS = "pv_urls";
    public static final String JSON_KEY_REPLACE_TMP = "replace_tmp";
    public static final String JSON_KEY_REQ_EXT_DATA = "req_ext_data";
    public static final String JSON_KEY_RKS = "rks";
    public static final String JSON_KEY_SESSION_ID = "a";
    public static final String JSON_KEY_SH = "sh";
    public static final String JSON_KEY_TEMPLATE = "template";
    public static final String JSON_KEY_TK_TCP_PORT = "tk_tcp_port";
    public static final String JSON_KEY_TOKEN_RULE = "token_r";
    public static final String JSON_KEY_UNIT_SIZE = "unit_size";
    public static final String JSON_KEY_VCN = "vcn";
    public static final String KEY_IRLFA = "irlfa";
    private static final String TAG = "b";
    private String adHtml;
    private int adType;
    private String adZip;
    public ArrayList<CampaignEx> ads;
    private String bannerHtml;
    private String bannerUrl;
    private String csp;
    private String domain;
    private double ecppv;
    private HashMap<String, String> epMap;
    private String htmlUrl;
    private String ia_all_ext1;
    private String ia_all_ext2;
    private String ia_icon;
    private int ia_ori;
    private int ia_rst;
    private String ia_url;
    private int jmDo;
    private List<Frame> listFrames;
    private String localRequestId;
    private com.mbridge.msdk.foundation.same.report.d.b metricsData;
    private String onlyImpressionUrl;
    private String parentSessionId;
    private String requestId;
    private HashMap<String, String> rks;
    private String sessionId;
    private String sh;
    private int template;
    private int tokenRule;
    private String unitSize;
    private int vcn;
    protected StringBuffer cParams = new StringBuffer();
    private String encryptPrice = "";
    private String msg = "";

    private static void getSysIDAndBKUPID(JSONObject jSONObject) {
        FastKV fastKV;
        com.mbridge.msdk.foundation.controller.d.a();
        try {
            fastKV = new FastKV.Builder(com.mbridge.msdk.foundation.same.b.e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_700_CONFIG), x.a("H+tU+FeXHM==")).build();
        } catch (Exception unused) {
            fastKV = null;
        }
        if (fastKV != null) {
            try {
                Context c8 = com.mbridge.msdk.foundation.controller.c.m().c();
                if (jSONObject != null && c8 != null) {
                    String optString = jSONObject.optString("b");
                    if (!TextUtils.isEmpty(optString) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.f20649U, optString)) {
                        com.mbridge.msdk.foundation.same.a.f20649U = optString;
                        com.mbridge.msdk.foundation.a.a.a.a().a("b", com.mbridge.msdk.foundation.same.a.f20649U);
                        try {
                            fastKV.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.f20649U);
                        } catch (Exception unused2) {
                        }
                    }
                    String optString2 = jSONObject.optString("c");
                    if (!TextUtils.isEmpty(optString2) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.f20658g, optString2)) {
                        com.mbridge.msdk.foundation.same.a.f20658g = optString2;
                        com.mbridge.msdk.foundation.a.a.a.a().a("c", com.mbridge.msdk.foundation.same.a.f20658g);
                        try {
                            fastKV.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f20658g);
                            return;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                    return;
                }
                return;
            } catch (Exception e8) {
                e8.printStackTrace();
                return;
            }
        }
        try {
            Context c9 = com.mbridge.msdk.foundation.controller.c.m().c();
            if (jSONObject != null && c9 != null) {
                String optString3 = jSONObject.optString("b");
                if (!TextUtils.isEmpty(optString3) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.f20649U, optString3)) {
                    com.mbridge.msdk.foundation.same.a.f20649U = optString3;
                    com.mbridge.msdk.foundation.a.a.a.a().a("b", com.mbridge.msdk.foundation.same.a.f20649U);
                    SharedPreferences sharedPreferences = c9.getSharedPreferences(x.a("H+tU+FeXHM=="), 0);
                    if (sharedPreferences != null) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        edit.putString(x.a("H+tU+bfPhM=="), com.mbridge.msdk.foundation.same.a.f20649U);
                        edit.apply();
                    }
                }
                String optString4 = jSONObject.optString("c");
                if (!TextUtils.isEmpty(optString4) && !TextUtils.equals(com.mbridge.msdk.foundation.same.a.f20658g, optString4)) {
                    com.mbridge.msdk.foundation.same.a.f20658g = optString4;
                    com.mbridge.msdk.foundation.a.a.a.a().a("c", com.mbridge.msdk.foundation.same.a.f20658g);
                    SharedPreferences sharedPreferences2 = c9.getSharedPreferences(x.a("H+tU+FeXHM=="), 0);
                    if (sharedPreferences2 != null) {
                        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
                        edit2.putString(x.a("H+tU+Fz8"), com.mbridge.msdk.foundation.same.a.f20658g);
                        edit2.apply();
                    }
                }
            }
        } catch (Exception e9) {
            e9.printStackTrace();
        }
    }

    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject) {
        return parseCampaignUnit(jSONObject, "");
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject) {
        return parseV5CampaignUnit(jSONObject, "");
    }

    public abstract String assembCParams();

    public String getAdHtml() {
        return this.adHtml;
    }

    public int getAdType() {
        return this.adType;
    }

    public String getAdZip() {
        return this.adZip;
    }

    public ArrayList<CampaignEx> getAds() {
        return this.ads;
    }

    public String getBannerHtml() {
        return this.bannerHtml;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public String getCsp() {
        return this.csp;
    }

    public String getDomain() {
        return this.domain;
    }

    public double getEcppv() {
        return this.ecppv;
    }

    public String getEncryptPrice() {
        return this.encryptPrice;
    }

    public HashMap<String, String> getEpMap() {
        return this.epMap;
    }

    public String getHtmlUrl() {
        return this.htmlUrl;
    }

    public String getIa_all_ext1() {
        return this.ia_all_ext1;
    }

    public String getIa_all_ext2() {
        return this.ia_all_ext2;
    }

    public String getIa_icon() {
        return this.ia_icon;
    }

    public int getIa_ori() {
        return this.ia_ori;
    }

    public int getIa_rst() {
        return this.ia_rst;
    }

    public String getIa_url() {
        return this.ia_url;
    }

    public int getJmDo() {
        return this.jmDo;
    }

    public List<Frame> getListFrames() {
        return this.listFrames;
    }

    public String getLocalRequestId() {
        return this.localRequestId;
    }

    public com.mbridge.msdk.foundation.same.report.d.b getMetricsData() {
        return this.metricsData;
    }

    public String getMsg() {
        return this.msg;
    }

    public String getOnlyImpressionUrl() {
        return this.onlyImpressionUrl;
    }

    public String getParentSessionId() {
        return this.parentSessionId;
    }

    public String getRequestId() {
        try {
            if (!TextUtils.isEmpty(this.requestId)) {
                return this.requestId;
            }
            if (!TextUtils.isEmpty(this.onlyImpressionUrl)) {
                Uri parse = Uri.parse(this.onlyImpressionUrl);
                if (parse != null) {
                    this.requestId = parse.getQueryParameter("k");
                }
                return this.requestId;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    public HashMap<String, String> getRks() {
        return this.rks;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public String getSh() {
        return this.sh;
    }

    public int getTemplate() {
        return this.template;
    }

    public int getTokenRule() {
        int i8 = this.tokenRule;
        if (i8 == 1) {
            return i8;
        }
        return 0;
    }

    public String getUnitSize() {
        return this.unitSize;
    }

    public int getVcn() {
        int i8 = this.vcn;
        if (i8 <= 1) {
            return 1;
        }
        return i8;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Object nullToEmpty(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj;
    }

    public void setAdHtml(String str) {
        this.adHtml = str;
    }

    public void setAdType(int i8) {
        this.adType = i8;
    }

    public void setAdZip(String str) {
        this.adZip = str;
    }

    public void setAds(ArrayList<CampaignEx> arrayList) {
        this.ads = arrayList;
    }

    public void setBannerHtml(String str) {
        this.bannerHtml = str;
    }

    public void setBannerUrl(String str) {
        this.bannerUrl = str;
    }

    public void setCsp(String str) {
        this.csp = str;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public void setEcppv(double d8) {
        this.ecppv = d8;
    }

    public void setEncryptPrice(String str) {
        this.encryptPrice = str;
    }

    public void setEpMap(HashMap<String, String> hashMap) {
        this.epMap = hashMap;
    }

    public void setHtmlUrl(String str) {
        this.htmlUrl = str;
    }

    public void setIa_all_ext1(String str) {
        this.ia_all_ext1 = str;
    }

    public void setIa_all_ext2(String str) {
        this.ia_all_ext2 = str;
    }

    public void setIa_icon(String str) {
        this.ia_icon = str;
    }

    public void setIa_ori(int i8) {
        this.ia_ori = i8;
    }

    public void setIa_rst(int i8) {
        this.ia_rst = i8;
    }

    public void setIa_url(String str) {
        this.ia_url = str;
    }

    public void setJmDo(int i8) {
        this.jmDo = i8;
    }

    public void setListFrames(List<Frame> list) {
        this.listFrames = list;
    }

    public void setLocalRequestId(String str) {
        this.localRequestId = str;
        Iterator<CampaignEx> it = getAds().iterator();
        while (it.hasNext()) {
            it.next().setLocalRequestId(str);
        }
    }

    public void setMetricsData(com.mbridge.msdk.foundation.same.report.d.b bVar) {
        this.metricsData = bVar;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setOnlyImpressionUrl(String str) {
        this.onlyImpressionUrl = str;
    }

    public void setParentSessionId(String str) {
        this.parentSessionId = str;
    }

    public void setRks(HashMap<String, String> hashMap) {
        this.rks = hashMap;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public void setSh(String str) {
        this.sh = str;
    }

    public void setTemplate(int i8) {
        this.template = i8;
    }

    public void setTokenRule(int i8) {
        this.tokenRule = i8;
    }

    public void setUnitSize(String str) {
        this.unitSize = str;
    }

    public void setVcn(int i8) {
        this.vcn = i8;
    }

    public static CampaignUnit parseCampaignUnit(JSONObject jSONObject, String str) {
        CampaignUnit campaignUnit;
        String optString;
        int optInt;
        String str2;
        int i8;
        ArrayList arrayList;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        String str3;
        String str4;
        CampaignUnit campaignUnit2;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        JSONObject jSONObject2 = jSONObject;
        String str10 = JSON_KEY_ADS;
        String str11 = "template";
        String str12 = CampaignEx.JSON_KEY_ECPPV;
        String str13 = JSON_KEY_ONLY_IMPRESSION_URL;
        String str14 = JSON_KEY_HTML_URL;
        if (jSONObject2 != null) {
            try {
                CampaignUnit campaignUnit3 = new CampaignUnit();
                try {
                    String optString2 = jSONObject2.optString(JSON_KEY_RKS);
                    if (!TextUtils.isEmpty(optString2)) {
                        try {
                            JSONObject jSONObject3 = new JSONObject(optString2);
                            Iterator<String> keys = jSONObject3.keys();
                            HashMap<String, String> hashMap = new HashMap<>();
                            while (keys != null && keys.hasNext()) {
                                String next = keys.next();
                                hashMap.put(next, jSONObject3.optString(next));
                            }
                            campaignUnit3.setRks(hashMap);
                        } catch (Exception unused) {
                            return campaignUnit3;
                        }
                    }
                    if (!TextUtils.isEmpty(str)) {
                        HashMap<String, String> hashMap2 = new HashMap<>();
                        hashMap2.put("encrypt_p", "");
                        hashMap2.put(KEY_IRLFA, "");
                        campaignUnit3.setEpMap(hashMap2);
                    }
                    JSONObject optJSONObject = jSONObject2.optJSONObject(JSON_KEY_REQ_EXT_DATA);
                    int optInt2 = jSONObject2.optInt(JSON_KEY_NSCPT, 1);
                    optString = jSONObject2.optString(JSON_KEY_MOF_TEMPLATE_URL, "");
                    optInt = jSONObject2.optInt(JSON_KEY_MOF_TPLID, 0);
                    String jSONObject4 = optJSONObject != null ? optJSONObject.toString() : "";
                    new JSONArray();
                    JSONArray optJSONArray3 = jSONObject2.optJSONArray("pv_urls");
                    if (optJSONArray3 == null || optJSONArray3.length() <= 0) {
                        str2 = jSONObject4;
                        i8 = optInt2;
                        arrayList = null;
                    } else {
                        str2 = jSONObject4;
                        arrayList = new ArrayList(optJSONArray3.length());
                        i8 = optInt2;
                        for (int i9 = 0; i9 < optJSONArray3.length(); i9++) {
                            arrayList.add(optJSONArray3.getString(i9));
                        }
                    }
                    com.mbridge.msdk.foundation.db.a.a.a().a(jSONObject2.optJSONObject(JSON_KEY_REPLACE_TMP), true);
                    getSysIDAndBKUPID(jSONObject);
                    campaignUnit3.setSessionId(jSONObject2.optString("a"));
                    campaignUnit3.setParentSessionId(jSONObject2.optString(JSON_KEY_PARENT_SESSION_ID));
                    campaignUnit3.setAdType(jSONObject2.optInt("ad_type"));
                    campaignUnit3.setUnitSize(jSONObject2.optString(JSON_KEY_UNIT_SIZE));
                    campaignUnit3.setHtmlUrl(jSONObject2.optString(JSON_KEY_HTML_URL));
                    campaignUnit3.setOnlyImpressionUrl(jSONObject2.optString(JSON_KEY_ONLY_IMPRESSION_URL));
                    campaignUnit3.setEcppv(jSONObject2.optDouble(CampaignEx.JSON_KEY_ECPPV));
                    campaignUnit3.setTemplate(jSONObject2.optInt("template"));
                    campaignUnit3.setJmDo(jSONObject2.optInt(JSON_KEY_JM_DO));
                    campaignUnit3.setIa_icon(jSONObject2.optString("ia_icon"));
                    campaignUnit3.setIa_rst(jSONObject2.optInt("ia_rst"));
                    campaignUnit3.setIa_url(jSONObject2.optString("ia_url"));
                    campaignUnit3.setIa_ori(jSONObject2.optInt("ia_ori"));
                    campaignUnit3.setIa_all_ext1(jSONObject2.optString(JSON_KEY_IA_EXT1));
                    campaignUnit3.setIa_all_ext2(jSONObject2.optString(JSON_KEY_IA_EXT2));
                    campaignUnit3.setVcn(jSONObject2.optInt("vcn"));
                    campaignUnit3.setTokenRule(jSONObject2.optInt("token_r"));
                    campaignUnit3.setEncryptPrice(jSONObject2.optString("encrypt_p"));
                    optJSONArray = jSONObject2.optJSONArray(JSON_KEY_ADS);
                    optJSONArray2 = jSONObject2.optJSONArray(JSON_KEY_FRAME_ADS);
                    str3 = "web env is not support";
                    str4 = JSON_KEY_END_SCREEN_URL;
                } catch (Exception unused2) {
                    campaignUnit = campaignUnit3;
                }
                if (optJSONArray2 != null) {
                    try {
                        if (optJSONArray2.length() > 0) {
                            ArrayList arrayList2 = new ArrayList();
                            String str15 = "web env is not support";
                            int i10 = optInt;
                            int i11 = 0;
                            while (i11 < optJSONArray2.length()) {
                                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i11);
                                int i12 = i11;
                                JSONArray jSONArray = optJSONObject2.getJSONArray(str10);
                                String str16 = str10;
                                ArrayList arrayList3 = new ArrayList();
                                String str17 = str11;
                                JSONObject jSONObject5 = optJSONObject2;
                                int i13 = 0;
                                while (i13 < jSONArray.length()) {
                                    JSONObject optJSONObject3 = jSONArray.optJSONObject(i13);
                                    String optString3 = jSONObject2.optString(str13);
                                    String optString4 = jSONObject2.optString(str14);
                                    String optString5 = jSONObject2.optString(str4);
                                    String optString6 = jSONObject2.optString(str12);
                                    String str18 = str4;
                                    String str19 = str15;
                                    JSONObject jSONObject6 = jSONObject5;
                                    String str20 = str2;
                                    JSONArray jSONArray2 = optJSONArray2;
                                    String str21 = str12;
                                    int i14 = i8;
                                    String str22 = str14;
                                    ArrayList arrayList4 = arrayList2;
                                    String str23 = str13;
                                    JSONArray jSONArray3 = jSONArray;
                                    int i15 = i10;
                                    CampaignUnit campaignUnit4 = campaignUnit3;
                                    try {
                                        CampaignEx parseCampaign = CampaignEx.parseCampaign(optJSONObject3, optString3, optString4, optString5, false, campaignUnit3, str, optString6);
                                        if (parseCampaign != null) {
                                            try {
                                                parseCampaign.setKeyIaUrl(campaignUnit4.getIa_url());
                                                parseCampaign.setKeyIaOri(campaignUnit4.getIa_ori());
                                                parseCampaign.setKeyIaRst(campaignUnit4.getIa_rst());
                                                parseCampaign.setKeyIaIcon(campaignUnit4.getIa_icon());
                                                parseCampaign.setAdType(jSONObject2.optInt("ad_type"));
                                                parseCampaign.setIa_ext1(jSONObject2.optString(CampaignEx.KEY_IA_EXT1));
                                                parseCampaign.setIa_ext2(jSONObject2.optString(CampaignEx.KEY_IA_EXT2));
                                                parseCampaign.setVcn(campaignUnit4.getVcn());
                                                parseCampaign.setTokenRule(campaignUnit4.getTokenRule());
                                                parseCampaign.setEncryptPrice(campaignUnit4.getEncryptPrice());
                                                parseCampaign.setMof_tplid(i15);
                                                str5 = optString;
                                                parseCampaign.setMof_template_url(str5);
                                                parseCampaign.setNscpt(i14);
                                                parseCampaign.setPv_urls(arrayList);
                                                str6 = str20;
                                                parseCampaign.setReq_ext_data(str6);
                                                arrayList3.add(parseCampaign);
                                                campaignUnit2 = campaignUnit4;
                                                str7 = str19;
                                            } catch (Exception unused3) {
                                                return campaignUnit4;
                                            }
                                        } else {
                                            str5 = optString;
                                            campaignUnit2 = campaignUnit4;
                                            str7 = str19;
                                            str6 = str20;
                                            try {
                                                campaignUnit2.setMsg(str7);
                                            } catch (Exception unused4) {
                                                return campaignUnit2;
                                            }
                                        }
                                        i13++;
                                        i10 = i15;
                                        arrayList2 = arrayList4;
                                        str15 = str7;
                                        optString = str5;
                                        str14 = str22;
                                        str13 = str23;
                                        str4 = str18;
                                        i8 = i14;
                                        campaignUnit3 = campaignUnit2;
                                        optJSONArray2 = jSONArray2;
                                        str12 = str21;
                                        jSONObject5 = jSONObject6;
                                        str2 = str6;
                                        jSONArray = jSONArray3;
                                    } catch (Exception unused5) {
                                        campaignUnit2 = campaignUnit4;
                                        return campaignUnit2;
                                    }
                                }
                                String str24 = str2;
                                JSONObject jSONObject7 = jSONObject5;
                                String str25 = str12;
                                int i16 = i8;
                                String str26 = str14;
                                ArrayList arrayList5 = arrayList2;
                                Frame frame = new Frame();
                                frame.setParentSessionId(jSONObject2.optString(JSON_KEY_PARENT_SESSION_ID));
                                frame.setSessionId(jSONObject2.optString("a"));
                                frame.setCampaigns(arrayList3);
                                frame.setTemplate(jSONObject7.optInt(str17));
                                arrayList5.add(frame);
                                i10 = i10;
                                arrayList2 = arrayList5;
                                str15 = str15;
                                optString = optString;
                                str14 = str26;
                                str13 = str13;
                                str4 = str4;
                                i8 = i16;
                                campaignUnit3 = campaignUnit3;
                                optJSONArray2 = optJSONArray2;
                                str12 = str25;
                                str2 = str24;
                                i11 = i12 + 1;
                                str11 = str17;
                                str10 = str16;
                            }
                            campaignUnit2 = campaignUnit3;
                            campaignUnit2.setListFrames(arrayList2);
                            campaignUnit = campaignUnit2;
                            return campaignUnit;
                        }
                    } catch (Exception unused6) {
                        campaignUnit2 = campaignUnit3;
                    }
                }
                String str27 = CampaignEx.JSON_KEY_ECPPV;
                String str28 = JSON_KEY_ONLY_IMPRESSION_URL;
                String str29 = JSON_KEY_END_SCREEN_URL;
                campaignUnit2 = campaignUnit3;
                String str30 = optString;
                String str31 = str2;
                int i17 = i8;
                String str32 = JSON_KEY_HTML_URL;
                if (optJSONArray != null) {
                    if (optJSONArray.length() > 0) {
                        ArrayList<CampaignEx> arrayList6 = new ArrayList<>();
                        int i18 = 0;
                        while (i18 < optJSONArray.length()) {
                            JSONObject optJSONObject4 = optJSONArray.optJSONObject(i18);
                            String str33 = str28;
                            String optString7 = jSONObject2.optString(str33);
                            String str34 = str32;
                            String optString8 = jSONObject2.optString(str34);
                            String str35 = str31;
                            String str36 = str29;
                            String optString9 = jSONObject2.optString(str36);
                            String str37 = str27;
                            String str38 = str3;
                            campaignUnit = campaignUnit2;
                            JSONArray jSONArray4 = optJSONArray;
                            String str39 = str30;
                            try {
                                CampaignEx parseCampaign2 = CampaignEx.parseCampaign(optJSONObject4, optString7, optString8, optString9, false, campaignUnit, str, jSONObject2.optString(str37));
                                if (parseCampaign2 != null) {
                                    parseCampaign2.setMof_tplid(optInt);
                                    str9 = str39;
                                    parseCampaign2.setMof_template_url(str9);
                                    parseCampaign2.setNscpt(i17);
                                    parseCampaign2.setPv_urls(arrayList);
                                    parseCampaign2.setReq_ext_data(str35);
                                    parseCampaign2.setVcn(campaignUnit.getVcn());
                                    parseCampaign2.setTokenRule(campaignUnit.getTokenRule());
                                    parseCampaign2.setEncryptPrice(campaignUnit.getEncryptPrice());
                                    arrayList6.add(parseCampaign2);
                                    str8 = str38;
                                } else {
                                    str8 = str38;
                                    str9 = str39;
                                    campaignUnit.setMsg(str8);
                                }
                                i18++;
                                str31 = str35;
                                str28 = str33;
                                campaignUnit2 = campaignUnit;
                                str32 = str34;
                                optJSONArray = jSONArray4;
                                str30 = str9;
                                str27 = str37;
                                str29 = str36;
                                jSONObject2 = jSONObject;
                                str3 = str8;
                            } catch (Exception unused7) {
                            }
                        }
                        campaignUnit = campaignUnit2;
                        campaignUnit.setAds(arrayList6);
                        return campaignUnit;
                    }
                }
                campaignUnit = campaignUnit2;
                return campaignUnit;
            } catch (Exception unused8) {
            }
        }
        return null;
    }

    public static CampaignUnit parseV5CampaignUnit(JSONObject jSONObject, String str) {
        return parseCampaignUnit(jSONObject, str);
    }
}
