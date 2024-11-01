package com.inmobi.cmp.core.model;

import androidx.annotation.Keep;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import w5.AbstractC4157a;

@Keep
/* loaded from: classes4.dex */
public final class ACData {
    private final String acString;

    public ACData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ACData copy$default(ACData aCData, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = aCData.acString;
        }
        return aCData.copy(str);
    }

    public final String component1() {
        return this.acString;
    }

    public final ACData copy(String str) {
        return new ACData(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ACData) && AbstractC3292y.d(this.acString, ((ACData) obj).acString);
    }

    public final String getAcString() {
        return this.acString;
    }

    public int hashCode() {
        String str = this.acString;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        StringBuilder a9 = AbstractC4157a.a("ACData(acString=");
        a9.append((Object) this.acString);
        a9.append(')');
        return a9.toString();
    }

    public ACData(String str) {
        this.acString = str;
    }

    public /* synthetic */ ACData(String str, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str);
    }
}
