package androidx.privacysandbox.ads.adservices.measurement;

import R5.AbstractC1435t;
import android.net.Uri;
import androidx.annotation.RequiresApi;
import j$.time.Instant;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(33)
/* loaded from: classes3.dex */
public final class DeletionRequest {
    public static final Companion Companion = new Companion(null);
    public static final int DELETION_MODE_ALL = 0;
    public static final int DELETION_MODE_EXCLUDE_INTERNAL_DATA = 1;
    public static final int MATCH_BEHAVIOR_DELETE = 0;
    public static final int MATCH_BEHAVIOR_PRESERVE = 1;
    private final int deletionMode;
    private final List<Uri> domainUris;
    private final Instant end;
    private final int matchBehavior;
    private final List<Uri> originUris;
    private final Instant start;

    @RequiresApi(33)
    /* loaded from: classes3.dex */
    public static final class Builder {
        private final int deletionMode;
        private List<? extends Uri> domainUris;
        private Instant end;
        private final int matchBehavior;
        private List<? extends Uri> originUris;
        private Instant start;

        public Builder(int i8, int i9) {
            this.deletionMode = i8;
            this.matchBehavior = i9;
            Instant MIN = Instant.MIN;
            AbstractC3292y.h(MIN, "MIN");
            this.start = MIN;
            Instant MAX = Instant.MAX;
            AbstractC3292y.h(MAX, "MAX");
            this.end = MAX;
            this.domainUris = AbstractC1435t.m();
            this.originUris = AbstractC1435t.m();
        }

        public final DeletionRequest build() {
            return new DeletionRequest(this.deletionMode, this.matchBehavior, this.start, this.end, this.domainUris, this.originUris);
        }

        public final Builder setDomainUris(List<? extends Uri> domainUris) {
            AbstractC3292y.i(domainUris, "domainUris");
            this.domainUris = domainUris;
            return this;
        }

        public final Builder setEnd(Instant end) {
            AbstractC3292y.i(end, "end");
            this.end = end;
            return this;
        }

        public final Builder setOriginUris(List<? extends Uri> originUris) {
            AbstractC3292y.i(originUris, "originUris");
            this.originUris = originUris;
            return this;
        }

        public final Builder setStart(Instant start) {
            AbstractC3292y.i(start, "start");
            this.start = start;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static final class Companion {

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface DeletionMode {
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes3.dex */
        public @interface MatchBehavior {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeletionRequest(int i8, int i9, Instant start, Instant end, List<? extends Uri> domainUris, List<? extends Uri> originUris) {
        AbstractC3292y.i(start, "start");
        AbstractC3292y.i(end, "end");
        AbstractC3292y.i(domainUris, "domainUris");
        AbstractC3292y.i(originUris, "originUris");
        this.deletionMode = i8;
        this.matchBehavior = i9;
        this.start = start;
        this.end = end;
        this.domainUris = domainUris;
        this.originUris = originUris;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DeletionRequest)) {
            return false;
        }
        DeletionRequest deletionRequest = (DeletionRequest) obj;
        if (this.deletionMode == deletionRequest.deletionMode && AbstractC3292y.d(new HashSet(this.domainUris), new HashSet(deletionRequest.domainUris)) && AbstractC3292y.d(new HashSet(this.originUris), new HashSet(deletionRequest.originUris)) && AbstractC3292y.d(this.start, deletionRequest.start) && AbstractC3292y.d(this.end, deletionRequest.end) && this.matchBehavior == deletionRequest.matchBehavior) {
            return true;
        }
        return false;
    }

    public final int getDeletionMode() {
        return this.deletionMode;
    }

    public final List<Uri> getDomainUris() {
        return this.domainUris;
    }

    public final Instant getEnd() {
        return this.end;
    }

    public final int getMatchBehavior() {
        return this.matchBehavior;
    }

    public final List<Uri> getOriginUris() {
        return this.originUris;
    }

    public final Instant getStart() {
        return this.start;
    }

    public int hashCode() {
        return (((((((((this.deletionMode * 31) + this.domainUris.hashCode()) * 31) + this.originUris.hashCode()) * 31) + this.start.hashCode()) * 31) + this.end.hashCode()) * 31) + this.matchBehavior;
    }

    public String toString() {
        String str;
        String str2;
        if (this.deletionMode == 0) {
            str = "DELETION_MODE_ALL";
        } else {
            str = "DELETION_MODE_EXCLUDE_INTERNAL_DATA";
        }
        if (this.matchBehavior == 0) {
            str2 = "MATCH_BEHAVIOR_DELETE";
        } else {
            str2 = "MATCH_BEHAVIOR_PRESERVE";
        }
        return "DeletionRequest { DeletionMode=" + str + ", MatchBehavior=" + str2 + ", Start=" + this.start + ", End=" + this.end + ", DomainUris=" + this.domainUris + ", OriginUris=" + this.originUris + " }";
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ DeletionRequest(int r8, int r9, j$.time.Instant r10, j$.time.Instant r11, java.util.List r12, java.util.List r13, int r14, kotlin.jvm.internal.AbstractC3284p r15) {
        /*
            r7 = this;
            r15 = r14 & 4
            if (r15 == 0) goto Lb
            j$.time.Instant r10 = j$.time.Instant.MIN
            java.lang.String r15 = "MIN"
            kotlin.jvm.internal.AbstractC3292y.h(r10, r15)
        Lb:
            r3 = r10
            r10 = r14 & 8
            if (r10 == 0) goto L17
            j$.time.Instant r11 = j$.time.Instant.MAX
            java.lang.String r10 = "MAX"
            kotlin.jvm.internal.AbstractC3292y.h(r11, r10)
        L17:
            r4 = r11
            r10 = r14 & 16
            if (r10 == 0) goto L20
            java.util.List r12 = R5.AbstractC1435t.m()
        L20:
            r5 = r12
            r10 = r14 & 32
            if (r10 == 0) goto L29
            java.util.List r13 = R5.AbstractC1435t.m()
        L29:
            r6 = r13
            r0 = r7
            r1 = r8
            r2 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.measurement.DeletionRequest.<init>(int, int, j$.time.Instant, j$.time.Instant, java.util.List, java.util.List, int, kotlin.jvm.internal.p):void");
    }
}
