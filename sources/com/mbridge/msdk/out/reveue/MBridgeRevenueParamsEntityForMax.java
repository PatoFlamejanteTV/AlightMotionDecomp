package com.mbridge.msdk.out.reveue;

/* loaded from: classes4.dex */
public class MBridgeRevenueParamsEntityForMax extends MBridgeRevenueParamsEntity {
    public MBridgeRevenueParamsEntityForMax(String str, String str2) {
        super(str, str2);
        setMediationName("Max");
    }

    @Override // com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity
    public void setDspInfo(String str, String str2) {
        super.setDspInfo(str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008e, code lost:            setBidType(java.lang.Boolean.valueOf(r3.optBoolean("isBidding", false)));        r0 = r3.optJSONArray("credentials");     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a1, code lost:            if (r0 == null) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a7, code lost:            if (r0.length() <= 0) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:            r0 = r0.optJSONObject(0);     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:            if (r0 == null) goto L33;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:            r1 = new org.json.JSONObject();        r2 = r0.keys();     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:            if (r2.hasNext() == false) goto L41;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00be, code lost:            r3 = r2.next();        r1.put(r3, r0.get(r3) + "");     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00dd, code lost:            setNetworkInfo(r1);     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setMaxAdInfo(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = " "
            java.lang.String r2 = ":"
            java.lang.String r3 = "="
            java.lang.String r4 = ""
            if (r0 != 0) goto L41
            java.lang.String r0 = "MediatedAd"
            java.lang.String r0 = r8.replace(r0, r4)     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = r0.replace(r3, r2)     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = r0.replace(r1, r4)     // Catch: java.lang.Exception -> L3d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3d
            r5.<init>(r0)     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = "format"
            java.lang.String r0 = r5.optString(r0)     // Catch: java.lang.Exception -> L3d
            r7.setAdType(r0)     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = "adUnitId"
            java.lang.String r0 = r5.optString(r0)     // Catch: java.lang.Exception -> L3d
            r7.setMediationUnitId(r0)     // Catch: java.lang.Exception -> L3d
            java.lang.String r0 = "networkName"
            java.lang.String r0 = r5.optString(r0)     // Catch: java.lang.Exception -> L3d
            r7.setNetworkName(r0)     // Catch: java.lang.Exception -> L3d
            goto L41
        L3d:
            r0 = move-exception
            r0.printStackTrace()
        L41:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto Le7
            java.lang.String r0 = "MaxAdWaterfallInfo"
            java.lang.String r0 = r9.replace(r0, r4)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r5 = "MaxResponseInfo"
            java.lang.String r0 = r0.replace(r5, r4)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r5 = "MaxMediatedNetworkInfo"
            java.lang.String r0 = r0.replace(r5, r4)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r5 = "Bundle"
            java.lang.String r0 = r0.replace(r5, r4)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r0 = r0.replace(r3, r2)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r0 = r0.replace(r1, r4)     // Catch: java.lang.Exception -> Ldb
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ldb
            r1.<init>(r0)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r0 = "networkResponses"
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: java.lang.Exception -> Ldb
            if (r0 == 0) goto Le7
            r1 = 0
            r2 = 0
        L76:
            int r3 = r0.length()     // Catch: java.lang.Exception -> Ldb
            if (r2 >= r3) goto Le7
            org.json.JSONObject r3 = r0.getJSONObject(r2)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r5 = "adLoadState"
            java.lang.String r5 = r3.optString(r5, r4)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r6 = "AD_LOADED"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Exception -> Ldb
            if (r5 == 0) goto Le1
            java.lang.String r0 = "isBidding"
            boolean r0 = r3.optBoolean(r0, r1)     // Catch: java.lang.Exception -> Ldb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch: java.lang.Exception -> Ldb
            r7.setBidType(r0)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r0 = "credentials"
            org.json.JSONArray r0 = r3.optJSONArray(r0)     // Catch: java.lang.Exception -> Ldb
            if (r0 == 0) goto Le7
            int r2 = r0.length()     // Catch: java.lang.Exception -> Ldb
            if (r2 <= 0) goto Le7
            org.json.JSONObject r0 = r0.optJSONObject(r1)     // Catch: java.lang.Exception -> Ldb
            if (r0 == 0) goto Le7
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> Ldb
            r1.<init>()     // Catch: java.lang.Exception -> Ldb
            java.util.Iterator r2 = r0.keys()     // Catch: java.lang.Exception -> Ldb
        Lb8:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Exception -> Ldb
            if (r3 == 0) goto Ldd
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Exception -> Ldb
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Ldb
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Ldb
            r5.<init>()     // Catch: java.lang.Exception -> Ldb
            java.lang.Object r6 = r0.get(r3)     // Catch: java.lang.Exception -> Ldb
            r5.append(r6)     // Catch: java.lang.Exception -> Ldb
            r5.append(r4)     // Catch: java.lang.Exception -> Ldb
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Exception -> Ldb
            r1.put(r3, r5)     // Catch: java.lang.Exception -> Ldb
            goto Lb8
        Ldb:
            r0 = move-exception
            goto Le4
        Ldd:
            r7.setNetworkInfo(r1)     // Catch: java.lang.Exception -> Ldb
            goto Le7
        Le1:
            int r2 = r2 + 1
            goto L76
        Le4:
            r0.printStackTrace()
        Le7:
            r7.setSourceData(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntityForMax.setMaxAdInfo(java.lang.String, java.lang.String):void");
    }

    public void setMaxRevenueInfo(String str, Double d8) {
        setRevenue(d8 + "");
        setPrecision(str + "");
    }
}
