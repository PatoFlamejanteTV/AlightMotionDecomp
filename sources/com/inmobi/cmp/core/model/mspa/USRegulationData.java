package com.inmobi.cmp.core.model.mspa;

import D5.t;
import H6.k;
import H6.l;
import R5.AbstractC1435t;
import androidx.annotation.Keep;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@Keep
/* loaded from: classes4.dex */
public final class USRegulationData {
    private String gppString;
    private List<Integer> knownChildSensitiveDataConsents;
    private int mspaCoveredTransaction;
    private int mspaOptOutOptionMode;
    private int mspaServiceProviderMode;
    private int personalDataConsents;
    private int saleOptOut;
    private int saleOptOutNotice;
    private int sensitiveDataLimitUseNotice;
    private List<Integer> sensitiveDataProcessing;
    private int sensitiveDataProcessingOptOutNotice;
    private int sharingNotice;
    private int sharingOptOut;
    private int sharingOptOutNotice;
    private int targetedAdvertisingOptOut;
    private int targetedAdvertisingOptOutNotice;
    private int version;

    public USRegulationData() {
        this(0, null, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, null, 0, 0, 0, 0, 131071, null);
    }

    public final int component1() {
        return this.version;
    }

    public final int component10() {
        return this.sharingOptOut;
    }

    public final int component11() {
        return this.targetedAdvertisingOptOut;
    }

    public final List<Integer> component12() {
        return this.sensitiveDataProcessing;
    }

    public final List<Integer> component13() {
        return this.knownChildSensitiveDataConsents;
    }

    public final int component14() {
        return this.personalDataConsents;
    }

    public final int component15() {
        return this.mspaCoveredTransaction;
    }

    public final int component16() {
        return this.mspaOptOutOptionMode;
    }

    public final int component17() {
        return this.mspaServiceProviderMode;
    }

    public final String component2() {
        return this.gppString;
    }

    public final int component3() {
        return this.sharingNotice;
    }

    public final int component4() {
        return this.saleOptOutNotice;
    }

    public final int component5() {
        return this.sharingOptOutNotice;
    }

    public final int component6() {
        return this.targetedAdvertisingOptOutNotice;
    }

    public final int component7() {
        return this.sensitiveDataProcessingOptOutNotice;
    }

    public final int component8() {
        return this.sensitiveDataLimitUseNotice;
    }

    public final int component9() {
        return this.saleOptOut;
    }

