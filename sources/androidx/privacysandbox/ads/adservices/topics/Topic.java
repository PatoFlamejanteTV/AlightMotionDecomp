package androidx.privacysandbox.ads.adservices.topics;

/* loaded from: classes3.dex */
public final class Topic {
    private final long modelVersion;
    private final long taxonomyVersion;
    private final int topicId;

    public Topic(long j8, long j9, int i8) {
        this.taxonomyVersion = j8;
        this.modelVersion = j9;
        this.topicId = i8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Topic)) {
            return false;
        }
        Topic topic = (Topic) obj;
        if (this.taxonomyVersion == topic.taxonomyVersion && this.modelVersion == topic.modelVersion && this.topicId == topic.topicId) {
            return true;
        }
        return false;
    }

    public final long getModelVersion() {
        return this.modelVersion;
    }

    public final long getTaxonomyVersion() {
        return this.taxonomyVersion;
    }

    public final int getTopicId() {
        return this.topicId;
    }

    public int hashCode() {
        return (((androidx.collection.a.a(this.taxonomyVersion) * 31) + androidx.collection.a.a(this.modelVersion)) * 31) + this.topicId;
    }

    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.taxonomyVersion + ", ModelVersion=" + this.modelVersion + ", TopicCode=" + this.topicId + " }");
    }
}
