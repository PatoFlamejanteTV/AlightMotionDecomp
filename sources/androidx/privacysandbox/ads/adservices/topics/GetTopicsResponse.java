package androidx.privacysandbox.ads.adservices.topics;

import j$.util.Objects;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class GetTopicsResponse {
    private final List<Topic> topics;

    public GetTopicsResponse(List<Topic> topics) {
        AbstractC3292y.i(topics, "topics");
        this.topics = topics;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetTopicsResponse)) {
            return false;
        }
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        if (this.topics.size() != getTopicsResponse.topics.size()) {
            return false;
        }
        return AbstractC3292y.d(new HashSet(this.topics), new HashSet(getTopicsResponse.topics));
    }

    public final List<Topic> getTopics() {
        return this.topics;
    }

    public int hashCode() {
        return Objects.hash(this.topics);
    }

    public String toString() {
        return "Topics=" + this.topics;
    }
}
