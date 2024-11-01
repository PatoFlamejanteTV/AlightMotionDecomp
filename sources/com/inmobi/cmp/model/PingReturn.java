package com.inmobi.cmp.model;

import D5.t;
import androidx.annotation.Keep;
import com.inmobi.cmp.core.cmpapi.status.CmpStatus;
import com.inmobi.cmp.core.cmpapi.status.DisplayStatus;
import com.mbridge.msdk.MBridgeConstans;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

@Keep
/* loaded from: classes4.dex */
public final class PingReturn {
    public static final a Companion = new a();
    private static final PingReturn LOADING_PING;
    private static final PingReturn STUB_PING;
    private String apiVersion;
    private Integer cmpId;
    private boolean cmpLoaded;
    private CmpStatus cmpStatus;
    private String cmpVersion;
    private DisplayStatus displayStatus;
    private Boolean gdprApplies;
    private Integer gvlVersion;
    private Integer tcfPolicyVersion;

    /* loaded from: classes4.dex */
    public static final class a {
    }

    static {
        CmpStatus cmpStatus = CmpStatus.STUB;
        DisplayStatus displayStatus = DisplayStatus.HIDDEN;
        STUB_PING = new PingReturn(null, false, cmpStatus, displayStatus, MBridgeConstans.NATIVE_VIDEO_VERSION, null, null, null, null);
        LOADING_PING = new PingReturn(null, false, CmpStatus.LOADING, displayStatus, MBridgeConstans.NATIVE_VIDEO_VERSION, "0.1", 10, null, null);
    }

    public PingReturn(Boolean bool, boolean z8, CmpStatus cmpStatus, DisplayStatus displayStatus, String apiVersion, String str, Integer num, Integer num2, Integer num3) {
        AbstractC3292y.i(cmpStatus, "cmpStatus");
        AbstractC3292y.i(displayStatus, "displayStatus");
        AbstractC3292y.i(apiVersion, "apiVersion");
        this.gdprApplies = bool;
        this.cmpLoaded = z8;
        this.cmpStatus = cmpStatus;
        this.displayStatus = displayStatus;
        this.apiVersion = apiVersion;
        this.cmpVersion = str;
        this.cmpId = num;
        this.gvlVersion = num2;
        this.tcfPolicyVersion = num3;
    }

    public final Boolean component1() {
        return this.gdprApplies;
    }

    public final boolean component2() {
        return this.cmpLoaded;
    }

    public final CmpStatus component3() {
        return this.cmpStatus;
    }

    public final DisplayStatus component4() {
        return this.displayStatus;
    }

    public final String component5() {
        return this.apiVersion;
    }

    public final String component6() {
        return this.cmpVersion;
    }

    public final Integer component7() {
        return this.cmpId;
    }

    public final Integer component8() {
        return this.gvlVersion;
    }

    public final Integer component9() {
        return this.tcfPolicyVersion;
    }

    public final PingReturn copy(Boolean bool, boolean z8, CmpStatus cmpStatus, DisplayStatus displayStatus, String apiVersion, String str, Integer num, Integer num2, Integer num3) {
        AbstractC3292y.i(cmpStatus, "cmpStatus");
        AbstractC3292y.i(displayStatus, "displayStatus");
        AbstractC3292y.i(apiVersion, "apiVersion");
        return new PingReturn(bool, z8, cmpStatus, displayStatus, apiVersion, str, num, num2, num3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PingReturn)) {
            return false;
        }
        PingReturn pingReturn = (PingReturn) obj;
        return AbstractC3292y.d(this.gdprApplies, pingReturn.gdprApplies) && this.cmpLoaded == pingReturn.cmpLoaded && this.cmpStatus == pingReturn.cmpStatus && this.displayStatus == pingReturn.displayStatus && AbstractC3292y.d(this.apiVersion, pingReturn.apiVersion) && AbstractC3292y.d(this.cmpVersion, pingReturn.cmpVersion) && AbstractC3292y.d(this.cmpId, pingReturn.cmpId) && AbstractC3292y.d(this.gvlVersion, pingReturn.gvlVersion) && AbstractC3292y.d(this.tcfPolicyVersion, pingReturn.tcfPolicyVersion);
    }

    public final String getApiVersion() {
        return this.apiVersion;
    }

    public final Integer getCmpId() {
        return this.cmpId;
    }

    public final boolean getCmpLoaded() {
        return this.cmpLoaded;
    }

    public final CmpStatus getCmpStatus() {
        return this.cmpStatus;
    }

    public final String getCmpVersion() {
        return this.cmpVersion;
    }

    public final DisplayStatus getDisplayStatus() {
        return this.displayStatus;
    }

    public final Boolean getGdprApplies() {
        return this.gdprApplies;
    }

    public final Integer getGvlVersion() {
        return this.gvlVersion;
    }

    public final Integer getTcfPolicyVersion() {
        return this.tcfPolicyVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        Boolean bool = this.gdprApplies;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        boolean z8 = this.cmpLoaded;
        int i8 = z8;
        if (z8 != 0) {
            i8 = 1;
        }
        int a9 = t.a(this.apiVersion, (this.displayStatus.hashCode() + ((this.cmpStatus.hashCode() + ((hashCode + i8) * 31)) * 31)) * 31, 31);
        String str = this.cmpVersion;
        int hashCode2 = (a9 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.cmpId;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.gvlVersion;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tcfPolicyVersion;
        return hashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final void setApiVersion(String str) {
        AbstractC3292y.i(str, "<set-?>");
        this.apiVersion = str;
    }

    public final void setCmpId(Integer num) {
        this.cmpId = num;
    }

    public final void setCmpLoaded(boolean z8) {
        this.cmpLoaded = z8;
    }

    public final void setCmpStatus(CmpStatus cmpStatus) {
        AbstractC3292y.i(cmpStatus, "<set-?>");
        this.cmpStatus = cmpStatus;
    }

    public final void setCmpVersion(String str) {
        this.cmpVersion = str;
    }

    public final void setDisplayStatus(DisplayStatus displayStatus) {
        AbstractC3292y.i(displayStatus, "<set-?>");
        this.displayStatus = displayStatus;
    }

    public final void setGdprApplies(Boolean bool) {
        this.gdprApplies = bool;
    }

    public final void setGvlVersion(Integer num) {
        this.gvlVersion = num;
    }

    public final void setTcfPolicyVersion(Integer num) {
        this.tcfPolicyVersion = num;
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("PingReturn(gdprApplies=");
        a9.append(this.gdprApplies);
        a9.append(", cmpLoaded=");
        a9.append(this.cmpLoaded);
        a9.append(", cmpStatus=");
        a9.append(this.cmpStatus);
        a9.append(", displayStatus=");
        a9.append(this.displayStatus);
        a9.append(", apiVersion=");
        a9.append(this.apiVersion);
        a9.append(", cmpVersion=");
        a9.append((Object) this.cmpVersion);
        a9.append(", cmpId=");
        a9.append(this.cmpId);
        a9.append(", gvlVersion=");
        a9.append(this.gvlVersion);
        a9.append(", tcfPolicyVersion=");
        a9.append(this.tcfPolicyVersion);
        a9.append(')');
        return a9.toString();
    }
}