    public final USRegulationData copy(int i8, String gppString, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List<Integer> sensitiveDataProcessing, List<Integer> knownChildSensitiveDataConsents, int i18, int i19, int i20, int i21) {
        AbstractC3292y.i(gppString, "gppString");
        AbstractC3292y.i(sensitiveDataProcessing, "sensitiveDataProcessing");
        AbstractC3292y.i(knownChildSensitiveDataConsents, "knownChildSensitiveDataConsents");
        return new USRegulationData(i8, gppString, i9, i10, i11, i12, i13, i14, i15, i16, i17, sensitiveDataProcessing, knownChildSensitiveDataConsents, i18, i19, i20, i21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof USRegulationData)) {
            return false;
        }
        USRegulationData uSRegulationData = (USRegulationData) obj;
        return this.version == uSRegulationData.version && AbstractC3292y.d(this.gppString, uSRegulationData.gppString) && this.sharingNotice == uSRegulationData.sharingNotice && this.saleOptOutNotice == uSRegulationData.saleOptOutNotice && this.sharingOptOutNotice == uSRegulationData.sharingOptOutNotice && this.targetedAdvertisingOptOutNotice == uSRegulationData.targetedAdvertisingOptOutNotice && this.sensitiveDataProcessingOptOutNotice == uSRegulationData.sensitiveDataProcessingOptOutNotice && this.sensitiveDataLimitUseNotice == uSRegulationData.sensitiveDataLimitUseNotice && this.saleOptOut == uSRegulationData.saleOptOut && this.sharingOptOut == uSRegulationData.sharingOptOut && this.targetedAdvertisingOptOut == uSRegulationData.targetedAdvertisingOptOut && AbstractC3292y.d(this.sensitiveDataProcessing, uSRegulationData.sensitiveDataProcessing) && AbstractC3292y.d(this.knownChildSensitiveDataConsents, uSRegulationData.knownChildSensitiveDataConsents) && this.personalDataConsents == uSRegulationData.personalDataConsents && this.mspaCoveredTransaction == uSRegulationData.mspaCoveredTransaction && this.mspaOptOutOptionMode == uSRegulationData.mspaOptOutOptionMode && this.mspaServiceProviderMode == uSRegulationData.mspaServiceProviderMode;
    }

    public final String getGppString() {
        return this.gppString;
    }

    public final List<Integer> getKnownChildSensitiveDataConsents() {
        return this.knownChildSensitiveDataConsents;
    }

    public final int getMspaCoveredTransaction() {
        return this.mspaCoveredTransaction;
    }

    public final int getMspaOptOutOptionMode() {
        return this.mspaOptOutOptionMode;
    }

    public final int getMspaServiceProviderMode() {
        return this.mspaServiceProviderMode;
    }

    public final int getPersonalDataConsents() {
        return this.personalDataConsents;
    }

    public final int getSaleOptOut() {
        return this.saleOptOut;
    }

    public final int getSaleOptOutNotice() {
        return this.saleOptOutNotice;
    }

    public final int getSensitiveDataLimitUseNotice() {
        return this.sensitiveDataLimitUseNotice;
    }

    public final List<Integer> getSensitiveDataProcessing() {
        return this.sensitiveDataProcessing;
    }

    public final int getSensitiveDataProcessingOptOutNotice() {
        return this.sensitiveDataProcessingOptOutNotice;
    }

    public final int getSharingNotice() {
        return this.sharingNotice;
    }

    public final int getSharingOptOut() {
        return this.sharingOptOut;
    }

    public final int getSharingOptOutNotice() {
        return this.sharingOptOutNotice;
    }

    public final int getTargetedAdvertisingOptOut() {
        return this.targetedAdvertisingOptOut;
    }

    public final int getTargetedAdvertisingOptOutNotice() {
        return this.targetedAdvertisingOptOutNotice;
    }

    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return this.mspaServiceProviderMode + k.a(this.mspaOptOutOptionMode, k.a(this.mspaCoveredTransaction, k.a(this.personalDataConsents, l.a(this.knownChildSensitiveDataConsents, l.a(this.sensitiveDataProcessing, k.a(this.targetedAdvertisingOptOut, k.a(this.sharingOptOut, k.a(this.saleOptOut, k.a(this.sensitiveDataLimitUseNotice, k.a(this.sensitiveDataProcessingOptOutNotice, k.a(this.targetedAdvertisingOptOutNotice, k.a(this.sharingOptOutNotice, k.a(this.saleOptOutNotice, k.a(this.sharingNotice, t.a(this.gppString, this.version * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final void setGppString(String str) {
        AbstractC3292y.i(str, "<set-?>");
        this.gppString = str;
    }

    public final void setKnownChildSensitiveDataConsents(List<Integer> list) {
        AbstractC3292y.i(list, "<set-?>");
        this.knownChildSensitiveDataConsents = list;
    }

    public final void setMspaCoveredTransaction(int i8) {
        this.mspaCoveredTransaction = i8;
    }

    public final void setMspaOptOutOptionMode(int i8) {
        this.mspaOptOutOptionMode = i8;
    }

    public final void setMspaServiceProviderMode(int i8) {
        this.mspaServiceProviderMode = i8;
    }

    public final void setPersonalDataConsents(int i8) {
        this.personalDataConsents = i8;
    }

    public final void setSaleOptOut(int i8) {
        this.saleOptOut = i8;
    }

    public final void setSaleOptOutNotice(int i8) {
        this.saleOptOutNotice = i8;
    }

    public final void setSensitiveDataLimitUseNotice(int i8) {
        this.sensitiveDataLimitUseNotice = i8;
    }

    public final void setSensitiveDataProcessing(List<Integer> list) {
        AbstractC3292y.i(list, "<set-?>");
        this.sensitiveDataProcessing = list;
    }

    public final void setSensitiveDataProcessingOptOutNotice(int i8) {
        this.sensitiveDataProcessingOptOutNotice = i8;
    }

    public final void setSharingNotice(int i8) {
        this.sharingNotice = i8;
    }

    public final void setSharingOptOut(int i8) {
        this.sharingOptOut = i8;
    }

    public final void setSharingOptOutNotice(int i8) {
        this.sharingOptOutNotice = i8;
    }

    public final void setTargetedAdvertisingOptOut(int i8) {
        this.targetedAdvertisingOptOut = i8;
    }

    public final void setTargetedAdvertisingOptOutNotice(int i8) {
        this.targetedAdvertisingOptOutNotice = i8;
    }

    public final void setVersion(int i8) {
        this.version = i8;
    }

    public String toString() {
        return "USRegulationData(version=" + this.version + ", gppString=" + this.gppString + ", sharingNotice=" + this.sharingNotice + ", saleOptOutNotice=" + this.saleOptOutNotice + ", sharingOptOutNotice=" + this.sharingOptOutNotice + ", targetedAdvertisingOptOutNotice=" + this.targetedAdvertisingOptOutNotice + ", sensitiveDataProcessingOptOutNotice=" + this.sensitiveDataProcessingOptOutNotice + ", sensitiveDataLimitUseNotice=" + this.sensitiveDataLimitUseNotice + ", saleOptOut=" + this.saleOptOut + ", sharingOptOut=" + this.sharingOptOut + ", targetedAdvertisingOptOut=" + this.targetedAdvertisingOptOut + ", sensitiveDataProcessing=" + this.sensitiveDataProcessing + ", knownChildSensitiveDataConsents=" + this.knownChildSensitiveDataConsents + ", personalDataConsents=" + this.personalDataConsents + ", mspaCoveredTransaction=" + this.mspaCoveredTransaction + ", mspaOptOutOptionMode=" + this.mspaOptOutOptionMode + ", mspaServiceProviderMode=" + this.mspaServiceProviderMode + ')';
    }

    public USRegulationData(int i8, String gppString, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List<Integer> sensitiveDataProcessing, List<Integer> knownChildSensitiveDataConsents, int i18, int i19, int i20, int i21) {
        AbstractC3292y.i(gppString, "gppString");
        AbstractC3292y.i(sensitiveDataProcessing, "sensitiveDataProcessing");
        AbstractC3292y.i(knownChildSensitiveDataConsents, "knownChildSensitiveDataConsents");
        this.version = i8;
        this.gppString = gppString;
        this.sharingNotice = i9;
        this.saleOptOutNotice = i10;
        this.sharingOptOutNotice = i11;
        this.targetedAdvertisingOptOutNotice = i12;
        this.sensitiveDataProcessingOptOutNotice = i13;
        this.sensitiveDataLimitUseNotice = i14;
        this.saleOptOut = i15;
        this.sharingOptOut = i16;
        this.targetedAdvertisingOptOut = i17;
        this.sensitiveDataProcessing = sensitiveDataProcessing;
        this.knownChildSensitiveDataConsents = knownChildSensitiveDataConsents;
        this.personalDataConsents = i18;
        this.mspaCoveredTransaction = i19;
        this.mspaOptOutOptionMode = i20;
        this.mspaServiceProviderMode = i21;
    }

    public /* synthetic */ USRegulationData(int i8, String str, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, List list, List list2, int i18, int i19, int i20, int i21, int i22, AbstractC3284p abstractC3284p) {
        this((i22 & 1) != 0 ? 0 : i8, (i22 & 2) != 0 ? "" : str, (i22 & 4) != 0 ? 0 : i9, (i22 & 8) != 0 ? 0 : i10, (i22 & 16) != 0 ? 0 : i11, (i22 & 32) != 0 ? 0 : i12, (i22 & 64) != 0 ? 0 : i13, (i22 & 128) != 0 ? 0 : i14, (i22 & 256) != 0 ? 0 : i15, (i22 & 512) != 0 ? 0 : i16, (i22 & 1024) != 0 ? 0 : i17, (i22 & 2048) != 0 ? AbstractC1435t.m() : list, (i22 & 4096) != 0 ? AbstractC1435t.m() : list2, (i22 & 8192) != 0 ? 0 : i18, (i22 & 16384) != 0 ? 0 : i19, (i22 & 32768) != 0 ? 0 : i20, (i22 & 65536) != 0 ? 0 : i21);
    }
}
